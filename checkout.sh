#!/bin/sh

set -e

CLJS_VERSION="$1"

if [ -z "$CLJS_VERSION" ]; then
  echo ""
  echo "USAGE: checkout <version>"
  echo ""
  echo "This will checkout clojurescript to the given version,"
  echo "and clojure to the appropriate matching version."
  echo ""
  echo "Choose from the following versions:"
  cd repos/clojurescript
  git tag | grep "^r" | sort -n -k1.2 | column
  exit 1
fi

cd repos

checkout() {
  name=$1
  version=$2
  echo ""
  echo "Checking out $name $version"
  pushd $name > /dev/null
  git checkout -- .
  git checkout $version
  git clean -xdf
  popd > /dev/null
}

checkout "clojurescript" $CLJS_VERSION

pushd clojurescript/script > /dev/null
CLJ_VERSION=`sed -n -e 's/^CLOJURE_RELEASE="\(.*\)"/\1/p' bootstrap`
if [ -z "$CLJ_VERSION" ]; then
  CLJ_VERSION=`sed -n -e 's/^unzip .*clojure-\(.*\)\.zip/\1/p' bootstrap`
fi
if [ -z "$CLJ_VERSION" ]; then
  echo "Could not find clojure version to checkout"
  exit 1
fi
popd > /dev/null

checkout "clojure" "clojure-$CLJ_VERSION"
