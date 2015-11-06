## cljs.core/PersistentArrayMapSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" title="Added in 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentArrayMapSeq.__ arr i _meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L5259-L5310):

```clj
(deftype PersistentArrayMapSeq [arr i _meta]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))
  
  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta]
    (PersistentArrayMapSeq. arr i new-meta))

  ICounted
  (-count [coll]
    (/ (- (alength arr) i) 2))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) _meta))

  IHash
  (-hash [coll] (hash-ordered-coll coll))
  
  ISeq
  (-first [coll]
    [(aget arr i) (aget arr (inc i))])

  (-rest [coll]
    (if (< i (- (alength arr) 2))
      (PersistentArrayMapSeq. arr (+ i 2) _meta)
      ()))

  INext
  (-next [coll]
    (when (< i (- (alength arr) 2))
      (PersistentArrayMapSeq. arr (+ i 2) _meta)))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5259-5310](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/core.cljs#L5259-L5310)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentArrayMapSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMapSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMapSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMapSeq",
 :type "type",
 :signature ["[arr i _meta]"],
 :source {:code "(deftype PersistentArrayMapSeq [arr i _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n  \n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (PersistentArrayMapSeq. arr i new-meta))\n\n  ICounted\n  (-count [coll]\n    (/ (- (alength arr) i) 2))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) _meta))\n\n  IHash\n  (-hash [coll] (hash-ordered-coll coll))\n  \n  ISeq\n  (-first [coll]\n    [(aget arr i) (aget arr (inc i))])\n\n  (-rest [coll]\n    (if (< i (- (alength arr) 2))\n      (PersistentArrayMapSeq. arr (+ i 2) _meta)\n      ()))\n\n  INext\n  (-next [coll]\n    (when (< i (- (alength arr) 2))\n      (PersistentArrayMapSeq. arr (+ i 2) _meta)))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5259 5310]},
 :full-name "cljs.core/PersistentArrayMapSeq",
 :full-name-encode "cljs.core/PersistentArrayMapSeq",
 :history [["+" "0.0-1820"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMapSeq"]))
```

-->
