---
name: cljs.core/for
see also:
  - cljs.core/doseq
  - cljs.core/doall
  - special/recur
---

## Summary

## Details

List comprehension.

Takes a vector of one or more binding-form/collection-expr pairs, each followed
by zero or more modifiers, and yields a lazy sequence of evaluations of expr.

Collections are iterated in a nested fashion, rightmost fastest, and nested
coll-exprs can refer to bindings created in prior binding-forms. Supported
modifiers are: `:let [binding-form expr ...]`, `:while test`, `:when test`.

## Examples
