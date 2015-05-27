## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/NodeSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__NodeSeq.__ meta nodes i s __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4468-4510](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L4468-L4510)</ins>
</pre>

```clj
(deftype NodeSeq [meta nodes i s ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))

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
  (-hash [coll] (caching-hash coll hash-coll __hash)))
```


---

```clj
{:full-name "cljs.core/NodeSeq",
 :ns "cljs.core",
 :name "NodeSeq",
 :type "type",
 :signature ["[meta nodes i s __hash]"],
 :source {:code "(deftype NodeSeq [meta nodes i s ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IWithMeta\n  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  ISeq\n  (-first [coll]\n    (if (nil? s)\n      [(aget nodes i) (aget nodes (inc i))]\n      (first s)))\n\n  (-rest [coll]\n    (if (nil? s)\n      (create-inode-seq nodes (+ i 2) nil)\n      (create-inode-seq nodes i (next s))))\n\n  ISeqable\n  (-seq [this] this)\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4468 4510],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L4468-L4510"},
 :full-name-encode "cljs.core_NodeSeq",
 :history [["+" "0.0-1211"]]}

```
