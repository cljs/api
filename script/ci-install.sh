#!/bin/bash

# we execute this separately in travis-ci so the dependencies
# downloads don't pollute our task log

set -e

cd `dirname $0`/..

lein deps

