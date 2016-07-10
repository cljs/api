---
name: cljs.core/*1
related:
  - cljs.core/*2
  - cljs.core/*3
  - cljs.core/*e
---

## Description

Only usable from a REPL.

Holds the result of the last expression.


## Examples

```clj
(+ 1 2 3 4)
;;=> 10

*1
;;=> 10

(inc *1)
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