## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/HashMap

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__HashMap.__ meta count hashobj)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r993
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2320-2407](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2320-L2407)</ins>
</pre>

```clj
(deftype HashMap [meta count hashobj]
  IWithMeta
  (-with-meta [coll meta] (HashMap. meta count hashobj))

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
  (-empty [coll] (with-meta cljs.core.HashMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll]
    (when (pos? count)
      (let [hashes (.sort (js-keys hashobj))]
        (mapcat #(map vec (partition 2 (aget hashobj %)))
                hashes))))

  ICounted
  (-count [coll] count)

  ILookup
  (-lookup [coll k] (-lookup coll k nil))
  (-lookup [coll k not-found]
    (let [bucket (aget hashobj (hash k))
          i (when bucket (scan-array 2 k bucket))]
      (if i
        (aget bucket (inc i))
        not-found)))

  IAssociative
  (-assoc [coll k v]
    (let [h (hash k)
          bucket (aget hashobj h)]
      (if bucket
        (let [new-bucket (aclone bucket)
              new-hashobj (goog.object/clone hashobj)]
          (aset new-hashobj h new-bucket)
          (if-let [i (scan-array 2 k new-bucket)]
            (do                         ; found key, replace
              (aset new-bucket (inc i) v)
              (HashMap. meta count new-hashobj))
            (do                         ; did not find key, append
              (.push new-bucket k v)
              (HashMap. meta (inc count) new-hashobj))))
        (let [new-hashobj (goog.object/clone hashobj)] ; did not find bucket
          (aset new-hashobj h (array k v))
          (HashMap. meta (inc count) new-hashobj)))))
  (-contains-key? [coll k]
    (let [bucket (aget hashobj (hash k))
          i (when bucket (scan-array 2 k bucket))]
      (if i
        true
        false)))

  IMap
  (-dissoc [coll k]
    (let [h (hash k)
          bucket (aget hashobj h)
          i (when bucket (scan-array 2 k bucket))]
      (if (not i)
        coll ; key not found, return coll unchanged
        (let [new-hashobj (goog.object/clone hashobj)]
          (if (> 3 (.-length bucket))
            (js-delete new-hashobj h)
            (let [new-bucket (aclone bucket)]
              (.splice new-bucket i 2)
              (aset new-hashobj h new-bucket)))
          (HashMap. meta (dec count) new-hashobj)))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```


---

```clj
{:full-name "cljs.core/HashMap",
 :ns "cljs.core",
 :name "HashMap",
 :type "type",
 :signature ["[meta count hashobj]"],
 :source {:code "(deftype HashMap [meta count hashobj]\n  IWithMeta\n  (-with-meta [coll meta] (HashMap. meta count hashobj))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.HashMap/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? count)\n      (let [hashes (.sort (js-keys hashobj))]\n        (mapcat #(map vec (partition 2 (aget hashobj %)))\n                hashes))))\n\n  ICounted\n  (-count [coll] count)\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found]\n    (let [bucket (aget hashobj (hash k))\n          i (when bucket (scan-array 2 k bucket))]\n      (if i\n        (aget bucket (inc i))\n        not-found)))\n\n  IAssociative\n  (-assoc [coll k v]\n    (let [h (hash k)\n          bucket (aget hashobj h)]\n      (if bucket\n        (let [new-bucket (aclone bucket)\n              new-hashobj (goog.object/clone hashobj)]\n          (aset new-hashobj h new-bucket)\n          (if-let [i (scan-array 2 k new-bucket)]\n            (do                         ; found key, replace\n              (aset new-bucket (inc i) v)\n              (HashMap. meta count new-hashobj))\n            (do                         ; did not find key, append\n              (.push new-bucket k v)\n              (HashMap. meta (inc count) new-hashobj))))\n        (let [new-hashobj (goog.object/clone hashobj)] ; did not find bucket\n          (aset new-hashobj h (array k v))\n          (HashMap. meta (inc count) new-hashobj)))))\n  (-contains-key? [coll k]\n    (let [bucket (aget hashobj (hash k))\n          i (when bucket (scan-array 2 k bucket))]\n      (if i\n        true\n        false)))\n\n  IMap\n  (-dissoc [coll k]\n    (let [h (hash k)\n          bucket (aget hashobj h)\n          i (when bucket (scan-array 2 k bucket))]\n      (if (not i)\n        coll ; key not found, return coll unchanged\n        (let [new-hashobj (goog.object/clone hashobj)]\n          (if (> 3 (.-length bucket))\n            (js-delete new-hashobj h)\n            (let [new-bucket (aclone bucket)]\n              (.splice new-bucket i 2)\n              (aset new-hashobj h new-bucket)))\n          (HashMap. meta (dec count) new-hashobj)))))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2320 2407],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2320-L2407"},
 :full-name-encode "cljs.core_HashMap",
 :history [["+" "0.0-927"]]}

```
