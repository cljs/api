## cljs.core/distinct



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/distinct</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/distinct)
</td>
</tr>
</table>


 <samp>
(__distinct__ coll)<br>
</samp>

---

Returns a lazy sequence of the elements of `coll` with duplicates removed.



---


###### See Also:

[`cljs.core/distinct?`](../cljs.core/distinctQMARK.md)<br>

---


Source docstring:

```
Returns a lazy sequence of the elements of coll with duplicates removed
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L7949-L7971):

```clj
(defn distinct
  ([]
    (fn [rf]
      (let [seen (volatile! #{})]
        (fn
          ([] (rf))
          ([result] (rf result))
          ([result input]
            (if (contains? @seen input)
              result
              (do (vswap! seen conj input)
                  (rf result input))))))))
  ([coll]
    (let [step (fn step [xs seen]
                 (lazy-seq
                   ((fn [[f :as xs] seen]
                      (when-let [s (seq xs)]
                        (if (contains? seen f)
                          (recur (rest s) seen)
                          (cons f (step (rest s) (conj seen f))))))
                     xs seen)))]
      (step coll #{}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7949-7971](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L7949-L7971)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/distinct` @ clojuredocs](http://clojuredocs.org/clojure.core/distinct)<br>
[`clojure.core/distinct` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/distinct/)<br>
[`clojure.core/distinct` @ crossclj](http://crossclj.info/fun/clojure.core/distinct.html)<br>
[`cljs.core/distinct` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/distinct.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/distinct.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the elements of `coll` with duplicates removed.",
 :ns "cljs.core",
 :name "distinct",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/distinct?"],
 :full-name-encode "cljs.core/distinct",
 :source {:code "(defn distinct\n  ([]\n    (fn [rf]\n      (let [seen (volatile! #{})]\n        (fn\n          ([] (rf))\n          ([result] (rf result))\n          ([result input]\n            (if (contains? @seen input)\n              result\n              (do (vswap! seen conj input)\n                  (rf result input))))))))\n  ([coll]\n    (let [step (fn step [xs seen]\n                 (lazy-seq\n                   ((fn [[f :as xs] seen]\n                      (when-let [s (seq xs)]\n                        (if (contains? seen f)\n                          (recur (rest s) seen)\n                          (cons f (step (rest s) (conj seen f))))))\n                     xs seen)))]\n      (step coll #{}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7949 7971]},
 :full-name "cljs.core/distinct",
 :clj-symbol "clojure.core/distinct",
 :docstring "Returns a lazy sequence of the elements of coll with duplicates removed"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/distinct"]))
```

-->
