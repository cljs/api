---
name: cljs.core/merge
related:
  - cljs.core/merge-with
  - cljs.core/hash-map
---

## Signature
[& maps]


## Details

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping from the rightmost map will
"win".
