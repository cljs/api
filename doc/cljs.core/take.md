---
name: cljs.core/take
related:
  - cljs.core/drop
  - cljs.core/take-while
  - cljs.core/take-last
  - cljs.core/take-nth
---

## Signature
[n]
[n coll]


## Details

Returns a lazy sequence of the first `n` items in `coll`. Returns all the items
if there are fewer than `n`.

Returns a stateful transducer when no collection is provided.
