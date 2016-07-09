## Name
special/require-macros

## Description

Only usable from a REPL.

This is a way for ClojureScript to load macros from Clojure files.
The usage is similar to the `require` form.

There is a nicer alternative if the Clojure macros file has the same name as a
ClojureScript file in the same directory, which is a common pattern.  In this
case, you can just use the `:include-macros` or `:refer-macros` flag of the
`require` form.

## Related
special/require

## Examples

```clj
(require-macros '[cljs.core.async.macros :refer [go]])
```
