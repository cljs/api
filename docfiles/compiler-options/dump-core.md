---
name: compiler-options/dump-core
see also:
---

## Summary

Dump the analysis cache of `cljs.core` into the output file, allowing you to
evaluate basic ClojureScript code at runtime using [doc:cljs.js/eval-str]
without extra setup.  Defaults to false.

```clj
:dump-core true
```

## Details

When true, adds ~5mb (330kb gzipped) to build size.

Specifically, the `cljs.core` analysis cache is written inline into the
[doc:cljs.js/empty-state] function, returning a useful default compiler state.

Otherwise, the `cljs.core` analysis cache would have to be loaded manually via:

```clj
(cljs.js/load-analysis-cache! st 'cljs.core cache)
```

## Examples

When true, the following code will allow you evaluate basic ClojureScript code
at runtime:

```clj
(require 'cljs.js)

(cljs.js/eval-str
  (cljs.js/empty-state)
  "(+ 1 2 3 4)"
  {:eval cljs.js/js-eval}
  (fn [res]
    (println res))) ;; <-- prints 10
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.js/empty-state]:https://github.com/cljs/api/blob/master/docfiles/cljs.js/empty-state.md
[doc:cljs.js/eval-str]:https://github.com/cljs/api/blob/master/docfiles/cljs.js/eval-str.md
