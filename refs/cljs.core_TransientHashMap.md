## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/TransientHashMap

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__TransientHashMap.__ edit root count has-nil? nil-val)<br>
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
            └── <ins>[core.cljs:4731-4832](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L4731-L4832)</ins>
</pre>

```clj
(deftype TransientHashMap [^:mutable ^boolean edit
                           ^:mutable root
                           ^:mutable count
                           ^:mutable ^boolean has-nil?
                           ^:mutable nil-val]
  Object
  (conj! [tcoll o]
    (if edit
      (if (satisfies? IMapEntry o)
        (.assoc! tcoll (key o) (val o))
        (loop [es (seq o) tcoll tcoll]
          (if-let [e (first es)]
            (recur (next es)
                   (.assoc! tcoll (key e) (val e)))
            tcoll)))
      (throw (js/Error. "conj! after persistent"))))

  (assoc! [tcoll k v]
    (if edit
      (if (nil? k)
        (do (if (identical? nil-val v)
              nil
              (set! nil-val v))
            (if has-nil?
              nil
              (do (set! count (inc count))
                  (set! has-nil? true)))
            tcoll)
        (let [added-leaf? (Box. false)
              node        (-> (if (nil? root)
                                cljs.core.BitmapIndexedNode/EMPTY
                                root)
                              (.inode-assoc! edit 0 (hash k) k v added-leaf?))]
          (if (identical? node root)
            nil
            (set! root node))
          (if ^boolean (.-val added-leaf?)
            (set! count (inc count)))
          tcoll))
      (throw (js/Error. "assoc! after persistent!"))))

  (without! [tcoll k]
    (if edit
      (if (nil? k)
        (if has-nil?
          (do (set! has-nil? false)
              (set! nil-val nil)
              (set! count (dec count))
              tcoll)
          tcoll)
        (if (nil? root)
          tcoll
          (let [removed-leaf? (Box. false)
                node (.inode-without! root edit 0 (hash k) k removed-leaf?)]
            (if (identical? node root)
              nil
              (set! root node))
            (if (aget removed-leaf? 0)
              (set! count (dec count)))
            tcoll)))
      (throw (js/Error. "dissoc! after persistent!"))))

  (persistent! [tcoll]
    (if edit
      (do (set! edit nil)
          (PersistentHashMap. nil count root has-nil? nil-val nil))
      (throw (js/Error. "persistent! called twice"))))

  ICounted
  (-count [coll]
    (if edit
      count
      (throw (js/Error. "count after persistent!"))))

  ILookup
  (-lookup [tcoll k]
    (if (nil? k)
      (if has-nil?
        nil-val)
      (if (nil? root)
        nil
        (.inode-lookup root 0 (hash k) k))))

  (-lookup [tcoll k not-found]
    (if (nil? k)
      (if has-nil?
        nil-val
        not-found)
      (if (nil? root)
        not-found
        (.inode-lookup root 0 (hash k) k not-found))))

  ITransientCollection
  (-conj! [tcoll val] (.conj! tcoll val))

  (-persistent! [tcoll] (.persistent! tcoll))

  ITransientAssociative
  (-assoc! [tcoll key val] (.assoc! tcoll key val))

  ITransientMap
  (-dissoc! [tcoll key] (.without! tcoll key)))
```


---

```clj
{:full-name "cljs.core/TransientHashMap",
 :ns "cljs.core",
 :name "TransientHashMap",
 :type "type",
 :signature ["[edit root count has-nil? nil-val]"],
 :source {:code "(deftype TransientHashMap [^:mutable ^boolean edit\n                           ^:mutable root\n                           ^:mutable count\n                           ^:mutable ^boolean has-nil?\n                           ^:mutable nil-val]\n  Object\n  (conj! [tcoll o]\n    (if edit\n      (if (satisfies? IMapEntry o)\n        (.assoc! tcoll (key o) (val o))\n        (loop [es (seq o) tcoll tcoll]\n          (if-let [e (first es)]\n            (recur (next es)\n                   (.assoc! tcoll (key e) (val e)))\n            tcoll)))\n      (throw (js/Error. \"conj! after persistent\"))))\n\n  (assoc! [tcoll k v]\n    (if edit\n      (if (nil? k)\n        (do (if (identical? nil-val v)\n              nil\n              (set! nil-val v))\n            (if has-nil?\n              nil\n              (do (set! count (inc count))\n                  (set! has-nil? true)))\n            tcoll)\n        (let [added-leaf? (Box. false)\n              node        (-> (if (nil? root)\n                                cljs.core.BitmapIndexedNode/EMPTY\n                                root)\n                              (.inode-assoc! edit 0 (hash k) k v added-leaf?))]\n          (if (identical? node root)\n            nil\n            (set! root node))\n          (if ^boolean (.-val added-leaf?)\n            (set! count (inc count)))\n          tcoll))\n      (throw (js/Error. \"assoc! after persistent!\"))))\n\n  (without! [tcoll k]\n    (if edit\n      (if (nil? k)\n        (if has-nil?\n          (do (set! has-nil? false)\n              (set! nil-val nil)\n              (set! count (dec count))\n              tcoll)\n          tcoll)\n        (if (nil? root)\n          tcoll\n          (let [removed-leaf? (Box. false)\n                node (.inode-without! root edit 0 (hash k) k removed-leaf?)]\n            (if (identical? node root)\n              nil\n              (set! root node))\n            (if (aget removed-leaf? 0)\n              (set! count (dec count)))\n            tcoll)))\n      (throw (js/Error. \"dissoc! after persistent!\"))))\n\n  (persistent! [tcoll]\n    (if edit\n      (do (set! edit nil)\n          (PersistentHashMap. nil count root has-nil? nil-val nil))\n      (throw (js/Error. \"persistent! called twice\"))))\n\n  ICounted\n  (-count [coll]\n    (if edit\n      count\n      (throw (js/Error. \"count after persistent!\"))))\n\n  ILookup\n  (-lookup [tcoll k]\n    (if (nil? k)\n      (if has-nil?\n        nil-val)\n      (if (nil? root)\n        nil\n        (.inode-lookup root 0 (hash k) k))))\n\n  (-lookup [tcoll k not-found]\n    (if (nil? k)\n      (if has-nil?\n        nil-val\n        not-found)\n      (if (nil? root)\n        not-found\n        (.inode-lookup root 0 (hash k) k not-found))))\n\n  ITransientCollection\n  (-conj! [tcoll val] (.conj! tcoll val))\n\n  (-persistent! [tcoll] (.persistent! tcoll))\n\n  ITransientAssociative\n  (-assoc! [tcoll key val] (.assoc! tcoll key val))\n\n  ITransientMap\n  (-dissoc! [tcoll key] (.without! tcoll key)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [4731 4832],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L4731-L4832"},
 :full-name-encode "cljs.core_TransientHashMap",
 :history [["+" "0.0-1211"]]}

```
