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




Source code @ [github](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L5720-L5727):

```clj
(defn hash-set
  ([] cljs.core.PersistentHashSet/EMPTY)
  ([& keys]
    (loop [in (seq keys)
           out (transient cljs.core.PersistentHashSet/EMPTY)]
      (if (seq in)
        (recur (next in) (conj! out (first in)))
        (persistent! out)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:5720-5727](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L5720-L5727)</ins>
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
 :source {:code "(defn hash-set\n  ([] cljs.core.PersistentHashSet/EMPTY)\n  ([& keys]\n    (loop [in (seq keys)\n           out (transient cljs.core.PersistentHashSet/EMPTY)]\n      (if (seq in)\n        (recur (next in) (conj! out (first in)))\n        (persistent! out)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1443",
          :filename "src/cljs/cljs/core.cljs",
          :lines [5720 5727]},
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
