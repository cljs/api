## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/vector-zip

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/vector-zip</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/vector-zip)
</td>
</tr>
</table>

 <samp>
(__vector-zip__ root)<br>
</samp>

```
Returns a zipper for nested vectors, given a root vector
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:42-48](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L42-L48)</ins>
</pre>

```clj
(defn vector-zip
  [root]
    (zipper vector?
            seq
            (fn [node children] (with-meta (vec children) (meta node)))
            root))
```


---

```clj
{:ns "clojure.zip",
 :name "vector-zip",
 :signature ["[root]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_vector-zip",
 :source {:code "(defn vector-zip\n  [root]\n    (zipper vector?\n            seq\n            (fn [node children] (with-meta (vec children) (meta node)))\n            root))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [42 48],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L42-L48"},
 :full-name "clojure.zip/vector-zip",
 :clj-symbol "clojure.zip/vector-zip",
 :docstring "Returns a zipper for nested vectors, given a root vector"}

```
