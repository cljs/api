---
name: cljs.core/update-in
see also:
  - cljs.core/assoc-in
  - cljs.core/get-in
---

## Summary

## Details

"Updates" a value in a nested associative structure, where `ks` is a sequence of
keys and `f` is a function that will take the old value and any supplied
arguments and return the new value. Returns a new nested structure.

If any levels do not exist, hash-maps will be created.

## Examples
