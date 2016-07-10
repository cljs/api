---
name: cljs.core/subvec
related:
  - cljs.core/vector
  - cljs.core/vector?
---

## Signature
[v start]
[v start end]


## Details

Returns a persistent vector of the items in `v` from `start` inclusive to `end`
exclusive.

If `end` is not supplied, defaults to `(count v)`.

This operation is O(1) and very fast, as the resulting vector shares structure
with the original and no trimming is done.
