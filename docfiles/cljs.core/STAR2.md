---
name: cljs.core/*2
see also:
  - cljs.core/*1
  - cljs.core/*3
  - cljs.core/*e
---

## Summary

Holds the result of the second to last REPL expression.

## Details

## Examples

```clj
(+ 1 2 3 4)
;;=> 10

(+ 4 8)
;;=> 12

*2
;;=> 10

(inc *2)
;;=> 11
```

Note that a standalone evaluation of `*1`, `*2`, `*3`, or `*e` is not a part of
remembered history:

```clj
:first
;;=> :first

:second
;;=> :second

:third
;;=> :third

*3
;;=> :first

*2
;;=> :second

*1
;;=> :third
```
