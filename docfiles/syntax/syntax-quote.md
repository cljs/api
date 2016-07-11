---
name: syntax/syntax-quote
display: "` syntax quote"
see also:
  - syntax/auto-gensym
  - syntax/quote
  - syntax/unquote
  - syntax/unquote-splicing
---

## Summary

## Details

(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Prevent evaluation of the following form.

Adds namespace-qualification to any symbols inside the following form by
resolving them in the current context.

Any non-namespaced symbols ending with `#` are replaced with unique symbols.
See [doc:syntax/auto-gensym].

## Examples

```clj
`foo
;;=> cljs.user/foo

`foo#
;;=> foo__20418__auto__

`(def foo 1)
;;=> (def cljs.user/foo 1)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/auto-gensym]:https://github.com/cljs/api/blob/master/docfiles/syntax/auto-gensym.md
