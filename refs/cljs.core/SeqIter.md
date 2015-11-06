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
(__SeqIter.__ _seq _next)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3391-L3407):

```clj
(deftype SeqIter [^:mutable _seq ^:mutable _next]
  Object
  (hasNext [_]
    (if (identical? _seq INIT)
      (do
        (set! _seq START)
        (set! _next (seq _next)))
      (if (identical? _seq _next)
        (set! _next (next _seq))))
    (not (nil? _next)))
  (next [this]
    (if-not (.hasNext this)
      (throw (js/Error. "No such element"))
      (do
        (set! _seq _next)
        (first _next))))
  (remove [_] (js/Error. "Unsupported operation")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:3391-3407](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/core.cljs#L3391-L3407)</ins>
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
 :signature ["[_seq _next]"],
 :history [["+" "0.0-2301"]],
 :type "type",
 :full-name-encode "cljs.core/SeqIter",
 :source {:code "(deftype SeqIter [^:mutable _seq ^:mutable _next]\n  Object\n  (hasNext [_]\n    (if (identical? _seq INIT)\n      (do\n        (set! _seq START)\n        (set! _next (seq _next)))\n      (if (identical? _seq _next)\n        (set! _next (next _seq))))\n    (not (nil? _next)))\n  (next [this]\n    (if-not (.hasNext this)\n      (throw (js/Error. \"No such element\"))\n      (do\n        (set! _seq _next)\n        (first _next))))\n  (remove [_] (js/Error. \"Unsupported operation\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [3391 3407]},
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
