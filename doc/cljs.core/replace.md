---
name: cljs.core/replace
related:
  - cljs.core/map
  - clojure.walk/prewalk-replace
  - clojure.walk/postwalk-replace
---

## Signature
[smap]
[smap coll]


## Details

Given a map of replacement pairs `smap` and a vector/collection `coll`, returns
a vector/seq with any elements `=` to a key in `smap` replaced with the
corresponding val in `smap`.

Returns a transducer when `coll` is not provided.
