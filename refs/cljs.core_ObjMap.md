## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ObjMap

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ObjMap.__ meta keys strobj update-count __hash)<br>
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
            └── <ins>[core.cljs:3541-3628](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3541-L3628)</ins>
</pre>

```clj
(deftype ObjMap [meta keys strobj update-count ^:mutable __hash]
  Object
  (toString [this]
    (pr-str this))
  
  IWithMeta
  (-with-meta [coll meta] (ObjMap. meta keys strobj update-count __hash))

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
  (-empty [coll] (with-meta cljs.core.ObjMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ISeqable
  (-seq [coll]
    (when (pos? (.-length keys))
      (map #(vector % (aget strobj %))
           (.sort keys obj-map-compare-keys))))

  ICounted
  (-count [coll] (.-length keys))

  ILookup
  (-lookup [coll k] (-lookup coll k nil))
  (-lookup [coll k not-found]
    (if (and ^boolean (goog/isString k)
             (not (nil? (scan-array 1 k keys))))
      (aget strobj k)
      not-found))

  IAssociative
  (-assoc [coll k v]
    (if ^boolean (goog/isString k)
        (if (or (> update-count cljs.core.ObjMap/HASHMAP_THRESHOLD)
                (>= (alength keys) cljs.core.ObjMap/HASHMAP_THRESHOLD))
          (obj-map->hash-map coll k v)
          (if-not (nil? (scan-array 1 k keys))
            (let [new-strobj (obj-clone strobj keys)]
              (aset new-strobj k v)
              (ObjMap. meta keys new-strobj (inc update-count) nil)) ; overwrite
            (let [new-strobj (obj-clone strobj keys) ; append
                  new-keys (aclone keys)]
              (aset new-strobj k v)
              (.push new-keys k)
              (ObjMap. meta new-keys new-strobj (inc update-count) nil))))
        ;; non-string key. game over.
        (obj-map->hash-map coll k v)))
  (-contains-key? [coll k]
    (if (and ^boolean (goog/isString k)
             (not (nil? (scan-array 1 k keys))))
      true
      false))

  IMap
  (-dissoc [coll k]
    (if (and ^boolean (goog/isString k)
             (not (nil? (scan-array 1 k keys))))
      (let [new-keys (aclone keys)
            new-strobj (obj-clone strobj keys)]
        (.splice new-keys (scan-array 1 k new-keys) 1)
        (js-delete new-strobj k)
        (ObjMap. meta new-keys new-strobj (inc update-count) nil))
      coll)) ; key not found, return coll unchanged

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (transient (into (hash-map) coll))))
```


---

```clj
{:full-name "cljs.core/ObjMap",
 :ns "cljs.core",
 :name "ObjMap",
 :type "type",
 :signature ["[meta keys strobj update-count __hash]"],
 :source {:code "(deftype ObjMap [meta keys strobj update-count ^:mutable __hash]\n  Object\n  (toString [this]\n    (pr-str this))\n  \n  IWithMeta\n  (-with-meta [coll meta] (ObjMap. meta keys strobj update-count __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.ObjMap/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-imap __hash))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? (.-length keys))\n      (map #(vector % (aget strobj %))\n           (.sort keys obj-map-compare-keys))))\n\n  ICounted\n  (-count [coll] (.-length keys))\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      (aget strobj k)\n      not-found))\n\n  IAssociative\n  (-assoc [coll k v]\n    (if ^boolean (goog/isString k)\n        (if (or (> update-count cljs.core.ObjMap/HASHMAP_THRESHOLD)\n                (>= (alength keys) cljs.core.ObjMap/HASHMAP_THRESHOLD))\n          (obj-map->hash-map coll k v)\n          (if-not (nil? (scan-array 1 k keys))\n            (let [new-strobj (obj-clone strobj keys)]\n              (aset new-strobj k v)\n              (ObjMap. meta keys new-strobj (inc update-count) nil)) ; overwrite\n            (let [new-strobj (obj-clone strobj keys) ; append\n                  new-keys (aclone keys)]\n              (aset new-strobj k v)\n              (.push new-keys k)\n              (ObjMap. meta new-keys new-strobj (inc update-count) nil))))\n        ;; non-string key. game over.\n        (obj-map->hash-map coll k v)))\n  (-contains-key? [coll k]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      true\n      false))\n\n  IMap\n  (-dissoc [coll k]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      (let [new-keys (aclone keys)\n            new-strobj (obj-clone strobj keys)]\n        (.splice new-keys (scan-array 1 k new-keys) 1)\n        (js-delete new-strobj k)\n        (ObjMap. meta new-keys new-strobj (inc update-count) nil))\n      coll)) ; key not found, return coll unchanged\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll]\n    (transient (into (hash-map) coll))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [3541 3628],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L3541-L3628"},
 :full-name-encode "cljs.core_ObjMap",
 :history [["+" "0.0-927"]]}

```
