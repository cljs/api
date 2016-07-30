---
name: syntax/namespace
display as: "/ namespace slash"
see also:
  - syntax/dot
---

## Summary

The left side of `/` in a keyword or symbol is a namespace.

- `foo/bar`
- `:foo/bar`

## Details

`/` can appear once inside a symbol. The left side of `/` must always be a namespace.
The right side completes the reference to the symbol.

It should be noted that this __differs from Clojure__.  For example,
notice `/` appearing before `PersistentVector` in Clojure:

- Clojure: `clojure.lang.PersistentVector/EMPTY`
- ClojureScript: `cljs.core/PersistentVector.EMPTY`

[doc:cljs.core//] is the division function if it is by itself.

See [doc:syntax/dot] for usage of dots on either side of `/`

## Examples

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/dot]:https://github.com/cljs/api/blob/master/docfiles/syntax/dot.md
[doc:cljs.core//]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/SLASH.md
