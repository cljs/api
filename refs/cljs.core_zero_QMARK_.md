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
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1651-1652](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1651-L1652)</ins>
</pre>

```clj
(defn ^boolean zero? [n]
  (cljs.core/zero? n))
```


---

 <pre>
clojurescript @ r1803
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:375-376](https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L375-L376)</ins>
</pre>

```clj
(defmacro zero? [x]
  `(== ~x 0))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "zero?",
 :signature ["[n]"],
 :shadowed-sources ({:code "(defmacro zero? [x]\n  `(== ~x 0))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [375 376],
                     :link "https://github.com/clojure/clojurescript/blob/r1803/src/clj/cljs/core.clj#L375-L376"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_zero_QMARK_",
 :source {:code "(defn ^boolean zero? [n]\n  (cljs.core/zero? n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1651 1652],
          :link "https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/core.cljs#L1651-L1652"},
 :full-name "cljs.core/zero?",
 :clj-symbol "clojure.core/zero?"}

```
