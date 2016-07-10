---
name: cljs.core/empty?
related:
  - cljs.core/seq
---

## Signature
[coll]


## Description

Returns true if `coll` has no items - same as `(not (seq coll))`.

Please use the idiom `(seq x)` rather than `(not (empty? x))`.
