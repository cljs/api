## <img valign="middle" src="https://raw.githubusercontent.com/cljsinfo/cljs.info/master/00-scrap/cljs_logo_v10-01.png" width="48px"> cljs.core/foo

 <table border="1">
<tr>
<td>special form</td>
<td>added in **<kbd>0.0-3211</kbd>**</td>
<td>removed in **<kbd>0.0-3211</kbd>**</td>
<td>from <img height="24px" valign="middle" src="https://raw.githubusercontent.com/ckirkendall/Presentations/master/ClojureWest/img/clojure-logo10.png"> <samp>clojure.core/-</samp></td>
</tr>
</table>

 <pre>
(__foo__ x)
(__foo__ x y)
(__foo__ x y & args)
</pre>

```
if no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

---

 <pre>
clojurescript/
└── src/
    └── cljs/
        └── cljs/
            └── <ins>[core.cljs:2109-2114](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L2109-L2114)</ins>
</pre>

```clj
(defn ^number -
  ([x] (cljs.core/- x))
  ([x y] (cljs.core/- x y))
  ([x y & more] (reduce - (cljs.core/- x y) more)))
```

---

```clj
{:source-link "https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L2109-L2114",
 :return-type number,
 :ns "cljs.core",
 :name "-",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source-lines [2109 2114],
 :history ["+ 0.0-3211"],
 :type "function",
 :full-name-encode "cljs.core_-",
 :source "(defn ^number -\n  ([x] (cljs.core/- x))\n  ([x y] (cljs.core/- x y))\n  ([x y & more] (reduce - (cljs.core/- x y) more)))",
 :source-filename "clojurescript/src/cljs/cljs/core.cljs",
 :full-name "cljs.core/-",
 :clj-symbol "clojure.core/-",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```
