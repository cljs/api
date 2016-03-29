## . dot



 <table border="1">
<tr>
<td>special character</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
</tr>
</table>



Dots can be used inside symbols. Its meaning depends on its position in the symbol:

- `.` (by itself), `.-foo`, `.foo` all refer to the interop [`. (special form)`][doc:special/.].
- `foo.` is constructor sugar, meaning [`(new foo)`][doc:special/new].
- `(ns foo.bar)` and `foo.bar/baz` means that `foo.bar` is a nested namespace.
- `foo/bar.baz` or `bar.baz` means `bar.baz` is nested JS property access (__not allowed in clojure__).

[doc:special/.]:../special/DOT.md
[doc:special/new]:../special/new.md

---

###### Examples:

For interop:

```clj
(def obj #js {:age 28, :greet #(str "Hi " %)})

(. obj greet "Bob")
;;=> "Hi Bob"

(.greet obj "Bob")
;;=> "Hi Bob"

(. obj -age)
;;=> 28

(.-age obj)
;;=> 28
```

For constructor:

```clj
(deftype Foo [x]
   Object
   (toString [_] (str "Foo:" x)))

(Foo. 1)
;;=> #<Foo: 1>

(new Foo 1)
;;=> #<Foo: 1>
```

For nested namespaces:

```clj
(ns example.nested.core)
(def foo 1)
example.nested.core/foo
;;=> 1
```

For nested JS properties.  The following pairs are equivalent:

```clj
(js/console.log "HELLO")
;; "HELLO"

(.log js/console "HELLO")
;; "HELLO"
```

```clj
cljs.core/PersistentQueue.EMPTY
;;=> #queue []

(.-EMPTY cljs.core/PersistentQueue)
;;=> #queue []
```



---

###### See Also:

[`symbol literal`](../syntax/symbol.md)<br>
[`/ namespace slash`](../syntax/namespace.md)<br>

---








 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/dot.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Dots can be used inside symbols. Its meaning depends on its position in the symbol:\n\n- `.` (by itself), `.-foo`, `.foo` all refer to the interop [`. (special form)`][doc:special/.].\n- `foo.` is constructor sugar, meaning [`(new foo)`][doc:special/new].\n- `(ns foo.bar)` and `foo.bar/baz` means that `foo.bar` is a nested namespace.\n- `foo/bar.baz` or `bar.baz` means `bar.baz` is nested JS property access (__not allowed in clojure__).",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/reader#toc1"},
 :ns "syntax",
 :name "dot",
 :name-encode "dot",
 :history [["+" "0.0-927"]],
 :type "special character",
 :related ["syntax/symbol" "syntax/namespace"],
 :full-name-encode "syntax/dot",
 :examples [{:id "61a0a1",
             :content "For interop:\n\n```clj\n(def obj #js {:age 28, :greet #(str \"Hi \" %)})\n\n(. obj greet \"Bob\")\n;;=> \"Hi Bob\"\n\n(.greet obj \"Bob\")\n;;=> \"Hi Bob\"\n\n(. obj -age)\n;;=> 28\n\n(.-age obj)\n;;=> 28\n```\n\nFor constructor:\n\n```clj\n(deftype Foo [x]\n   Object\n   (toString [_] (str \"Foo:\" x)))\n\n(Foo. 1)\n;;=> #<Foo: 1>\n\n(new Foo 1)\n;;=> #<Foo: 1>\n```\n\nFor nested namespaces:\n\n```clj\n(ns example.nested.core)\n(def foo 1)\nexample.nested.core/foo\n;;=> 1\n```\n\nFor nested JS properties.  The following pairs are equivalent:\n\n```clj\n(js/console.log \"HELLO\")\n;; \"HELLO\"\n\n(.log js/console \"HELLO\")\n;; \"HELLO\"\n```\n\n```clj\ncljs.core/PersistentQueue.EMPTY\n;;=> #queue []\n\n(.-EMPTY cljs.core/PersistentQueue)\n;;=> #queue []\n```"}],
 :full-name "syntax/dot",
 :display ". dot",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/dot.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/dot"]))
```

-->
