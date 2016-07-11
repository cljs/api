---
name: syntax/unquote-splicing
display as: "~@ unquote splicing"
see also:
  - syntax/syntax-quote
  - syntax/unquote
---

## Summary

## Details

(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Intended for use inside a [doc:syntax/syntax-quote].

Forces evaluation of the following form and expands its children into the
parent form.

## Examples

```clj
(def foo '[a b c])
`(~@foo)
;;=> (a b c)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/syntax-quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/syntax-quote.md
