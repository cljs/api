---
name: cljs.core/when-some
see also:
  - cljs.core/if-some
---

## Signature
[[x test] & body]


## Details

When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.
