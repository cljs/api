## cljs.core/PersistentQueueSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentQueueSeq.__ meta front rear __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L3374-L3408):

```clj
(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))
  
  IWithMeta
  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (-first front))
  (-rest  [coll]
    (if-let [f1 (next front)]
      (PersistentQueueSeq. meta f1 rear nil)
      (if (nil? rear)
        (-empty coll)
        (PersistentQueueSeq. meta rear nil nil))))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll] coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3374-3408](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L3374-L3408)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentQueueSeq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentQueueSeq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentQueueSeq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentQueueSeq",
 :type "type",
 :signature ["[meta front rear __hash]"],
 :source {:code "(deftype PersistentQueueSeq [meta front rear ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n  \n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (-first front))\n  (-rest  [coll]\n    (if-let [f1 (next front)]\n      (PersistentQueueSeq. meta f1 rear nil)\n      (if (nil? rear)\n        (-empty coll)\n        (PersistentQueueSeq. meta rear nil nil))))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll] coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1424",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3374 3408]},
 :full-name "cljs.core/PersistentQueueSeq",
 :full-name-encode "cljs.core/PersistentQueueSeq",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentQueueSeq"]))
```

-->
