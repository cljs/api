## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ChunkedCons

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ChunkedCons.__ chunk more meta __hash)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2126-2176](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2126-L2176)</ins>
</pre>

```clj
(deftype ChunkedCons [chunk more meta ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  
  IWithMeta
  (-with-meta [coll m]
    (ChunkedCons. chunk more m __hash))

  IMeta
  (-meta [coll] meta)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ASeq
  ISeq
  (-first [coll] (-nth chunk 0))
  (-rest [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (if (nil? more)
        ()
        more)))

  IChunkedSeq
  (-chunked-first [coll] chunk)
  (-chunked-rest [coll]
    (if (nil? more)
      ()
      more))

  IChunkedNext
  (-chunked-next [coll]
    (if (nil? more)
      nil
      more))

  ICollection
  (-conj [this o]
    (cons o this))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash)))
```


---

```clj
{:full-name "cljs.core/ChunkedCons",
 :ns "cljs.core",
 :name "ChunkedCons",
 :type "type",
 :signature ["[chunk more meta __hash]"],
 :source {:code "(deftype ChunkedCons [chunk more meta ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  \n  IWithMeta\n  (-with-meta [coll m]\n    (ChunkedCons. chunk more m __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  ISeqable\n  (-seq [coll] coll)\n\n  ASeq\n  ISeq\n  (-first [coll] (-nth chunk 0))\n  (-rest [coll]\n    (if (> (-count chunk) 1)\n      (ChunkedCons. (-drop-first chunk) more meta nil)\n      (if (nil? more)\n        ()\n        more)))\n\n  IChunkedSeq\n  (-chunked-first [coll] chunk)\n  (-chunked-rest [coll]\n    (if (nil? more)\n      ()\n      more))\n\n  IChunkedNext\n  (-chunked-next [coll]\n    (if (nil? more)\n      nil\n      more))\n\n  ICollection\n  (-conj [this o]\n    (cons o this))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.List/EMPTY meta))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2126 2176],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L2126-L2176"},
 :full-name-encode "cljs.core_ChunkedCons",
 :history [["+" "0.0-1424"]]}

```
