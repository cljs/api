---
name: compiler-options/language-out
see also:
  - compiler-options/language-in
---

## Summary

Set the output language for Google Closure Compiler.

```clj
:language-out :no-transpile ;; default
```

## Details

Available options (`:ecmascript...` can be replaced with `:es...` as shorthand):

- `:no-transpile` - use the same option from [doc:compiler-options/language-in]
- `:ecmascript3` - 90's JavaScript
- `:ecmascript5` - Traditional JavaScript
- `:ecmascript5-strict` - Nitpicky, traditional JavaScript
- `:ecmascript6-typed` - A superset of ES6 which adds Typescript-style type declarations. Always strict.
- `:ecmascript-2015` - ECMAScript standard approved in 2015
- `:ecmascript-2016` - ECMAScript standard approved in 2016. Adds the exponent operator `**`.
- `:ecmascript-2017` - ECMAScript standard approved in 2017. Adds `async`/`await`.
- `:ecmascript-next` - ECMAScript latest draft standard.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/language-in]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/language-in.md
