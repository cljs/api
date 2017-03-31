---
name: compiler-options/source-map-path
see also:
  - compiler-options/source-map
  - compiler-options/source-map-asset-path
---

## Summary

Source maps associate compiled JS lines to their original CLJS files. Use this
option if you configured your web server to host these original CLJS files at a
custom path. If present, it is prepended to all `sources` inside the
[doc:compiler-options/source-map] file.

```clj
:source-map-path "..."  ;; <-- absolute or relative path
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/source-map]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/source-map.md
