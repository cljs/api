---
name: special/finally
related:
  - special/try
  - special/catch
  - special/throw
---

## Signature
[expr*]


## Details

`finally` should be the last form inside of a `try` expression. It is optional.

`finally` clauses are always evaluated for their side effects whether there was
an error or not, but they are never the return value of a `try` expression.
