#!/bin/bash

set -e

lein run '{:catalog :all}'

cd catalog
git remote add origin git@github.com:cljsinfo/api-refs.git
git push --force --tags origin master:catalog

