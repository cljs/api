## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-add-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-add-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-add-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-add-int__)<br>
(__unchecked-add-int__ x)<br>
(__unchecked-add-int__ x y)<br>
(__unchecked-add-int__ x y & more)<br>
</samp>

```
Returns the sum of nums. (+) returns 0.
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1493-1498](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1493-L1498)</ins>
</pre>

```clj
(defn unchecked-add-int
  ([] 0)
  ([x] x)
  ([x y] (cljs.core/unchecked-add-int x y))
  ([x y & more] (reduce unchecked-add-int (cljs.core/unchecked-add-int x y) more)))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:289-290](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L289-L290)</ins>
</pre>

```clj
(defmacro unchecked-add-int
  ([& xs] `(+ ~@xs)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-add-int",
 :signature ["[]" "[x]" "[x y]" "[x y & more]"],
 :shadowed-sources ({:code "(defmacro unchecked-add-int\n  ([& xs] `(+ ~@xs)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [289 290],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L289-L290"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-add-int",
 :source {:code "(defn unchecked-add-int\n  ([] 0)\n  ([x] x)\n  ([x y] (cljs.core/unchecked-add-int x y))\n  ([x y & more] (reduce unchecked-add-int (cljs.core/unchecked-add-int x y) more)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1493 1498],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1493-L1498"},
 :full-name "cljs.core/unchecked-add-int",
 :clj-symbol "clojure.core/unchecked-add-int",
 :docstring "Returns the sum of nums. (+) returns 0."}

```
