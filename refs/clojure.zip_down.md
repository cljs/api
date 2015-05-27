## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/down

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/down</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/down)
</td>
</tr>
</table>

 <samp>
(__down__ loc)<br>
</samp>

```
Returns the loc of the leftmost child of the node at this loc, or
nil if no children
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:98-109](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L98-L109)</ins>
</pre>

```clj
(defn down
  [loc]
    (when (branch? loc)
      (let [[node path] loc
            [c & cnext :as cs] (children loc)]
        (when cs
          (with-meta [c {:l [] 
                         :pnodes (if path (conj (:pnodes path) node) [node]) 
                         :ppath path 
                         :r cnext}] (meta loc))))))
```


---

```clj
{:ns "clojure.zip",
 :name "down",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_down",
 :source {:code "(defn down\n  [loc]\n    (when (branch? loc)\n      (let [[node path] loc\n            [c & cnext :as cs] (children loc)]\n        (when cs\n          (with-meta [c {:l [] \n                         :pnodes (if path (conj (:pnodes path) node) [node]) \n                         :ppath path \n                         :r cnext}] (meta loc))))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [98 109],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/clojure/zip.cljs#L98-L109"},
 :full-name "clojure.zip/down",
 :clj-symbol "clojure.zip/down",
 :docstring "Returns the loc of the leftmost child of the node at this loc, or\nnil if no children"}

```
