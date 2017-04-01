---
name: compiler-options/cache-analysis
see also:
  - compiler-options/cache-analysis-format
---

## Summary

Cache compiler analysis to disk to enable faster cold build and REPL startup times.
Defaults to true in REPL and when [doc:compiler-options/optimizations] is disabled.
Each CLJS file is cached to [doc:compiler-options/output-dir] with analysis
formatted by [doc:compiler-options/cache-analysis-format].

- `foo.cljs` - copied source
- `foo.cljs.cache.json` - analysis in transit format, or
- `foo.cljs.cache.edn` - analysis in edn format

```clj
:cache-analysis true
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/output-dir]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-dir.md
[doc:compiler-options/cache-analysis-format]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/cache-analysis-format.md
