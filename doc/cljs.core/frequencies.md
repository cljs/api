---
name: cljs.core/frequencies
see also:
  - cljs.core/group-by
  - cljs.core/distinct
---

## Signature
[coll]


## Details

Returns a map from distinct items in `coll` to the number of times they appear.

`(frequencies [:a :a :b])` => `{:a 2, :b 1}`
