---
name: cljs.core/while
related:
  - cljs.core/loop
---

## Signature
[test & body]


## Details

Repeatedly executes `body` while `test` expression is true. Presumes some
side-effect will cause `test` to become false or nil.

Returns nil.
