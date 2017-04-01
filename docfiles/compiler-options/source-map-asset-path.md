---
name: compiler-options/source-map-asset-path
see also:
  - compiler-options/source-map
  - compiler-options/source-map-path
---

## Summary

A compiled JS file can contain a `sourceMappingURL` comment, which cljs uses
to locate the [doc:compiler-options/source-map] JSON file.
You can prepend this location with a custom path if required by
your web server configuration.

```clj
:source-map-asset-path "..."  ;; <-- custom server path of source map metadata
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/source-map]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/source-map.md
