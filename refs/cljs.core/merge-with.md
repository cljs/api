## cljs.core/merge-with



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge-with</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge-with)
</td>
</tr>
</table>


 <samp>
(__merge-with__ f & maps)<br>
</samp>

---

Returns a map that consists of the rest of the maps `conj`-ed onto the first.

If a key occurs in more than one map, the mapping(s) from the latter (left-to-
right) will be combined with the mapping in the result by calling `(f val-in-
result val-in-latter)`.



---


###### See Also:

[`cljs.core/merge`](../cljs.core/merge.md)<br>

---


Source docstring:

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping(s)
from the latter (left-to-right) will be combined with the mapping in
the result by calling (f val-in-result val-in-latter).
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L7620-L7634):

```clj
(defn merge-with
  [f & maps]
  (when (some identity maps)
    (let [merge-entry (fn [m e]
                        (let [k (first e) v (second e)]
                          (if (contains? m k)
                            (assoc m k (f (get m k) v))
                            (assoc m k v))))
          merge2 (fn [m1 m2]
                   (reduce merge-entry (or m1 {}) (seq m2)))]
      (reduce merge2 maps))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3126
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7620-7634](https://github.com/clojure/clojurescript/blob/r3126/src/cljs/cljs/core.cljs#L7620-L7634)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/merge-with` @ clojuredocs](http://clojuredocs.org/clojure.core/merge-with)<br>
[`clojure.core/merge-with` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/merge-with/)<br>
[`clojure.core/merge-with` @ crossclj](http://crossclj.info/fun/clojure.core/merge-with.html)<br>
[`cljs.core/merge-with` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/merge-with.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/merge-with.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a map that consists of the rest of the maps `conj`-ed onto the first.\n\nIf a key occurs in more than one map, the mapping(s) from the latter (left-to-\nright) will be combined with the mapping in the result by calling `(f val-in-\nresult val-in-latter)`.",
 :ns "cljs.core",
 :name "merge-with",
 :signature ["[f & maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/merge"],
 :full-name-encode "cljs.core/merge-with",
 :source {:code "(defn merge-with\n  [f & maps]\n  (when (some identity maps)\n    (let [merge-entry (fn [m e]\n                        (let [k (first e) v (second e)]\n                          (if (contains? m k)\n                            (assoc m k (f (get m k) v))\n                            (assoc m k v))))\n          merge2 (fn [m1 m2]\n                   (reduce merge-entry (or m1 {}) (seq m2)))]\n      (reduce merge2 maps))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3126",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7620 7634]},
 :full-name "cljs.core/merge-with",
 :clj-symbol "clojure.core/merge-with",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping(s)\nfrom the latter (left-to-right) will be combined with the mapping in\nthe result by calling (f val-in-result val-in-latter)."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/merge-with"]))
```

-->
