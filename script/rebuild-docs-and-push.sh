#!/bin/sh

script/reset-docs.sh
lein run
script/push-docs.sh
