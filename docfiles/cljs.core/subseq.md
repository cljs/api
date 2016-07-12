---
name: cljs.core/subseq
see also:
  - cljs.core/rsubseq
  - cljs.core/sorted-map
  - cljs.core/sorted-set
  - cljs.core/sorted-map-by
  - cljs.core/sorted-set-by
---

## Summary

## Details

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.

## Examples
