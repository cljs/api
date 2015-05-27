## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/IndexedSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__IndexedSeq.__ a i)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:475-534](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L475-L534)</ins>
</pre>

```clj
(deftype IndexedSeq [a i]
  Object
  (toString [this]
    (pr-str this))
  
  ISeqable
  (-seq [this] this)

  ASeq
  ISeq
  (-first [_] (aget a i))
  (-rest [_] (if (< (inc i) (.-length a))
               (IndexedSeq. a (inc i))
               (list)))

  INext
  (-next [_] (if (< (inc i) (.-length a))
               (IndexedSeq. a (inc i))
               nil))

  ICounted
  (-count [_] (- (.-length a) i))

  IIndexed
  (-nth [coll n]
    (let [i (+ n i)]
      (when (< i (.-length a))
        (aget a i))))
  (-nth [coll n not-found]
    (let [i (+ n i)]
      (if (< i (.-length a))
        (aget a i)
        not-found)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IReduce
  (-reduce [coll f]
    (if (counted? a)
      (ci-reduce a f (aget a i) (inc i))
      (ci-reduce coll f (aget a i) 0)))
  (-reduce [coll f start]
    (if (counted? a)
      (ci-reduce a f start i)
      (ci-reduce coll f start 0)))

  IHash
  (-hash [coll] (hash-coll coll))

  IReversible
  (-rseq [coll]
    (let [c (-count coll)]
      (if (pos? c)
        (RSeq. coll (dec c) nil)
        ()))))
```


---

```clj
{:full-name "cljs.core/IndexedSeq",
 :ns "cljs.core",
 :name "IndexedSeq",
 :type "type",
 :signature ["[a i]"],
 :source {:code "(deftype IndexedSeq [a i]\n  Object\n  (toString [this]\n    (pr-str this))\n  \n  ISeqable\n  (-seq [this] this)\n\n  ASeq\n  ISeq\n  (-first [_] (aget a i))\n  (-rest [_] (if (< (inc i) (.-length a))\n               (IndexedSeq. a (inc i))\n               (list)))\n\n  INext\n  (-next [_] (if (< (inc i) (.-length a))\n               (IndexedSeq. a (inc i))\n               nil))\n\n  ICounted\n  (-count [_] (- (.-length a) i))\n\n  IIndexed\n  (-nth [coll n]\n    (let [i (+ n i)]\n      (when (< i (.-length a))\n        (aget a i))))\n  (-nth [coll n not-found]\n    (let [i (+ n i)]\n      (if (< i (.-length a))\n        (aget a i)\n        not-found)))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ICollection\n  (-conj [coll o] (cons o coll))\n\n  IReduce\n  (-reduce [coll f]\n    (if (counted? a)\n      (ci-reduce a f (aget a i) (inc i))\n      (ci-reduce coll f (aget a i) 0)))\n  (-reduce [coll f start]\n    (if (counted? a)\n      (ci-reduce a f start i)\n      (ci-reduce coll f start 0)))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  IReversible\n  (-rseq [coll]\n    (let [c (-count coll)]\n      (if (pos? c)\n        (RSeq. coll (dec c) nil)\n        ()))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [475 534],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L475-L534"},
 :full-name-encode "cljs.core_IndexedSeq",
 :history [["+" "0.0-927"]]}

```
