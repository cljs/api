---
name: cljs.core/map
see also:
  - cljs.core/map-indexed
  - cljs.core/amap
  - cljs.core/mapcat
  - cljs.core/keep
  - cljs.core/juxt
---

## Summary

## Details

Returns a lazy sequence of applying function `f` to every element of `coll`.

When more than one collection is provided, returns a lazy sequence consisting of
the result of applying `f` to the set of first items of each `c`, followed by
applying `f` to the set of second items in each `c`, until any one of the `c`s
is exhausted. Any remaining items in other `c`s are ignored. Function `f` should
accept number-of-`c`s arguments.

Returns a transducer when no collection is provided.

## Examples

## Signature
[f]
[f coll]
[f c1 c2]
[f c1 c2 c3]
[f c1 c2 c3 & colls]
