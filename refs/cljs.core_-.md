## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/-

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/-</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-)
</td>
</tr>
</table>

 <samp>
(__-__ x)<br>
(__-__ x y)<br>
(__-__ x y & more)<br>
</samp>

```
If no ys are supplied, returns the negation of x, else subtracts
the ys from x and returns the result.
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1375-1380](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1375-L1380)</ins>
</pre>

```clj
(defn -
  ([x] (cljs.core/- x))
  ([x y] (cljs.core/- x y))
  ([x y & more] (reduce - (cljs.core/- x y) more)))
```


---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:328-331](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L328-L331)</ins>
</pre>

```clj
(defmacro -
  ([x] (list 'js* "(- ~{})" x))
  ([x y] (list 'js* "(~{} - ~{})" x y))
  ([x y & more] `(- (- ~x ~y) ~@more)))
```

---

```clj
{:ns "cljs.core",
 :name "-",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro -\n  ([x] (list 'js* \"(- ~{})\" x))\n  ([x y] (list 'js* \"(~{} - ~{})\" x y))\n  ([x y & more] `(- (- ~x ~y) ~@more)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [328 331],
                     :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L328-L331"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_-",
 :source {:code "(defn -\n  ([x] (cljs.core/- x))\n  ([x y] (cljs.core/- x y))\n  ([x y & more] (reduce - (cljs.core/- x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1375 1380],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1375-L1380"},
 :full-name "cljs.core/-",
 :clj-symbol "clojure.core/-",
 :docstring "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result."}

```
