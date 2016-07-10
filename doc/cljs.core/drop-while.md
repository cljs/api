---
name: cljs.core/drop-while
see also:
  - cljs.core/take-while
  - cljs.core/split-with
---

## Signature
[pred]
[pred coll]


## Details

Returns a lazy sequence of the items in `coll` starting from the first item for
which `(pred item)` returns logical false.

Returns a stateful transducer when no collection is provided.
