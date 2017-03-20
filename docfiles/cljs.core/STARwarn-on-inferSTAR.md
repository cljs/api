---
name: cljs.core/*warn-on-infer*
see also:
---

## Summary

For interop purposes, this is used in conjunction with the compiler option
`:infer-externs true` to emit a warning whenever a symbol is in danger of being
renamed in advanced optimizations mode (i.e. compiler cannot infer an extern).
Defaults to false.  When set to true, warnings are activated for the rest of the file thereafter.

```clj
(set! *warn-on-infer* true)

(defn wrap-baz [x] (.baz x))
;; WARNING: Cannot infer target type in expression (. x baz)

(defn wrap-baz [^js/Foo.Bar x] (.baz x))
;; no more warning after x is annotated
```

## Details

See [externs inference](https://clojurescript.org/guides/externs#externs-inference) for full details.

Somewhat analogous to [`*warn-on-reflection*`](https://clojure.github.io/clojure/clojure.core-api.html#clojure.core/*warn-on-reflection*)
in Clojure.

## Examples
