## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/branch?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/branch?</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/branch?)
</td>
</tr>
</table>

 <samp>
(__branch?__ loc)<br>
</samp>

```
Returns true if the node at loc is a branch
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:64-67](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/zip.cljs#L64-L67)</ins>
</pre>

```clj
(defn branch?
  [loc]
    ((:zip/branch? (meta loc)) (node loc)))
```


---

```clj
{:ns "clojure.zip",
 :name "branch?",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_branch_QMARK_",
 :source {:code "(defn branch?\n  [loc]\n    ((:zip/branch? (meta loc)) (node loc)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [64 67],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/zip.cljs#L64-L67"},
 :full-name "clojure.zip/branch?",
 :clj-symbol "clojure.zip/branch?",
 :docstring "Returns true if the node at loc is a branch"}

```
