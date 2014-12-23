#!/bin/sh

echo "Starting..."
lein run

echo "Pushing docs..."
cd cljs-api-docs
git push --tags origin docs:docs
