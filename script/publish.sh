#!/bin/bash

set -e

if [ "$1" == "build" ]; then
  # assuming that the parsed data cache is good.
  # if not, add ":skip-parse? false".
  lein run '{:catalog? true, skip-pages? false}'
fi

cd catalog

# add origin remote if not yet added.
if git remote | grep origin > /dev/null; then
  echo
else
  git remote add origin git@github.com:cljsinfo/cljs-api-docs.git
fi

git push --force --tags origin master:catalog

