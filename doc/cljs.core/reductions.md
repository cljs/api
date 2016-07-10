---
name: cljs.core/reductions
related:
  - cljs.core/reduce
---

## Signature
[f coll]
[f init coll]


## Description

Returns a lazy sequence of the intermediate values of the reduction (as per
`reduce`) of `coll` by `f`, starting with `init`.
