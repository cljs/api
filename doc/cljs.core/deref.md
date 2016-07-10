---
name: cljs.core/deref
see also:
  - cljs.core/atom
---

## Signature
[x]


## Details

Returns the current value of atom `x`.

The `@` reader macro is often used instead of `deref`. `@foo` is the same thing
as `(deref foo)`.
