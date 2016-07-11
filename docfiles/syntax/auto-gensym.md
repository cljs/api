---
name: syntax/auto-gensym
display: "# auto-gensym"
see also:
  - cljs.core/gensym
  - syntax/syntax-quote
---

## Summary

## Details

(Only intended for use in a [doc:syntax/syntax-quote].)

``foo#` => `foo__135__auto__`

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

## Usage
foo#
