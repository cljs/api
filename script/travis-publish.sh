#!/bin/bash

set -e

if [ "${TRAVIS_PULL_REQUEST}" = "false" ]; then
  cd output-repo
  git config user.name "${GIT_NAME}"
  git config user.email "${GIT_EMAIL}"
  git remote add origin https://shaunlebron:${GH_TOKEN}@github.com/cljsinfo/api-docs-generator.git
  git push --force --tags origin docs &> /dev/null
fi

