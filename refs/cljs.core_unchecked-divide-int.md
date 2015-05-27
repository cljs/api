## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-divide-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-divide-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-divide-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-divide-int__ x)<br>
(__unchecked-divide-int__ x y)<br>
(__unchecked-divide-int__ x y & more)<br>
</samp>

```
If no denominators are supplied, returns 1/numerator,
else returns numerator divided by all of the denominators.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1496-1501](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1496-L1501)</ins>
</pre>

```clj
(defn unchecked-divide-int
  ([x] (unchecked-divide-int 1 x))
  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:293-294](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L293-L294)</ins>
</pre>

```clj
(defmacro unchecked-divide-int
  ([& xs] `(/ ~@xs)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-divide-int",
 :signature ["[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro unchecked-divide-int\n  ([& xs] `(/ ~@xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [293 294],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L293-L294"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-divide-int",
 :source {:code "(defn unchecked-divide-int\n  ([x] (unchecked-divide-int 1 x))\n  ([x y] (cljs.core/divide x y)) ;; FIXME: waiting on cljs.core//\n  ([x y & more] (reduce unchecked-divide-int (unchecked-divide-int x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1496 1501],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1496-L1501"},
 :full-name "cljs.core/unchecked-divide-int",
 :clj-symbol "clojure.core/unchecked-divide-int",
 :docstring "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators."}

```
