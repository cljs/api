#!/bin/sh

cd repos/clojurescript
git tag | grep "^r" | sort -n -k1.2
