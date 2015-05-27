## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/PersistentVector

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__PersistentVector.__ meta cnt shift root tail)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2098-2199](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2098-L2199)</ins>
</pre>

```clj
(deftype PersistentVector [meta cnt shift root tail]
  IWithMeta
  (-with-meta [coll meta] (PersistentVector. meta cnt shift root tail))

  IMeta
  (-meta [coll] meta)

  IStack
  (-peek [coll]
    (when (> cnt 0)
      (-nth coll (dec cnt))))
  (-pop [coll]
    (cond
     (zero? cnt) (throw (js/Error. "Can't pop empty vector"))
     (= 1 cnt) (-with-meta cljs.core.PersistentVector/EMPTY meta)
     (< 1 (- cnt (tail-off coll)))
      (PersistentVector. meta (dec cnt) shift root (aclone tail))
      :else (let [new-tail (array-for coll (- cnt 2))
                  nr (pop-tail shift root)
                  new-root (if (nil? nr) cljs.core.PersistentVector/EMPTY_NODE nr)
                  cnt-1 (dec cnt)]
              (if (and (< 5 shift) (nil? (aget new-root 1)))
                (PersistentVector. meta cnt-1 (- shift 5) (aget new-root 0) new-tail)
                (PersistentVector. meta cnt-1 shift new-root new-tail)))))

  ICollection
  (-conj [coll o]
    (if (< (- cnt (tail-off coll)) 32)
      (let [new-tail (aclone tail)]
        (.push new-tail o)
        (PersistentVector. meta (inc cnt) shift root new-tail))
      (let [root-overflow? (> (bit-shift-right cnt 5) (bit-shift-left 1 shift))
            new-shift (if root-overflow? (+ shift 5) shift)
            new-root (if root-overflow?
                       (let [n-r (aclone cljs.core.PersistentVector/EMPTY_NODE)]
                           (aset n-r 0 root)
                           (aset n-r 1 (new-path shift tail))
                           n-r)
                       (push-tail coll shift root tail))]
        (PersistentVector. meta (inc cnt) new-shift new-root (array o)))))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.PersistentVector/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll]
    (when (> cnt 0)
      (let [vector-seq
             (fn vector-seq [i]
               (lazy-seq
                 (when (< i cnt)
                   (cons (-nth coll i) (vector-seq (inc i))))))]
        (vector-seq 0))))

  ICounted
  (-count [coll] cnt)

  IIndexed
  (-nth [coll n]
    (aget (array-for coll n) (bit-and n 0x01f)))
  (-nth [coll n not-found]
    (if (and (<= 0 n) (< n cnt))
      (-nth coll n)
      not-found))

  ILookup
  (-lookup [coll k] (-nth coll k nil))
  (-lookup [coll k not-found] (-nth coll k not-found))

  IAssociative
  (-assoc [coll k v]
    (cond
       (and (<= 0 k) (< k cnt))
       (if (<= (tail-off coll) k)
         (let [new-tail (aclone tail)]
           (aset new-tail (bit-and k 0x01f) v)
           (PersistentVector. meta cnt shift root new-tail))
         (PersistentVector. meta cnt shift (do-assoc coll shift root k v) tail))
       (= k cnt) (-conj coll v)
       :else (throw (js/Error. (str "Index " k " out of bounds  [0," cnt "]")))))

  IVector
  (-assoc-n [coll n val] (-assoc coll n val))

  IReduce
  (-reduce [v f]
    (ci-reduce v f))
  (-reduce [v f start]
    (ci-reduce v f start))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```


---

```clj
{:full-name "cljs.core/PersistentVector",
 :ns "cljs.core",
 :name "PersistentVector",
 :type "type",
 :signature ["[meta cnt shift root tail]"],
 :source {:code "(deftype PersistentVector [meta cnt shift root tail]\n  IWithMeta\n  (-with-meta [coll meta] (PersistentVector. meta cnt shift root tail))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IStack\n  (-peek [coll]\n    (when (> cnt 0)\n      (-nth coll (dec cnt))))\n  (-pop [coll]\n    (cond\n     (zero? cnt) (throw (js/Error. \"Can't pop empty vector\"))\n     (= 1 cnt) (-with-meta cljs.core.PersistentVector/EMPTY meta)\n     (< 1 (- cnt (tail-off coll)))\n      (PersistentVector. meta (dec cnt) shift root (aclone tail))\n      :else (let [new-tail (array-for coll (- cnt 2))\n                  nr (pop-tail shift root)\n                  new-root (if (nil? nr) cljs.core.PersistentVector/EMPTY_NODE nr)\n                  cnt-1 (dec cnt)]\n              (if (and (< 5 shift) (nil? (aget new-root 1)))\n                (PersistentVector. meta cnt-1 (- shift 5) (aget new-root 0) new-tail)\n                (PersistentVector. meta cnt-1 shift new-root new-tail)))))\n\n  ICollection\n  (-conj [coll o]\n    (if (< (- cnt (tail-off coll)) 32)\n      (let [new-tail (aclone tail)]\n        (.push new-tail o)\n        (PersistentVector. meta (inc cnt) shift root new-tail))\n      (let [root-overflow? (> (bit-shift-right cnt 5) (bit-shift-left 1 shift))\n            new-shift (if root-overflow? (+ shift 5) shift)\n            new-root (if root-overflow?\n                       (let [n-r (aclone cljs.core.PersistentVector/EMPTY_NODE)]\n                           (aset n-r 0 root)\n                           (aset n-r 1 (new-path shift tail))\n                           n-r)\n                       (push-tail coll shift root tail))]\n        (PersistentVector. meta (inc cnt) new-shift new-root (array o)))))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.PersistentVector/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll]\n    (when (> cnt 0)\n      (let [vector-seq\n             (fn vector-seq [i]\n               (lazy-seq\n                 (when (< i cnt)\n                   (cons (-nth coll i) (vector-seq (inc i))))))]\n        (vector-seq 0))))\n\n  ICounted\n  (-count [coll] cnt)\n\n  IIndexed\n  (-nth [coll n]\n    (aget (array-for coll n) (bit-and n 0x01f)))\n  (-nth [coll n not-found]\n    (if (and (<= 0 n) (< n cnt))\n      (-nth coll n)\n      not-found))\n\n  ILookup\n  (-lookup [coll k] (-nth coll k nil))\n  (-lookup [coll k not-found] (-nth coll k not-found))\n\n  IAssociative\n  (-assoc [coll k v]\n    (cond\n       (and (<= 0 k) (< k cnt))\n       (if (<= (tail-off coll) k)\n         (let [new-tail (aclone tail)]\n           (aset new-tail (bit-and k 0x01f) v)\n           (PersistentVector. meta cnt shift root new-tail))\n         (PersistentVector. meta cnt shift (do-assoc coll shift root k v) tail))\n       (= k cnt) (-conj coll v)\n       :else (throw (js/Error. (str \"Index \" k \" out of bounds  [0,\" cnt \"]\")))))\n\n  IVector\n  (-assoc-n [coll n val] (-assoc coll n val))\n\n  IReduce\n  (-reduce [v f]\n    (ci-reduce v f))\n  (-reduce [v f start]\n    (ci-reduce v f start))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2098 2199],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/cljs/core.cljs#L2098-L2199"},
 :full-name-encode "cljs.core_PersistentVector",
 :history [["+" "0.0-1006"]]}

```
