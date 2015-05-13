#!/bin/bash

set -e

lein run '{:catalog :all}'

cd catalog
git remote add origin git@github.com:cljsinfo/api-docs-generator.git
git push --force --tags origin docs

