---
name: syntax/js-tag
display as: "^js"
see also:
  - syntax/meta
  - syntax/js-namespace
  - compiler-options/infer-externs
---

## Summary

Add a type hint to a local binding name to prevent advanced compilation from munging property names on [doc:syntax/dot] calls—
only if [doc:compiler-options/infer-externs] is enabled.

- `^js` - short form
- `^js/React.Element` - long form (purely for documentation, see details)

## Details

A `^js` type hint on a local binding causes the ClojureScript compiler to generate externs for all subsequent property name accesses.

Technically, `^js` is just as effective as the more specific `^js/Foo.Bar`— because the full name is not actually a real Closure type.
Closure plays it safe by refusing to mangle recognized property names (belonging to *any* type) being accessed on untyped objects.

Thus, the extra type info can be used for documentation, but has no real effect on your program.

Internally, externs are generated as follows:

* `^js` externs are added to `Object.*`
* `^js/Foo.Bar` externs are added to `Foo.Bar.prototype.*`
* (in shadow-cljs all externs are added to `ShadowJS.prototype.*`)

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
[doc:compiler-options/infer-externs]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/infer-externs.md
[doc:syntax/dot]:https://github.com/cljs/api/blob/master/docfiles/syntax/dot.md
