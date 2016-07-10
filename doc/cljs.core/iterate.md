---
name: cljs.core/iterate
see also:
  - cljs.core/cycle
  - cljs.core/repeatedly
  - cljs.core/repeat
---

## Signature
[f x]


## Details

Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.

`f` must be free of side-effects.
