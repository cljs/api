## cljs.core/underive



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/underive</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/underive)
</td>
</tr>
</table>


 <samp>
(__underive__ tag parent)<br>
</samp>
 <samp>
(__underive__ h tag parent)<br>
</samp>

---





Source docstring:

```
Removes a parent/child relationship between parent and
tag. h must be a hierarchy obtained from make-hierarchy, if not
supplied defaults to, and modifies, the global hierarchy.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L7283-L7302):

```clj
(defn underive
  ([tag parent]
    (swap-global-hierarchy! underive tag parent)
    nil)
  ([h tag parent]
    (let [parentMap (:parents h)
          childsParents (if (parentMap tag)
                          (disj (parentMap tag) parent) #{})
          newParents (if (not-empty childsParents)
                      (assoc parentMap tag childsParents)
                      (dissoc parentMap tag))
          deriv-seq (flatten (map #(cons (first %) (interpose (first %) (second %)))
                                  (seq newParents)))]
      (if (contains? (parentMap tag) parent)
        (reduce #(apply derive %1 %2) (make-hierarchy)
                (partition 2 deriv-seq))
        h))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7283-7302](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L7283-L7302)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/underive` @ clojuredocs](http://clojuredocs.org/clojure.core/underive)<br>
[`clojure.core/underive` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/underive/)<br>
[`clojure.core/underive` @ crossclj](http://crossclj.info/fun/clojure.core/underive.html)<br>
[`cljs.core/underive` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/underive.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/underive.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "underive",
 :signature ["[tag parent]" "[h tag parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/underive",
 :source {:code "(defn underive\n  ([tag parent]\n    (swap-global-hierarchy! underive tag parent)\n    nil)\n  ([h tag parent]\n    (let [parentMap (:parents h)\n          childsParents (if (parentMap tag)\n                          (disj (parentMap tag) parent) #{})\n          newParents (if (not-empty childsParents)\n                      (assoc parentMap tag childsParents)\n                      (dissoc parentMap tag))\n          deriv-seq (flatten (map #(cons (first %) (interpose (first %) (second %)))\n                                  (seq newParents)))]\n      (if (contains? (parentMap tag) parent)\n        (reduce #(apply derive %1 %2) (make-hierarchy)\n                (partition 2 deriv-seq))\n        h))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7283 7302]},
 :full-name "cljs.core/underive",
 :clj-symbol "clojure.core/underive",
 :docstring "Removes a parent/child relationship between parent and\ntag. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/underive"]))
```

-->
