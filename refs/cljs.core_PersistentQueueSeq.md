## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentQueueSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentQueueSeq.__ meta front rear)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2111-2141](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2111-L2141)</ins>
</pre>

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


---

```clj
{:full-name "cljs.core/PersistentQueueSeq",
 :ns "cljs.core",
 :name "PersistentQueueSeq",
 :type "type",
 :signature ["[meta front rear]"],
 :source {:code "(deftype PersistentQueueSeq [meta front rear]\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueueSeq. meta front rear))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (-first front))\n  (-rest  [coll]\n    (if-let [f1 (next front)]\n      (PersistentQueueSeq. meta f1 rear)\n      (if (nil? rear)\n        (-empty coll)\n        (PersistentQueueSeq. meta rear nil))))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2111 2141],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2111-L2141"},
 :full-name-encode "cljs.core_PersistentQueueSeq",
 :history [["+" "0.0-927"]]}

```
