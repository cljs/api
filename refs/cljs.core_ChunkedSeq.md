## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkedSeq

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ChunkedSeq.__ vec node i off meta)<br>
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
            └── <ins>[core.cljs:3047-3107](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3047-L3107)</ins>
</pre>

```clj
(deftype ChunkedSeq [vec node i off meta]
  IWithMeta
  (-with-meta [coll m]
    (chunked-seq vec node i off m))
  (-meta [coll] meta)

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ASeq
  ISeq
  (-first [coll]
    (aget node off))
  (-rest [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          ()
          s))
      (-chunked-rest coll)))

  INext
  (-next [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          nil
          s))
      (-chunked-next coll)))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll]
    (with-meta cljs.core.PersistentVector/EMPTY meta))

  IChunkedSeq
  (-chunked-first [coll]
    (array-chunk node off))
  (-chunked-rest [coll]
    (let [l (alength node)
          s (when (< (+ i l) (-count vec))
              (chunked-seq vec (+ i l) 0))]
      (if (nil? s)
        ()
        s)))

  IChunkedNext
  (-chunked-next [coll]
    (let [l (alength node)
          s (when (< (+ i l) (-count vec))
              (chunked-seq vec (+ i l) 0))]
      (if (nil? s)
        nil
        s))))
```


---

```clj
{:full-name "cljs.core/ChunkedSeq",
 :ns "cljs.core",
 :name "ChunkedSeq",
 :type "type",
 :signature ["[vec node i off meta]"],
 :source {:code "(deftype ChunkedSeq [vec node i off meta]\n  IWithMeta\n  (-with-meta [coll m]\n    (chunked-seq vec node i off m))\n  (-meta [coll] meta)\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ASeq\n  ISeq\n  (-first [coll]\n    (aget node off))\n  (-rest [coll]\n    (if (< (inc off) (alength node))\n      (let [s (chunked-seq vec node i (inc off))]\n        (if (nil? s)\n          ()\n          s))\n      (-chunked-rest coll)))\n\n  INext\n  (-next [coll]\n    (if (< (inc off) (alength node))\n      (let [s (chunked-seq vec node i (inc off))]\n        (if (nil? s)\n          nil\n          s))\n      (-chunked-next coll)))\n\n  ICollection\n  (-conj [coll o]\n    (cons o coll))\n\n  IEmptyableCollection\n  (-empty [coll]\n    (with-meta cljs.core.PersistentVector/EMPTY meta))\n\n  IChunkedSeq\n  (-chunked-first [coll]\n    (array-chunk node off))\n  (-chunked-rest [coll]\n    (let [l (alength node)\n          s (when (< (+ i l) (-count vec))\n              (chunked-seq vec (+ i l) 0))]\n      (if (nil? s)\n        ()\n        s)))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (let [l (alength node)\n          s (when (< (+ i l) (-count vec))\n              (chunked-seq vec (+ i l) 0))]\n      (if (nil? s)\n        nil\n        s))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3047 3107],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3047-L3107"},
 :full-name-encode "cljs.core_ChunkedSeq",
 :history [["+" "0.0-1424"]]}

```
