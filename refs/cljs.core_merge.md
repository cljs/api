## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/merge

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/merge</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/merge)
</td>
</tr>
</table>

 <samp>
(__merge__ & maps)<br>
</samp>

```
Returns a map that consists of the rest of the maps conj-ed onto
the first.  If a key occurs in more than one map, the mapping from
the latter (left-to-right) will be the mapping in the result.
```

---

 <pre>
clojurescript @ r1011
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2619-2625](https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2619-L2625)</ins>
</pre>

```clj
(defn merge
  [& maps]
  (when (some identity maps)
    (reduce #(conj (or %1 {}) %2) maps)))
```


---

```clj
{:ns "cljs.core",
 :name "merge",
 :signature ["[& maps]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_merge",
 :source {:code "(defn merge\n  [& maps]\n  (when (some identity maps)\n    (reduce #(conj (or %1 {}) %2) maps)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2619 2625],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/cljs/cljs/core.cljs#L2619-L2625"},
 :full-name "cljs.core/merge",
 :clj-symbol "clojure.core/merge",
 :docstring "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping from\nthe latter (left-to-right) will be the mapping in the result."}

```
