---
name: compiler-options/infer-externs
see also:
  - cljs.core/*warn-on-infer*
  - compiler-options/externs
---

## Summary

A helpful facility for generating [doc:compiler-options/externs] whenever a
[doc:cljs.core/.] form is used on a type-hinted symbol `^js/Foo.Bar x`.
Enable [doc:cljs.core/*warn-on-infer*] to be warned of failed inferences.
Successfully inferred externs are written to `inferred_externs.js` in
[doc:compiler-options/output-dir].

```clj
:infer-externs true
```

## Details

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/.]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/DOT.md
[doc:compiler-options/output-dir]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-dir.md
[doc:compiler-options/externs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/externs.md
[doc:cljs.core/*warn-on-infer*]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/STARwarn-on-inferSTAR.md
