---
name: compiler-options/fn-invoke-direct
see also:
  - compiler-options/static-fns
---

## Summary

Requires [doc:compiler-options/static-fns] `true`. This option emits slightly
different code that can speed up your code around 10-30%. Higher order function
that don’t implement the IFn protocol are normally called with `f.call(null,
arg0, arg1 ...)`.  With this option enabled the compiler calls them with a
faster `f(arg0, arg1 ...)` instead.

```clj
:fn-invoke-direct true
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/static-fns]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/static-fns.md
