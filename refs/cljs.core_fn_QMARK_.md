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
clojurescript @ r1586
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1049-1050](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1049-L1050)</ins>
</pre>

```clj
(defn ^boolean fn? [f]
  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "fn?",
 :signature ["[f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.core_fn_QMARK_",
 :source {:code "(defn ^boolean fn? [f]\n  (or ^boolean (goog/isFunction f) (satisfies? Fn f)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1049 1050],
          :link "https://github.com/clojure/clojurescript/blob/r1586/src/cljs/cljs/core.cljs#L1049-L1050"},
 :full-name "cljs.core/fn?",
 :clj-symbol "clojure.core/fn?"}

```
