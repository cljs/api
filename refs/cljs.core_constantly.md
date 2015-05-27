## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/constantly

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/constantly</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/constantly)
</td>
</tr>
</table>

 <samp>
(__constantly__ x)<br>
</samp>

```
Returns a function that takes any number of arguments and returns x.
```

---

 <pre>
clojurescript @ r1513
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2235-2237](https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2235-L2237)</ins>
</pre>

```clj
(defn constantly
  [x] (fn [& args] x))
```


---

```clj
{:ns "cljs.core",
 :name "constantly",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_constantly",
 :source {:code "(defn constantly\n  [x] (fn [& args] x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [2235 2237],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/cljs/cljs/core.cljs#L2235-L2237"},
 :full-name "cljs.core/constantly",
 :clj-symbol "clojure.core/constantly",
 :docstring "Returns a function that takes any number of arguments and returns x."}

```
