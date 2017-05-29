---
name: compiler-options/closure-defines
see also:
  - cljs.core/goog-define
---

## Summary

Assign [doc:cljs.core/goog-define] vars with compile-time constants. Vars must
be specified as a namespace-qualified symbol, and their values must be a string,
number, or a boolean.

```clj
:closure-defines {my.core/foo "new-value"}
```

This will result in the following var being replaced:

```clj
(ns my.core)

(goog-define foo "default-value") ;; <-- replaced with "new-value"
(println foo) ;; <-- prints "new-value"
```

## Details

Be aware that a __symbol name__ is interpreted as the original name in
ClojureScript, whereas a __string name__ is interpreted as the munged name in
JavaScript:

```
;; Symbol (original name)
:closure-defines {my.core/foo! "..."}

;; String (munged name)
:closure-defines {"my.core.foo_BANG_" "..."}
```

Also note that:

- When `:optimizations :none`, closure-defines have no effect unless [doc:compiler-options/main] is specified.
- When `:optimizations :whitespace`, closure-defines have no effect.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/main]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/main.md
[doc:cljs.core/goog-define]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/goog-define.md
