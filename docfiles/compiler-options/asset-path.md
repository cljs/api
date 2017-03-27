---
name: compiler-options/asset-path
see also:
  - compiler-options/output-dir
  - compiler-options/main
---

## Summary

A path to [doc:compiler-options/output-dir] relative to your web server's root,
if not already specified as such.
Only required when [doc:compiler-options/optimizations] is `:none` and
[doc:compiler-options/main] is set, because the generated
[doc:compiler-options/output-to] file will then need to load other parts of the
build at runtime.

```clj
:output-to "resources/public/main.js"
:output-dir "resources/public/js/compiled/out"
:asset-path "js/compiled/out" ;; <--- relative URL of output-dir
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/main]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/main.md
[doc:compiler-options/output-dir]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-dir.md
[doc:compiler-options/output-to]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-to.md
