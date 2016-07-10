---
name: cljs.core/iterate
related:
  - cljs.core/cycle
  - cljs.core/repeatedly
  - cljs.core/repeat
---

## Signature
[f x]


## Description

Returns a lazy sequence of `x`, `(f x)`, `(f (f x))` etc.

`f` must be free of side-effects.
