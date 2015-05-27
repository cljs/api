## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fn?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fn?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fn?)
</td>
</tr>
</table>

 <samp>
(__fn?__ f)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:684-685](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L684-L685)</ins>
</pre>

```clj
(defn fn? [f]
  (goog/isFunction f))
```


---

```clj
{:full-name "cljs.core/fn?",
 :ns "cljs.core",
 :name "fn?",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn fn? [f]\n  (goog/isFunction f))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [684 685],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/core.cljs#L684-L685"},
 :full-name-encode "cljs.core_fn_QMARK_",
 :clj-symbol "clojure.core/fn?",
 :history [["+" "0.0-927"]]}

```
