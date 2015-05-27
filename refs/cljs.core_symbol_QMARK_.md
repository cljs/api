## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/symbol?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol?)
</td>
</tr>
</table>

 <samp>
(__symbol?__ x)<br>
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
            └── <ins>[core.cljs:1107-1108](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1107-L1108)</ins>
</pre>

```clj
(defn ^boolean symbol? [x]
  (instance? Symbol x))
```


---

 <pre>
clojurescript @ r1798
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:251-252](https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L251-L252)</ins>
</pre>

```clj
(defmacro symbol? [x]
  (bool-expr `(instance? Symbol ~x)))
```

---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol?",
 :signature ["[x]"],
 :shadowed-sources ({:code "(defmacro symbol? [x]\n  (bool-expr `(instance? Symbol ~x)))",
                     :filename "clojurescript/src/clj/cljs/core.clj",
                     :lines [251 252],
                     :link "https://github.com/clojure/clojurescript/blob/r1798/src/clj/cljs/core.clj#L251-L252"}),
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_symbol_QMARK_",
 :source {:code "(defn ^boolean symbol? [x]\n  (instance? Symbol x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1107 1108],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/cljs/core.cljs#L1107-L1108"},
 :full-name "cljs.core/symbol?",
 :clj-symbol "clojure.core/symbol?"}

```
