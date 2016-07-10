---
name: cljs.core/remove
related:
  - cljs.core/filter
---

## Signature
[pred]
[pred coll]


## Details

Returns a lazy sequence of the items in `coll` for which `(pred item)` returns
false.

`pred` must be free of side-effects.

Returns a transducer when no collection is provided.
