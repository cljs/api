---
name: cljs.core/assert
see also:
---

## Summary

`(assert x)` - throw exception if `x` is false  
`(assert x message)` - include message if assertion fails

Returns `nil`.

## Details

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
