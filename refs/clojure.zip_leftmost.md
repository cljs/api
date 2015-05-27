## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/leftmost

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/leftmost</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/leftmost)
</td>
</tr>
</table>

 <samp>
(__leftmost__ loc)<br>
</samp>

```
Returns the loc of the leftmost sibling of the node at this loc, or self
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:157-163](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L157-L163)</ins>
</pre>

```clj
(defn leftmost
  [loc]
    (let [[node {l :l r :r :as path}] loc]
      (if (and path (seq l))
        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))
        loc)))
```


---

```clj
{:ns "clojure.zip",
 :name "leftmost",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_leftmost",
 :source {:code "(defn leftmost\n  [loc]\n    (let [[node {l :l r :r :as path}] loc]\n      (if (and path (seq l))\n        (with-meta [(first l) (assoc path :l [] :r (concat (rest l) [node] r))] (meta loc))\n        loc)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [157 163],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L157-L163"},
 :full-name "clojure.zip/leftmost",
 :clj-symbol "clojure.zip/leftmost",
 :docstring "Returns the loc of the leftmost sibling of the node at this loc, or self"}

```
