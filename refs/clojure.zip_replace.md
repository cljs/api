## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/replace

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/replace)
</td>
</tr>
</table>

 <samp>
(__replace__ loc node)<br>
</samp>

```
Replaces the node at this loc, without moving
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:183-187](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/zip.cljs#L183-L187)</ins>
</pre>

```clj
(defn replace
  [loc node]
    (let [[_ path] loc]
      (with-meta [node (assoc path :changed? true)] (meta loc))))
```


---

```clj
{:ns "clojure.zip",
 :name "replace",
 :signature ["[loc node]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_replace",
 :source {:code "(defn replace\n  [loc node]\n    (let [[_ path] loc]\n      (with-meta [node (assoc path :changed? true)] (meta loc))))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [183 187],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/zip.cljs#L183-L187"},
 :full-name "clojure.zip/replace",
 :clj-symbol "clojure.zip/replace",
 :docstring "Replaces the node at this loc, without moving"}

```
