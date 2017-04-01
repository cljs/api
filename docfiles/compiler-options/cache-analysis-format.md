---
name: compiler-options/cache-analysis-format
see also:
---

## Summary

Set the output format of the analysis cache if [doc:compiler-options/cache-analysis]
is enabled. Defaults to [transit json](https://github.com/cognitect/transit-format).

```clj
                                 ;; for foo.cljs
:cache-analysis-format :transit  ;; <-- foo.cljs.cache.json (default)
:cache-analysis-format :edn      ;; <-- foo.cljs.cache.edn
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/cache-analysis]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/cache-analysis.md
