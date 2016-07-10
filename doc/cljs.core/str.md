---
name: cljs.core/str
---

## Signature
[]
[x]
[x & ys]


## Details

`(str)` and `(str nil)` return the empty string.

`(str x)` returns `x.toString()`.

With more than one argument, returns the concatenation of the `str` values of
the arguments.
