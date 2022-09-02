---
name: syntax/function
display as: "#() function"
clojure doc: http://clojure.org/reference/reader#_dispatch
see also:
  - syntax/arg
  - cljs.core/fn
  - cljs.core/defn
  - cljs.core/partial
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

Quote the form to see how the reader expands it:

```clj
'#(+ %1 %2)
;;=> (fn* [p1__11# p2__12#] (+ p1__11# p2__12#))
```

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4 5)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/arg]:https://github.com/cljs/api/blob/master/docfiles/syntax/arg.md
