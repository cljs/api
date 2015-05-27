## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/LazySeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__LazySeq.__ meta realized x __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1822-1854](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1822-L1854)</ins>
</pre>

```clj
(deftype LazySeq [meta realized x ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (LazySeq. meta realized x __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first (lazy-seq-value coll)))
  (-rest [coll] (rest (lazy-seq-value coll)))

  INext
  (-next [coll] (-seq (-rest coll)))

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
  (-seq [coll] (seq (lazy-seq-value coll))))
```


---

```clj
{:full-name "cljs.core/LazySeq",
 :ns "cljs.core",
 :name "LazySeq",
 :type "type",
 :signature ["[meta realized x __hash]"],
 :source {:code "(deftype LazySeq [meta realized x ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (LazySeq. meta realized x __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISeq\n  (-first [coll] (first (lazy-seq-value coll)))\n  (-rest [coll] (rest (lazy-seq-value coll)))\n\n  INext\n  (-next [coll] (-seq (-rest coll)))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll] (seq (lazy-seq-value coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1822 1854],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1822-L1854"},
 :full-name-encode "cljs.core_LazySeq",
 :history [["+" "0.0-927"]]}

```
