---
name: cljs.core/*print-dup*
see also:
  - cljs.core/*print-readably*
  - cljs.core/prn
---

## Summary

Not implemented. In clojure, it can be bound to true to preserve object types
when printing, allowing successful object _duplication_ when read back.

## Details

In Clojure, when `*print-dup*` is set to true, print functions will check for a
`print-dup` multimethod on any given object, rather than their usual `print-method`.
An object type can implement this differently if reading the normal string would
not faithfully duplicate the original object.

## Examples
