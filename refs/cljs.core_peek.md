## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/peek

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/peek</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/peek)
</td>
</tr>
</table>

 <samp>
(__peek__ coll)<br>
</samp>

```
For a list or queue, same as first, for a vector, same as, but much
more efficient than, last. If the collection is empty, returns nil.
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:558-562](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L558-L562)</ins>
</pre>

```clj
(defn peek
  [coll]
  (-peek coll))
```


---

```clj
{:ns "cljs.core",
 :name "peek",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_peek",
 :source {:code "(defn peek\n  [coll]\n  (-peek coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [558 562],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L558-L562"},
 :full-name "cljs.core/peek",
 :clj-symbol "clojure.core/peek",
 :docstring "For a list or queue, same as first, for a vector, same as, but much\nmore efficient than, last. If the collection is empty, returns nil."}

```
