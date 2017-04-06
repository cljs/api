---
name: cljs.core/*assert*
see also:
  - cljs.core/assert
  - compiler-options/elide-asserts
---

## Summary

Internally used to remove all calls to [doc:cljs.core/assert] when the compiler
option [doc:compiler-options/elide-asserts] is set to true.  Not to be used
manually.

## Details

This variable cannot be set at runtime in JVM ClojureScript, but can be in
self-hosted ClojureScript.

## Examples

The following only works in self-hosted ClojureScript:

```clj
(assert (= 1 2))
;; Error: Assert failed: false

(set! *assert* false)
(assert (= 1 2))
;;=> nil
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/assert]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/assert.md
[doc:compiler-options/elide-asserts]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/elide-asserts.md
