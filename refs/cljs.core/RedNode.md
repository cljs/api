## cljs.core/RedNode



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__RedNode.__ key val left right __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/core.cljs#L6375-L6514):

```clj
(deftype RedNode [key val left right ^:mutable __hash]
  Object
  (add-left [node ins]
    (RedNode. key val ins right nil))

  (add-right [node ins]
    (RedNode. key val left ins nil))

  (remove-left [node del]
    (RedNode. key val del right nil))

  (remove-right [node del]
    (RedNode. key val left del nil))

  (blacken [node]
    (BlackNode. key val left right nil))

  (redden [node]
    (throw (js/Error. "red-black tree invariant violation")))

  (balance-left [node parent]
    (cond
      (instance? RedNode left)
      (RedNode. key val
                (.blacken left)
                (BlackNode. (.-key parent) (.-val parent) right (.-right parent) nil)
                nil)

      (instance? RedNode right)
      (RedNode. (.-key right) (.-val right)
                (BlackNode. key val left (.-left right) nil)
                (BlackNode. (.-key parent) (.-val parent)
                            (.-right right)
                            (.-right parent)
                            nil)
                nil)

      :else
      (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil)))

  (balance-right [node parent]
    (cond
      (instance? RedNode right)
      (RedNode. key val
                (BlackNode. (.-key parent) (.-val parent)
                            (.-left parent)
                            left
                            nil)
                (.blacken right)
                nil)

      (instance? RedNode left)
      (RedNode. (.-key left) (.-val left)
                (BlackNode. (.-key parent) (.-val parent)
                            (.-left parent)
                            (.-left left)
                            nil)
                (BlackNode. key val (.-right left) right nil)
                nil)

      :else
      (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil)))

  (replace [node key val left right]
    (RedNode. key val left right nil))

  (kv-reduce [node f init]
    (tree-map-kv-reduce node f init))

  IMapEntry
  (-key [node] key)
  (-val [node] val)

  IHash
  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2322
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6375-6514](https://github.com/clojure/clojurescript/blob/r2322/src/cljs/cljs/core.cljs#L6375-L6514)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/RedNode` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/RedNode.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/RedNode.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "RedNode",
 :type "type",
 :signature ["[key val left right __hash]"],
 :source {:code "(deftype RedNode [key val left right ^:mutable __hash]\n  Object\n  (add-left [node ins]\n    (RedNode. key val ins right nil))\n\n  (add-right [node ins]\n    (RedNode. key val left ins nil))\n\n  (remove-left [node del]\n    (RedNode. key val del right nil))\n\n  (remove-right [node del]\n    (RedNode. key val left del nil))\n\n  (blacken [node]\n    (BlackNode. key val left right nil))\n\n  (redden [node]\n    (throw (js/Error. \"red-black tree invariant violation\")))\n\n  (balance-left [node parent]\n    (cond\n      (instance? RedNode left)\n      (RedNode. key val\n                (.blacken left)\n                (BlackNode. (.-key parent) (.-val parent) right (.-right parent) nil)\n                nil)\n\n      (instance? RedNode right)\n      (RedNode. (.-key right) (.-val right)\n                (BlackNode. key val left (.-left right) nil)\n                (BlackNode. (.-key parent) (.-val parent)\n                            (.-right right)\n                            (.-right parent)\n                            nil)\n                nil)\n\n      :else\n      (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil)))\n\n  (balance-right [node parent]\n    (cond\n      (instance? RedNode right)\n      (RedNode. key val\n                (BlackNode. (.-key parent) (.-val parent)\n                            (.-left parent)\n                            left\n                            nil)\n                (.blacken right)\n                nil)\n\n      (instance? RedNode left)\n      (RedNode. (.-key left) (.-val left)\n                (BlackNode. (.-key parent) (.-val parent)\n                            (.-left parent)\n                            (.-left left)\n                            nil)\n                (BlackNode. key val (.-right left) right nil)\n                nil)\n\n      :else\n      (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil)))\n\n  (replace [node key val left right]\n    (RedNode. key val left right nil))\n\n  (kv-reduce [node f init]\n    (tree-map-kv-reduce node f init))\n\n  IMapEntry\n  (-key [node] key)\n  (-val [node] val)\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-ordered-coll __hash))\n\n  IEquiv\n  (-equiv [coll other] (equiv-sequential coll other))\n\n  IMeta\n  (-meta [node] nil)\n\n  IWithMeta\n  (-with-meta [node meta]\n    (with-meta [key val] meta))\n\n  IStack\n  (-peek [node] val)\n\n  (-pop [node] [key])\n\n  ICollection\n  (-conj [node o] [key val o])\n\n  IEmptyableCollection\n  (-empty [node] [])\n\n  ISequential\n  ISeqable\n  (-seq [node] (list key val))\n\n  ICounted\n  (-count [node] 2)\n\n  IIndexed\n  (-nth [node n]\n    (cond (== n 0) key\n          (== n 1) val\n          :else    nil))\n\n  (-nth [node n not-found]\n    (cond (== n 0) key\n          (== n 1) val\n          :else    not-found))\n\n  ILookup\n  (-lookup [node k] (-nth node k nil))\n  (-lookup [node k not-found] (-nth node k not-found))\n\n  IAssociative\n  (-assoc [node k v]\n    (assoc [key val] k v))\n\n  IVector\n  (-assoc-n [node n v]\n    (-assoc-n [key val] n v))\n\n  IReduce\n  (-reduce [node f]\n    (ci-reduce node f))\n\n  (-reduce [node f start]\n    (ci-reduce node f start))\n\n  IFn\n  (-invoke [node k]\n    (-lookup node k))\n\n  (-invoke [node k not-found]\n    (-lookup node k not-found)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6375 6514]},
 :full-name "cljs.core/RedNode",
 :full-name-encode "cljs.core/RedNode",
 :history [["+" "0.0-1211"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/RedNode"]))
```

-->
