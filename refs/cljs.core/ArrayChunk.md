## cljs.core/ArrayChunk



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ArrayChunk</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ArrayChunk.java)
</td>
</tr>
</table>


 <samp>
(__ArrayChunk.__ arr off end)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L2234-L2256):

```clj
(deftype ArrayChunk [arr off end]
  ICounted
  (-count [_] (- end off))

  IIndexed
  (-nth [coll i]
    (aget arr (+ off i)))
  (-nth [coll i not-found]
    (if (and (>= i 0) (< i (- end off)))
      (aget arr (+ off i))
      not-found))

  IChunk
  (-drop-first [coll]
    (if (== off end)
      (throw (js/Error. "-drop-first of empty chunk"))
      (ArrayChunk. arr (inc off) end)))

  IReduce
  (-reduce [coll f]
    (array-reduce arr f (aget arr off) (inc off)))
  (-reduce [coll f start]
    (array-reduce arr f start off)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2202
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2234-2256](https://github.com/clojure/clojurescript/blob/r2202/src/cljs/cljs/core.cljs#L2234-L2256)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ArrayChunk` @ clojuredocs](http://clojuredocs.org/clojure.lang/ArrayChunk)<br>
[`clojure.lang/ArrayChunk` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ArrayChunk/)<br>
[`clojure.lang/ArrayChunk` @ crossclj](http://crossclj.info/fun/clojure.lang/ArrayChunk.html)<br>
[`cljs.core/ArrayChunk` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayChunk.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayChunk.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayChunk",
 :signature ["[arr off end]"],
 :history [["+" "0.0-1424"]],
 :type "type",
 :full-name-encode "cljs.core/ArrayChunk",
 :source {:code "(deftype ArrayChunk [arr off end]\n  ICounted\n  (-count [_] (- end off))\n\n  IIndexed\n  (-nth [coll i]\n    (aget arr (+ off i)))\n  (-nth [coll i not-found]\n    (if (and (>= i 0) (< i (- end off)))\n      (aget arr (+ off i))\n      not-found))\n\n  IChunk\n  (-drop-first [coll]\n    (if (== off end)\n      (throw (js/Error. \"-drop-first of empty chunk\"))\n      (ArrayChunk. arr (inc off) end)))\n\n  IReduce\n  (-reduce [coll f]\n    (array-reduce arr f (aget arr off) (inc off)))\n  (-reduce [coll f start]\n    (array-reduce arr f start off)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2202",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2234 2256]},
 :full-name "cljs.core/ArrayChunk",
 :clj-symbol "clojure.lang/ArrayChunk"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayChunk"]))
```

-->
