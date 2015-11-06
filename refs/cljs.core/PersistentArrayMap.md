## cljs.core/PersistentArrayMap



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentArrayMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentArrayMap.java)
</td>
</tr>
</table>


 <samp>
(__PersistentArrayMap.__ meta cnt arr __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L4160-L4264):

```clj
(deftype PersistentArrayMap [meta cnt arr ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IWithMeta
  (-with-meta [coll meta] (PersistentArrayMap. meta cnt arr __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj coll entry)))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljs.core.PersistentArrayMap.EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ISeqable
  (-seq [coll]
    (persistent-array-map-seq arr 0 nil))

  ICounted
  (-count [coll] cnt)

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (let [idx (array-map-index-of coll k)]
      (if (== idx -1)
        not-found
        (aget arr (inc idx)))))

  IAssociative
  (-assoc [coll k v]
    (let [idx (array-map-index-of coll k)]
      (cond
        (== idx -1)
        (if (< cnt cljs.core.PersistentArrayMap.HASHMAP_THRESHOLD)
          (let [arr (array-map-extend-kv coll k v)]
            (PersistentArrayMap. meta (inc cnt) arr nil))
          (-> (into cljs.core.PersistentHashMap.EMPTY coll)
            (-assoc k v)
            (-with-meta meta)))

        (identical? v (aget arr (inc idx)))
        coll

        :else
        (let [arr (doto (aclone arr)
                    (aset (inc idx) v))]
          (PersistentArrayMap. meta cnt arr nil)))))

  (-contains-key? [coll k]
    (not (== (array-map-index-of coll k) -1)))

  IMap
  (-dissoc [coll k]
    (let [idx (array-map-index-of coll k)]
      (if (>= idx 0)
        (let [len     (alength arr)
              new-len (- len 2)]
          (if (zero? new-len)
            (-empty coll)
            (let [new-arr (make-array new-len)]
              (loop [s 0 d 0]
                (cond
                  (>= s len) (PersistentArrayMap. meta (dec cnt) new-arr nil)
                  (= k (aget arr s)) (recur (+ s 2) d)
                  :else (do (aset new-arr d (aget arr s))
                            (aset new-arr (inc d) (aget arr (inc s)))
                            (recur (+ s 2) (+ d 2))))))))
        coll)))

  IKVReduce
  (-kv-reduce [coll f init]
    (let [len (alength arr)]
      (loop [i 0 init init]
        (if (< i len)
          (let [init (f init (aget arr i) (aget arr (inc i)))]
            (if (reduced? init)
              @init
              (recur (+ i 2) init)))
          init))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (TransientArrayMap. (js-obj) (alength arr) (aclone arr))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2075
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4160-4264](https://github.com/clojure/clojurescript/blob/r2075/src/cljs/cljs/core.cljs#L4160-L4264)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentArrayMap` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentArrayMap)<br>
[`clojure.lang/PersistentArrayMap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentArrayMap/)<br>
[`clojure.lang/PersistentArrayMap` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentArrayMap.html)<br>
[`cljs.core/PersistentArrayMap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap",
 :signature ["[meta cnt arr __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentArrayMap",
 :source {:code "(deftype PersistentArrayMap [meta cnt arr ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentArrayMap. meta cnt arr __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj coll entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (-with-meta cljs.core.PersistentArrayMap.EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-imap __hash))\n\n  ISeqable\n  (-seq [coll]\n    (persistent-array-map-seq arr 0 nil))\n\n  ICounted\n  (-count [coll] cnt)\n\n  ILookup\n  (-lookup [coll k]\n    (-lookup coll k nil))\n\n  (-lookup [coll k not-found]\n    (let [idx (array-map-index-of coll k)]\n      (if (== idx -1)\n        not-found\n        (aget arr (inc idx)))))\n\n  IAssociative\n  (-assoc [coll k v]\n    (let [idx (array-map-index-of coll k)]\n      (cond\n        (== idx -1)\n        (if (< cnt cljs.core.PersistentArrayMap.HASHMAP_THRESHOLD)\n          (let [arr (array-map-extend-kv coll k v)]\n            (PersistentArrayMap. meta (inc cnt) arr nil))\n          (-> (into cljs.core.PersistentHashMap.EMPTY coll)\n            (-assoc k v)\n            (-with-meta meta)))\n\n        (identical? v (aget arr (inc idx)))\n        coll\n\n        :else\n        (let [arr (doto (aclone arr)\n                    (aset (inc idx) v))]\n          (PersistentArrayMap. meta cnt arr nil)))))\n\n  (-contains-key? [coll k]\n    (not (== (array-map-index-of coll k) -1)))\n\n  IMap\n  (-dissoc [coll k]\n    (let [idx (array-map-index-of coll k)]\n      (if (>= idx 0)\n        (let [len     (alength arr)\n              new-len (- len 2)]\n          (if (zero? new-len)\n            (-empty coll)\n            (let [new-arr (make-array new-len)]\n              (loop [s 0 d 0]\n                (cond\n                  (>= s len) (PersistentArrayMap. meta (dec cnt) new-arr nil)\n                  (= k (aget arr s)) (recur (+ s 2) d)\n                  :else (do (aset new-arr d (aget arr s))\n                            (aset new-arr (inc d) (aget arr (inc s)))\n                            (recur (+ s 2) (+ d 2))))))))\n        coll)))\n\n  IKVReduce\n  (-kv-reduce [coll f init]\n    (let [len (alength arr)]\n      (loop [i 0 init init]\n        (if (< i len)\n          (let [init (f init (aget arr i) (aget arr (inc i)))]\n            (if (reduced? init)\n              @init\n              (recur (+ i 2) init)))\n          init))))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll]\n    (TransientArrayMap. (js-obj) (alength arr) (aclone arr))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2075",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4160 4264]},
 :full-name "cljs.core/PersistentArrayMap",
 :clj-symbol "clojure.lang/PersistentArrayMap"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap"]))
```

-->
