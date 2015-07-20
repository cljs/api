#!/bin/bash

# This script creates an offline version of the API reference catalog
# currently on github.

cd `dirname $0`

OUTDIR=offline
CONTINUE=
if [ -d $OUTDIR ]; then
  CONTINUE="--continue"
fi

DONT_GEN_404_HTML=-o0

httrack "https://github.com/cljsinfo/cljs-api-docs/blob/catalog/INDEX.md" \
  --path $OUTDIR \
  '-*' \
  '+https://github.com/cljsinfo/cljs-api-docs/blob/catalog/*.md' \
  '+*.css' \
  '+*.ttf' \
  '+*.wof' \
  '+*.js' \
  '+*camo.githubusercontent.com/*' \
  $DONT_GEN_404_HTML
  $CONTINUE
