---
name: compiler-options/rewrite-polyfills
see also:
---

## Summary

Rewrite any ES6+ feature usage with Closure Library's polyfills.
[doc:compiler-options/language-in] must be at least `:es6`.  Defaults to false.

```clj
:rewrite-polyfills true
```

## Details

All supported polyfills listed below (from [polyfills.txt]):

[polyfills.txt]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/polyfills.txt

| Native symbol                      | Native version | Polyfill version | Polyfill library                       |
|:-----------------------------------|:---------------|:-----------------|:---------------------------------------|
| `Array.from`                       | es6            | es3              | [es6/array/from]                       |
| `Array.of`                         | es6            | es3              | [es6/array/of]                         |
| `Array.prototype.copyWithin`       | es6            | es3              | [es6/array/copywithin]                 |
| `Array.prototype.entries`          | es6            | es3              | [es6/array/entries]                    |
| `Array.prototype.fill`             | es6            | es3              | [es6/array/fill]                       |
| `Array.prototype.find`             | es6            | es3              | [es6/array/find]                       |
| `Array.prototype.findIndex`        | es6            | es3              | [es6/array/findindex]                  |
| `Array.prototype.includes`         | es7            | es3              | [es6/array/includes]                   |
| `Array.prototype.keys`             | es6            | es3              | [es6/array/keys]                       |
| `Array.prototype.values`           | es6            | es3              | [es6/array/values]                     |
| `Map`                              | es6            | es3              | [es6/map]                              |
| `Math.acosh`                       | es6            | es3              | [es6/math/acosh]                       |
| `Math.asinh`                       | es6            | es3              | [es6/math/asinh]                       |
| `Math.atanh`                       | es6            | es3              | [es6/math/atanh]                       |
| `Math.cbrt`                        | es6            | es3              | [es6/math/cbrt]                        |
| `Math.clz32`                       | es6            | es3              | [es6/math/clz32]                       |
| `Math.cosh`                        | es6            | es3              | [es6/math/cosh]                        |
| `Math.expm1`                       | es6            | es3              | [es6/math/exp1m]                       |
| `Math.hypot`                       | es6            | es3              | [es6/math/hypot]                       |
| `Math.imul`                        | es6            | es3              | [es6/math/imul]                        |
| `Math.log10`                       | es6            | es3              | [es6/math/log10]                       |
| `Math.log1p`                       | es6            | es3              | [es6/math/log1p]                       |
| `Math.log2`                        | es6            | es3              | [es6/math/log2]                        |
| `Math.sign`                        | es6            | es3              | [es6/math/sign]                        |
| `Math.sinh`                        | es6            | es3              | [es6/math/sinh]                        |
| `Math.tanh`                        | es6            | es3              | [es6/math/tanh]                        |
| `Math.trunc`                       | es6            | es3              | [es6/math/trunc]                       |
| `Number.EPSILON`                   | es6            | es3              | [es6/number/constants]                 |
| `Number.MAX_SAFE_INTEGER`          | es6            | es3              | [es6/number/constants]                 |
| `Number.MIN_SAFE_INTEGER`          | es6            | es3              | [es6/number/constants]                 |
| `Number.isFinite`                  | es6            | es3              | [es6/number/isfinite]                  |
| `Number.isInteger`                 | es6            | es3              | [es6/number/isinteger]                 |
| `Number.isNaN`                     | es6            | es3              | [es6/number/isnan]                     |
| `Number.isSafeInteger`             | es6            | es3              | [es6/number/issafeinteger]             |
| `Object.assign`                    | es6            | es3              | [es6/object/assign]                    |
| `Object.entries`                   | es8            | es3              | [es6/object/entries]                   |
| `Object.getOwnPropertyDescriptors` | es8            | es5              | [es6/object/getownpropertydescriptors] |
| `Object.getOwnPropertySymbols`     | es6            | es5              | [es6/object/getownpropertysymbols]     |
| `Object.is`                        | es6            | es3              | [es6/object/is]                        |
| `Object.setPrototypeOf`            | es6            | es5              | [es6/object/setprototypeof]            |
| `Object.values`                    | es8            | es3              | [es6/object/values]                    |
| `Promise`                          | es6            | es3              | [es6/promise]                          |
| `Proxy`                            | es6            | es6              |                                        |
| `Reflect.apply`                    | es6            | es3              | [es6/reflect/apply]                    |
| `Reflect.construct`                | es6            | es3              | [es6/reflect/construct]                |
| `Reflect.defineProperty`           | es6            | es5              | [es6/reflect/defineproperty]           |
| `Reflect.deleteProperty`           | es6            | es3              | [es6/reflect/deleteproperty]           |
| `Reflect.get`                      | es6            | es5              | [es6/reflect/get]                      |
| `Reflect.getOwnPropertyDescriptor` | es6            | es5              | [es6/reflect/getownpropertydescriptor] |
| `Reflect.getPrototypeOf`           | es6            | es5              | [es6/reflect/getprototypeof]           |
| `Reflect.has`                      | es6            | es3              | [es6/reflect/has]                      |
| `Reflect.isExtensible`             | es6            | es3              | [es6/reflect/isextensible]             |
| `Reflect.ownKeys`                  | es6            | es5              | [es6/reflect/ownkeys]                  |
| `Reflect.preventExtensions`        | es6            | es3              | [es6/reflect/preventextensions]        |
| `Reflect.set`                      | es6            | es5              | [es6/reflect/set]                      |
| `Reflect.setPrototypeOf`           | es6            | es5              | [es6/reflect/setprototypeof]           |
| `Set`                              | es6            | es3              | [es6/set]                              |
| `String.fromCodePoint`             | es6            | es3              | [es6/string/fromcodepoint]             |
| `String.prototype.codePointAt`     | es6            | es3              | [es6/string/codepointat]               |
| `String.prototype.endsWith`        | es6            | es3              | [es6/string/endswith]                  |
| `String.prototype.includes`        | es6            | es3              | [es6/string/includes]                  |
| `String.prototype.normalize`       | es6            | es6              |                                        |
| `String.prototype.padEnd`          | es8            | es3              | [es6/string/padend]                    |
| `String.prototype.padStart`        | es8            | es3              | [es6/string/padstart]                  |
| `String.prototype.repeat`          | es6            | es3              | [es6/string/repeat]                    |
| `String.prototype.startsWith`      | es6            | es3              | [es6/string/startswith]                |
| `String.raw`                       | es6            | es6              |                                        |
| `WeakMap`                          | es6            | es3              | [es6/weakmap]                          |
| `WeakSet`                          | es6            | es3              | [es6/weakset]                          |

[es6/array/from]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/from.js
[es6/array/of]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/of.js
[es6/array/copywithin]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/copywithin.js
[es6/array/entries]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/entries.js
[es6/array/fill]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/fill.js
[es6/array/find]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/find.js
[es6/array/findindex]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/findindex.js
[es6/array/includes]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/includes.js
[es6/array/keys]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/keys.js
[es6/array/values]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/array/values.js
[es6/map]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/map.js
[es6/math/acosh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/acosh.js
[es6/math/asinh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/asinh.js
[es6/math/atanh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/atanh.js
[es6/math/cbrt]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/cbrt.js
[es6/math/clz32]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/clz32.js
[es6/math/cosh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/cosh.js
[es6/math/exp1m]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/exp1m.js
[es6/math/hypot]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/hypot.js
[es6/math/imul]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/imul.js
[es6/math/log10]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/log10.js
[es6/math/log1p]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/log1p.js
[es6/math/log2]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/log2.js
[es6/math/sign]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/sign.js
[es6/math/sinh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/sinh.js
[es6/math/tanh]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/tanh.js
[es6/math/trunc]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/math/trunc.js
[es6/number/constants]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/constants.js
[es6/number/constants]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/constants.js
[es6/number/constants]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/constants.js
[es6/number/isfinite]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/isfinite.js
[es6/number/isinteger]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/isinteger.js
[es6/number/isnan]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/isnan.js
[es6/number/issafeinteger]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/number/issafeinteger.js
[es6/object/assign]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/assign.js
[es6/object/entries]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/entries.js
[es6/object/getownpropertydescriptors]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/getownpropertydescriptors.js
[es6/object/getownpropertysymbols]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/getownpropertysymbols.js
[es6/object/is]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/is.js
[es6/object/setprototypeof]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/setprototypeof.js
[es6/object/values]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/object/values.js
[es6/promise]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/promise.js
[es6/reflect/apply]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/apply.js
[es6/reflect/construct]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/construct.js
[es6/reflect/defineproperty]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/defineproperty.js
[es6/reflect/deleteproperty]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/deleteproperty.js
[es6/reflect/get]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/get.js
[es6/reflect/getownpropertydescriptor]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/getownpropertydescriptor.js
[es6/reflect/getprototypeof]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/getprototypeof.js
[es6/reflect/has]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/has.js
[es6/reflect/isextensible]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/isextensible.js
[es6/reflect/ownkeys]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/ownkeys.js
[es6/reflect/preventextensions]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/preventextensions.js
[es6/reflect/set]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/set.js
[es6/reflect/setprototypeof]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/reflect/setprototypeof.js
[es6/set]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/set.js
[es6/string/fromcodepoint]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/fromcodepoint.js
[es6/string/codepointat]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/codepointat.js
[es6/string/endswith]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/endswith.js
[es6/string/includes]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/includes.js
[es6/string/padend]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/padend.js
[es6/string/padstart]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/padstart.js
[es6/string/repeat]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/repeat.js
[es6/string/startswith]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/string/startswith.js
[es6/weakmap]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/weakmap.js
[es6/weakset]:https://github.com/google/closure-compiler/blob/master/src/com/google/javascript/jscomp/js/es6/weakset.js

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/language-in]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/language-in.md
