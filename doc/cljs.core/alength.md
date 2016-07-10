---
name: cljs.core/alength
related:
  - cljs.core/count
---

## Signature
[a]


## Details

For interop, it returns the length of a JavaScript array or string.


## Examples

```clj
(def a #js [1 2 3])

(alength a)
;;=> 3

(.-length a)
;;=> 3

(aget a "length")
;;=> 3

(count a)
;;=> 3
```