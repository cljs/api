---
name: cljs.core/some-fn
see also:
  - cljs.core/every-pred
  - cljs.core/some
  - cljs.core/or
---

## Summary

## Details

Takes a set of predicate functions and returns a function `f` that returns the
first logical true value returned by one of its composing predicates against any
of its arguments, else it returns logical false.

Note that `f` is short-circuiting in that it will stop execution on the first
argument that triggers a logical true result against the original predicates.

## Examples

## Signature
[p]
[p1 p2]
[p1 p2 p3]
[p1 p2 p3 & ps]
