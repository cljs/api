## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/rightmost

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/rightmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/rightmost)
</td>
</tr>
</table>

 <samp>
(__rightmost__ loc)<br>
</samp>

```
Returns the loc of the rightmost sibling of the node at this loc, or self
```

---

 <pre>
clojurescript @ r1006
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:142-148](https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/zip.cljs#L142-L148)</ins>
</pre>

```clj
(defn rightmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path r)
        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))
        loc)))
```


---

```clj
{:ns "clojure.zip",
 :name "rightmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_rightmost",
 :source {:code "(defn rightmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path r)\n        (with-meta [(last r) (assoc path :l (apply conj l node (butlast r)) :r nil)] (meta loc))\n        loc)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [142 148],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/cljs/clojure/zip.cljs#L142-L148"},
 :full-name "clojure.zip/rightmost",
 :clj-symbol "clojure.zip/rightmost",
 :docstring "Returns the loc of the rightmost sibling of the node at this loc, or self"}

```
