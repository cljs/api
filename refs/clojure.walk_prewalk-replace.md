## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.walk/prewalk-replace

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.walk/prewalk-replace</samp>](http://clojure.github.io/clojure/branch-master/clojure.walk-api.html#clojure.walk/prewalk-replace)
</td>
</tr>
</table>

 <samp>
(__prewalk-replace__ smap form)<br>
</samp>

```
Recursively transforms form by replacing keys in smap with their
values.  Like clojure/replace but works on any data structure.  Does
replacement at the root of the tree first.
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── <ins>[walk.cljs:80-86](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/walk.cljs#L80-L86)</ins>
</pre>

```clj
(defn prewalk-replace
  [smap form]
  (prewalk (fn [x] (if (contains? smap x) (smap x) x)) form))
```


---

```clj
{:ns "clojure.walk",
 :name "prewalk-replace",
 :signature ["[smap form]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.walk_prewalk-replace",
 :source {:code "(defn prewalk-replace\n  [smap form]\n  (prewalk (fn [x] (if (contains? smap x) (smap x) x)) form))",
          :filename "clojurescript/src/cljs/clojure/walk.cljs",
          :lines [80 86],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/walk.cljs#L80-L86"},
 :full-name "clojure.walk/prewalk-replace",
 :clj-symbol "clojure.walk/prewalk-replace",
 :docstring "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the root of the tree first."}

```
