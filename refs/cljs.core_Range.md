## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Range

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Range.__ meta start end step __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5924-5993](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L5924-L5993)</ins>
</pre>

```clj
(deftype Range [meta start end step ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  IWithMeta
  (-with-meta [rng meta] (Range. meta start end step __hash))

  IMeta
  (-meta [rng] meta)

  ISeqable
  (-seq [rng]
    (if (pos? step)
      (when (< start end)
        rng)
      (when (> start end)
        rng)))

  ISeq
  (-first [rng] start)
  (-rest [rng]
    (if-not (nil? (-seq rng))
      (Range. meta (+ start step) end step nil)
      ()))

  INext
  (-next [rng]
    (if (pos? step)
      (when (< (+ start step) end)
        (Range. meta (+ start step) end step nil))
      (when (> (+ start step) end)
        (Range. meta (+ start step) end step nil))))

  ICollection
  (-conj [rng o] (cons o rng))

  IEmptyableCollection
  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [rng other] (equiv-sequential rng other))

  IHash
  (-hash [rng] (caching-hash rng hash-coll __hash))

  ICounted
  (-count [rng]
    (if-not (-seq rng)
      0
      (js/Math.ceil (/ (- end start) step))))

  IIndexed
  (-nth [rng n]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        (throw (js/Error. "Index out of bounds")))))
  (-nth [rng n not-found]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        not-found)))

  IReduce
  (-reduce [rng f] (ci-reduce rng f))
  (-reduce [rng f s] (ci-reduce rng f s)))
```


---

```clj
{:full-name "cljs.core/Range",
 :ns "cljs.core",
 :name "Range",
 :type "type",
 :signature ["[meta start end step __hash]"],
 :source {:code "(deftype Range [meta start end step ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  IWithMeta\n  (-with-meta [rng meta] (Range. meta start end step __hash))\n\n  IMeta\n  (-meta [rng] meta)\n\n  ISeqable\n  (-seq [rng]\n    (if (pos? step)\n      (when (< start end)\n        rng)\n      (when (> start end)\n        rng)))\n\n  ISeq\n  (-first [rng] start)\n  (-rest [rng]\n    (if-not (nil? (-seq rng))\n      (Range. meta (+ start step) end step nil)\n      ()))\n\n  INext\n  (-next [rng]\n    (if (pos? step)\n      (when (< (+ start step) end)\n        (Range. meta (+ start step) end step nil))\n      (when (> (+ start step) end)\n        (Range. meta (+ start step) end step nil))))\n\n  ICollection\n  (-conj [rng o] (cons o rng))\n\n  IEmptyableCollection\n  (-empty [rng] (with-meta cljs.core.List/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [rng other] (equiv-sequential rng other))\n\n  IHash\n  (-hash [rng] (caching-hash rng hash-coll __hash))\n\n  ICounted\n  (-count [rng]\n    (if-not (-seq rng)\n      0\n      (js/Math.ceil (/ (- end start) step))))\n\n  IIndexed\n  (-nth [rng n]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        (throw (js/Error. \"Index out of bounds\")))))\n  (-nth [rng n not-found]\n    (if (< n (-count rng))\n      (+ start (* n step))\n      (if (and (> start end) (zero? step))\n        start\n        not-found)))\n\n  IReduce\n  (-reduce [rng f] (ci-reduce rng f))\n  (-reduce [rng f s] (ci-reduce rng f s)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5924 5993],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L5924-L5993"},
 :full-name-encode "cljs.core_Range",
 :history [["+" "0.0-927"]]}

```
