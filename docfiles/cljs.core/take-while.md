---
name: cljs.core/take-while
see also:
  - cljs.core/drop-while
  - cljs.core/split-with
---

## Summary

## Details

Returns a lazy sequence of successive items from `coll` while `(pred item)`
returns true. `pred` must be free of side-effects.

Returns a transducer when no collection is provided.

## Examples
