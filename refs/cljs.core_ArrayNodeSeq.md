## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayNodeSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ArrayNodeSeq.__ meta nodes i s __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4631-4662](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L4631-L4662)</ins>
</pre>

```clj
(deftype ArrayNodeSeq [meta nodes i s ^:mutable __hash]
  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (ArrayNodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  ISeq
  (-first [coll] (first s))
  (-rest  [coll] (create-array-node-seq nil nodes i (next s)))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash)))
```


---

```clj
{:full-name "cljs.core/ArrayNodeSeq",
 :ns "cljs.core",
 :name "ArrayNodeSeq",
 :type "type",
 :signature ["[meta nodes i s __hash]"],
 :source {:code "(deftype ArrayNodeSeq [meta nodes i s ^:mutable __hash]\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta] (ArrayNodeSeq. meta nodes i s __hash))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  ISeq\n  (-first [coll] (first s))\n  (-rest  [coll] (create-array-node-seq nil nodes i (next s)))\n\n  ISeqable\n  (-seq [this] this)\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4631 4662],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L4631-L4662"},
 :full-name-encode "cljs.core_ArrayNodeSeq",
 :history [["+" "0.0-1211"]]}

```
