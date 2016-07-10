---
name: cljs.core/fn
related:
  - cljs.core/defn
  - cljs.core/defn-
---

## Signature
[name? [params*] prepost-map? body]
[name? ([params*] prepost-map? body)+]


## Description

Defines a function.

`name?` is an optional name of the function to be used inside `body`. This is
useful for recursive calls. Note that `name?` in `fn` is not the same as the
`name` argument to `defn`, which defines a global symbol for the function.

`params*` are the arguments to the function and a binding form for the symbols
that the arguments will take inside the body of the function. Functions can have
arity of 0-20 and there is no runtime enforcement of arity when calling a
function (just like in JavaScript).

`prepost-map?` is an optional map with optional keys `:pre` and `:post` that
contain collections of [pre or post conditions](http://blog.fogus.me/2009/12/21/clojures-pre-and-post/)
for the function.

`body` is a series of expressions that execute when the function is called. The
arguments to the function are mapped to symbols in `params*` and are available
in `body`. The value of the last expression in `body` is the return value of
calling the function.


## TODO

need to provide a link to some function definition examples; we probably need
a whole page dedicated to fn expressions