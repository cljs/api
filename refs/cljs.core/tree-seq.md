## cljs.core/tree-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/tree-seq</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/tree-seq)
</td>
</tr>
</table>


 <samp>
(__tree-seq__ branch? children root)<br>
</samp>

---

Returns a lazy sequence of the nodes in a tree, via a depth-first walk.

`branch?` must be a function of one argument that returns true if passed a node
that can have children (but may not).

`children` must be a function of one argument that returns a sequence of the
children. `children` will only be called on nodes for which `branch?` returns
true.

`root` is the root node of the tree.



---




Source docstring:

```
Returns a lazy sequence of the nodes in a tree, via a depth-first walk.
 branch? must be a fn of one arg that returns true if passed a node
 that can have children (but may not).  children must be a fn of one
 arg that returns a sequence of the children. Will only be called on
 nodes for which branch? returns true. Root is the root node of the
tree.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L3251-L3264):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2261
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3251-3264](https://github.com/clojure/clojurescript/blob/r2261/src/cljs/cljs/core.cljs#L3251-L3264)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/tree-seq` @ clojuredocs](http://clojuredocs.org/clojure.core/tree-seq)<br>
[`clojure.core/tree-seq` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/tree-seq/)<br>
[`clojure.core/tree-seq` @ crossclj](http://crossclj.info/fun/clojure.core/tree-seq.html)<br>
[`cljs.core/tree-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/tree-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/tree-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n\n`branch?` must be a function of one argument that returns true if passed a node\nthat can have children (but may not).\n\n`children` must be a function of one argument that returns a sequence of the\nchildren. `children` will only be called on nodes for which `branch?` returns\ntrue.\n\n`root` is the root node of the tree.",
 :ns "cljs.core",
 :name "tree-seq",
 :signature ["[branch? children root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core/tree-seq",
 :source {:code "(defn tree-seq\n   [branch? children root]\n   (let [walk (fn walk [node]\n                (lazy-seq\n                 (cons node\n                  (when (branch? node)\n                    (mapcat walk (children node))))))]\n     (walk root)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2261",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3251 3264]},
 :full-name "cljs.core/tree-seq",
 :clj-symbol "clojure.core/tree-seq",
 :docstring "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n branch? must be a fn of one arg that returns true if passed a node\n that can have children (but may not).  children must be a fn of one\n arg that returns a sequence of the children. Will only be called on\n nodes for which branch? returns true. Root is the root node of the\ntree."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/tree-seq"]))
```

-->
