---
name: cljs.core/swap!
see also:
  - cljs.core/atom
  - cljs.core/reset!
---

## Summary

## Details

Atomically swaps the value of atom to be: `(apply f current-value-of-atom
args)`

Note that `f` may be called multiple times, and thus should be free of side
effects.

Returns the value that was swapped in.

## Examples
