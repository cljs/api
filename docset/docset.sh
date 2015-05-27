#!/bin/bash

# This script creates an offline version of the API reference catalog
# currently on github.

cd `dirname $0`

OUTDIR=offline
CONTINUE=
if [ -d $OUTDIR ]; then
  CONTINUE="--continue"
fi

httrack "https://github.com/cljsinfo/api-refs/blob/catalog/README.md" \
  --path $OUTDIR \
  '-*' \
  '+https://github.com/cljsinfo/api-refs/blob/catalog/*.md' \
  '+*.css' \
  '+*.ttf' \
  '+*.wof' \
  '+*.js' \
  '+*camo.githubusercontent.com/*' \
  $CONTINUE
