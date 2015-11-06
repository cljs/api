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
(__Keyword.__ ns name fqn _hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2767-L2793):

```clj
(deftype Keyword [ns name fqn ^:mutable _hash]
  Object
  (toString [_] (str ":" fqn))
  (equiv [this other]
    (-equiv this other))
  
  IEquiv
  (-equiv [_ other]
    (if (instance? Keyword other)
      (identical? fqn (.-fqn other))
      false))
  IFn
  (-invoke [kw coll]
    (get coll kw))
  (-invoke [kw coll not-found]
    (get coll kw not-found))

  IHash
  (-hash [this]
    (caching-hash this hash-keyword _hash))

  INamed
  (-name [_] name)
  (-namespace [_] ns)

  IPrintWithWriter
  (-pr-writer [o writer _] (-write writer (str ":" fqn))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3191
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2767-2793](https://github.com/clojure/clojurescript/blob/r3191/src/cljs/cljs/core.cljs#L2767-L2793)</ins>
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
 :signature ["[ns name fqn _hash]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/Keyword",
 :source {:code "(deftype Keyword [ns name fqn ^:mutable _hash]\n  Object\n  (toString [_] (str \":\" fqn))\n  (equiv [this other]\n    (-equiv this other))\n  \n  IEquiv\n  (-equiv [_ other]\n    (if (instance? Keyword other)\n      (identical? fqn (.-fqn other))\n      false))\n  IFn\n  (-invoke [kw coll]\n    (get coll kw))\n  (-invoke [kw coll not-found]\n    (get coll kw not-found))\n\n  IHash\n  (-hash [this]\n    (caching-hash this hash-keyword _hash))\n\n  INamed\n  (-name [_] name)\n  (-namespace [_] ns)\n\n  IPrintWithWriter\n  (-pr-writer [o writer _] (-write writer (str \":\" fqn))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3191",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2767 2793]},
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
