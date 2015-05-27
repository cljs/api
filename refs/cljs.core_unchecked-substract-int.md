## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-substract-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__unchecked-substract-int__ x)<br>
(__unchecked-substract-int__ x y)<br>
(__unchecked-substract-int__ x y & more)<br>
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
            └── <ins>[core.cljs:1503-1508](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1503-L1508)</ins>
</pre>

```clj
(defn unchecked-substract-int
  ([x] (cljs.core/unchecked-subtract-int x))
  ([x y] (cljs.core/unchecked-subtract-int x y))
  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))
```


---

```clj
{:full-name "cljs.core/unchecked-substract-int",
 :ns "cljs.core",
 :name "unchecked-substract-int",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
 :type "function",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :source {:code "(defn unchecked-substract-int\n  ([x] (cljs.core/unchecked-subtract-int x))\n  ([x y] (cljs.core/unchecked-subtract-int x y))\n  ([x y & more] (reduce unchecked-substract-int (cljs.core/unchecked-subtract-int x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1503 1508],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1503-L1508"},
 :full-name-encode "cljs.core_unchecked-substract-int",
 :history [["+" "0.0-1798"]]}

```
