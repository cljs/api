## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/insert-child

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-child</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-child)
</td>
</tr>
</table>

 <samp>
(__insert-child__ loc item)<br>
</samp>

```
Inserts the item as the leftmost child of the node at this loc,
without moving
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:194-198](https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/zip.cljs#L194-L198)</ins>
</pre>

```clj
(defn insert-child
  [loc item]
    (replace loc (make-node loc (node loc) (cons item (children loc)))))
```


---

```clj
{:ns "clojure.zip",
 :name "insert-child",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_insert-child",
 :source {:code "(defn insert-child\n  [loc item]\n    (replace loc (make-node loc (node loc) (cons item (children loc)))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [194 198],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/clojure/zip.cljs#L194-L198"},
 :full-name "clojure.zip/insert-child",
 :clj-symbol "clojure.zip/insert-child",
 :docstring "Inserts the item as the leftmost child of the node at this loc,\nwithout moving"}

```
