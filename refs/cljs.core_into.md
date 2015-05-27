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
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1825-1829](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1825-L1829)</ins>
</pre>

```clj
(defn into
  [to from]
  (reduce -conj to from))
```


---

```clj
{:ns "cljs.core",
 :name "into",
 :signature ["[to from]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_into",
 :source {:code "(defn into\n  [to from]\n  (reduce -conj to from))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1825 1829],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L1825-L1829"},
 :full-name "cljs.core/into",
 :clj-symbol "clojure.core/into",
 :docstring "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined."}

```
