---
name: cljs.core/array-map
related:
  - cljs.core/assoc
  - cljs.core/hash-map
  - cljs.core/sorted-map
---

## Signature
[& keyvals]


## Details

Returns a new array map (a map implemented with arrays) with the supplied mappings.

`keyvals` must be an even number of forms.


## Examples

```clj
(array-map :a 10)
;;=> {:a 10}

(array-map :a 10 :b 20)
;;=> {:a 10 :b 20}
```