## Name
cljs.core/if-let

## Signature
[[x test] then]
[[x test] then else]

## Description

When `test` is logical true, evaluates `then` with the value of `test` bound to
`x`. Otherwise, evaluates `else` with no bindings.

`else` defaults to nil.

## Related
cljs.core/when-let
special/if
