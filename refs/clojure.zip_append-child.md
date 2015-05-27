## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/append-child

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/append-child</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/append-child)
</td>
</tr>
</table>

 <samp>
(__append-child__ loc item)<br>
</samp>

```
Inserts the item as the rightmost child of the node at this loc,
without moving
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:200-204](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L200-L204)</ins>
</pre>

```clj
(defn append-child
  [loc item]
    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))
```


---

```clj
{:ns "clojure.zip",
 :name "append-child",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_append-child",
 :source {:code "(defn append-child\n  [loc item]\n    (replace loc (make-node loc (node loc) (concat (children loc) [item]))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [200 204],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/clojure/zip.cljs#L200-L204"},
 :full-name "clojure.zip/append-child",
 :clj-symbol "clojure.zip/append-child",
 :docstring "Inserts the item as the rightmost child of the node at this loc,\nwithout moving"}

```
