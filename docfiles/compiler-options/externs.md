---
name: compiler-options/externs
see also:
  - compiler-options/infer-externs
---

## Summary

Files declaring JavaScript symbols that should not be munged under advanced
[doc:compiler-options/optimizations].

- Check [cljsjs](http://cljsjs.github.io) for curated externs for popular libraries.
- See [Creating Externs](https://github.com/cljsjs/packages/wiki/Creating-Externs)
for how to write them.
- Use [doc:compiler-options/infer-externs] to help generate them.

```clj
:externs ["react-externs.js"
          "jquery-externs.js"]
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/infer-externs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/infer-externs.md
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
