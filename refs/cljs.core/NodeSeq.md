## cljs.core/NodeSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/NodeSeq</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashMap.java)
</td>
</tr>
</table>


 <samp>
(__NodeSeq.__ meta nodes i s __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/core.cljs#L6396-L6438):

```clj
(deftype NodeSeq [meta nodes i s ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY List) meta))

  ISequential
  ISeq
  (-first [coll]
    (if (nil? s)
      [(aget nodes i) (aget nodes (inc i))]
      (first s)))

  (-rest [coll]
    (if (nil? s)
      (create-inode-seq nodes (+ i 2) nil)
      (create-inode-seq nodes i (next s))))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

  IReduce
  (-reduce [coll f] (seq-reduce f coll))
  (-reduce [coll f start] (seq-reduce f start coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3190
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6396-6438](https://github.com/clojure/clojurescript/blob/r3190/src/cljs/cljs/core.cljs#L6396-L6438)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/NodeSeq` @ clojuredocs](http://clojuredocs.org/clojure.lang/NodeSeq)<br>
[`clojure.lang/NodeSeq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/NodeSeq/)<br>
[`clojure.lang/NodeSeq` @ crossclj](http://crossclj.info/fun/clojure.lang/NodeSeq.html)<br>
[`cljs.core/NodeSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/NodeSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/NodeSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "NodeSeq",
 :signature ["[meta nodes i s __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/NodeSeq",
 :source {:code "(deftype NodeSeq [meta nodes i s ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY List) meta))\n\n  ISequential\n  ISeq\n  (-first [coll]\n    (if (nil? s)\n      [(aget nodes i) (aget nodes (inc i))]\n      (first s)))\n\n  (-rest [coll]\n    (if (nil? s)\n      (create-inode-seq nodes (+ i 2) nil)\n      (create-inode-seq nodes i (next s))))\n\n  ISeqable\n  (-seq [this] this)\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  IReduce\n  (-reduce [coll f] (seq-reduce f coll))\n  (-reduce [coll f start] (seq-reduce f start coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6396 6438]},
 :full-name "cljs.core/NodeSeq",
 :clj-symbol "clojure.lang/NodeSeq"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/NodeSeq"]))
```

-->
