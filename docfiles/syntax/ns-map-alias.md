---
name: syntax/ns-map-alias
display as: "#:: namespaced map"
clojure doc: http://clojure.org/reference/reader#_map_namespace_syntax
see also:
---

## Summary

Provide a default namespace for keyword keys in a map, using an alias.

- `#:: {:a 1}` => `{:current-ns/a 1}`
- `#::s {:a 1}` => `{:aliased-ns/a 1}`

## Details

## Examples
