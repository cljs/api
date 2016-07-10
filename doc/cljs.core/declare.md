---
name: cljs.core/declare
related:
  - special/def
---

## Signature
[& names]


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
