---
name: cljs.core/partial
related:
  - cljs.core/comp
  - cljs.core/juxt
---

## Signature
[f]
[f arg1]
[f arg1 arg2]
[f arg1 arg2 arg3]
[f arg1 arg2 arg3 & more]


## Details

Takes a function `f` and fewer than the normal arguments to `f`. Returns a
function that takes a variable number of additional arguments. When called, the
returned function calls `f` with the original arguments plus the additional
arguments.

`((partial f a b) c d)` => `(f a b c d)`
