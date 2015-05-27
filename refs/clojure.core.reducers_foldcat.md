## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/foldcat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__foldcat__ coll)<br>
</samp>

```
Equivalent to (fold cat append! coll)
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:228-231](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L228-L231)</ins>
</pre>

```clj
(defn foldcat
  [coll]
  (fold cat append! coll))
```


---

```clj
{:full-name "clojure.core.reducers/foldcat",
 :ns "clojure.core.reducers",
 :name "foldcat",
 :docstring "Equivalent to (fold cat append! coll)",
 :type "function",
 :signature ["[coll]"],
 :source {:code "(defn foldcat\n  [coll]\n  (fold cat append! coll))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [228 231],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/core/reducers.cljs#L228-L231"},
 :full-name-encode "clojure.core.reducers_foldcat",
 :history [["+" "0.0-1236"]]}

```
