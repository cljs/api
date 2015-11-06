## cljs.core/ObjMap



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ObjMap.__ meta keys strobj update-count __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L5143-L5245):

```clj
(deftype ObjMap [meta keys strobj update-count ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

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
  (-empty [coll] (with-meta (.-EMPTY ObjMap) meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))

  ISeqable
  (-seq [coll]
    (when (pos? (alength keys))
      (map #(vector % (aget strobj %))
           (.sort keys obj-map-compare-keys))))

  ICounted
  (-count [coll] (alength keys))

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
        (if (or (> update-count (.-HASHMAP_THRESHOLD ObjMap))
                (>= (alength keys) (.-HASHMAP_THRESHOLD ObjMap)))
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

  IKVReduce
  (-kv-reduce [coll f init]
    (let [len (alength keys)]
      (loop [keys (.sort keys obj-map-compare-keys)
             init init]
        (if (seq keys)
          (let [k (first keys)
                init (f init k (aget strobj k))]
            (if (reduced? init)
              @init
              (recur (rest keys) init)))
          init))))

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5143-5245](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/cljs/core.cljs#L5143-L5245)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ObjMap` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ObjMap.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ObjMap.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ObjMap",
 :type "type",
 :signature ["[meta keys strobj update-count __hash]"],
 :source {:code "(deftype ObjMap [meta keys strobj update-count ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  IWithMeta\n  (-with-meta [coll meta] (ObjMap. meta keys strobj update-count __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll entry]\n    (if (vector? entry)\n      (-assoc coll (-nth entry 0) (-nth entry 1))\n      (reduce -conj\n              coll\n              entry)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY ObjMap) meta))\n\n  IEquiv\n  (-equiv [coll other] (equiv-map coll other))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))\n\n  ISeqable\n  (-seq [coll]\n    (when (pos? (alength keys))\n      (map #(vector % (aget strobj %))\n           (.sort keys obj-map-compare-keys))))\n\n  ICounted\n  (-count [coll] (alength keys))\n\n  ILookup\n  (-lookup [coll k] (-lookup coll k nil))\n  (-lookup [coll k not-found]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      (aget strobj k)\n      not-found))\n\n  IAssociative\n  (-assoc [coll k v]\n    (if ^boolean (goog/isString k)\n        (if (or (> update-count (.-HASHMAP_THRESHOLD ObjMap))\n                (>= (alength keys) (.-HASHMAP_THRESHOLD ObjMap)))\n          (obj-map->hash-map coll k v)\n          (if-not (nil? (scan-array 1 k keys))\n            (let [new-strobj (obj-clone strobj keys)]\n              (aset new-strobj k v)\n              (ObjMap. meta keys new-strobj (inc update-count) nil)) ; overwrite\n            (let [new-strobj (obj-clone strobj keys) ; append\n                  new-keys (aclone keys)]\n              (aset new-strobj k v)\n              (.push new-keys k)\n              (ObjMap. meta new-keys new-strobj (inc update-count) nil))))\n        ;; non-string key. game over.\n        (obj-map->hash-map coll k v)))\n  (-contains-key? [coll k]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      true\n      false))\n\n  IKVReduce\n  (-kv-reduce [coll f init]\n    (let [len (alength keys)]\n      (loop [keys (.sort keys obj-map-compare-keys)\n             init init]\n        (if (seq keys)\n          (let [k (first keys)\n                init (f init k (aget strobj k))]\n            (if (reduced? init)\n              @init\n              (recur (rest keys) init)))\n          init))))\n\n  IMap\n  (-dissoc [coll k]\n    (if (and ^boolean (goog/isString k)\n             (not (nil? (scan-array 1 k keys))))\n      (let [new-keys (aclone keys)\n            new-strobj (obj-clone strobj keys)]\n        (.splice new-keys (scan-array 1 k new-keys) 1)\n        (js-delete new-strobj k)\n        (ObjMap. meta new-keys new-strobj (inc update-count) nil))\n      coll)) ; key not found, return coll unchanged\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll]\n    (transient (into (hash-map) coll))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5143 5245]},
 :full-name "cljs.core/ObjMap",
 :full-name-encode "cljs.core/ObjMap",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ObjMap"]))
```

-->
