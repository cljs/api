---
name: compiler-options/elide-asserts
see also:
  - cljs.core/assert
  - cljs.core/*assert*
---

## Summary

Remove all [doc:cljs.core/assert] calls during compilation, including `:pre` and
`:post` condition checks for functions. Useful for production. Defaults to
false, even in advanced mode.

```clj
:elide-asserts true
```

## Details

Does NOT specify `goog.asserts.ENABLE_ASSERTS`, which is different and used by the Closure library.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/assert]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/assert.md
