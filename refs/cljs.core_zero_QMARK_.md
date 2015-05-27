## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/zero?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/zero?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/zero?)
</td>
</tr>
</table>

 <samp>
(__zero?__ n)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r927
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:963-964](https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L963-L964)</ins>
</pre>

```clj
(defn zero? [n]
  (== 0 n))
```


---

 <pre>
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:109-110](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L109-L110)</ins>
</pre>

```clj
(defmacro zero? [x]
  `(== ~x 0))
```

---

```clj
{:ns "cljs.core",
 :name "zero?",
 :signature ["[n]"],
 :shadowed-sources ({:code "(defmacro zero? [x]\n  `(== ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [109 110],
                     :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/core.clj#L109-L110"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_zero_QMARK_",
 :source {:code "(defn zero? [n]\n  (== 0 n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [963 964],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/cljs/cljs/core.cljs#L963-L964"},
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?"}

```
