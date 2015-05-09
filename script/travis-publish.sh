#!/bin/bash

set -e

if [ "${TRAVIS_PULL_REQUEST}" = "false" ]; then
  cd output-repo
  git config user.name "${GIT_NAME}"
  git config user.email "${GIT_EMAIL}"
  git remote add origin https://github.com/cljsinfo/api-docs-generator.git
  echo "https://${GH_TOKEN}:@github.com" > .git/credentials
  git push --force --tags origin docs
fi

