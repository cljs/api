---
name: cljs.core/fnext
see also:
  - cljs.core/ffirst
  - cljs.core/second
---

## Signature
[coll]


## Details

Same as `(first (next coll))`


## Examples

```clj
(fnext [1 2 3])
;;=> 2

(fnext [1 2])
;;=> 2

(fnext [1])
;;=> nil

(fnext [])
;;=> nil
```