---
name: cljs.core/interleave
related:
  - cljs.core/interpose
  - cljs.core/zipmap
---

## Signature
[c1 c2]
[c1 c2 & colls]


## Description

Returns a lazy seq of the first item in each collection, then the second items,
then the third, etc.
