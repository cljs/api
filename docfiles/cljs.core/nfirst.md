---
name: cljs.core/nfirst
see also:
  - cljs.core/next
---

## Summary

## Details

Same as `(next (first coll))`.

## Examples

```clj
(nfirst [[1 2 3] [4 5]])
;;=> (2 3)

(nfirst [[1 2] [3 4]])
;;=> (2)

(nfirst [[1] [2 3]])
;;=> nil

(nfirst [[] [1 2]])
;;=> nil
```
