## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/underive

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/underive</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/underive)
</td>
</tr>
</table>

 <samp>
(__underive__ tag parent)<br>
(__underive__ h tag parent)<br>
</samp>

```
Removes a parent/child relationship between parent and
tag. h must be a hierarchy obtained from make-hierarchy, if not
supplied defaults to, and modifies, the global hierarchy.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7011-7030](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L7011-L7030)</ins>
</pre>

```clj
(defn underive
  ([tag parent]
     ;; (alter-var-root #'global-hierarchy underive tag parent)
     (swap! global-hierarchy underive tag parent) nil)
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


---

```clj
{:ns "cljs.core",
 :name "underive",
 :signature ["[tag parent]" "[h tag parent]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_underive",
 :source {:code "(defn underive\n  ([tag parent]\n     ;; (alter-var-root #'global-hierarchy underive tag parent)\n     (swap! global-hierarchy underive tag parent) nil)\n  ([h tag parent]\n    (let [parentMap (:parents h)\n          childsParents (if (parentMap tag)\n                          (disj (parentMap tag) parent) #{})\n          newParents (if (not-empty childsParents)\n                      (assoc parentMap tag childsParents)\n                      (dissoc parentMap tag))\n          deriv-seq (flatten (map #(cons (first %) (interpose (first %) (second %)))\n                                  (seq newParents)))]\n      (if (contains? (parentMap tag) parent)\n        (reduce #(apply derive %1 %2) (make-hierarchy)\n                (partition 2 deriv-seq))\n        h))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [7011 7030],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L7011-L7030"},
 :full-name "cljs.core/underive",
 :clj-symbol "clojure.core/underive",
 :docstring "Removes a parent/child relationship between parent and\ntag. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy."}

```
