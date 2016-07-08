## Name
cljs.core/declare

## Type
macro

## Signature
[& names]

## Description

Uses `def` to establish symbols of `names` with no bindings.

Useful for making forward declarations.

## Example#5a2dc2

```clj
a
;; WARNING: Use of undeclared Var

(declare a)
a
;;=> nil
```

## Related
special/def
