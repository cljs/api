---
name: cljs.core/mapv
see also:
  - cljs.core/map
---

## Summary

## Details

Returns a vector consisting of the result of applying `f` to the set of first
items of each coll, followed by applying `f` to the set of second items in each
coll, until any one of the colls is exhausted. Any remaining items in other
colls are ignored.

Function `f` should accept number-of-colls arguments.

## Examples
