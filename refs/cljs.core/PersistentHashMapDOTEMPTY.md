## cljs.core/PersistentHashMap.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashMap.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6928):

```clj
(set! (.-EMPTY PersistentHashMap) (PersistentHashMap. nil 0 nil false nil empty-unordered-hash))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:6928](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L6928)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentHashMap.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentHashMap.EMPTY)<br>
[`clojure.lang/PersistentHashMap.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentHashMap.EMPTY/)<br>
[`clojure.lang/PersistentHashMap.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentHashMap.EMPTY.html)<br>
[`cljs.core/PersistentHashMap.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashMap.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashMapDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashMap.EMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentHashMap",
 :type "var",
 :full-name-encode "cljs.core/PersistentHashMapDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentHashMap) (PersistentHashMap. nil 0 nil false nil empty-unordered-hash))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [6928]},
 :full-name "cljs.core/PersistentHashMap.EMPTY",
 :clj-symbol "clojure.lang/PersistentHashMap.EMPTY"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashMap.EMPTY"]))
```

-->
