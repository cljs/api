---
name: syntax/unquote-splicing
display as: "~@ unquote splicing"
see also:
  - syntax/syntax-quote
  - syntax/unquote
clojure doc: http://clojure.org/reference/reader#syntax-quote
---

## Summary

Like [doc:syntax/unquote], except the result is spliced (i.e. `[a b]` => `a b`)

- <code>\`(foo ~@x)</code> => `(cljs.user/foo a b)` (if x is [a b])

## Details

## Examples

```clj
(def foo '[a b c])
`(~@foo)
;;=> (a b c)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/syntax-quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/syntax-quote.md
