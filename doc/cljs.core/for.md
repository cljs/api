## Name
cljs.core/for

## Type
macro

## Signature
[seq-exprs body-expr]

## Description

List comprehension.

Takes a vector of one or more binding-form/collection-expr pairs, each followed
by zero or more modifiers, and yields a lazy sequence of evaluations of expr.

Collections are iterated in a nested fashion, rightmost fastest, and nested
coll-exprs can refer to bindings created in prior binding-forms. Supported
modifiers are: `:let [binding-form expr ...]`, `:while test`, `:when test`.

## Related
cljs.core/doseq
cljs.core/doall
special/recur

## TODO

This description is completely unreadable to someone new to the
language and confusing even to someone with moderate experience (ie: me)

Need to simplify and provide an inline example.
