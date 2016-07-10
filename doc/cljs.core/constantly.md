---
name: cljs.core/constantly
related:
  - cljs.core/repeatedly
---

## Signature
[x]


## Details
Returns a function that takes any number of arguments and always returns `x`.


## Examples

```clj
(def ten (constantly 10))

(ten "hi")
;;=> 10

(ten 123)
;;=> 10

(ten :whatever)
;;=> 10
```
