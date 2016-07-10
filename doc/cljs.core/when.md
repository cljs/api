---
name: cljs.core/when
related:
  - cljs.core/when-not
  - cljs.core/when-let
  - special/if
---

## Signature
[test & body]


## Details

Evaluates `test`. If logical true, evaluates `body` in an implicit `do`.

`when` is often used instead of `if` for conditions that do not have an "else".
