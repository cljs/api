## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/pos?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/pos?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/pos?)
</td>
</tr>
</table>

 <samp>
(__pos?__ n)<br>
</samp>

```
Returns true if num is greater than zero, else false
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:959-961](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L959-L961)</ins>
</pre>

```clj
(defn pos?
  [n] (< 0 n))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:112-113](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L112-L113)</ins>
</pre>

```clj
(defmacro pos? [x]
  `(> ~x 0))
```

---

```clj
{:ns "cljs.core",
 :name "pos?",
 :signature ["[n]"],
 :shadowed-sources ({:code "(defmacro pos? [x]\n  `(> ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [112 113],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L112-L113"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_pos_QMARK_",
 :source {:code "(defn pos?\n  [n] (< 0 n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [959 961],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L959-L961"},
 :full-name "cljs.core/pos?",
 :clj-symbol "clojure.core/pos?",
 :docstring "Returns true if num is greater than zero, else false"}

```
