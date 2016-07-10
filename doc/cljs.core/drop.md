---
name: cljs.core/drop
related:
  - cljs.core/take
  - cljs.core/drop-last
  - cljs.core/drop-while
  - cljs.core/nthnext
  - cljs.core/nthrest
---

## Signature
[n]
[n coll]


## Description

Returns a lazy sequence of all but the first `n` items in `coll`.

Returns a stateful transducer when no collection is provided.
