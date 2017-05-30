---
name: compiler-options/optimize-constants
see also:
---

## Summary

Build a constant table to prevent duplicate allocation of keywords and symbols.
Defaults to true for advanced [doc:compiler-options/optimizations], otherwise false.

```clj
:optimize-constants true
```

## Details

Constants are stored as `cljs.core.cst$...` variables under the
`cljs.core.constants` namespace.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
