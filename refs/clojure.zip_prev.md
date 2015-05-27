## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.zip/prev

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.zip/prev</samp>](http://clojure.github.io/clojure/branch-master/clojure.zip-api.html#clojure.zip/prev)
</td>
</tr>
</table>

 <samp>
(__prev__ loc)<br>
</samp>

```
Moves to the previous loc in the hierarchy, depth-first. If already
at the root, returns nil.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── clojure
            └── <ins>[zip.cljs:221-230](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/zip.cljs#L221-L230)</ins>
</pre>

```clj
(defn prev
  [loc]
    (if-let [lloc (left loc)]
      (loop [loc lloc]
        (if-let [child (and (branch? loc) (down loc))]
          (recur (rightmost child))
          loc))
      (up loc)))
```


---

```clj
{:ns "clojure.zip",
 :name "prev",
 :signature ["[loc]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.zip_prev",
 :source {:code "(defn prev\n  [loc]\n    (if-let [lloc (left loc)]\n      (loop [loc lloc]\n        (if-let [child (and (branch? loc) (down loc))]\n          (recur (rightmost child))\n          loc))\n      (up loc)))",
          :filename "clojurescript/src/cljs/clojure/zip.cljs",
          :lines [221 230],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/clojure/zip.cljs#L221-L230"},
 :full-name "clojure.zip/prev",
 :clj-symbol "clojure.zip/prev",
 :docstring "Moves to the previous loc in the hierarchy, depth-first. If already\nat the root, returns nil."}

```
