## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.set/intersection

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/intersection</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/intersection)
</td>
</tr>
</table>

 <samp>
(__intersection__ s1)<br>
(__intersection__ s1 s2)<br>
(__intersection__ s1 s2 & sets)<br>
</samp>

```
Return a set that is the intersection of the input sets
```

---

 <pre>
clojurescript @ r1503
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:31-44](https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/set.cljs#L31-L44)</ins>
</pre>

```clj
(defn intersection
  ([s1] s1)
  ([s1 s2]
     (if (< (count s2) (count s1))
       (recur s2 s1)
       (reduce (fn [result item]
                   (if (contains? s2 item)
		     result
                     (disj result item)))
	       s1 s1)))
  ([s1 s2 & sets] 
     (let [bubbled-sets (bubble-max-key #(- (count %)) (conj sets s2 s1))]
       (reduce intersection (first bubbled-sets) (rest bubbled-sets)))))
```


---

```clj
{:ns "clojure.set",
 :name "intersection",
 :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.set_intersection",
 :source {:code "(defn intersection\n  ([s1] s1)\n  ([s1 s2]\n     (if (< (count s2) (count s1))\n       (recur s2 s1)\n       (reduce (fn [result item]\n                   (if (contains? s2 item)\n\t\t     result\n                     (disj result item)))\n\t       s1 s1)))\n  ([s1 s2 & sets] \n     (let [bubbled-sets (bubble-max-key #(- (count %)) (conj sets s2 s1))]\n       (reduce intersection (first bubbled-sets) (rest bubbled-sets)))))",
          :filename "clojurescript/src/cljs/clojure/set.cljs",
          :lines [31 44],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/cljs/clojure/set.cljs#L31-L44"},
 :full-name "clojure.set/intersection",
 :clj-symbol "clojure.set/intersection",
 :docstring "Return a set that is the intersection of the input sets"}

```
