---
name: syntax/function
display as: "#() function"
see also:
  - syntax/arg
  - cljs.core/fn
  - cljs.core/defn
  - cljs.core/partial
clojure doc: http://clojure.org/reference/reader#_dispatch
---

## Summary

Shorthand for creating an anonymous function. Use [doc:syntax/arg] to refer
to the arguments.

- `#(...)` => `(fn [args] (...))`

## Details

Use the following to access the implicit function arguments:

- `%` or `%1` for first argument.
- `%2`, `%3` and so on for subsequent arguments
- `%&` for the rest of the arguments after the highest individually referenced argument

Note that `#(1)` does not create a function that returns `1`, for the same
reason that `(1)` does evaluate to `1`.

`#()` forms cannot be nested, since this would create an ambiguity between the
automatically assigned `%` argument names.

## Examples

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4 5)
```
