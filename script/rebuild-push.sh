#!/bin/sh

cd cljs-api-docs
git checkout master &> /dev/null

echo "Deleting docs branch..."
git branch -D docs > /dev/null

echo "Deleting tags..."
for t in `git tag`; do
  git tag -d $t > /dev/null
done

echo "Deleting symbol history..."
rm ../symbol-history

echo "Starting..."
lein run

echo "Pushing docs..."
git push -f --tags origin docs:docs
