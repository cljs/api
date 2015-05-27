## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/up

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/up</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/up)
</td>
</tr>
</table>

 <samp>
(__up__ loc)<br>
</samp>

```
Returns the loc of the parent of the node at this loc, or nil if at
the top
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:111-122](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L111-L122)</ins>
</pre>

```clj
(defn up
  [loc]
    (let [[node {l :l, ppath :ppath, pnodes :pnodes r :r, changed? :changed?, :as path}] loc]
      (when pnodes
        (let [pnode (peek pnodes)]
          (with-meta (if changed?
                       [(make-node loc pnode (concat l (cons node r))) 
                        (and ppath (assoc ppath :changed? true))]
                       [pnode ppath])
                     (meta loc))))))
```


---

```clj
{:ns "clojure.zip",
 :name "up",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_up",
 :source {:code "(defn up\n  [loc]\n    (let [[node {l :l, ppath :ppath, pnodes :pnodes r :r, changed? :changed?, :as path}] loc]\n      (when pnodes\n        (let [pnode (peek pnodes)]\n          (with-meta (if changed?\n                       [(make-node loc pnode (concat l (cons node r))) \n                        (and ppath (assoc ppath :changed? true))]\n                       [pnode ppath])\n                     (meta loc))))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [111 122],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L111-L122"},
 :full-name "clojure.zip/up",
 :clj-symbol "clojure.zip/up",
 :docstring "Returns the loc of the parent of the node at this loc, or nil if at\nthe top"}

```
