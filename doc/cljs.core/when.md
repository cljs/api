## Name
cljs.core/when

## Signature
[test & body]

## Description

Evaluates `test`. If logical true, evaluates `body` in an implicit `do`.

`when` is often used instead of `if` for conditions that do not have an "else".

## Related
cljs.core/when-not
cljs.core/when-let
special/if
