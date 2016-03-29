## cljs.core/extend-protocol



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/extend-protocol</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-protocol)
</td>
</tr>
</table>

<samp>(extend-protocol p & specs)</samp><br>

---

 <samp>
(__extend-protocol__ p & specs)<br>
</samp>

---



###### See Also:

[`cljs.core/extend-type`](../cljs.core/extend-type.md)<br>

---


Source docstring:

```
Useful when you want to provide several implementations of the same
protocol all at once. Takes a single protocol and the implementation
of that protocol for one or more types. Expands into calls to
extend-type:

(extend-protocol Protocol
  AType
    (foo [x] ...)
    (bar [x y] ...)
  BType
    (foo [x] ...)
    (bar [x y] ...)
  AClass
    (foo [x] ...)
    (bar [x y] ...)
  nil
    (foo [x] ...)
    (bar [x y] ...))

expands into:

(do
 (clojure.core/extend-type AType Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type BType Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type AClass Protocol 
   (foo [x] ...) 
   (bar [x y] ...))
 (clojure.core/extend-type nil Protocol 
   (foo [x] ...) 
   (bar [x y] ...)))
```


Source code @ [github]():

```clj
(defmacro extend-protocol 
  [p & specs]
  (emit-extend-protocol p specs))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/extend-protocol` @ clojuredocs](http://clojuredocs.org/clojure.core/extend-protocol)<br>
[`clojure.core/extend-protocol` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/extend-protocol/)<br>
[`clojure.core/extend-protocol` @ crossclj](http://crossclj.info/fun/clojure.core/extend-protocol.html)<br>
[`cljs.core/extend-protocol` @ crossclj](http://crossclj.info/fun/cljs.core/extend-protocol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/extend-protocol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "extend-protocol",
 :signature ["[p & specs]"],
 :name-encode "extend-protocol",
 :history [["+" "0.0-927"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/extend-protocol",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/extend-protocol"},
 :related ["cljs.core/extend-type"],
 :full-name-encode "cljs.core/extend-protocol",
 :source {:code "(defmacro extend-protocol \n  [p & specs]\n  (emit-extend-protocol p specs))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.8.0",
          :filename "src/clj/clojure/core_deftype.clj",
          :lines [831 869],
          :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core_deftype.clj#L831-L869"},
 :usage ["(extend-protocol p & specs)"],
 :full-name "cljs.core/extend-protocol",
 :docstring "Useful when you want to provide several implementations of the same\nprotocol all at once. Takes a single protocol and the implementation\nof that protocol for one or more types. Expands into calls to\nextend-type:\n\n(extend-protocol Protocol\n  AType\n    (foo [x] ...)\n    (bar [x y] ...)\n  BType\n    (foo [x] ...)\n    (bar [x y] ...)\n  AClass\n    (foo [x] ...)\n    (bar [x y] ...)\n  nil\n    (foo [x] ...)\n    (bar [x y] ...))\n\nexpands into:\n\n(do\n (clojure.core/extend-type AType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type BType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type AClass Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type nil Protocol \n   (foo [x] ...) \n   (bar [x y] ...)))",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/extend-protocol.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/extend-protocol"]))
```

-->
