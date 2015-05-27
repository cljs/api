## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/into

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/into</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/into)
</td>
</tr>
</table>

 <samp>
(__into__ to from)<br>
</samp>

```
Returns a new coll consisting of to-coll with all of the items of
from-coll conjoined.
```

---

 <pre>
clojurescript @ r1535
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2646-2652](https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2646-L2652)</ins>
</pre>

```clj
(defn into
  [to from]
  (if (satisfies? IEditableCollection to)
    (persistent! (reduce -conj! (transient to) from))
    (reduce -conj to from)))
```


---

```clj
{:ns "cljs.core",
 :name "into",
 :signature ["[to from]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_into",
 :source {:code "(defn into\n  [to from]\n  (if (satisfies? IEditableCollection to)\n    (persistent! (reduce -conj! (transient to) from))\n    (reduce -conj to from)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2646 2652],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/cljs/cljs/core.cljs#L2646-L2652"},
 :full-name "cljs.core/into",
 :clj-symbol "clojure.core/into",
 :docstring "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined."}

```
