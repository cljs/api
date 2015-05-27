## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/children

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/children</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/children)
</td>
</tr>
</table>

 <samp>
(__children__ loc)<br>
</samp>

```
Returns a seq of the children of node at loc, which must be a branch
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:69-74](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L69-L74)</ins>
</pre>

```clj
(defn children
  [loc]
    (if (branch? loc)
      ((:zip/children (meta loc)) (node loc))
      (throw "called children on a leaf node")))
```


---

```clj
{:ns "clojure.zip",
 :name "children",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_children",
 :source {:code "(defn children\n  [loc]\n    (if (branch? loc)\n      ((:zip/children (meta loc)) (node loc))\n      (throw \"called children on a leaf node\")))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [69 74],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/clojure/zip.cljs#L69-L74"},
 :full-name "clojure.zip/children",
 :clj-symbol "clojure.zip/children",
 :docstring "Returns a seq of the children of node at loc, which must be a branch"}

```
