## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-add

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-add</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-add)
</td>
</tr>
</table>

 <samp>
(__unchecked-add__)<br>
(__unchecked-add__ x)<br>
(__unchecked-add__ x y)<br>
(__unchecked-add__ x y & more)<br>
</samp>

```
Returns the sum of nums. (+) returns 0.
```

---

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1476-1481](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1476-L1481)</ins>
</pre>

```clj
(defn unchecked-add
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/unchecked-add x y))
  ([x y & more] (reduce unchecked-add (cljs.core/unchecked-add x y) more)))
```


---

 <pre>
clojurescript @ r1806
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:281-282](https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L281-L282)</ins>
</pre>

```clj
(defmacro unchecked-add
  ([& xs] `(+ ~@xs)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-add",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro unchecked-add\n  ([& xs] `(+ ~@xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [281 282],
                     :link "https://github.com/clojure/clojurescript/blob/r1806/src/clj/cljs/core.clj#L281-L282"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-add",
 :source {:code "(defn unchecked-add\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-add x y))\n  ([x y & more] (reduce unchecked-add (cljs.core/unchecked-add x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1476 1481],
          :link "https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L1476-L1481"},
 :full-name "cljs.core/unchecked-add",
 :clj-symbol "clojure.core/unchecked-add",
 :docstring "Returns the sum of nums. (+) returns 0."}

```
