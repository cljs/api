---
name: syntax/syntax-quote
display as: "` syntax quote"
clojure doc: http://clojure.org/reference/reader#syntax-quote
see also:
  - syntax/auto-gensym
  - syntax/quote
  - syntax/unquote
  - syntax/unquote-splicing
---

## Summary

A template facility for easier code generation inside macros.  Like [doc:syntax/quote],
but with more features to help resolve symbols and interpolate values.

- <code>\`(foo 123)</code> => `(cljs.user/foo 123)` - symbols become fully-qualified
- <code>\`(foo ~x)</code> => `(cljs.user/foo 123)` - interpolates the value of `x`
- <code>\`(foo ~@y)</code> => `(cljs.user/foo 1 2 3)` - interpolates and splices the sequence of `y`
- <code>\`(foo bar#)</code> => `(cljs.user/foo bar__20418__auto__)` - make symbols ending in `#` unique

## Details

(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Like [doc:syntax/quote], but with important differences:

- Symbols are auto-resolved to include their namespace, preventing ambiguous
  symbols at the time of evaluation.
- Evaluated forms can be inserted using [doc:syntax/unquote].
- Any non-namespaced symbols ending with `#` are replaced with unique symbols.
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
[doc:syntax/quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/quote.md
[doc:syntax/auto-gensym]:https://github.com/cljs/api/blob/master/docfiles/syntax/auto-gensym.md
[doc:syntax/unquote]:https://github.com/cljs/api/blob/master/docfiles/syntax/unquote.md
