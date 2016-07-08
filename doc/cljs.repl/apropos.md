## Name
cljs.repl/apropos

## Signature
[str-or-pattern]

## Description

Given a regular expression or stringable thing, return a seq of all
public definitions in all currently-loaded namespaces that match the
`str-or-pattern`.

## Related
cljs.repl/find-doc

## Example#aceda4

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
