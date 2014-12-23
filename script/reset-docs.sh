#!/bin/sh

if [ -d "cljs-api-docs" ]; then
  pushd cljs-api-docs > /dev/null
  git checkout master &> /dev/null
  echo "Deleting docs branch..."
  git branch -D docs > /dev/null
  echo "Deleting tags..."
  for t in `git tag`; do
    git tag -d $t
  done
  popd > /dev/null
fi

rm symbol-history
