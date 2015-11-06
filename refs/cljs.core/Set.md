## cljs.core/Set



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__Set.__ meta hash-map)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2426-L2467):

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
    (Set. meta (dissoc hash-map v))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2426-2467](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L2426-L2467)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Set` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/Set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Set",
 :type "type",
 :signature ["[meta hash-map]"],
 :source {:code "(deftype Set [meta hash-map]\n  IWithMeta\n  (-with-meta [coll meta] (Set. meta hash-map))\n\n  IMeta\n  (-meta [coll] meta)\n\n  ICollection\n  (-conj [coll o]\n    (Set. meta (assoc hash-map o nil)))\n\n  IEmptyableCollection\n  (-empty [coll] (with-meta cljs.core.Set/EMPTY meta))\n\n  IEquiv\n  (-equiv [coll other]\n    (and\n     (set? other)\n     (= (count coll) (count other))\n     (every? #(contains? coll %)\n             other)))\n\n  IHash\n  (-hash [coll] (hash-coll coll))\n\n  ISeqable\n  (-seq [coll] (keys hash-map))\n\n  ICounted\n  (-count [coll] (count (seq coll)))\n\n  ILookup\n  (-lookup [coll v]\n    (-lookup coll v nil))\n  (-lookup [coll v not-found]\n    (if (-contains-key? hash-map v)\n      v\n      not-found))\n\n  ISet\n  (-disjoin [coll v]\n    (Set. meta (dissoc hash-map v))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r927",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2426 2467]},
 :full-name "cljs.core/Set",
 :full-name-encode "cljs.core/Set",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Set"]))
```

-->
