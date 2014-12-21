#!/bin/sh

if [ ! -d "repos" ]; then
  mkdir repos
fi
cd repos

clone_or_fetch() {
  url=$1
  name=`basename $url`
  if [ ! -d "$name" ]; then
    git clone $url
  else
    echo "Checking for \"$name\" updates..."
    cd $name
    git fetch
    cd ..
  fi
}

clone_or_fetch https://github.com/clojure/clojure
clone_or_fetch https://github.com/clojure/clojurescript
clone_or_fetch https://github.com/clojure/core.async
