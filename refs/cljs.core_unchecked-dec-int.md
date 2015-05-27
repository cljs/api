## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-dec-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-dec-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-dec-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-dec-int__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1455-1456](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1455-L1456)</ins>
</pre>

```clj
(defn unchecked-dec-int [x]
  (cljs.core/unchecked-dec-int x))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:290-291](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L290-L291)</ins>
</pre>

```clj
(defmacro unchecked-dec-int
  ([x] `(dec ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-dec-int",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-dec-int\n  ([x] `(dec ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [290 291],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L290-L291"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-dec-int",
 :source {:code "(defn unchecked-dec-int [x]\n  (cljs.core/unchecked-dec-int x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1455 1456],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1455-L1456"},
 :full-name "cljs.core/unchecked-dec-int",
 :clj-symbol "clojure.core/unchecked-dec-int"}

```
