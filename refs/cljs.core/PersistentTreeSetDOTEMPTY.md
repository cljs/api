## cljs.core/PersistentTreeSet.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentTreeSet.EMPTY</samp>](https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/PersistentTreeSet.java)
</td>
</tr>
</table>









Source code @ [github]():

```clj
(set! (.-EMPTY PersistentTreeSet)
  (PersistentTreeSet. nil (.-EMPTY PersistentTreeMap) empty-unordered-hash))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentTreeSet.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentTreeSet.EMPTY)<br>
[`clojure.lang/PersistentTreeSet.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentTreeSet.EMPTY/)<br>
[`clojure.lang/PersistentTreeSet.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentTreeSet.EMPTY.html)<br>
[`cljs.core/PersistentTreeSet.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentTreeSet.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentTreeSetDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentTreeSet.EMPTY",
 :name-encode "PersistentTreeSetDOTEMPTY",
 :history [["+" "0.0-1211"]],
 :parent-type "PersistentTreeSet",
 :type "var",
 :clj-equiv {:full-name "clojure.lang/PersistentTreeSet.EMPTY",
             :url "https://github.com/clojure/clojure/blob/clojure-1.9.0-alpha4/src/jvm/clojure/lang/PersistentTreeSet.java"},
 :full-name-encode "cljs.core/PersistentTreeSetDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentTreeSet)\n  (PersistentTreeSet. nil (.-EMPTY PersistentTreeMap) empty-unordered-hash))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.36",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [8437 8438],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.36/src/main/cljs/cljs/core.cljs#L8437-L8438"},
 :full-name "cljs.core/PersistentTreeSet.EMPTY",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentTreeSetDOTEMPTY.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeSet.EMPTY"]))
```

-->
