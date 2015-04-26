#!/bin/sh

echo "Starting..."
lein run

echo "Pushing docs..."
cd api-docs-generated
git push --tags origin docs:docs
