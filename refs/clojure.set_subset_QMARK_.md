## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/subset?

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/subset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/subset?)
</td>
</tr>
</table>

 <samp>
(__subset?__ set1 set2)<br>
</samp>

```
Is set1 a subset of set2?
```

---

 <pre>
clojurescript @ r1424
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:132-136](https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L132-L136)</ins>
</pre>

```clj
(defn subset? 
  [set1 set2]
  (and (<= (count set1) (count set2))
       (every? #(contains? set2 %) set1)))
```


---

```clj
{:ns "clojure.set",
 :name "subset?",
 :signature ["[set1 set2]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_subset_QMARK_",
 :source {:code "(defn subset? \n  [set1 set2]\n  (and (<= (count set1) (count set2))\n       (every? #(contains? set2 %) set1)))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [132 136],
          :link "https://github.com/clojure/clojurescript/blob/r1424/src/cljs/clojure/set.cljs#L132-L136"},
 :full-name "clojure.set/subset?",
 :clj-symbol "clojure.set/subset?",
 :docstring "Is set1 a subset of set2?"}

```
