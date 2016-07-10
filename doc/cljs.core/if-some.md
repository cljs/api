---
name: cljs.core/if-some
related:
  - cljs.core/when-some
---

## Signature
[[x test] then]
[[x test] then else]


## Details

If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If
not, yields `else`.
