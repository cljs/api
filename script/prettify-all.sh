#!/bin/bash

find catalog/site -name "*.md" -o -name "*.yaml" | xargs -n1 -P8 script/yaml-pretty.rb
