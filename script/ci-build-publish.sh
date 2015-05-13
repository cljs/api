#!/bin/bash

set -e

lein run '{:catalog :all}'

# don't publish docs for pull requests
if [ -z "$CI_PULL_REQUEST" ]; then
  cd catalog
  git remote add origin git@github.com:cljsinfo/api-docs-generator.git
  git push --force --tags origin docs
fi

