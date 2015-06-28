#!/bin/bash

set -e

cd `dirname $0`/..

echo

# runs tests for the docs compiler
lein test

# runs the quick doc compiler to force simple errors early
lein run '{:task :cljsdoc}'

# generate docs for the latest version (full history) and output errors if encountered
lein run

