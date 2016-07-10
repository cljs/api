---
name: cljs.core/partition-by
related:
  - cljs.core/partition
  - cljs.core/partition-all
  - cljs.core/group-by
---

## Signature
[f]
[f coll]


## Details

Applies `f` to each value in `coll`, splitting it each time `f` returns a new
value. Returns a lazy sequence of partitions.

Returns a stateful transducer when no collection is provided.
