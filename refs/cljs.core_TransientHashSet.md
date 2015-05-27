## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/TransientHashSet

 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__TransientHashSet.__ transient-map)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5656-5691](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5656-L5691)</ins>
</pre>

```clj
(deftype TransientHashSet [^:mutable transient-map]
  ITransientCollection
  (-conj! [tcoll o]
    (set! transient-map (assoc! transient-map o nil))
    tcoll)

  (-persistent! [tcoll]
    (PersistentHashSet. nil (persistent! transient-map) nil))

  ITransientSet
  (-disjoin! [tcoll v]
    (set! transient-map (dissoc! transient-map v))
    tcoll)

  ICounted
  (-count [tcoll] (count transient-map))

  ILookup
  (-lookup [tcoll v]
    (-lookup tcoll v nil))

  (-lookup [tcoll v not-found]
    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)
      not-found
      v))

  IFn
  (-invoke [tcoll k]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      nil
      k))

  (-invoke [tcoll k not-found]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      not-found
      k)))
```


---

```clj
{:full-name "cljs.core/TransientHashSet",
 :ns "cljs.core",
 :name "TransientHashSet",
 :type "type",
 :signature ["[transient-map]"],
 :source {:code "(deftype TransientHashSet [^:mutable transient-map]\n  ITransientCollection\n  (-conj! [tcoll o]\n    (set! transient-map (assoc! transient-map o nil))\n    tcoll)\n\n  (-persistent! [tcoll]\n    (PersistentHashSet. nil (persistent! transient-map) nil))\n\n  ITransientSet\n  (-disjoin! [tcoll v]\n    (set! transient-map (dissoc! transient-map v))\n    tcoll)\n\n  ICounted\n  (-count [tcoll] (count transient-map))\n\n  ILookup\n  (-lookup [tcoll v]\n    (-lookup tcoll v nil))\n\n  (-lookup [tcoll v not-found]\n    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)\n      not-found\n      v))\n\n  IFn\n  (-invoke [tcoll k]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      nil\n      k))\n\n  (-invoke [tcoll k not-found]\n    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)\n      not-found\n      k)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [5656 5691],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L5656-L5691"},
 :full-name-encode "cljs.core_TransientHashSet",
 :history [["+" "0.0-1211"]]}

```
