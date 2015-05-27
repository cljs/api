## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ArrayChunk

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ArrayChunk</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ArrayChunk)
</td>
</tr>
</table>

 <samp>
(__ArrayChunk.__ arr off end)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2040-2062](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L2040-L2062)</ins>
</pre>

```clj
(deftype ArrayChunk [arr off end]
  ICounted
  (-count [_] (- end off))

  IIndexed
  (-nth [coll i]
    (aget arr (+ off i)))
  (-nth [coll i not-found]
    (if (and (>= i 0) (< i (- end off)))
      (aget arr (+ off i))
      not-found))

  IChunk
  (-drop-first [coll]
    (if (== off end)
      (throw (js/Error. "-drop-first of empty chunk"))
      (ArrayChunk. arr (inc off) end)))

  IReduce
  (-reduce [coll f]
    (array-reduce arr f (aget arr off) (inc off)))
  (-reduce [coll f start]
    (array-reduce arr f start off)))
```


---

```clj
{:full-name "cljs.core/ArrayChunk",
 :ns "cljs.core",
 :name "ArrayChunk",
 :type "type",
 :signature ["[arr off end]"],
 :source {:code "(deftype ArrayChunk [arr off end]\n  ICounted\n  (-count [_] (- end off))\n\n  IIndexed\n  (-nth [coll i]\n    (aget arr (+ off i)))\n  (-nth [coll i not-found]\n    (if (and (>= i 0) (< i (- end off)))\n      (aget arr (+ off i))\n      not-found))\n\n  IChunk\n  (-drop-first [coll]\n    (if (== off end)\n      (throw (js/Error. \"-drop-first of empty chunk\"))\n      (ArrayChunk. arr (inc off) end)))\n\n  IReduce\n  (-reduce [coll f]\n    (array-reduce arr f (aget arr off) (inc off)))\n  (-reduce [coll f start]\n    (array-reduce arr f start off)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2040 2062],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L2040-L2062"},
 :full-name-encode "cljs.core_ArrayChunk",
 :clj-symbol "clojure.core/ArrayChunk",
 :history [["+" "0.0-1424"]]}

```
