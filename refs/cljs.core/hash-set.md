## cljs.core/hash-set



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" title="Added in 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/hash-set</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/hash-set)
</td>
</tr>
</table>


 <samp>
(__hash-set__)<br>
</samp>
 <samp>
(__hash-set__ & keys)<br>
</samp>

---

Returns a new hash set with supplied `keys`.

Any equal keys are handled as if by repeated uses of `conj`.



---


###### See Also:

[`cljs.core/set`](../cljs.core/set.md)<br>
[`cljs.core/sorted-set`](../cljs.core/sorted-set.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L7599-L7601):

```clj
(defn hash-set
  ([] #{})
  ([& keys] (set keys)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7599-7601](https://github.com/clojure/clojurescript/blob/r2755/src/cljs/cljs/core.cljs#L7599-L7601)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L1450-L1462):

```clj
(defmacro hash-set
  ([] `(.-EMPTY cljs.core/PersistentHashSet))
  ([& xs]
    (if (core/and (core/<= (count xs) 8)
                  (every? #(= (:op %) :constant)
                    (map #(cljs.analyzer/analyze &env %) xs))
                  (= (count (into #{} xs)) (count xs)))
      `(cljs.core/PersistentHashSet. nil
         (cljs.core/PersistentArrayMap. nil ~(count xs) (array ~@(interleave xs (repeat nil))) nil)
         nil)
      (vary-meta
        `(.fromArray cljs.core/PersistentHashSet (array ~@xs) true)
        assoc :tag 'cljs.core/PersistentHashSet))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2755
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1450-1462](https://github.com/clojure/clojurescript/blob/r2755/src/clj/cljs/core.clj#L1450-L1462)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/hash-set` @ clojuredocs](http://clojuredocs.org/clojure.core/hash-set)<br>
[`clojure.core/hash-set` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/hash-set/)<br>
[`clojure.core/hash-set` @ crossclj](http://crossclj.info/fun/clojure.core/hash-set.html)<br>
[`cljs.core/hash-set` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/hash-set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/hash-set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a new hash set with supplied `keys`.\n\nAny equal keys are handled as if by repeated uses of `conj`.",
 :ns "cljs.core",
 :name "hash-set",
 :signature ["[]" "[& keys]"],
 :history [["+" "0.0-1443"]],
 :type "function/macro",
 :related ["cljs.core/set" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core/hash-set",
 :source {:code "(defn hash-set\n  ([] #{})\n  ([& keys] (set keys)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2755",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7599 7601]},
 :extra-sources [{:code "(defmacro hash-set\n  ([] `(.-EMPTY cljs.core/PersistentHashSet))\n  ([& xs]\n    (if (core/and (core/<= (count xs) 8)\n                  (every? #(= (:op %) :constant)\n                    (map #(cljs.analyzer/analyze &env %) xs))\n                  (= (count (into #{} xs)) (count xs)))\n      `(cljs.core/PersistentHashSet. nil\n         (cljs.core/PersistentArrayMap. nil ~(count xs) (array ~@(interleave xs (repeat nil))) nil)\n         nil)\n      (vary-meta\n        `(.fromArray cljs.core/PersistentHashSet (array ~@xs) true)\n        assoc :tag 'cljs.core/PersistentHashSet))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2755",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1450 1462]}],
 :full-name "cljs.core/hash-set",
 :clj-symbol "clojure.core/hash-set"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/hash-set"]))
```

-->
