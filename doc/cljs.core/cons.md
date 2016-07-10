---
name: cljs.core/cons
related:
  - cljs.core/conj
---

## Signature
[x coll]


## Details

Returns a new sequence where `x` is the first element and `coll` is the rest.


## Examples

```clj
(cons 1 (list 1 2 3))
;;=> (1 1 2 3)

(cons 1 [1 2 3])
;;=> (1 1 2 3)

(cons 1 nil)
;;=> (1)

(cons nil nil)
;;=> (nil)
```
