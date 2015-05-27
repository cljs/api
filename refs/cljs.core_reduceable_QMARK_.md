## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/reduceable?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__reduceable?__ x)<br>
</samp>

```
Returns true if coll satisfies IReduce
```

---

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:899-901](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L899-L901)</ins>
</pre>

```clj
(defn ^boolean reduceable?
  [x] (satisfies? IReduce x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "reduceable?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_reduceable_QMARK_",
 :source {:code "(defn ^boolean reduceable?\n  [x] (satisfies? IReduce x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [899 901],
          :link "https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L899-L901"},
 :full-name "cljs.core/reduceable?",
 :docstring "Returns true if coll satisfies IReduce"}

```
