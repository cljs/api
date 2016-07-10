---
name: cljs.core/split-with
related:
  - cljs.core/split-at
  - clojure.string/split
  - cljs.core/take-while
  - cljs.core/drop-while
---

## Signature
[pred coll]


## Description

Returns a vector of `[(take-while pred coll) (drop-while pred coll)]`
