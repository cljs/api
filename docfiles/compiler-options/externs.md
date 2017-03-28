---
name: compiler-options/externs
see also:
---

## Summary

Files declaring JavaScript symbols—to prevent their munging when
[doc:compiler-options/optimizations] is `:advanced`.
Check [cljsjs](http://cljsjs.github.io) for curated externs for popular libraries,
or see [Creating Externs](https://github.com/cljsjs/packages/wiki/Creating-Externs)
for details on writing them.

```clj
:externs ["react-externs.js"
          "jquery-externs.js"]
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
