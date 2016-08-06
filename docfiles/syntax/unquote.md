---
name: syntax/unquote
display as: "~ unquote"
clojure doc: http://clojure.org/reference/reader#syntax-quote
see also:
  - syntax/syntax-quote
  - syntax/unquote-splicing
---

## Summary

Inserts an evaluated form inside of a [doc:syntax/syntax-quote] template.

- <code>\`(foo ~x)</code> => `(cljs.user/foo 123)` (if x is 123)

## Details

## Examples

```clj
(def foo 1)
`~foo
;;=> 1

`(def foo ~foo)
;;=> (def cljs.user/foo 1)
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/syntax-quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/syntax-quote.md
