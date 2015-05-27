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
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1488-1489](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1488-L1489)</ins>
</pre>

```clj
(defn unchecked-negate-int [x]
  (cljs.core/unchecked-negate-int x))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:311-312](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L311-L312)</ins>
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
                     :lines [311 312],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L311-L312"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-negate-int",
 :source {:code "(defn unchecked-negate-int [x]\n  (cljs.core/unchecked-negate-int x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1488 1489],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1488-L1489"},
 :full-name "cljs.core/unchecked-negate-int",
 :clj-symbol "clojure.core/unchecked-negate-int"}

```
