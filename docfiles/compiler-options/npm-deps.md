---
name: compiler-options/npm-deps
see also:
  - compiler-options/foreign-libs
---

## Summary

Include libraries from [npm](http://npmjs.com).  This experimental feature
downloads the dependencies from npm and generates a [doc:compiler-options/foreign-libs]
entry for each.

```clj
:npm-deps {:react "15.4.2"
           :lodash "4.17.4"}
```

## Details

See [Requiring Node.js modules from ClojureScript namespaces](https://anmonteiro.com/2017/03/requiring-node-js-modules-from-clojurescript-namespaces/)
for more details.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/foreign-libs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/foreign-libs.md
