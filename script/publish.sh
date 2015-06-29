#!/bin/bash

set -e

# build if the catalog doesn't exist, or if we force it.
if [ "$1" == "build" ] || [ ! -d "catalog" ]; then
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

