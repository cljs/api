---
name: cljs.repl/apropos
see also:
  - cljs.repl/find-doc
---

## Signature
[str-or-pattern]


## Details

Given a regular expression or stringable thing, return a seq of all
public definitions in all currently-loaded namespaces that match the
`str-or-pattern`.


## Examples

```clj
(apropos "some")
;;=> (cljs.core/if-some
;;    cljs.core/some
;;    cljs.core/some->
;;    cljs.core/some->>
;;    cljs.core/some-fn
;;    cljs.core/some?
;;    cljs.core/when-some)
```