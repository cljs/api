---
name: cljs.core/swap!
related:
  - cljs.core/atom
  - cljs.core/reset!
---

## Signature
[a f]
[a f x]
[a f x y]
[a f x y & more]


## Details

Atomically swaps the value of atom to be: `(apply f current-value-of-atom
args)`

Note that `f` may be called multiple times, and thus should be free of side
effects.

Returns the value that was swapped in.
