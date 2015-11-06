## cljs.core/PersistentQueueSeq



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentQueueSeq.__ meta front rear)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2070-L2100):

```clj
(deftype PersistentQueueSeq [meta front rear]
  IWithMeta
  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (-first front))
  (-rest  [coll]
    (if-let [f1 (next front)]
      (PersistentQueueSeq. meta f1 rear)
      (if (nil? rear)
        (-empty coll)
        (PersistentQueueSeq. meta rear nil))))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2070-2100](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2070-L2100)</ins>
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
 :signature ["[meta front rear]"],
 :source {:code "(deftype PersistentQueueSeq [meta front rear]\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (-first front))\n  (-rest  [coll]\n    (if-let [f1 (next front)]\n      (PersistentQueueSeq. meta f1 rear)\n      (if (nil? rear)\n        (-empty coll)\n        (PersistentQueueSeq. meta rear nil))))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2070 2100]},
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
