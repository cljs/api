## Name
cljs.core/*3

## Description

Only usable from a REPL.

Holds the result of the third to last expression.

## Related
cljs.core/*1
cljs.core/*2
cljs.core/*e

## Examples

```clj
(+ 1 2 3 4)
;;=> 10

(+ 4 8)
;;=> 12

(+ 1 2)
;;=> 3

*3
;;=> 10

(inc *3)
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
