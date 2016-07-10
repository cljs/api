---
name: cljs.core/assert
---

## Signature
[expr]
[expr message]


## Details

Evaluates expression `expr` and throws an exception if it does not evaluate to
logical true.  Exception will include `message` if given.

Returns `nil`.


## Examples

```clj
(assert true)
;;=> nil

(assert false)
;;=> Uncaught Error: Assert failed: false

(assert (= 1 2) "1 is not 2")
;;=> Uncaught Error: Assert failed: 1 is not 2
;;   (= 1 2)
```