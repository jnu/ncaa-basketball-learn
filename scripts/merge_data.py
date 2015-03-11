# -*-coding: utf8 -*-
#
# Utility to merge TSV game and summary data into a master data file for
# processing in Spark.
#
# Takes lists of game and team summary files as input (TSV or CSV), and prints
# a CSV to stdout containing the processed and merged data.

import sys
import csv
import argparse
from collections import OrderedDict

# constants
AWAY_HERO = 'away_hero'
HOME_HERO = 'home_hero'
HERO = 'hero'
CHALLENGER = 'challenger'


def parse_file(fn):
    '''Parse the file located at `fn`. Can be either TSV or CSV. Result will
       preserve order from the file.
    '''
    # get the dialect: TSV or CSV
    fmt = fn.rpartition('.')[-1]
    dialect = csv.excel_tab if fmt.lower() == 'tsv' else csv.excel
    header = None
    entries = []
    with open(fn, 'r') as fh:
        for line in csv.reader(fh, dialect=dialect):
            # use the first row as the header
            if header is None:
                header = line
                continue
            entries.append(OrderedDict(zip(header, line)))
    return entries


def get_team_by_id(team_rows, id):
    t = None
    try:
        t = next(tr for tr in team_rows if tr['team_id'] == id)
    except StopIteration:
        print >>sys.stderr, "Could not find team %s. Skipping ..." % id
    finally:
        return t


def clean_val(val):
    '''Clean a gross value. Ad-hoc to the expected inputs, will clear nbsp and
       remove comma formatting from numbers.
    '''
    # Convert times to minutes
    if val.find(':') > -1:
        hours, mins = val.split(':')
        val = str(int(hours) * 60 + int(mins))
    return val.replace('\xc2\xa0', '').replace(',', '')


def merge_game_row(game_row, team_rows):
    '''Merge the game row with the summary team stats.
    '''
    away_team_id = game_row['away_team_id']
    away_team = get_team_by_id(team_rows, away_team_id)

    home_team_id = game_row['home_team_id']
    home_team = get_team_by_id(team_rows, home_team_id)

    # early exit if one or the other team wasn't found
    if not away_team or not home_team:
        return []

    rows = []

    # create two rows, one from the home team perspective, one from away
    for r in [AWAY_HERO, HOME_HERO]:
        row = OrderedDict()

        # generate unique id
        row['id'] = "%s%s" % (game_row['game_id'], r)

        # location ternary: -1 for away, 0 for neutral, 1 for home
        location = 0
        if not int(game_row['neutral_site']):
            location = 1 if r == HOME_HERO else -1
        row['location'] = location

        # merge game row
        for key, val in game_row.iteritems():
            # replace home / away with perspective-oriented epithets
            if r == AWAY_HERO:
                key = key.replace('home', CHALLENGER).replace('away', HERO)
            else:
                key = key.replace('home', HERO).replace('away', CHALLENGER)

            row[key] = clean_val(val)

        # merge away team row
        for key, val in away_team.iteritems():
            pfx = HERO if r == AWAY_HERO else CHALLENGER
            row["%s_%s" % (pfx, key)] = clean_val(val)

        # merge home team row
        for key, val in home_team.iteritems():
            pfx = HERO if r == HOME_HERO else CHALLENGER
            row["%s_%s" % (pfx, key)] = clean_val(val)

        # push row
        rows.append(row)

    return rows





if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument(
        '--games',
        nargs='+',
        help="TSV files containing game data for an arbitrary number of years"
    )
    parser.add_argument(
        '--summaries',
        nargs='+',
        help="TSV files containing team summary data for a given year"
    )

    args = parser.parse_args(sys.argv[1:])

    if len(args.games) != len(args.summaries):
        raise argparse.ArgumentTypeError('File lists must be same length')

    # Assume that these things are named in a sortable way.
    # XXX this is a mean assumption. Expected format is 'YYYY-stat_type.tsv'
    args.games.sort()
    args.summaries.sort()

    all_rows = []

    # Parse and merge all the game / team summary files
    for games, summaries in zip(args.games, args.summaries):
        print >>sys.stderr, "Merging games from %s and teams from %s ..." % \
            (games, summaries)
        game_rows = parse_file(games)
        summary_rows = parse_file(summaries)

        for row in game_rows:
            new_rows = merge_game_row(row, summary_rows)
            for new_row in new_rows:
                if new_row:
                    all_rows.append(new_row)

    # Now write the out file as CSV to stdout
    writer = csv.writer(sys.stdout, dialect=csv.excel)
    out_header = all_rows[0].keys()
    writer.writerow(out_header)
    for row in all_rows:
        writer.writerow([row[key] for key in out_header])
