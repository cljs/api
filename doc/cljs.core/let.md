## Name
cljs.core/let

## Type
macro

## Signature
[bindings & body]

## Description

Binds expressions to symbols and makes those symbols available only within
`body`.

`bindings` should be a vector with an even number of forms, ie: `[a1 b1, a2 b2,
a3 b3]`. The first item in a pair (the `a`s) should be a symbol that is assigned
the evaluation of the second item (the `b`s). These symbols (the `a`s) are then
available within `body` (and not outside of `body`).

Another way to think about this is that the binding symbols in `let` are like
local `def`s that are only available within `let`'s scope.

In addition to direct symbol binding, `let` supports a destructuring syntax to
"break apart" collections into multiple symbols. This destructuring syntax is
like it's own [mini-language] and allows for succinct code.

`let` is a wrapper over one of ClojureScript's [special forms] and is a
fundamental building block of the language. Many macros rely on `let`s binding
syntax and scope rules.

[mini-language]:http://blog.jayfields.com/2010/07/clojure-destructuring.html
[special forms]:http://clojure.org/special_forms

## Related
cljs.core/letfn
cljs.core/if-let
