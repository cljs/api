## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/ifn?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/ifn?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/ifn?)
</td>
</tr>
</table>

 <samp>
(__ifn?__ f)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:992-993](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L992-L993)</ins>
</pre>

```clj
(defn ^boolean ifn? [f]
  (or (fn? f) (satisfies? IFn f)))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "ifn?",
 :signature ["[f]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_ifn_QMARK_",
 :source {:code "(defn ^boolean ifn? [f]\n  (or (fn? f) (satisfies? IFn f)))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [992 993],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/cljs/core.cljs#L992-L993"},
 :full-name "cljs.core/ifn?",
 :clj-symbol "clojure.core/ifn?"}

```
