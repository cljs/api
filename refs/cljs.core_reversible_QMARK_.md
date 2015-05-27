## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reversible?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/reversible?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/reversible?)
</td>
</tr>
</table>

 <samp>
(__reversible?__ coll)<br>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1436-1437](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1436-L1437)</ins>
</pre>

```clj
(defn ^boolean reversible? [coll]
  (satisfies? IReversible coll))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reversible?",
 :signature ["[coll]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reversible_QMARK_",
 :source {:code "(defn ^boolean reversible? [coll]\n  (satisfies? IReversible coll))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [1436 1437],
          :link "https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/core.cljs#L1436-L1437"},
 :full-name "cljs.core/reversible?",
 :clj-symbol "clojure.core/reversible?"}

```
