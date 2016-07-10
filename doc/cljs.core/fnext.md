---
name: cljs.core/fnext
related:
  - cljs.core/ffirst
  - cljs.core/second
---

## Signature
[coll]


## Description

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