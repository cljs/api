## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.core.reducers/foldcat

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/foldcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/foldcat)
</td>
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
clojurescript @ r1820
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:230-233](https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L230-L233)</ins>
</pre>

```clj
(defn foldcat
  [coll]
  (fold cat append! coll))
```


---

```clj
{:ns "clojure.core.reducers",
 :name "foldcat",
 :signature ["[coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers_foldcat",
 :source {:code "(defn foldcat\n  [coll]\n  (fold cat append! coll))",
          :filename "clojurescript/src/cljs/clojure/core/reducers.cljs",
          :lines [230 233],
          :link "https://github.com/clojure/clojurescript/blob/r1820/src/cljs/clojure/core/reducers.cljs#L230-L233"},
 :full-name "clojure.core.reducers/foldcat",
 :clj-symbol "clojure.core.reducers/foldcat",
 :docstring "Equivalent to (fold cat append! coll)"}

```
