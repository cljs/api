## cljs.core/PersistentTreeMap



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentTreeMap</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentTreeMap.java)
</td>
</tr>
</table>


 <samp>
(__PersistentTreeMap.__ comp tree cnt meta __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L5653-L5773):

```clj
(deftype PersistentTreeMap [comp tree cnt meta ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))

  Object
  (entry-at [coll k]
    (loop [t tree]
      (if-not (nil? t)
        (let [c (comp k (.-key t))]
          (cond (zero? c) t
                (neg? c)  (recur (.-left t))
                :else     (recur (.-right t)))))))

  IWithMeta
  (-with-meta [coll meta] (PersistentTreeMap. comp tree cnt meta __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj
              coll
              entry)))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.PersistentTreeMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ICounted
  (-count [coll] cnt)

  IKVReduce
  (-kv-reduce [coll f init]
    (if-not (nil? tree)
      (tree-map-kv-reduce tree f init)
      init))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  ISeqable
  (-seq [coll]
    (if (pos? cnt)
      (create-tree-map-seq tree true cnt)))

  IReversible
  (-rseq [coll]
    (if (pos? cnt)
      (create-tree-map-seq tree false cnt)))

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (let [n (.entry-at coll k)]
      (if-not (nil? n)
        (.-val n)
        not-found)))

  IAssociative
  (-assoc [coll k v]
    (let [found (array nil)
          t     (tree-map-add comp tree k v found)]
      (if (nil? t)
        (let [found-node (nth found 0)]
          (if (= v (.-val found-node))
            coll
            (PersistentTreeMap. comp (tree-map-replace comp tree k v) cnt meta nil)))
        (PersistentTreeMap. comp (.blacken t) (inc cnt) meta nil))))

  (-contains-key? [coll k]
    (not (nil? (.entry-at coll k))))

  IMap
  (-dissoc [coll k]
    (let [found (array nil)
          t     (tree-map-remove comp tree k found)]
      (if (nil? t)
        (if (nil? (nth found 0))
          coll
          (PersistentTreeMap. comp nil 0 meta nil))
        (PersistentTreeMap. comp (.blacken t) (dec cnt) meta nil))))

  ISorted
  (-sorted-seq [coll ascending?]
    (if (pos? cnt)
      (create-tree-map-seq tree ascending? cnt)))

  (-sorted-seq-from [coll k ascending?]
    (if (pos? cnt)
      (loop [stack nil t tree]
        (if-not (nil? t)
          (let [c (comp k (.-key t))]
            (cond
              (zero? c)  (PersistentTreeMapSeq. nil (conj stack t) ascending? -1 nil)
              ascending? (if (neg? c)
                           (recur (conj stack t) (.-left t))
                           (recur stack          (.-right t)))
              :else      (if (pos? c)
                           (recur (conj stack t) (.-right t))
                           (recur stack          (.-left t)))))
          (when-not (nil? stack)
            (PersistentTreeMapSeq. nil stack ascending? -1 nil))))))

  (-entry-key [coll entry] (key entry))

  (-comparator [coll] comp))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1913
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5653-5773](https://github.com/clojure/clojurescript/blob/r1913/src/cljs/cljs/core.cljs#L5653-L5773)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentTreeMap` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentTreeMap)<br>
[`clojure.lang/PersistentTreeMap` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentTreeMap/)<br>
[`clojure.lang/PersistentTreeMap` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentTreeMap.html)<br>
[`cljs.core/PersistentTreeMap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentTreeMap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentTreeMap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentTreeMap",
 :signature ["[comp tree cnt meta __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentTreeMap",
 :source {:code "(deftype PersistentTreeMap [comp tree cnt meta ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n\n  Object\n  (entry-at [coll k]\n    (loop [t tree]\n      (if-not (nil? t)\n        (let [c (comp k (.-key t))]\n          (cond (zero? c) t\n                (neg? c)  (recur (.-left t))\n                :else     (recur (.-right t)))))))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentTreeMap. comp tree cnt meta __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.PersistentTreeMap/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-imap __hash))\n\n  ICounted\n  (-count [coll] cnt)\n\n  IKVReduce\n  (-kv-reduce [coll f init]\n    (if-not (nil? tree)\n      (tree-map-kv-reduce tree f init)\n      init))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  ISeqable\n  (-seq [coll]\n    (if (pos? cnt)\n      (create-tree-map-seq tree true cnt)))\n\n  IReversible\n  (-rseq [coll]\n    (if (pos? cnt)\n      (create-tree-map-seq tree false cnt)))\n\n  ILookup\n  (-lookup [coll k]\n    (-lookup coll k nil))\n\n  (-lookup [coll k not-found]\n    (let [n (.entry-at coll k)]\n      (if-not (nil? n)\n        (.-val n)\n        not-found)))\n\n  IAssociative\n  (-assoc [coll k v]\n    (let [found (array nil)\n          t     (tree-map-add comp tree k v found)]\n      (if (nil? t)\n        (let [found-node (nth found 0)]\n          (if (= v (.-val found-node))\n            coll\n            (PersistentTreeMap. comp (tree-map-replace comp tree k v) cnt meta nil)))\n        (PersistentTreeMap. comp (.blacken t) (inc cnt) meta nil))))\n\n  (-contains-key? [coll k]\n    (not (nil? (.entry-at coll k))))\n\n  IMap\n  (-dissoc [coll k]\n    (let [found (array nil)\n          t     (tree-map-remove comp tree k found)]\n      (if (nil? t)\n        (if (nil? (nth found 0))\n          coll\n          (PersistentTreeMap. comp nil 0 meta nil))\n        (PersistentTreeMap. comp (.blacken t) (dec cnt) meta nil))))\n\n  ISorted\n  (-sorted-seq [coll ascending?]\n    (if (pos? cnt)\n      (create-tree-map-seq tree ascending? cnt)))\n\n  (-sorted-seq-from [coll k ascending?]\n    (if (pos? cnt)\n      (loop [stack nil t tree]\n        (if-not (nil? t)\n          (let [c (comp k (.-key t))]\n            (cond\n              (zero? c)  (PersistentTreeMapSeq. nil (conj stack t) ascending? -1 nil)\n              ascending? (if (neg? c)\n                           (recur (conj stack t) (.-left t))\n                           (recur stack          (.-right t)))\n              :else      (if (pos? c)\n                           (recur (conj stack t) (.-right t))\n                           (recur stack          (.-left t)))))\n          (when-not (nil? stack)\n            (PersistentTreeMapSeq. nil stack ascending? -1 nil))))))\n\n  (-entry-key [coll entry] (key entry))\n\n  (-comparator [coll] comp))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1913",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5653 5773]},
 :full-name "cljs.core/PersistentTreeMap",
 :clj-symbol "clojure.lang/PersistentTreeMap"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentTreeMap"]))
```

-->
