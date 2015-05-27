## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/BlackNode

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__BlackNode.__ key val left right __hash)<br>
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
            └── <ins>[core.cljs:4994-5100](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L4994-L5100)</ins>
</pre>

```clj
(deftype BlackNode [key val left right ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))

  (add-left [node ins]
    (.balance-left ins node))

  (add-right [node ins]
    (.balance-right ins node))

  (remove-left [node del]
    (balance-left-del key val del right))

  (remove-right [node del]
    (balance-right-del key val left del))

  (blacken [node] node)

  (redden [node] (RedNode. key val left right nil))

  (balance-left [node parent]
    (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil))

  (balance-right [node parent]
    (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil))

  (replace [node key val left right]
    (BlackNode. key val left right nil))

  (kv-reduce [node f init]
    (tree-map-kv-reduce node f init))

  (toString [this]
    (pr-str this))

  IMapEntry
  (-key [node] key)
  (-val [node] val)

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IMeta
  (-meta [node] nil)

  IWithMeta
  (-with-meta [node meta]
    (with-meta [key val] meta))

  IStack
  (-peek [node] val)

  (-pop [node] [key])

  ICollection
  (-conj [node o] [key val o])

  IEmptyableCollection
  (-empty [node] [])

  ISequential
  ISeqable
  (-seq [node] (list key val))

  ICounted
  (-count [node] 2)

  IIndexed
  (-nth [node n]
    (cond (== n 0) key
          (== n 1) val
          :else    nil))

  (-nth [node n not-found]
    (cond (== n 0) key
          (== n 1) val
          :else    not-found))

  ILookup
  (-lookup [node k] (-nth node k nil))
  (-lookup [node k not-found] (-nth node k not-found))

  IAssociative
  (-assoc [node k v]
    (assoc [key val] k v))

  IVector
  (-assoc-n [node n v]
    (-assoc-n [key val] n v))

  IReduce
  (-reduce [node f]
    (ci-reduce node f))

  (-reduce [node f start]
    (ci-reduce node f start))

  IFn
  (-invoke [node k]
    (-lookup node k))

  (-invoke [node k not-found]
    (-lookup node k not-found)))
```


---

```clj
{:full-name "cljs.core/BlackNode",
 :ns "cljs.core",
 :name "BlackNode",
 :type "type",
 :signature ["[key val left right __hash]"],
 :source {:code "(deftype BlackNode [key val left right ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n\n  (add-left [node ins]\n    (.balance-left ins node))\n\n  (add-right [node ins]\n    (.balance-right ins node))\n\n  (remove-left [node del]\n    (balance-left-del key val del right))\n\n  (remove-right [node del]\n    (balance-right-del key val left del))\n\n  (blacken [node] node)\n\n  (redden [node] (RedNode. key val left right nil))\n\n  (balance-left [node parent]\n    (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil))\n\n  (balance-right [node parent]\n    (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil))\n\n  (replace [node key val left right]\n    (BlackNode. key val left right nil))\n\n  (kv-reduce [node f init]\n    (tree-map-kv-reduce node f init))\n\n  (toString [this]\n    (pr-str this))\n\n  IMapEntry\n  (-key [node] key)\n  (-val [node] val)\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-coll __hash))\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IMeta\n  (-meta [node] nil)\n\n  IWithMeta\n  (-with-meta [node meta]\n    (with-meta [key val] meta))\n\n  IStack\n  (-peek [node] val)\n\n  (-pop [node] [key])\n\n  ICollection\n  (-conj [node o] [key val o])\n\n  IEmptyableCollection\n  (-empty [node] [])\n\n  ISequential\n  ISeqable\n  (-seq [node] (list key val))\n\n  ICounted\n  (-count [node] 2)\n\n  IIndexed\n  (-nth [node n]\n    (cond (== n 0) key\n          (== n 1) val\n          :else    nil))\n\n  (-nth [node n not-found]\n    (cond (== n 0) key\n          (== n 1) val\n          :else    not-found))\n\n  ILookup\n  (-lookup [node k] (-nth node k nil))\n  (-lookup [node k not-found] (-nth node k not-found))\n\n  IAssociative\n  (-assoc [node k v]\n    (assoc [key val] k v))\n\n  IVector\n  (-assoc-n [node n v]\n    (-assoc-n [key val] n v))\n\n  IReduce\n  (-reduce [node f]\n    (ci-reduce node f))\n\n  (-reduce [node f start]\n    (ci-reduce node f start))\n\n  IFn\n  (-invoke [node k]\n    (-lookup node k))\n\n  (-invoke [node k not-found]\n    (-lookup node k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4994 5100],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L4994-L5100"},
 :full-name-encode "cljs.core_BlackNode",
 :history [["+" "0.0-1211"]]}

```
