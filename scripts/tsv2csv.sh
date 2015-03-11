#!/bin/bash
# Convert a list of TSV files to CSV

DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )

for infile in "$@"
do
    echo "Processing $infile ..." >&2
    # also replace nbsp because they suck
    exec cat $infile | python "$DIR/tsv2csv.py" | sed 's/ //g' > ${infile/%.tsv/.csv}
done
