---
name: cljs.core/mapcat
related:
  - cljs.core/map
  - cljs.core/concat
---

## Signature
[f]
[f & colls]


## Description

Returns the result of applying `concat` to the result of applying `map` to `f`
and `colls`.

Function `f` should return a collection.

Returns a transducer when no collections are provided.
