## cljs.core/PersistentQueue.EMPTY



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentQueue.EMPTY</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentQueue.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L4973):

```clj
(set! (.-EMPTY PersistentQueue) (PersistentQueue. nil 0 nil [] empty-ordered-hash))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4973](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L4973)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentQueue.EMPTY` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentQueue.EMPTY)<br>
[`clojure.lang/PersistentQueue.EMPTY` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentQueue.EMPTY/)<br>
[`clojure.lang/PersistentQueue.EMPTY` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentQueue.EMPTY.html)<br>
[`cljs.core/PersistentQueue.EMPTY` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentQueue.EMPTY.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueDOTEMPTY.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentQueue.EMPTY",
 :history [["+" "0.0-927"]],
 :parent-type "PersistentQueue",
 :type "var",
 :full-name-encode "cljs.core/PersistentQueueDOTEMPTY",
 :source {:code "(set! (.-EMPTY PersistentQueue) (PersistentQueue. nil 0 nil [] empty-ordered-hash))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4973]},
 :full-name "cljs.core/PersistentQueue.EMPTY",
 :clj-symbol "clojure.lang/PersistentQueue.EMPTY"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueue.EMPTY"]))
```

-->
