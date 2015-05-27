## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/append!

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__append!__ acc x)<br>
</samp>

```
.adds x to acc and returns acc
```

---

 <pre>
clojurescript @ r1576
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:223-226](https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L223-L226)</ins>
</pre>

```clj
(defn append!
  [acc x]
  (doto acc (.add x)))
```


---

```clj
{:full-name "clojure.core.reducers/append!",
 :ns "clojure.core.reducers",
 :name "append!",
 :docstring ".adds x to acc and returns acc",
 :type "function",
 :signature ["[acc x]"],
 :source {:code "(defn append!\n  [acc x]\n  (doto acc (.add x)))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [223 226],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/cljs/clojure/core/reducers.cljs#L223-L226"},
 :full-name-encode "clojure.core.reducers_append_BANG_",
 :history [["+" "0.0-1236"]]}

```
