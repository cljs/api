---
name: syntax/unquote
display: "~ unquote"
see also:
  - syntax/syntax-quote
  - syntax/unquote-splicing
---

## Details

(Only intended for use in Clojure macros, which can be used from but not
written in ClojureScript.)

Intended for use inside a [doc:syntax/syntax-quote].

Forces evaluation of the following form.


## Examples

```clj
(def foo 1)
`~foo
;;=> 1

`(def foo ~foo)
;;=> (def cljs.user/foo 1)
```