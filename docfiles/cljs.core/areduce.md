---
name: cljs.core/areduce
see also:
  - cljs.core/reduce
---

## Summary

## Details

For quickly reducing an expression `expr` across a JavaScript array `a`.  The
expression can use `ret` as the current result, which is initialized to `init`.
It can also use `idx` to get the current index.

## Examples

```clj
(def a #js [1 2 3])
(areduce a i ret 0 (+ ret (aget a i)))
;;=> 6
```
