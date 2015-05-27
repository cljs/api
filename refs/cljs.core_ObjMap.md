## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ObjMap

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__ObjMap.__ meta keys strobj)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2193-2254](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2193-L2254)</ins>
</pre>

```clj
(deftype ObjMap [meta keys strobj]
  IWithMeta
  (-with-meta [coll meta] (ObjMap. meta keys strobj))

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
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll]
    (when (pos? (.-length keys))
      (map #(vector % (aget strobj %)) keys)))

  ICounted
  (-count [coll] (.-length keys))

  ILookup
  (-lookup [coll k] (-lookup coll k nil))
  (-lookup [coll k not-found]
    (obj-map-contains-key? k strobj (aget strobj k) not-found))

  IAssociative
  (-assoc [coll k v]
    (if (goog/isString k)
      (let [new-strobj (goog.object/clone strobj)
            overwrite? (.hasOwnProperty new-strobj k)]
        (aset new-strobj k v)
        (if overwrite?
          (ObjMap. meta keys new-strobj)     ; overwrite
          (let [new-keys (aclone keys)] ; append
            (.push new-keys k)
            (ObjMap. meta new-keys new-strobj))))
      ; non-string key. game over.
      (with-meta (into (hash-map k v) (seq coll)) meta)))
  (-contains-key? [coll k]
    (obj-map-contains-key? k strobj))

  IMap
  (-dissoc [coll k]
    (if (and (goog/isString k) (.hasOwnProperty strobj k))
      (let [new-keys (aclone keys)
            new-strobj (goog.object/clone strobj)]
        (.splice new-keys (scan-array 1 k new-keys) 1)
        (js-delete new-strobj k)
        (ObjMap. meta new-keys new-strobj))
      coll)))
```


---

```clj
{:full-name "cljs.core/ObjMap",
 :ns "cljs.core",
 :name "ObjMap",
 :type "type",
 :signature ["[meta keys strobj]"],
 :source {:code "(deftype ObjMap [meta keys strobj]\n  IWithMeta\n  (-with-meta [coll meta] (ObjMap. meta keys strobj))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.ObjMap/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? (.-length keys))\n      (map #(vector % (aget strobj %)) keys)))\n\n  ICounted\n  (-count [coll] (.-length keys))\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found]\n    (obj-map-contains-key? k strobj (aget strobj k) not-found))\n\n  IAssociative\n  (-assoc [coll k v]\n    (if (goog/isString k)\n      (let [new-strobj (goog.object/clone strobj)\n            overwrite? (.hasOwnProperty new-strobj k)]\n        (aset new-strobj k v)\n        (if overwrite?\n          (ObjMap. meta keys new-strobj)     ; overwrite\n          (let [new-keys (aclone keys)] ; append\n            (.push new-keys k)\n            (ObjMap. meta new-keys new-strobj))))\n      ; non-string key. game over.\n      (with-meta (into (hash-map k v) (seq coll)) meta)))\n  (-contains-key? [coll k]\n    (obj-map-contains-key? k strobj))\n\n  IMap\n  (-dissoc [coll k]\n    (if (and (goog/isString k) (.hasOwnProperty strobj k))\n      (let [new-keys (aclone keys)\n            new-strobj (goog.object/clone strobj)]\n        (.splice new-keys (scan-array 1 k new-keys) 1)\n        (js-delete new-strobj k)\n        (ObjMap. meta new-keys new-strobj))\n      coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2193 2254],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2193-L2254"},
 :full-name-encode "cljs.core_ObjMap",
 :history [["+" "0.0-927"]]}

```
