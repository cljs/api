---
name: cljs.core/filter
see also:
  - cljs.core/remove
  - cljs.core/keep
---

## Summary

## Details

Returns a lazy sequence of the items in coll for which `(pred item)` returns logical true.

`pred` must be free of side-effects.

Returns a transducer when no collection is provided.

## Examples
