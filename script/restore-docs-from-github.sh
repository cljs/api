#!/bin/bash

set -e

if [ -d "api-docs-generated" ]; then
  echo "api-docs-generated already exists.  If you really want to restore from github, please delete it first."
else
  git clone git@github.com:cljsinfo/api-docs-generated.git
  cd api-docs-generated
  git checkout docs

  # recreate the symbol-history file required for syncing state with docs repo
  echo `git describe --tags` | sed -e 's/0\.0-/r/' > ../symbol-history
  cat symbol-history >> ../symbol-history
fi

