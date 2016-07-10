---
name: cljs.core/cond->>
related:
  - cljs.core/->
  - cljs.core/->>
  - cljs.core/cond->
  - cljs.core/cond
---

## Signature
[expr & clauses]


## Details

Takes an expression and a set of test/form pairs. Threads `expr` (via `->>`)
through each form for which the corresponding test expression is true.

Note that, unlike `cond` branching, `cond->>` threading does not short circuit
after the first true test expression.


## Examples

```clj
(def filter? true)
(def sum? true)

(cond->> [1 2 3 4]
  filter? (filter even?)
  sum?    (reduce +))
;;=> 6
```
