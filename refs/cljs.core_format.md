## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/format

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1443"><img valign="middle" alt="[+] 0.0-1443" src="https://img.shields.io/badge/+-0.0--1443-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/format</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/format)
</td>
</tr>
</table>

 <samp>
(__format__ fmt & args)<br>
</samp>

```
Formats a string using goog.string.format.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1745-1753](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1745-L1753)</ins>
</pre>

```clj
(defn format
  [fmt & args]
  (let [args (map (fn [x]
                    (if (or (keyword? x) (symbol? x))
                      (str x)
                      x))
                args)]
    (apply gstring/format fmt args)))
```


---

```clj
{:ns "cljs.core",
 :name "format",
 :signature ["[fmt & args]"],
 :history [["+" "0.0-1443"]],
 :type "function",
 :full-name-encode "cljs.core_format",
 :source {:code "(defn format\n  [fmt & args]\n  (let [args (map (fn [x]\n                    (if (or (keyword? x) (symbol? x))\n                      (str x)\n                      x))\n                args)]\n    (apply gstring/format fmt args)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1745 1753],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1745-L1753"},
 :full-name "cljs.core/format",
 :clj-symbol "clojure.core/format",
 :docstring "Formats a string using goog.string.format."}

```
