---
name: syntax/dispatch
display as: "# dispatch"
clojure doc: http://clojure.org/reference/reader#_dispatch
edn doc: https://github.com/edn-format/edn#-dispatch-character
see also:
  - syntax/regex
  - syntax/function
  - syntax/set
  - syntax/var
  - syntax/ignore
  - syntax/tagged-literal
  - syntax/cond
---

## Summary

As a general pattern, syntax forms prefixed with `#` are related to their
standalone forms:

| relation               | original                            | with `#` prefix                                      |
|------------------------|-------------------------------------|------------------------------------------------------|
| string-related         | [doc:syntax/string]                 | [doc:syntax/regex]                                   |
| code-related           | [doc:syntax/list]                   | [doc:syntax/function]                                |
| lookup-related         | [doc:syntax/map]                    | [doc:syntax/set]                                     |
| quote-related          | [doc:syntax/quote]                  | [doc:syntax/var]                                     |
| ignore-related         | [doc:syntax/unused]                 | [doc:syntax/ignore]                                  |
| name-related           | [`foo (symbol)`][doc:syntax/symbol] | [`#foo (tagged literal)`][doc:syntax/tagged-literal] |
| conditional-related    | [doc:syntax/predicate]              | [doc:syntax/cond]                                    |

## Details

`#` is a prefix character that is called the dispatch macro, because it allows
the behavior of the reader to be dispatched to another table, indexed by the
character following the `#`.

## Examples

The dispatch macro is not usable on its own.  Rather, it dispatches to other
syntax forms.

Regular expression:

```clj
#"[a-zA-Z0-9]+"
;;=> #"[a-zA-Z0-9]+"
```

Set:

```clj
#{:foo 1 2}
;;=> #{:foo 1 2}
```

Function:

```clj
#(foo 1 2)
;;=> #<function (){
;;   return cljs.user.foo.call(null,(1),(2));
;;   }>
```

Var reference:

```clj
(def a)
#'a
;;=> #'cljs.user/a
```

Ignore form:

```clj
#_foo
;; waits for next form since #_foo was ignored

#_123 456
;;=> 456
```

Tagged Literals:

```clj
#queue [1 2 3]
;;=> #queue [1 2 3]

#js {:foo 1}
;;=> #js {:foo 1}

#inst "2010-11-12T18:14:15.666-00:00"
;;=> #inst "2010-11-12T18:14:15.666-00:00"
```

Reader Conditional:

```clj
#?(:clj "Clojure" :cljs "ClojureScript")
;;=> "ClojureScript"
```

<!-- AUTO-GENERATED docfile links for github -->
[doc:syntax/symbol]:https://github.com/cljs/api/blob/master/docfiles/syntax/symbol.md
[doc:syntax/cond]:https://github.com/cljs/api/blob/master/docfiles/syntax/cond.md
[doc:syntax/string]:https://github.com/cljs/api/blob/master/docfiles/syntax/string.md
[doc:syntax/quote]:https://github.com/cljs/api/blob/master/docfiles/syntax/quote.md
[doc:syntax/regex]:https://github.com/cljs/api/blob/master/docfiles/syntax/regex.md
[doc:syntax/unused]:https://github.com/cljs/api/blob/master/docfiles/syntax/unused.md
[doc:syntax/set]:https://github.com/cljs/api/blob/master/docfiles/syntax/set.md
[doc:syntax/tagged-literal]:https://github.com/cljs/api/blob/master/docfiles/syntax/tagged-literal.md
[doc:syntax/function]:https://github.com/cljs/api/blob/master/docfiles/syntax/function.md
[doc:syntax/map]:https://github.com/cljs/api/blob/master/docfiles/syntax/map.md
[doc:syntax/list]:https://github.com/cljs/api/blob/master/docfiles/syntax/list.md
[doc:syntax/predicate]:https://github.com/cljs/api/blob/master/docfiles/syntax/predicate.md
[doc:syntax/ignore]:https://github.com/cljs/api/blob/master/docfiles/syntax/ignore.md
[doc:syntax/var]:https://github.com/cljs/api/blob/master/docfiles/syntax/var.md
