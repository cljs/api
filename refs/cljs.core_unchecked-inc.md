## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/unchecked-inc

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/unchecked-inc</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/unchecked-inc)
</td>
</tr>
</table>

 <samp>
(__unchecked-inc__ x)<br>
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
            └── <ins>[core.cljs:1465-1466](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1465-L1466)</ins>
</pre>

```clj
(defn unchecked-inc [x]
  (cljs.core/unchecked-inc x))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:296-297](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L296-L297)</ins>
</pre>

```clj
(defmacro unchecked-inc
  ([x] `(inc ~x)))
```

---

```clj
{:ns "cljs.core",
 :name "unchecked-inc",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro unchecked-inc\n  ([x] `(inc ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [296 297],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L296-L297"}),
 :history [["+" "0.0-1798"]],
 :type "function",
 :full-name-encode "cljs.core_unchecked-inc",
 :source {:code "(defn unchecked-inc [x]\n  (cljs.core/unchecked-inc x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1465 1466],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1465-L1466"},
 :full-name "cljs.core/unchecked-inc",
 :clj-symbol "clojure.core/unchecked-inc"}

```
