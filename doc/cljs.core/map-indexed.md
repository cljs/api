---
name: cljs.core/map-indexed
see also:
  - cljs.core/map
  - cljs.core/keep-indexed
---

## Signature
[f coll]


## Details

Returns a lazy sequence consisting of the result of applying `f` to 0 and the
first item of `coll`, followed by applying `f` to 1 and the second item in
`coll`, etc, until `coll` is exhausted.

Function `f` should accept 2 arguments, index and item.
