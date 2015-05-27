## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/KeySeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__KeySeq.__ mseq _meta)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5734-5781](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L5734-L5781)</ins>
</pre>

```clj
(deftype KeySeq [^not-native mseq _meta]
  Object
  (toString [coll]
    (pr-str* coll))

  IMeta
  (-meta [coll] _meta)

  IWithMeta
  (-with-meta [coll new-meta] (KeySeq. mseq new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY _meta))

  IHash
  (-hash [coll] (hash-coll coll))
  
  ISeq
  (-first [coll]
    (let [^not-native me (-first mseq)]
      (-key me)))

  (-rest [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (if-not (nil? nseq)
        (KeySeq. nseq _meta)
        ())))

  INext
  (-next [coll]
    (let [nseq (if (satisfies? INext mseq)
                 (-next mseq)
                 (next mseq))]
      (when-not (nil? nseq)
        (KeySeq. nseq _meta)))))
```


---

```clj
{:full-name "cljs.core/KeySeq",
 :ns "cljs.core",
 :name "KeySeq",
 :type "type",
 :signature ["[mseq _meta]"],
 :source {:code "(deftype KeySeq [^not-native mseq _meta]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IMeta\n  (-meta [coll] _meta)\n\n  IWithMeta\n  (-with-meta [coll new-meta] (KeySeq. mseq new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY _meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n  \n  ISeq\n  (-first [coll]\n    (let [^not-native me (-first mseq)]\n      (-key me)))\n\n  (-rest [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (if-not (nil? nseq)\n        (KeySeq. nseq _meta)\n        ())))\n\n  INext\n  (-next [coll]\n    (let [nseq (if (satisfies? INext mseq)\n                 (-next mseq)\n                 (next mseq))]\n      (when-not (nil? nseq)\n        (KeySeq. nseq _meta)))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5734 5781],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L5734-L5781"},
 :full-name-encode "cljs.core_KeySeq",
 :history [["+" "0.0-1820"]]}

```
