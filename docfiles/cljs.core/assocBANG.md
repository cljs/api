---
name: cljs.core/assoc!
see also:
  - cljs.core/transient
  - cljs.core/persistent!
---

## Summary

## Details

assoc(iate) on transient collection

When applied to a transient map, adds mapping of key(s) to val(s).

When applied to a transient vector, sets the val at index.  Note - index must
be <= (count vector).

Returns coll.

## Examples

```clj
(def tcoll (transient! {}))
(assoc! tcoll :a 1)
(assoc! tcoll :b 2)

tcoll
;;=> #<[object Object]> 

(:a tcoll)
;;=> 1

(:b tcoll)
;;=> 2

(def a (persistent! tcoll))
;;=> {:a 1 :b 2}
```
