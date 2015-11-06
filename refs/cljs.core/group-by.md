## cljs.core/group-by



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/group-by</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/group-by)
</td>
</tr>
</table>


 <samp>
(__group-by__ f coll)<br>
</samp>

---

Returns a map of the elements of `coll` keyed by the result of running `f` on
each element.

The value at each key will be a vector of the corresponding elements in the
order they appeared in `coll`.



---


###### See Also:

[`cljs.core/partition-by`](../cljs.core/partition-by.md)<br>
[`cljs.core/frequencies`](../cljs.core/frequencies.md)<br>

---


Source docstring:

```
Returns a map of the elements of coll keyed by the result of
f on each element. The value at each key will be a vector of the
corresponding elements, in the order they appeared in coll.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L8740-L8750):

```clj
(defn group-by
  [f coll]
  (persistent!
    (reduce
      (fn [ret x]
        (let [k (f x)]
          (assoc! ret k (conj (get ret k []) x))))
      (transient {}) coll)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2719
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:8740-8750](https://github.com/clojure/clojurescript/blob/r2719/src/cljs/cljs/core.cljs#L8740-L8750)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/group-by` @ clojuredocs](http://clojuredocs.org/clojure.core/group-by)<br>
[`clojure.core/group-by` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/group-by/)<br>
[`clojure.core/group-by` @ crossclj](http://crossclj.info/fun/clojure.core/group-by.html)<br>
[`cljs.core/group-by` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/group-by.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/group-by.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map of the elements of `coll` keyed by the result of running `f` on\neach element.\n\nThe value at each key will be a vector of the corresponding elements in the\norder they appeared in `coll`.",
 :ns "cljs.core",
 :name "group-by",
 :signature ["[f coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/partition-by" "cljs.core/frequencies"],
 :full-name-encode "cljs.core/group-by",
 :source {:code "(defn group-by\n  [f coll]\n  (persistent!\n    (reduce\n      (fn [ret x]\n        (let [k (f x)]\n          (assoc! ret k (conj (get ret k []) x))))\n      (transient {}) coll)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2719",
          :filename "src/cljs/cljs/core.cljs",
          :lines [8740 8750]},
 :full-name "cljs.core/group-by",
 :clj-symbol "clojure.core/group-by",
 :docstring "Returns a map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/group-by"]))
```

-->
