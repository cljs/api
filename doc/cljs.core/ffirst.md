---
name: cljs.core/ffirst
see also:
  - cljs.core/first
  - cljs.core/fnext
  - cljs.core/nfirst
---

## Signature
[coll]


## Details

Same as `(first (first coll))`.


## Examples

```clj
(ffirst [[1 2] [3 4] [5 6]])
;;=> 1
```