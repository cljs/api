## cljs.core/Keyword



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Keyword</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Keyword.java)
</td>
</tr>
</table>


 <samp>
(__Keyword.__ k)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L2011-L2021):

```clj
(deftype Keyword [k]
  IFn
  (invoke [_ coll]
    (when-not (nil? coll)
      (when (satisfies? ILookup coll)
        (-lookup coll k nil))))
  (invoke [_ coll not-found]
    (if (nil? coll)
      not-found
      (when (satisfies? ILookup coll)
        (-lookup coll k not-found)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1835
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2011-2021](https://github.com/clojure/clojurescript/blob/r1835/src/cljs/cljs/core.cljs#L2011-L2021)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Keyword` @ clojuredocs](http://clojuredocs.org/clojure.lang/Keyword)<br>
[`clojure.lang/Keyword` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Keyword/)<br>
[`clojure.lang/Keyword` @ crossclj](http://crossclj.info/fun/clojure.lang/Keyword.html)<br>
[`cljs.core/Keyword` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Keyword.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Keyword",
 :signature ["[k]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/Keyword",
 :source {:code "(deftype Keyword [k]\n  IFn\n  (invoke [_ coll]\n    (when-not (nil? coll)\n      (when (satisfies? ILookup coll)\n        (-lookup coll k nil))))\n  (invoke [_ coll not-found]\n    (if (nil? coll)\n      not-found\n      (when (satisfies? ILookup coll)\n        (-lookup coll k not-found)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1835",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2011 2021]},
 :full-name "cljs.core/Keyword",
 :clj-symbol "clojure.lang/Keyword"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Keyword"]))
```

-->
