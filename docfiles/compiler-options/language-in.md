---
name: compiler-options/language-in
see also:
  - compiler-options/language-out
---

## Summary

Set the input language for Google Closure Compiler.

```clj
:language-in :ecmascript6 ;; default
```

## Details

Available options (`:ecmascript...` can be replaced with `:es...` as shorthand):

- `:ecmascript3` - 90's JavaScript.
- `:ecmascript5` - Traditional JavaScript.
- `:ecmascript5-strict` - Nitpicky, traditional JavaScript.
- `:ecmascript6-typed` - A superset of ES6 which adds Typescript-style type declarations. Always strict.
- `:ecmascript-2015` - ECMAScript standard approved in 2015.
- `:ecmascript-2016` - ECMAScript standard approved in 2016. Adds the exponent operator `**`.
- `:ecmascript-2017` - ECMAScript standard approved in 2017. Adds `async`/`await`.
- `:ecmascript-next` - ECMAScript latest draft standard.

## Examples
