---
name: syntax/tagged-literal
display as: "# tagged literal"
see also:
  - syntax/dispatch
---

## Summary

Some frequently used value types are afforded a "tagged literal" syntax. It is
similar to a constructor, but this special syntax makes it de/serializable and
easier to read at the REPL.

Tagged literals start with a `#` followed by a symbol and a literal:

`#js [...]` - [JavaScript array literal](doc:syntax/js-literal)
`#js {...}` - [JavaScript object literal](doc:syntax/js-literal)
`#inst "..."` - [JavaScript date literal](doc:syntax/inst-literal)
`#uuid "..."` - [UUID literal](doc:syntax/uuid-literal)
`#queue [...]` - [queue literal](doc:syntax/queue-literal)

## Details

These tagged literals are the "extensible" part of extensible data notation
([edn]), with ClojureScript being a superset of edn.

[edn]:https://github.com/edn-format/edn#tagged-elements

## Examples

(Tagged literals are printed as themselves, just like core syntax literals.)

literal JavaScript object:

```clj
#js {:foo 1}
;;=> #js {:foo 1}

(def foo 1)
#js {:foo foo}
;;=> #js {:foo 1}
```

literal queue:

```clj
#queue [1 2 3]
;;=> #queue [1 2 3]

(conj #queue [1 2 3] 4)
;;=> #queue [1 2 3 4]
```

literal instant of time (date):

```clj
#inst "2014-10-13"
;;=> #inst "2014-10-13T00:00:00.000-00:00"
```

literal UUID:

```clj
#uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
;;=> #uuid "97bda55b-6175-4c39-9e04-7c0205c709dc"
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/symbol]:https://github.com/cljs/api/blob/master/docfiles/syntax/symbol.md
[doc:syntax/inst-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/inst-literal.md
[doc:syntax/queue-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/queue-literal.md
[doc:syntax/js-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/js-literal.md
[doc:syntax/uuid-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/uuid-literal.md
