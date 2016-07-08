## Name
cljs.core/*1

## Type
var

## Description

Only usable from a REPL.

Holds the result of the last expression.

## Related
cljs.core/*2
cljs.core/*3
cljs.core/*e

## Example#30a861

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

