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

Expands to a *clojure expression* (at read time) which—when evaluated—produces the literal structure described by the template inside.

- <code>\`(foo 123)</code> => `(cljs.user/foo 123)` - symbols become fully-qualified
- <code>\`(foo ~x)</code> => `(cljs.user/foo 123)` - interpolates the value of `x`
- <code>\`(foo ~@y)</code> => `(cljs.user/foo 1 2 3)` - interpolates and splices the sequence of `y`
- <code>\`(foo bar#)</code> => `(cljs.user/foo bar__20418__auto__)` - make symbols ending in `#` unique

## Details

Produces a similar structure to that produced by [doc:syntax/quote], but with important differences:

- Symbols are auto-resolved to include their namespace, preventing ambiguous
  symbols at the time of evaluation.
- Evaluated forms can be inserted using [doc:syntax/unquote].
- Any non-namespaced symbols ending with `#` are replaced with unique symbols.
  See [doc:syntax/auto-gensym].

Though it is often used for code-generation at macro-expansion time, it is very
useful at runtime for constructing collections without requiring the usual API
ceremony:

```
(def foo [2 3 4])
(def bar 7)
(def baz `[1 ~@foo 5 6 ~bar])
baz
;;=> [1 2 3 4 5 6 7]
```

You can peek at the code generated to construct the vector by quoting it:

```
(def foo [2 3 4])
(def bar 7)
(quote `[1 ~@foo 5 6 ~bar])
;;=> (clojure.core/vec (clojure.core/sequence (clojure.core/seq (clojure.core/concat (clojure.core/list 1) foo (clojure.core/list 5) (clojure.core/list 6) (clojure.core/list bar)))))

;; pretty-print it!
(pp)
;; (clojure.core/vec
;;  (clojure.core/sequence
;;   (clojure.core/seq
;;    (clojure.core/concat
;;     (clojure.core/list 1)
;;     foo
;;     (clojure.core/list 5)
;;     (clojure.core/list 6)
;;     (clojure.core/list bar)))))
```

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
