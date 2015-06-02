#!/bin/bash

set -e

cd docset

repo=Dash-User-Contributions

if [ ! -d "$repo" ]; then
  git clone git@github.com:shaunlebron/${repo}.git
  cd $repo
  git remote add upstream git@github.com:Kapeli/${repo}.git
  cd ..
fi

cd $repo

# reset unsaved changes and go to master branch
git reset --hard
git checkout master

# Need to reset to make simple squashed PRs and to prevent possible problems
# from Dash's history rewriting from large file removal.
#    source: https://gist.github.com/glennblock/1974465
git fetch upstream
git reset --hard upstream/master

# create PR branch
git checkout -b cljs upstream/master
echo "PR branch 'cljs' created."

# add docset file
cp ../ClojureScript.tgz docsets/ClojureScript/
echo "latest docset copied."

echo
echo "Now, update the version in docsets/ClojureScript/docset.json"
echo "and commit, push, and submit PR."
