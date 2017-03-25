---
name: compiler-options/main
see also:
  - compiler-options/asset-path
  - compiler-options/optimizations
---

## Summary

Specifies an entry point namespace. When used with [doc:compiler-options/optimizations]
`:simple` or `:advanced`, only namespaces reachable from main are included in the
build.

When used with `:none`, all namespaces are still built to separate files, but the
[doc:compiler-options/output-to] file will be generated such that main is executed
for the given [doc:compiler-options/target] (browser or Node).

```clj
:main "foo.bar"
```

## Details

## Examples
