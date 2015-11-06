## cljs.core/vector



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/vector</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/vector)
</td>
</tr>
</table>


 <samp>
(__vector__ & args)<br>
</samp>

---

Creates a new vector containing `args`.



---


###### See Also:

[`cljs.core/vec`](../cljs.core/vec.md)<br>
[`cljs.core/vector?`](../cljs.core/vectorQMARK.md)<br>
[`cljs.core/pop`](../cljs.core/pop.md)<br>
[`cljs.core/into`](../cljs.core/into.md)<br>

---




Function code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L4399-L4402):

```clj
(defn vector [& args]
  (if (and (instance? IndexedSeq args) (zero? (.-i args)))
    (.fromArray PersistentVector (.-arr args) true)
    (vec args)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4399-4402](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L4399-L4402)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/core.clj#L1418-L1427):

```clj
(defmacro vector
  ([] '(.-EMPTY cljs.core/PersistentVector))
  ([& xs]
    (let [cnt (count xs)]
      (if (core/< cnt 32)
        `(cljs.core/PersistentVector. nil ~cnt 5
           (.-EMPTY-NODE cljs.core/PersistentVector) (array ~@xs) nil)
        (vary-meta
          `(.fromArray cljs.core/PersistentVector (array ~@xs) true)
          assoc :tag 'cljs.core/PersistentVector)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1418-1427](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/core.clj#L1418-L1427)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/vector` @ clojuredocs](http://clojuredocs.org/clojure.core/vector)<br>
[`clojure.core/vector` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/vector/)<br>
[`clojure.core/vector` @ crossclj](http://crossclj.info/fun/clojure.core/vector.html)<br>
[`cljs.core/vector` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/vector.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/vector.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a new vector containing `args`.",
 :ns "cljs.core",
 :name "vector",
 :signature ["[& args]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :related ["cljs.core/vec"
           "cljs.core/vector?"
           "cljs.core/pop"
           "cljs.core/into"],
 :full-name-encode "cljs.core/vector",
 :source {:code "(defn vector [& args]\n  (if (and (instance? IndexedSeq args) (zero? (.-i args)))\n    (.fromArray PersistentVector (.-arr args) true)\n    (vec args)))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4399 4402]},
 :extra-sources [{:code "(defmacro vector\n  ([] '(.-EMPTY cljs.core/PersistentVector))\n  ([& xs]\n    (let [cnt (count xs)]\n      (if (core/< cnt 32)\n        `(cljs.core/PersistentVector. nil ~cnt 5\n           (.-EMPTY-NODE cljs.core/PersistentVector) (array ~@xs) nil)\n        (vary-meta\n          `(.fromArray cljs.core/PersistentVector (array ~@xs) true)\n          assoc :tag 'cljs.core/PersistentVector)))))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2498",
                  :filename "src/clj/cljs/core.clj",
                  :lines [1418 1427]}],
 :full-name "cljs.core/vector",
 :clj-symbol "clojure.core/vector"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/vector"]))
```

-->
