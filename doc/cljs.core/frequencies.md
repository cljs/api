---
name: cljs.core/frequencies
related:
  - cljs.core/group-by
  - cljs.core/distinct
---

## Signature
[coll]


## Description

Returns a map from distinct items in `coll` to the number of times they appear.

`(frequencies [:a :a :b])` => `{:a 2, :b 1}`
