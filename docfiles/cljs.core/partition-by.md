---
name: cljs.core/partition-by
see also:
  - cljs.core/partition
  - cljs.core/partition-all
  - cljs.core/group-by
---

## Summary

## Details

Applies `f` to each value in `coll`, splitting it each time `f` returns a new
value. Returns a lazy sequence of partitions.

Returns a stateful transducer when no collection is provided.

## Examples

## Signature
[f]
[f coll]
