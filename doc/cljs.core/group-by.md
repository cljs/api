---
name: cljs.core/group-by
related:
  - cljs.core/partition-by
  - cljs.core/frequencies
---

## Signature
[f coll]


## Description

Returns a map of the elements of `coll` keyed by the result of running `f` on
each element.

The value at each key will be a vector of the corresponding elements in the
order they appeared in `coll`.
