---
name: cljs.core/partition-all
related:
  - cljs.core/partition
  - cljs.core/partition-by
---

## Signature
[n]
[n coll]
[n step coll]


## Details

Returns a lazy sequence of lists like `partition`, but may include partitions
with fewer than `n` items at the end.

Returns a stateful transducer when no collection is provided.
