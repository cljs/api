---
name: cljs.core/when-let
see also:
  - cljs.core/if-let
  - cljs.core/when
  - cljs.core/when-not
  - special/if
  - cljs.core/when-first
---

## Signature
[[x test] & body]


## Details

When `test` is logical true, evaluates `body` with the value of `test` bound to
`x`.
