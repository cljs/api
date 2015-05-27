## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-negate-int

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-negate-int</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-negate-int)
</td>
</tr>
</table>

 <samp>
(__unchecked-negate-int__ x)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1820
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1532-1533](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1532-L1533)</ins>
</pre>

```clj
(defn unchecked-negate-int [x]
  (cljs.core/unchecked-negate-int x))
```


---

 <pre>
clojurescript @ r1820
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:316-317](https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L316-L317)</ins>
</pre>

```clj
(defmacro unchecked-negate-int
  ([x] `(- ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-negate-int",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-negate-int\n  ([x] `(- ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [316 317],
                     :link "https://github.com/clojure/clojurescript/blob/r1820/src/clj/cljs/core.clj#L316-L317"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-negate-int",
 :source {:code "(defn unchecked-negate-int [x]\n  (cljs.core/unchecked-negate-int x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1532 1533],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/cljs/core.cljs#L1532-L1533"},
 :full-name "cljs.core/unchecked-negate-int",
 :clj-symbol "clojure.core/unchecked-negate-int"}

```
