---
name: cljs.core/declare
see also:
  - cljs.core/def
---

## Summary

## Details

Uses `def` to establish symbols of `names` with no bindings.

Useful for making forward declarations.

## Examples

```clj
a
;; WARNING: Use of undeclared Var

(declare a)
a
;;=> nil
```
