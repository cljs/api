## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Vector

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Vector.__ meta array __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2345-2430](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2345-L2430)</ins>
</pre>

```clj
(deftype Vector [meta array ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [coll meta] (Vector. meta array __hash))

  IMeta
  (-meta [coll] meta)

  IStack
  (-peek [coll]
    (let [count (.-length array)]
      (when (> count 0)
        (aget array (dec count)))))
  (-pop [coll]
    (if (> (.-length array) 0)
      (let [new-array (aclone array)]
        (. new-array (pop))
        (Vector. meta new-array nil))
      (throw (js/Error. "Can't pop empty vector"))))

  ICollection
  (-conj [coll o]
    (let [new-array (aclone array)]
      (.push new-array o)
      (Vector. meta new-array nil)))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.Vector/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll]
    (when (> (.-length array) 0)
      (let [vector-seq
             (fn vector-seq [i]
               (lazy-seq
                 (when (< i (.-length array))
                   (cons (aget array i) (vector-seq (inc i))))))]
        (vector-seq 0))))

  ICounted
  (-count [coll] (.-length array))

  IIndexed
  (-nth [coll n]
    (if (and (<= 0 n) (< n (.-length array)))
      (aget array n)
      #_(throw (js/Error. (str "No item " n " in vector of length " (.-length array))))))
  (-nth [coll n not-found]
    (if (and (<= 0 n) (< n (.-length array)))
      (aget array n)
      not-found))

  ILookup
  (-lookup [coll k] (-nth coll k nil))
  (-lookup [coll k not-found] (-nth coll k not-found))

  IAssociative
  (-assoc [coll k v]
    (let [new-array (aclone array)]
      (aset new-array k v)
      (Vector. meta new-array nil)))

  IVector
  (-assoc-n [coll n val] (-assoc coll n val))

  IReduce
  (-reduce [v f]
    (ci-reduce array f))
  (-reduce [v f start]
    (ci-reduce array f start))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```


---

```clj
{:full-name "cljs.core/Vector",
 :ns "cljs.core",
 :name "Vector",
 :type "type",
 :signature ["[meta array __hash]"],
 :source {:code "(deftype Vector [meta array ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [coll meta] (Vector. meta array __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IStack\n  (-peek [coll]\n    (let [count (.-length array)]\n      (when (> count 0)\n        (aget array (dec count)))))\n  (-pop [coll]\n    (if (> (.-length array) 0)\n      (let [new-array (aclone array)]\n        (. new-array (pop))\n        (Vector. meta new-array nil))\n      (throw (js/Error. \"Can't pop empty vector\"))))\n\n  ICollection\n  (-conj [coll o]\n    (let [new-array (aclone array)]\n      (.push new-array o)\n      (Vector. meta new-array nil)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.Vector/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (when (> (.-length array) 0)\n      (let [vector-seq\n             (fn vector-seq [i]\n               (lazy-seq\n                 (when (< i (.-length array))\n                   (cons (aget array i) (vector-seq (inc i))))))]\n        (vector-seq 0))))\n\n  ICounted\n  (-count [coll] (.-length array))\n\n  IIndexed\n  (-nth [coll n]\n    (if (and (<= 0 n) (< n (.-length array)))\n      (aget array n)\n      #_(throw (js/Error. (str \"No item \" n \" in vector of length \" (.-length array))))))\n  (-nth [coll n not-found]\n    (if (and (<= 0 n) (< n (.-length array)))\n      (aget array n)\n      not-found))\n\n  ILookup\n  (-lookup [coll k] (-nth coll k nil))\n  (-lookup [coll k not-found] (-nth coll k not-found))\n\n  IAssociative\n  (-assoc [coll k v]\n    (let [new-array (aclone array)]\n      (aset new-array k v)\n      (Vector. meta new-array nil)))\n\n  IVector\n  (-assoc-n [coll n val] (-assoc coll n val))\n\n  IReduce\n  (-reduce [v f]\n    (ci-reduce array f))\n  (-reduce [v f start]\n    (ci-reduce array f start))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2345 2430],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L2345-L2430"},
 :full-name-encode "cljs.core_Vector",
 :history [["+" "0.0-927"]]}

```
