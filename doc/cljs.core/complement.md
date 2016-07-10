---
name: cljs.core/complement
related:
  - cljs.core/not
---

## Signature
[f]


## Details

Takes a function `f` and returns a function that takes the same arguments as
`f`, has the same effects, if any, and returns the opposite truth value.


## Examples

```clj
(def a 10)
((complement #(= a %)) 12)
;;=> true
```
