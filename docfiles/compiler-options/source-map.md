---
name: compiler-options/source-map
see also:
  - compiler-options/source-map-path
---

## Summary

To help debugging at runtime, creates a standard source map JSON file used by Node
and browsers to map compiled JS lines to their original CLJS files.
Use a string path if there is a single output file expected, otherwise use `true`
to auto-assign source map filenames.

```clj
:source-map "out/main.js.map"
:source-map true ;; <-- use if `:optimizations :none`, or any `:modules`
```

## Details

Multiple files are expected when [doc:compiler-options/optimizations] is none,
or if [doc:compiler-options/modules] are specified.

See [ClojureScript Source Maps](https://clojurescript.org/reference/source-maps)
for details.

See [Source Map Revision 3 Proposal](https://docs.google.com/document/d/1U1RGAehQwRypUTovF1KRlpiOFze0b-_2gc6fAH0KY0k)
for details on the output JSON format.

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:compiler-options/optimizations]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/optimizations.md
[doc:compiler-options/modules]:https://github.com/cljs/api/blob/master/docfiles/compiler-options/modules.md
