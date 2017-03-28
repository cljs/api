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
Successful inferences are written to `inferred_externs.js` in
[doc:compiler-options/output-dir].

```clj
:infer-externs true
```

## Details

See [Externs](https://clojurescript.org/guides/externs) for more details.

## Examples

Given the following cljs code

```clj
(defn wrap-baz [^js/Foo.Bar x]
  (.baz x))
```

these externs will be created in `inferred_externs.js`:

```js
var Foo = {};
Foo.Bar = function() {};
Foo.Bar.prototype.baz = function() {};
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/.]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/DOT.md
[doc:compiler-options/output-dir]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-dir.md
[doc:compiler-options/externs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/externs.md
[doc:cljs.core/*warn-on-infer*]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/STARwarn-on-inferSTAR.md
