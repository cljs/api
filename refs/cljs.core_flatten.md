## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/flatten

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/flatten</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/flatten)
</td>
</tr>
</table>

 <samp>
(__flatten__ x)<br>
</samp>

```
Takes any nested combination of sequential things (lists, vectors,
etc.) and returns their contents as a single, flat sequence.
(flatten nil) returns nil.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2598-2604](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L2598-L2604)</ins>
</pre>

```clj
(defn flatten
  [x]
  (filter #(not (sequential? %))
          (rest (tree-seq sequential? seq x))))
```


---

```clj
{:ns "cljs.core",
 :name "flatten",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_flatten",
 :source {:code "(defn flatten\n  [x]\n  (filter #(not (sequential? %))\n          (rest (tree-seq sequential? seq x))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2598 2604],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/cljs/core.cljs#L2598-L2604"},
 :full-name "cljs.core/flatten",
 :clj-symbol "clojure.core/flatten",
 :docstring "Takes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil."}

```
