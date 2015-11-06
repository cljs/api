## cljs.core/PersistentVector



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" title="Added in 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentVector</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentVector.java)
</td>
</tr>
</table>


 <samp>
(__PersistentVector.__ meta cnt shift root tail __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L3138-L3277):

```clj
(deftype PersistentVector [meta cnt shift root tail ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  IWithMeta
  (-with-meta [coll meta] (PersistentVector. meta cnt shift root tail __hash))

  IMeta
  (-meta [coll] meta)

  IStack
  (-peek [coll]
    (when (> cnt 0)
      (-nth coll (dec cnt))))
  (-pop [coll]
    (cond
     (zero? cnt) (throw (js/Error. "Can't pop empty vector"))
     (== 1 cnt) (-with-meta cljs.core.PersistentVector/EMPTY meta)
     (< 1 (- cnt (tail-off coll)))
      (PersistentVector. meta (dec cnt) shift root (.slice tail 0 -1) nil)
      :else (let [new-tail (array-for coll (- cnt 2))
                  nr (pop-tail coll shift root)
                  new-root (if (nil? nr) cljs.core.PersistentVector/EMPTY_NODE nr)
                  cnt-1 (dec cnt)]
              (if (and (< 5 shift) (nil? (pv-aget new-root 1)))
                (PersistentVector. meta cnt-1 (- shift 5) (pv-aget new-root 0) new-tail nil)
                (PersistentVector. meta cnt-1 shift new-root new-tail nil)))))

  ICollection
  (-conj [coll o]
    (if (< (- cnt (tail-off coll)) 32)
      (let [new-tail (aclone tail)]
        (.push new-tail o)
        (PersistentVector. meta (inc cnt) shift root new-tail nil))
      (let [root-overflow? (> (bit-shift-right-zero-fill cnt 5) (bit-shift-left 1 shift))
            new-shift (if root-overflow? (+ shift 5) shift)
            new-root (if root-overflow?
                       (let [n-r (pv-fresh-node nil)]
                           (pv-aset n-r 0 root)
                           (pv-aset n-r 1 (new-path nil shift (VectorNode. nil tail)))
                           n-r)
                       (push-tail coll shift root (VectorNode. nil tail)))]
        (PersistentVector. meta (inc cnt) new-shift new-root (array o) nil))))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.PersistentVector/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll]
    (cond
      (zero? cnt) nil
      (< cnt 32) (array-seq tail)
      :else (chunked-seq coll 0 0)))

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

  IMapEntry
  (-key [coll]
    (-nth coll 0))
  (-val [coll]
    (-nth coll 1))

  IAssociative
  (-assoc [coll k v]
    (cond
       (and (<= 0 k) (< k cnt))
       (if (<= (tail-off coll) k)
         (let [new-tail (aclone tail)]
           (aset new-tail (bit-and k 0x01f) v)
           (PersistentVector. meta cnt shift root new-tail nil))
         (PersistentVector. meta cnt shift (do-assoc coll shift root k v) tail nil))
       (== k cnt) (-conj coll v)
       :else (throw (js/Error. (str "Index " k " out of bounds  [0," cnt "]")))))

  IVector
  (-assoc-n [coll n val] (-assoc coll n val))

  IReduce
  (-reduce [v f]
    (ci-reduce v f))
  (-reduce [v f start]
    (ci-reduce v f start))

  IKVReduce
  (-kv-reduce [v f init]
    (let [step-init (array 0 init)] ; [step 0 init init]
      (loop [i 0]
        (if (< i cnt)
          (let [arr (array-for v i)
                len (alength arr)]
            (let [init (loop [j 0 init (aget step-init 1)]
                         (if (< j len)
                           (let [init (f init (+ j i) (aget arr j))]
                             (if (reduced? init)
                               init
                               (recur (inc j) init)))
                           (do (aset step-init 0 len)
                               (aset step-init 1 init)
                               init)))]
              (if (reduced? init)
                @init
                (recur (+ i (aget step-init 0))))))
          (aget step-init 1)))))

  IFn
  (-invoke [coll k]
    (-nth coll k))
  (-invoke [coll k not-found]
    (-nth coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (TransientVector. cnt shift (tv-editable-root root) (tv-editable-tail tail)))

  IReversible
  (-rseq [coll]
    (if (pos? cnt)
      (RSeq. coll (dec cnt) nil)
      ())))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1847
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3138-3277](https://github.com/clojure/clojurescript/blob/r1847/src/cljs/cljs/core.cljs#L3138-L3277)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentVector` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentVector)<br>
[`clojure.lang/PersistentVector` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentVector/)<br>
[`clojure.lang/PersistentVector` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentVector.html)<br>
[`cljs.core/PersistentVector` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentVector.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentVector",
 :signature ["[meta cnt shift root tail __hash]"],
 :history [["+" "0.0-1006"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentVector",
 :source {:code "(deftype PersistentVector [meta cnt shift root tail ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentVector. meta cnt shift root tail __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  IStack\n  (-peek [coll]\n    (when (> cnt 0)\n      (-nth coll (dec cnt))))\n  (-pop [coll]\n    (cond\n     (zero? cnt) (throw (js/Error. \"Can't pop empty vector\"))\n     (== 1 cnt) (-with-meta cljs.core.PersistentVector/EMPTY meta)\n     (< 1 (- cnt (tail-off coll)))\n      (PersistentVector. meta (dec cnt) shift root (.slice tail 0 -1) nil)\n      :else (let [new-tail (array-for coll (- cnt 2))\n                  nr (pop-tail coll shift root)\n                  new-root (if (nil? nr) cljs.core.PersistentVector/EMPTY_NODE nr)\n                  cnt-1 (dec cnt)]\n              (if (and (< 5 shift) (nil? (pv-aget new-root 1)))\n                (PersistentVector. meta cnt-1 (- shift 5) (pv-aget new-root 0) new-tail nil)\n                (PersistentVector. meta cnt-1 shift new-root new-tail nil)))))\n\n  ICollection\n  (-conj [coll o]\n    (if (< (- cnt (tail-off coll)) 32)\n      (let [new-tail (aclone tail)]\n        (.push new-tail o)\n        (PersistentVector. meta (inc cnt) shift root new-tail nil))\n      (let [root-overflow? (> (bit-shift-right-zero-fill cnt 5) (bit-shift-left 1 shift))\n            new-shift (if root-overflow? (+ shift 5) shift)\n            new-root (if root-overflow?\n                       (let [n-r (pv-fresh-node nil)]\n                           (pv-aset n-r 0 root)\n                           (pv-aset n-r 1 (new-path nil shift (VectorNode. nil tail)))\n                           n-r)\n                       (push-tail coll shift root (VectorNode. nil tail)))]\n        (PersistentVector. meta (inc cnt) new-shift new-root (array o) nil))))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.PersistentVector/EMPTY meta))\n\n  ISequential\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (cond\n      (zero? cnt) nil\n      (< cnt 32) (array-seq tail)\n      :else (chunked-seq coll 0 0)))\n\n  ICounted\n  (-count [coll] cnt)\n\n  IIndexed\n  (-nth [coll n]\n    (aget (array-for coll n) (bit-and n 0x01f)))\n  (-nth [coll n not-found]\n    (if (and (<= 0 n) (< n cnt))\n      (-nth coll n)\n      not-found))\n\n  ILookup\n  (-lookup [coll k] (-nth coll k nil))\n  (-lookup [coll k not-found] (-nth coll k not-found))\n\n  IMapEntry\n  (-key [coll]\n    (-nth coll 0))\n  (-val [coll]\n    (-nth coll 1))\n\n  IAssociative\n  (-assoc [coll k v]\n    (cond\n       (and (<= 0 k) (< k cnt))\n       (if (<= (tail-off coll) k)\n         (let [new-tail (aclone tail)]\n           (aset new-tail (bit-and k 0x01f) v)\n           (PersistentVector. meta cnt shift root new-tail nil))\n         (PersistentVector. meta cnt shift (do-assoc coll shift root k v) tail nil))\n       (== k cnt) (-conj coll v)\n       :else (throw (js/Error. (str \"Index \" k \" out of bounds  [0,\" cnt \"]\")))))\n\n  IVector\n  (-assoc-n [coll n val] (-assoc coll n val))\n\n  IReduce\n  (-reduce [v f]\n    (ci-reduce v f))\n  (-reduce [v f start]\n    (ci-reduce v f start))\n\n  IKVReduce\n  (-kv-reduce [v f init]\n    (let [step-init (array 0 init)] ; [step 0 init init]\n      (loop [i 0]\n        (if (< i cnt)\n          (let [arr (array-for v i)\n                len (alength arr)]\n            (let [init (loop [j 0 init (aget step-init 1)]\n                         (if (< j len)\n                           (let [init (f init (+ j i) (aget arr j))]\n                             (if (reduced? init)\n                               init\n                               (recur (inc j) init)))\n                           (do (aset step-init 0 len)\n                               (aset step-init 1 init)\n                               init)))]\n              (if (reduced? init)\n                @init\n                (recur (+ i (aget step-init 0))))))\n          (aget step-init 1)))))\n\n  IFn\n  (-invoke [coll k]\n    (-nth coll k))\n  (-invoke [coll k not-found]\n    (-nth coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll]\n    (TransientVector. cnt shift (tv-editable-root root) (tv-editable-tail tail)))\n\n  IReversible\n  (-rseq [coll]\n    (if (pos? cnt)\n      (RSeq. coll (dec cnt) nil)\n      ())))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1847",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3138 3277]},
 :full-name "cljs.core/PersistentVector",
 :clj-symbol "clojure.lang/PersistentVector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector"]))
```

-->
