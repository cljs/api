## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/count

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/count</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/count)
</td>
</tr>
</table>

 <samp>
(__count__ coll)<br>
</samp>

```
Returns the number of items in the collection. (count nil) returns
0.  Also works on strings, arrays, and Maps
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:714-720](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L714-L720)</ins>
</pre>

```clj
(defn count
  [coll]
  (if (counted? coll)
    (-count coll)
    (accumulating-seq-count coll)))
```


---

```clj
{:ns "cljs.core",
 :name "count",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_count",
 :source {:code "(defn count\n  [coll]\n  (if (counted? coll)\n    (-count coll)\n    (accumulating-seq-count coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [714 720],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L714-L720"},
 :full-name "cljs.core/count",
 :clj-symbol "clojure.core/count",
 :docstring "Returns the number of items in the collection. (count nil) returns\n0.  Also works on strings, arrays, and Maps"}

```
