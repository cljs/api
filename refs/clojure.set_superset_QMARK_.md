## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/superset?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/superset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/superset?)
</td>
</tr>
</table>

 <samp>
(__superset?__ set1 set2)<br>
</samp>

```
Is set1 a superset of set2?
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:138-142](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L138-L142)</ins>
</pre>

```clj
(defn superset? 
  [set1 set2]
  (and (>= (count set1) (count set2))
       (every? #(contains? set1 %) set2)))
```


---

```clj
{:ns "clojure.set",
 :name "superset?",
 :signature ["[set1 set2]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_superset_QMARK_",
 :source {:code "(defn superset? \n  [set1 set2]\n  (and (>= (count set1) (count set2))\n       (every? #(contains? set1 %) set2)))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [138 142],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L138-L142"},
 :full-name "clojure.set/superset?",
 :clj-symbol "clojure.set/superset?",
 :docstring "Is set1 a superset of set2?"}

```
