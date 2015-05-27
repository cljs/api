## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/tree-seq

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tree-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tree-seq)
</td>
</tr>
</table>

 <samp>
(__tree-seq__ branch? children root)<br>
</samp>

```
Returns a lazy sequence of the nodes in a tree, via a depth-first walk.
 branch? must be a fn of one arg that returns true if passed a node
 that can have children (but may not).  children must be a fn of one
 arg that returns a sequence of the children. Will only be called on
 nodes for which branch? returns true. Root is the root node of the
tree.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2622-2635](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2622-L2635)</ins>
</pre>

```clj
(defn tree-seq
   [branch? children root]
   (let [walk (fn walk [node]
                (lazy-seq
                 (cons node
                  (when (branch? node)
                    (mapcat walk (children node))))))]
     (walk root)))
```


---

```clj
{:ns "cljs.core",
 :name "tree-seq",
 :signature ["[branch? children root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_tree-seq",
 :source {:code "(defn tree-seq\n   [branch? children root]\n   (let [walk (fn walk [node]\n                (lazy-seq\n                 (cons node\n                  (when (branch? node)\n                    (mapcat walk (children node))))))]\n     (walk root)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2622 2635],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/cljs/core.cljs#L2622-L2635"},
 :full-name "cljs.core/tree-seq",
 :clj-symbol "clojure.core/tree-seq",
 :docstring "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n branch? must be a fn of one arg that returns true if passed a node\n that can have children (but may not).  children must be a fn of one\n arg that returns a sequence of the children. Will only be called on\n nodes for which branch? returns true. Root is the root node of the\ntree."}

```
