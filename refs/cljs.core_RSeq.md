## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/RSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__RSeq.__ ci i meta)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:688-725](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L688-L725)</ins>
</pre>

```clj
(deftype RSeq [ci i meta]
  Object
  (toString [this]
    (pr-str this))

  IMeta
  (-meta [coll] meta)
  IWithMeta
  (-with-meta [coll new-meta]
    (RSeq. ci i new-meta))

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeq
  (-first [coll]
    (-nth ci i))
  (-rest [coll]
    (if (pos? i)
      (RSeq. ci (dec i) nil)
      ()))

  ICounted
  (-count [coll] (inc i))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  IHash
  (-hash [coll] (hash-coll coll)))
```


---

```clj
{:full-name "cljs.core/RSeq",
 :ns "cljs.core",
 :name "RSeq",
 :type "type",
 :signature ["[ci i meta]"],
 :source {:code "(deftype RSeq [ci i meta]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IMeta\n  (-meta [coll] meta)\n  IWithMeta\n  (-with-meta [coll new-meta]\n    (RSeq. ci i new-meta))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeq\n  (-first [coll]\n    (-nth ci i))\n  (-rest [coll]\n    (if (pos? i)\n      (RSeq. ci (dec i) nil)\n      ()))\n\n  ICounted\n  (-count [coll] (inc i))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  IHash\n  (-hash [coll] (hash-coll coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [688 725],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/cljs/core.cljs#L688-L725"},
 :full-name-encode "cljs.core_RSeq",
 :history [["+" "0.0-1424"]]}

```
