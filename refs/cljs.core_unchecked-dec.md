## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-dec

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec)
</td>
</tr>
</table>

 <samp>
(__unchecked-dec__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1834
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1500-1501](https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1500-L1501)</ins>
</pre>

```clj
(defn unchecked-dec [x]
  (cljs.core/unchecked-dec x))
```


---

 <pre>
clojurescript @ r1834
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:292-293](https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L292-L293)</ins>
</pre>

```clj
(defmacro unchecked-dec
  ([x] `(dec ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-dec",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-dec\n  ([x] `(dec ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [292 293],
                     :link "https://github.com/clojure/clojurescript/blob/r1834/src/clj/cljs/core.clj#L292-L293"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-dec",
 :source {:code "(defn unchecked-dec [x]\n  (cljs.core/unchecked-dec x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1500 1501],
          :link "https://github.com/clojure/clojurescript/blob/r1834/src/cljs/cljs/core.cljs#L1500-L1501"},
 :full-name "cljs.core/unchecked-dec",
 :clj-symbol "clojure.core/unchecked-dec"}

```
