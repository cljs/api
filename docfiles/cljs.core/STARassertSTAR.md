---
name: cljs.core/*assert*
see also:
  - cljs.core/assert
---

## Summary

Internally used to remove all calls to [doc:cljs.core/assert] when the
compiler option `:elide-asserts` is set to true.  Not to be used manually.

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
