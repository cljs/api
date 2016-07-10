---
name: cljs.core/array?
related:
  - cljs.core/object?
---

## Signature
[x]


## Details

Returns true if `x` is a JavaScript array, false otherwise.


## Examples

```clj
(array? #js [1 2 3])
;;=> true

(array? [1 2 3])
;;=> false

(array? "hi")
;;=> false
```