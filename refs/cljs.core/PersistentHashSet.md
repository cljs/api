## cljs.core/PersistentHashSet



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/PersistentHashSet</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/PersistentHashSet.java)
</td>
</tr>
</table>


 <samp>
(__PersistentHashSet.__ meta hash-map __hash)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L7677-L7749):

```clj
(deftype PersistentHashSet [meta hash-map ^:mutable __hash]
  Object
  (toString [coll]
    (pr-str* coll))
  (equiv [this other]
    (-equiv this other))

  ;; EXPERIMENTAL: subject to change
  (keys [coll]
    (es6-iterator (seq coll)))
  (entries [coll]
    (es6-set-entries-iterator (seq coll)))
  (values [coll]
    (es6-iterator (seq coll)))
  (has [coll k]
    (contains? coll k))
  (forEach [coll f]
    (doseq [[k v] coll]
      (f v k)))

  ICloneable
  (-clone [_] (PersistentHashSet. meta hash-map __hash))

  IWithMeta
  (-with-meta [coll meta] (PersistentHashSet. meta hash-map __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (PersistentHashSet. meta (assoc hash-map o nil) nil))

  IEmptyableCollection
  (-empty [coll] (with-meta (.-EMPTY PersistentHashSet) meta))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (== (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  IHash
  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))

  ISeqable
  (-seq [coll] (keys hash-map))

  ICounted
  (-count [coll] (-count hash-map))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (-contains-key? hash-map v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (PersistentHashSet. meta (-dissoc hash-map v) nil))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll] (TransientHashSet. (-as-transient hash-map))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:7677-7749](https://github.com/clojure/clojurescript/blob/r3269/src/main/cljs/cljs/core.cljs#L7677-L7749)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/PersistentHashSet` @ clojuredocs](http://clojuredocs.org/clojure.lang/PersistentHashSet)<br>
[`clojure.lang/PersistentHashSet` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/PersistentHashSet/)<br>
[`clojure.lang/PersistentHashSet` @ crossclj](http://crossclj.info/fun/clojure.lang/PersistentHashSet.html)<br>
[`cljs.core/PersistentHashSet` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentHashSet.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentHashSet.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentHashSet",
 :signature ["[meta hash-map __hash]"],
 :history [["+" "0.0-1211"]],
 :type "type",
 :full-name-encode "cljs.core/PersistentHashSet",
 :source {:code "(deftype PersistentHashSet [meta hash-map ^:mutable __hash]\n  Object\n  (toString [coll]\n    (pr-str* coll))\n  (equiv [this other]\n    (-equiv this other))\n\n  ;; EXPERIMENTAL: subject to change\n  (keys [coll]\n    (es6-iterator (seq coll)))\n  (entries [coll]\n    (es6-set-entries-iterator (seq coll)))\n  (values [coll]\n    (es6-iterator (seq coll)))\n  (has [coll k]\n    (contains? coll k))\n  (forEach [coll f]\n    (doseq [[k v] coll]\n      (f v k)))\n\n  ICloneable\n  (-clone [_] (PersistentHashSet. meta hash-map __hash))\n\n  IWithMeta\n  (-with-meta [coll meta] (PersistentHashSet. meta hash-map __hash))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll o]\n    (PersistentHashSet. meta (assoc hash-map o nil) nil))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta (.-EMPTY PersistentHashSet) meta))\n\n  IEquiv\n  (-equiv [coll other]\n    (and\n     (set? other)\n     (== (count coll) (count other))\n     (every? #(contains? coll %)\n             other)))\n\n  IHash\n  (-hash [coll] (caching-hash coll hash-unordered-coll __hash))\n\n  ISeqable\n  (-seq [coll] (keys hash-map))\n\n  ICounted\n  (-count [coll] (-count hash-map))\n\n  ILookup\n  (-lookup [coll v]\n    (-lookup coll v nil))\n  (-lookup [coll v not-found]\n    (if (-contains-key? hash-map v)\n      v\n      not-found))\n\n  ISet\n  (-disjoin [coll v]\n    (PersistentHashSet. meta (-dissoc hash-map v) nil))\n\n  IFn\n  (-invoke [coll k]\n    (-lookup coll k))\n  (-invoke [coll k not-found]\n    (-lookup coll k not-found))\n\n  IEditableCollection\n  (-as-transient [coll] (TransientHashSet. (-as-transient hash-map))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [7677 7749]},
 :full-name "cljs.core/PersistentHashSet",
 :clj-symbol "clojure.lang/PersistentHashSet"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentHashSet"]))
```

-->
