#!/bin/bash

set -e

if [ "$1" == "rebuild" ]; then
  rm -rf catalog
fi

lein run '{:catalog :all}'

cd catalog
git remote add origin git@github.com:cljsinfo/api-refs.git
git push --force --tags origin master:catalog

