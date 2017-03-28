---
name: compiler-options/pseudo-names
see also:
  - compiler-options/pretty-print
---

## Summary

Allows you to retain var names similar to their original when compiling
advanced [doc:compiler-options/optimizations].
Enable this along with [doc:compiler-options/pretty-print] if you wish to
read the advanced output for debugging purposes.

```clj
:pseudo-names true
```

## Details

See [Implications of object property flattening](https://developers.google.com/closure/compiler/docs/limitations#implications-of-object-property-flattening)
for details on the naming scheme `foo$bar`.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/pretty-print]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/pretty-print.md
