#!/bin/bash

set -e

cd `dirname $0`/..

echo
echo "COMPILING DOCS..."
lein test
lein run :cljsdoc

if [ "${TRAVIS_PULL_REQUEST}" = "false" ]; then
  echo
  echo "TRYING LATEST VERSION..."
  lein run '{:version :latest}'

  echo
  echo "TRYING ABRIDGED CATALOG..."
  lein run '{:catalog 6}'
fi
