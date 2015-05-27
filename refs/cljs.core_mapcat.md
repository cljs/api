## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/mapcat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/mapcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/mapcat)
</td>
</tr>
</table>

 <samp>
(__mapcat__ f coll)<br>
(__mapcat__ f coll & colls)<br>
</samp>

```
Returns the result of applying concat to the result of applying map
to f and colls.  Thus function f should return a collection.
```

---

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2550-2556](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2550-L2556)</ins>
</pre>

```clj
(defn mapcat
  ([f coll]
    (flatten1 (map f coll)))
  ([f coll & colls]
    (flatten1 (apply map f coll colls))))
```


---

```clj
{:ns "cljs.core",
 :name "mapcat",
 :signature ["[f coll]" "[f coll & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_mapcat",
 :source {:code "(defn mapcat\n  ([f coll]\n    (flatten1 (map f coll)))\n  ([f coll & colls]\n    (flatten1 (apply map f coll colls))))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2550 2556],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L2550-L2556"},
 :full-name "cljs.core/mapcat",
 :clj-symbol "clojure.core/mapcat",
 :docstring "Returns the result of applying concat to the result of applying map\nto f and colls.  Thus function f should return a collection."}

```
