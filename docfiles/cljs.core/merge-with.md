---
name: cljs.core/merge-with
see also:
  - cljs.core/merge
---

## Summary

## Details

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping(s) from the latter (left-to-
right) will be combined with the mapping in the result by calling `(f val-in-
result val-in-latter)`.

## Examples

## Signature
[f & maps]
