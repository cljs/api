---
name: cljs.core/cond->
see also:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/cond->>
  - cljs.core/cond
---

## Summary

## Details

Takes an expression and a set of test/form pairs. Threads `expr` (via `->`)
through each form for which the corresponding test expression is true.

Note that, unlike `cond` branching, `cond->` threading does not short circuit
after the first true test expression.

## Examples

```clj
(def a 12)
(cond-> a
  (> a 10) (str " is greater than 10")
  (< a 20) (str " and less than 20"))
;;=> "12 is greater than 10 and less than 20"
```

## Signature
[expr & clauses]
