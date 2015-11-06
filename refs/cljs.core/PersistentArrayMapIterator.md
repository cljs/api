## cljs.core/PersistentArrayMapIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentArrayMapIterator.__ arr i cnt)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L5324-L5331):

```clj
(deftype PersistentArrayMapIterator [arr ^:mutable i cnt]
  Object
  (hasNext [_]
    (< i cnt))
  (next [_]
    (let [ret [(aget arr i) (aget arr (inc i))]]
      (set! i (+ i 2))
      ret)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5324-5331](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/core.cljs#L5324-L5331)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentArrayMapIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMapIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMapIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMapIterator",
 :type "type",
 :signature ["[arr i cnt]"],
 :source {:code "(deftype PersistentArrayMapIterator [arr ^:mutable i cnt]\n  Object\n  (hasNext [_]\n    (< i cnt))\n  (next [_]\n    (let [ret [(aget arr i) (aget arr (inc i))]]\n      (set! i (+ i 2))\n      ret)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5324 5331]},
 :full-name "cljs.core/PersistentArrayMapIterator",
 :full-name-encode "cljs.core/PersistentArrayMapIterator",
 :history [["+" "0.0-2371"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMapIterator"]))
```

-->
