---
name: cljs.core/finally
see also:
  - cljs.core/try
  - cljs.core/catch
  - cljs.core/throw
---

## Summary

## Details

`finally` should be the last form inside of a `try` expression. It is optional.

`finally` clauses are always evaluated for their side effects whether there was
an error or not, but they are never the return value of a `try` expression.

## Examples
