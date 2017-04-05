---
name: compiler-options/static-fns
see also:
---

## Summary

Controls how multi-arity function calls are generated. A "static" call
means the dispatch to the appropriate arity is handled at compile time (better
performance), whereas a "dynamic" call means the dispatch is handled at run time
(allows safer redefinition in REPL). Static is enabled by default in advanced
[doc:compiler-options/optimizations].

```clj
:static-fns true
```

## Details

See [Static-Free ClojureScript REPL](http://blog.fikesfarm.com/posts/2016-04-14-static-free-clojurescript-repl.html)
for details.

## Examples

With the following multi-arity function `foo`:

```clj
(defn foo
  ([] "zero")
  ([x] "one")
  ([x & y] "multi"))
```

When static is disabled,:

```clj
          ;; compiles to...
(foo)     ;;  foo.call(null)
(foo 1)   ;;  foo.call(null,(1))
(foo 1 2) ;;  foo.call(null,(1),(2))
```

When static is enabled:

```clj
          ;; compiles to...
(foo)     ;;  foo..._arity$0()
(foo 1)   ;;  foo..._arity$1((1))
(foo 1 2) ;;  foo..._arity$variadic((1),cljs.core.array_seq([(2)], 0))
```

If `foo` was redefined to have an arity removed, any previous static calls to
the removed arity would be broken, whereas previous dynamic calls would
remain working as expected.

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
