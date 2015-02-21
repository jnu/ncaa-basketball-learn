#!/bin/bash
# Convert a list of files to CSV

DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )

for infile in "$@"
do
    echo "Processing $infile ..." >&2
    exec cat $infile | python "$DIR/tsv2csv.py" > ${infile/%.tsv/.csv}
done
