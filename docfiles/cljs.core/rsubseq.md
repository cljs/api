---
name: cljs.core/rsubseq
see also:
  - cljs.core/subseq
---

## Summary

## Details

`sc` must be a sorted collection.

`test`, `start-test`, `end-test` must be `<`, `<=`, `>` or `>=`.

Returns a reverse sequence of those entries with keys `ek` for which
`(test (.. sc comparator (compare ek key)) 0)` is true.

## Examples
