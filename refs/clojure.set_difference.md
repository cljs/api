## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/difference

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/difference</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/difference)
</td>
</tr>
</table>

 <samp>
(__difference__ s1)<br>
(__difference__ s1 s2)<br>
(__difference__ s1 s2 & sets)<br>
</samp>

```
Return a set that is the first set without elements of the remaining sets
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:46-58](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/set.cljs#L46-L58)</ins>
</pre>

```clj
(defn difference
  ([s1] s1)
  ([s1 s2] 
     (if (< (count s1) (count s2))
       (reduce (fn [result item] 
                   (if (contains? s2 item) 
                     (disj result item) 
                     result))
               s1 s1)
       (reduce disj s1 s2)))
  ([s1 s2 & sets] 
     (reduce difference s1 (conj sets s2))))
```


---

```clj
{:ns "clojure.set",
 :name "difference",
 :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_difference",
 :source {:code "(defn difference\n  ([s1] s1)\n  ([s1 s2] \n     (if (< (count s1) (count s2))\n       (reduce (fn [result item] \n                   (if (contains? s2 item) \n                     (disj result item) \n                     result))\n               s1 s1)\n       (reduce disj s1 s2)))\n  ([s1 s2 & sets] \n     (reduce difference s1 (conj sets s2))))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [46 58],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/set.cljs#L46-L58"},
 :full-name "clojure.set/difference",
 :clj-symbol "clojure.set/difference",
 :docstring "Return a set that is the first set without elements of the remaining sets"}

```
