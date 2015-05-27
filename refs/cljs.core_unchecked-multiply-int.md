## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-multiply-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-multiply-int__)<br>
(__unchecked-multiply-int__ x)<br>
(__unchecked-multiply-int__ x y)<br>
(__unchecked-multiply-int__ x y & more)<br>
</samp>

```
Returns the product of nums. (*) returns 1.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1526-1531](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1526-L1531)</ins>
</pre>

```clj
(defn unchecked-multiply-int
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply-int x y))
  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:310-311](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L310-L311)</ins>
</pre>

```clj
(defmacro unchecked-multiply-int
  ([& xs] `(* ~@xs)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-multiply-int",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro unchecked-multiply-int\n  ([& xs] `(* ~@xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [310 311],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L310-L311"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-multiply-int",
 :source {:code "(defn unchecked-multiply-int\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply-int x y))\n  ([x y & more] (reduce unchecked-multiply-int (cljs.core/unchecked-multiply-int x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1526 1531],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1526-L1531"},
 :full-name "cljs.core/unchecked-multiply-int",
 :clj-symbol "clojure.core/unchecked-multiply-int",
 :docstring "Returns the product of nums. (*) returns 1."}

```
