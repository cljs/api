#!/bin/sh

if [ -d "cljs-api-docs" ]; then
  pushd cljs-api-docs > /dev/null
  git push -f --tags origin docs:docs
  popd > /dev/null
else
  echo "No docs found."
  exit 1
fi
