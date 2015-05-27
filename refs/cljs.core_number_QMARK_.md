## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/number?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/number?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/number?)
</td>
</tr>
</table>

 <samp>
(__number?__ n)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1110-1111](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1110-L1111)</ins>
</pre>

```clj
(defn ^boolean number? [n]
  (cljs.core/number? n))
```


---

 <pre>
clojurescript @ r1798
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:248-249](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L248-L249)</ins>
</pre>

```clj
(defmacro number? [x]
  (bool-expr (list 'js* "typeof ~{} === 'number'" x)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "number?",
 :signature ["[n]"],
 :shadowed-sources ({:code "(defmacro number? [x]\n  (bool-expr (list 'js* \"typeof ~{} === 'number'\" x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [248 249],
                     :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L248-L249"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_number_QMARK_",
 :source {:code "(defn ^boolean number? [n]\n  (cljs.core/number? n))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1110 1111],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1110-L1111"},
 :full-name "cljs.core/number?",
 :clj-symbol "clojure.core/number?"}

```
