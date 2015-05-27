## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/insert-left

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/insert-left</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/insert-left)
</td>
</tr>
</table>

 <samp>
(__insert-left__ loc item)<br>
</samp>

```
Inserts the item as the left sibling of the node at this loc,
without moving
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:165-172](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/zip.cljs#L165-L172)</ins>
</pre>

```clj
(defn insert-left
  [loc item]
    (let [[node {l :l :as path}] loc]
      (if (nil? path)
        (throw "Insert at top")
        (with-meta [node (assoc path :l (conj l item) :changed? true)] (meta loc)))))
```


---

```clj
{:ns "clojure.zip",
 :name "insert-left",
 :signature ["[loc item]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_insert-left",
 :source {:code "(defn insert-left\n  [loc item]\n    (let [[node {l :l :as path}] loc]\n      (if (nil? path)\n        (throw \"Insert at top\")\n        (with-meta [node (assoc path :l (conj l item) :changed? true)] (meta loc)))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [165 172],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/clojure/zip.cljs#L165-L172"},
 :full-name "clojure.zip/insert-left",
 :clj-symbol "clojure.zip/insert-left",
 :docstring "Inserts the item as the left sibling of the node at this loc,\nwithout moving"}

```
