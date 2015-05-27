## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/Set

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__Set.__ meta hash-map)<br>
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
            └── <ins>[core.cljs:2477-2524](https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2477-L2524)</ins>
</pre>

```clj
(deftype Set [meta hash-map]
  IWithMeta
  (-with-meta [coll meta] (Set. meta hash-map))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (Set. meta (assoc hash-map o nil)))

  IEmptyableCollection
  (-empty [coll] (with-meta cljs.core.Set/EMPTY meta))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (= (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  IHash
  (-hash [coll] (hash-coll coll))

  ISeqable
  (-seq [coll] (keys hash-map))

  ICounted
  (-count [coll] (count (seq coll)))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (-contains-key? hash-map v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (Set. meta (dissoc hash-map v)))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))
```


---

```clj
{:full-name "cljs.core/Set",
 :ns "cljs.core",
 :name "Set",
 :type "type",
 :signature ["[meta hash-map]"],
 :source {:code "(deftype Set [meta hash-map]\n  IWithMeta\n  (-with-meta [coll meta] (Set. meta hash-map))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll o]\n    (Set. meta (assoc hash-map o nil)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.Set/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other]\n    (and\n     (set? other)\n     (= (count coll) (count other))\n     (every? #(contains? coll %)\n             other)))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] (keys hash-map))\n\n  ICounted\n  (-count [coll] (count (seq coll)))\n\n  ILookup\n  (-lookup [coll v]\n    (-lookup coll v nil))\n  (-lookup [coll v not-found]\n    (if (-contains-key? hash-map v)\n      v\n      not-found))\n\n  ISet\n  (-disjoin [coll v]\n    (Set. meta (dissoc hash-map v)))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2477 2524],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/cljs/cljs/core.cljs#L2477-L2524"},
 :full-name-encode "cljs.core_Set",
 :history [["+" "0.0-927"]]}

```
