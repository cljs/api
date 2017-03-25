---
name: compiler-options/main
see also:
  - compiler-options/asset-path
  - compiler-options/optimizations
---

## Summary

Specifies an entry point namespace. Behavior depends on [doc:compiler-options/optimizations]:

- `:simple`,`:advanced` - only namespaces reachable from main are built
- `:none` - all namespaces are built, but the
[doc:compiler-options/output-to] file will be generated such that main is executed
for the appropriate [doc:compiler-options/target] (browser or Node).

```clj
:main "foo.bar"
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/target]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/target.md
[doc:compiler-options/output-to]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-to.md
