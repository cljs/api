## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentQueue

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentQueue.__ meta count front rear)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2325-2369](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2325-L2369)</ins>
</pre>

```clj
(deftype PersistentQueue [meta count front rear]
  IWithMeta
  (-with-meta [coll meta] (PersistentQueue. meta count front rear))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first front))
  (-rest [coll] (rest (seq coll)))

  IStack
  (-peek [coll] (-first front))
  (-pop [coll]
    (if front
      (if-let [f1 (next front)]
        (PersistentQueue. meta (dec count) f1 rear)
        (PersistentQueue. meta (dec count) (seq rear) []))
      coll))

  ICollection
  (-conj [coll o]
    (if front
      (PersistentQueue. meta (inc count) front (conj (or rear []) o))
      (PersistentQueue. meta (inc count) (conj front o) [])))

  IEmptyableCollection
  (-empty [coll] cljs.core.PersistentQueue/EMPTY)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll]
    (let [rear (seq rear)]
      (if (or front rear)
        (PersistentQueueSeq. nil front (seq rear))
        cljs.core.List/EMPTY)))

  ICounted
  (-count [coll] count))
```


---

```clj
{:full-name "cljs.core/PersistentQueue",
 :ns "cljs.core",
 :name "PersistentQueue",
 :type "type",
 :signature ["[meta count front rear]"],
 :source {:code "(deftype PersistentQueue [meta count front rear]\n  IWithMeta\n  (-with-meta [coll meta] (PersistentQueue. meta count front rear))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first front))\n  (-rest [coll] (rest (seq coll)))\n\n  IStack\n  (-peek [coll] (-first front))\n  (-pop [coll]\n    (if front\n      (if-let [f1 (next front)]\n        (PersistentQueue. meta (dec count) f1 rear)\n        (PersistentQueue. meta (dec count) (seq rear) []))\n      coll))\n\n  ICollection\n  (-conj [coll o]\n    (if front\n      (PersistentQueue. meta (inc count) front (conj (or rear []) o))\n      (PersistentQueue. meta (inc count) (conj front o) [])))\n\n  IEmptyableCollection\n  (-empty [coll] cljs.core.PersistentQueue/EMPTY)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll]\n    (let [rear (seq rear)]\n      (if (or front rear)\n        (PersistentQueueSeq. nil front (seq rear))\n        cljs.core.List/EMPTY)))\n\n  ICounted\n  (-count [coll] count))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2325 2369],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2325-L2369"},
 :full-name-encode "cljs.core_PersistentQueue",
 :history [["+" "0.0-927"]]}

```
