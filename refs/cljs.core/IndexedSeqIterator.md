## cljs.core/IndexedSeqIterator



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2371"><img valign="middle" alt="[+] 0.0-2371" title="Added in 0.0-2371" src="https://img.shields.io/badge/+-0.0--2371-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__IndexedSeqIterator.__ arr i)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L929-L936):

```clj
(deftype IndexedSeqIterator [arr ^:mutable i]
  Object
  (hasNext [_]
    (< i (alength arr)))
  (next [_]
    (let [ret (aget arr i)]
      (set! i (inc i))
      ret)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2496
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:929-936](https://github.com/clojure/clojurescript/blob/r2496/src/cljs/cljs/core.cljs#L929-L936)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IndexedSeqIterator` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IndexedSeqIterator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IndexedSeqIterator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IndexedSeqIterator",
 :type "type",
 :signature ["[arr i]"],
 :source {:code "(deftype IndexedSeqIterator [arr ^:mutable i]\n  Object\n  (hasNext [_]\n    (< i (alength arr)))\n  (next [_]\n    (let [ret (aget arr i)]\n      (set! i (inc i))\n      ret)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2496",
          :filename "src/cljs/cljs/core.cljs",
          :lines [929 936]},
 :full-name "cljs.core/IndexedSeqIterator",
 :full-name-encode "cljs.core/IndexedSeqIterator",
 :history [["+" "0.0-2371"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IndexedSeqIterator"]))
```

-->
