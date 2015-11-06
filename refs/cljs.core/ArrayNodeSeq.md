## cljs.core/ArrayNodeSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ArrayNodeSeq.__ meta nodes i s __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L4926-L4965):

```clj
(deftype ArrayNodeSeq [meta nodes i s ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (ArrayNodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))

  ISequential
  ISeq
  (-first [coll] (first s))
  (-rest  [coll] (create-array-node-seq nil nodes i (next s)))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4926-4965](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L4926-L4965)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ArrayNodeSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ArrayNodeSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ArrayNodeSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ArrayNodeSeq",
 :type "type",
 :signature ["[meta nodes i s __hash]"],
 :source {:code "(deftype ArrayNodeSeq [meta nodes i s ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta] (ArrayNodeSeq. meta nodes i s __hash))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List.EMPTY meta))\n\n  ISequential\n  ISeq\n  (-first [coll] (first s))\n  (-rest  [coll] (create-array-node-seq nil nodes i (next s)))\n\n  ISeqable\n  (-seq [this] this)\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4926 4965]},
 :full-name "cljs.core/ArrayNodeSeq",
 :full-name-encode "cljs.core/ArrayNodeSeq",
 :history [["+" "0.0-1211"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ArrayNodeSeq"]))
```

-->
