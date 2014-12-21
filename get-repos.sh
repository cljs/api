#!/bin/sh

if [ ! -d "repos" ]; then
  mkdir repos
fi
cd repos

if [ ! -d "clojure" ]; then
  git clone https://github.com/clojure/clojure
fi

if [ ! -d "clojurescript" ]; then
  git clone https://github.com/clojure/clojurescript
fi

if [ ! -d "core.async" ]; then
  git clone https://github.com/clojure/core.async
fi
