---
name: syntax/auto-gensym
display as: "# auto-gensym"
see also:
  - cljs.core/gensym
  - syntax/syntax-quote
---

## Summary

Shorthand for generating unique symbols inside a [doc:syntax/syntax-quote] template.

`foo#` => `foo__135__auto__`

## Details

Auto-generates a unique symbol with the given prefix, particularly one that
will not shadow any existing symbol in its resulting scope.  This is intended
as a convenience for creating hygienic macros without calling
[doc:cljs.core/gensym] directly.

Every symbol matching a unique `foo#` symbol within a syntax quoted form will
be replaced with the same generated symbol.

``(foo# foo#)` => `(foo__138__auto__ foo__138__auto__)`

Namespace-qualified symbols `foo/bar#` are not replaced.

## Examples

```clj
`foo#
;;=> foo__142__auto__
```

Namespace-qualified symbols are left alone.

```clj
`foo/bar#
;;=> foo/bar#
```

Create safe local bindings:

```clj
`(let [x# 1]
   (+ x# 2))
;;=> (cljs.user/let [x__146__auto__ 1] (cljs.user/+ x__146__auto__ 2))
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:cljs.core/gensym]:https://github.com/cljs/api/blob/master/docfiles/cljs.core/gensym.md
[doc:syntax/syntax-quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/syntax-quote.md
