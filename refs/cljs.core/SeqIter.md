## cljs.core/SeqIter



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/SeqIterator</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/SeqIterator.java)
</td>
</tr>
</table>


 <samp>
(__SeqIter.__ seq)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L2901-L2908):

```clj
(deftype SeqIter [^:mutable seq]
  Object
  (hasNext [_] (not (nil? seq)))
  (next [_]
    (let [first (first seq)]
      (set! seq (next seq))
      first))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2301
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2901-2908](https://github.com/clojure/clojurescript/blob/r2301/src/cljs/cljs/core.cljs#L2901-L2908)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/SeqIterator` @ clojuredocs](http://clojuredocs.org/clojure.lang/SeqIterator)<br>
[`clojure.lang/SeqIterator` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/SeqIterator/)<br>
[`clojure.lang/SeqIterator` @ crossclj](http://crossclj.info/fun/clojure.lang/SeqIterator.html)<br>
[`cljs.core/SeqIter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/SeqIter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/SeqIter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "SeqIter",
 :signature ["[seq]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core/SeqIter",
 :source {:code "(deftype SeqIter [^:mutable seq]\n  Object\n  (hasNext [_] (not (nil? seq)))\n  (next [_]\n    (let [first (first seq)]\n      (set! seq (next seq))\n      first))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2301",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2901 2908]},
 :full-name "cljs.core/SeqIter",
 :clj-symbol "clojure.lang/SeqIterator"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/SeqIter"]))
```

-->
