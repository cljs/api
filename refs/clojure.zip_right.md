## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/right

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/right</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/right)
</td>
</tr>
</table>

 <samp>
(__right__ loc)<br>
</samp>

```
Returns the loc of the right sibling of the node at this loc, or nil
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:135-140](https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/zip.cljs#L135-L140)</ins>
</pre>

```clj
(defn right
  [loc]
    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]
      (when (and path rs)
        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))
```


---

```clj
{:ns "clojure.zip",
 :name "right",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_right",
 :source {:code "(defn right\n  [loc]\n    (let [[node {l :l  [r & rnext :as rs] :r :as path}] loc]\n      (when (and path rs)\n        (with-meta [r (assoc path :l (conj l node) :r rnext)] (meta loc)))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [135 140],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/clojure/zip.cljs#L135-L140"},
 :full-name "clojure.zip/right",
 :clj-symbol "clojure.zip/right",
 :docstring "Returns the loc of the right sibling of the node at this loc, or nil"}

```
