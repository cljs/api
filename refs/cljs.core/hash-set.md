## cljs.core/hash-set



 <table border="1">
<tr>
<td>function</td>
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




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6080-L6100):

```clj
(defn hash-set
  ([] cljs.core.PersistentHashSet/EMPTY)
  ([& ^not-native keys]
     (if (and (instance? IndexedSeq keys)
              (< (alength (.-arr keys)) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD))
       (let [karr (.-arr keys)
             klen (alength karr)
             alen (* 2 klen)
             arr  (make-array alen)]
         (loop [ki 0]
           (if (< ki klen)
             (let [ai (* 2 ki)]
               (aset arr ai (aget karr ki))
               (aset arr (inc ai) nil)
               (recur (inc ki)))
             (cljs.core.PersistentHashSet/fromArray arr true))))
       (loop [in keys
              ^not-native out (-as-transient cljs.core.PersistentHashSet/EMPTY)]
         (if-not (nil? in)
           (recur (-next in) (-conj! out (-first in)))
           (-persistent! out))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:6080-6100](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L6080-L6100)</ins>
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
 :type "function",
 :related ["cljs.core/set" "cljs.core/sorted-set"],
 :full-name-encode "cljs.core/hash-set",
 :source {:code "(defn hash-set\n  ([] cljs.core.PersistentHashSet/EMPTY)\n  ([& ^not-native keys]\n     (if (and (instance? IndexedSeq keys)\n              (< (alength (.-arr keys)) cljs.core.PersistentArrayMap/HASHMAP_THRESHOLD))\n       (let [karr (.-arr keys)\n             klen (alength karr)\n             alen (* 2 klen)\n             arr  (make-array alen)]\n         (loop [ki 0]\n           (if (< ki klen)\n             (let [ai (* 2 ki)]\n               (aset arr ai (aget karr ki))\n               (aset arr (inc ai) nil)\n               (recur (inc ki)))\n             (cljs.core.PersistentHashSet/fromArray arr true))))\n       (loop [in keys\n              ^not-native out (-as-transient cljs.core.PersistentHashSet/EMPTY)]\n         (if-not (nil? in)\n           (recur (-next in) (-conj! out (-first in)))\n           (-persistent! out))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1820",
          :filename "src/cljs/cljs/core.cljs",
          :lines [6080 6100]},
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
