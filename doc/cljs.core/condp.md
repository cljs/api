---
name: cljs.core/condp
related:
  - cljs.core/cond
  - special/if
---

## Signature
[pred expr & clauses]


## Description

Takes a binary predicate, an expression, and a set of clauses. There are two
kinds of clauses:

Binary clause: `test-expr` `result-expr`

Ternary clause: `test-expr` `:>>` `result-fn`<br />
(Note: `:>>` is an ordinary keyword)

For each clause, `(pred test-expr expr)` is evaluated. If it returns logical
true, the clause is a match.

If a binary clause matches, its `result-expr` is returned.

If a ternary clause matches, its `result-fn` is called with the result of the
predicate and returned by `condp`. `result-fn` should take one argument.

A single default expression can follow the clauses, and its value will be
returned if no clause matches.

If no default expression is provided and no clause matches, an Error is thrown.
