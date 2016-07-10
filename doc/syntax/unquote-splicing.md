---
name: syntax/unquote-splicing
display: "~@ unquote splicing"
related:
  - syntax/syntax-quote
  - syntax/unquote
---

## Description

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