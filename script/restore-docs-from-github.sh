#!/bin/bash

set -e

if [ -d "cljs-api-docs" ]; then
  echo "cljs-api-docs already exists.  If you really want to restore from github, please delete it first."
else
  git clone git@github.com:shaunlebron/cljs-api-docs.git
  cd cljs-api-docs
  git checkout docs

  # recreate the symbol-history file required for syncing state with docs repo
  echo `git describe --tags` | sed -e 's/0\.0-/r/' > ../symbol-history
  cat symbol-history >> ../symbol-history
fi

