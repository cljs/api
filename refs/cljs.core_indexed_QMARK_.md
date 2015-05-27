## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/indexed?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__indexed?__ x)<br>
</samp>

```
Returns true if coll implements nth in constant time
```

---

 <pre>
clojurescript @ r1236
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:765-767](https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L765-L767)</ins>
</pre>

```clj
(defn ^boolean indexed?
  [x] (satisfies? IIndexed x))
```


---

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "indexed?",
 :signature ["[x]"],
 :history [["+" "0.0-1211"]],
 :type "function",
 :full-name-encode "cljs.core_indexed_QMARK_",
 :source {:code "(defn ^boolean indexed?\n  [x] (satisfies? IIndexed x))",
          :filename "clojurescript/src/cljs/cljs/core.cljs",
          :lines [765 767],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/cljs/cljs/core.cljs#L765-L767"},
 :full-name "cljs.core/indexed?",
 :docstring "Returns true if coll implements nth in constant time"}

```
