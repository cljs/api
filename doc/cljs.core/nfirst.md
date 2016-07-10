---
name: cljs.core/nfirst
related:
  - cljs.core/next
---

## Signature
[coll]


## Description

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