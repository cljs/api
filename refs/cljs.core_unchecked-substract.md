## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-substract

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unchecked-substract__ x)<br>
(__unchecked-substract__ x y)<br>
(__unchecked-substract__ x y & more)<br>
</samp>

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1496-1501](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1496-L1501)</ins>
</pre>

```clj
(defn unchecked-substract
  ([x] (cljs.core/unchecked-subtract x))
  ([x y] (cljs.core/unchecked-subtract x y))
  ([x y & more] (reduce unchecked-substract (cljs.core/unchecked-subtract x y) more)))
```


---

```clj
{:full-name "cljs.core/unchecked-substract",
 :ns "cljs.core",
 :name "unchecked-substract",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
 :type "function",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source {:code "(defn unchecked-substract\n  ([x] (cljs.core/unchecked-subtract x))\n  ([x y] (cljs.core/unchecked-subtract x y))\n  ([x y & more] (reduce unchecked-substract (cljs.core/unchecked-subtract x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1496 1501],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1496-L1501"},
 :full-name-encode "cljs.core_unchecked-substract",
 :history [["+" "0.0-1798"]]}

```
