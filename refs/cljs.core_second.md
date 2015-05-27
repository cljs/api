## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/second

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/second</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/second)
</td>
</tr>
</table>

 <samp>
(__second__ coll)<br>
</samp>

```
Same as (first (next x))
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:545-548](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L545-L548)</ins>
</pre>

```clj
(defn second
  [coll]
  (first (next coll)))
```


---

```clj
{:ns "cljs.core",
 :name "second",
 :signature ["[coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_second",
 :source {:code "(defn second\n  [coll]\n  (first (next coll)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [545 548],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L545-L548"},
 :full-name "cljs.core/second",
 :clj-symbol "clojure.core/second",
 :docstring "Same as (first (next x))"}

```
