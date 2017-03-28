---
name: compiler-options/libs
see also:
  - compiler-options/foreign-libs
  - compiler-options/npm-deps
---

## Summary

Paths to JavaScript libraries that you wish to include
in the build.  Libs must be proper Google Closure namespaces,
else use [doc:compiler-options/foreign-libs] or
[doc:compiler-options/npm-deps].

```clj
:libs ["src/js"                      ;; <-- all files in directory
       "src/org/example/example.js"] ;; <-- single file
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/npm-deps]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/npm-deps.md
[doc:compiler-options/foreign-libs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/foreign-libs.md
