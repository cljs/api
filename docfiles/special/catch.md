---
name: special/catch
see also:
  - special/try
  - special/finally
  - special/throw
---

## Summary

## Details

`catch` should be used inside of a `try` expression.

`exception-type` should be the type of exception thrown (usually `js/Error` or
`js/Object`). When there is a match, the thrown exception will be bound to
`name` inside of `expr*` and `expr*` will be evaluated and returned as the value
of the `try` expression.

Since JavaScript allows you to throw anything, `exception-type` can be set to
`:default` to catch all types of exceptions.

## Examples
