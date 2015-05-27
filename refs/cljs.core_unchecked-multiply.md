## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-multiply

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-multiply</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-multiply)
</td>
</tr>
</table>

 <samp>
(__unchecked-multiply__)<br>
(__unchecked-multiply__ x)<br>
(__unchecked-multiply__ x y)<br>
(__unchecked-multiply__ x y & more)<br>
</samp>

```
Returns the product of nums. (*) returns 1.
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1471-1476](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1471-L1476)</ins>
</pre>

```clj
(defn unchecked-multiply
  ([] 1)
  ([x] x)
  ([x y] (cljs.core/unchecked-multiply x y))
  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:302-303](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L302-L303)</ins>
</pre>

```clj
(defmacro unchecked-multiply
  ([& xs] `(* ~@xs)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-multiply",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro unchecked-multiply\n  ([& xs] `(* ~@xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [302 303],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L302-L303"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-multiply",
 :source {:code "(defn unchecked-multiply\n  ([] 1)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-multiply x y))\n  ([x y & more] (reduce unchecked-multiply (cljs.core/unchecked-multiply x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1471 1476],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1471-L1476"},
 :full-name "cljs.core/unchecked-multiply",
 :clj-symbol "clojure.core/unchecked-multiply",
 :docstring "Returns the product of nums. (*) returns 1."}

```
