---
name: compiler-options/modules
see also:
---

## Summary

Employ code-splitting to replace the usual [doc:compiler-options/output-to]
file with separate logical modules. Every namespace is assigned to exactly
one logical module. Code-motion will enable code to be pulled across module
boundaries when possible, but this is avoided if the compiler knows it will
already be included on the page:

- `:output-to` - output file of a module
- `:entries` - namespaces to include (modules must have no entries in common)
- `:depends-on` - modules expected to be included on the page beforehand

```clj
:modules
{:foo {:output-to "js/foo.js" :entries #{"my.foo"}}
 :bar {:output-to "js/bar.js" :entries #{"my.bar"} :depends-on #{:foo}}
 :baz {:output-to "js/baz.js" :entries #{"my.baz"} :depends-on #{:bar}}

 :cljs-base ;; <-- leftover namespaces are placed here for you
 {:output-to "js/cljs_base.js"}} ;; <-- specify to change base output
```

## Details

Use this option to specify a module containing only the code that a certain page
will need, saving on file size and thus load time.

Only supported with simple and advanced [doc:compiler-options/optimizations].

Set the top-level [doc:compiler-options/source-map] to `true` to build source
maps for all modules.

For dynamic module loading at runtime, see [conwip-modules](https://github.com/bendyworks/conwip-modules).

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/source-map]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/source-map.md
[doc:compiler-options/output-to]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/output-to.md
