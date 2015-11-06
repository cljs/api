## clojure.set/difference



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/difference</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/difference)
</td>
</tr>
</table>


 <samp>
(__difference__ s1)<br>
</samp>
 <samp>
(__difference__ s1 s2)<br>
</samp>
 <samp>
(__difference__ s1 s2 & sets)<br>
</samp>

---

Return a set that is the first set without elements of the remaining sets.



---


###### See Also:

[`clojure.set/union`](../clojure.set/union.md)<br>
[`clojure.set/intersection`](../clojure.set/intersection.md)<br>
[`clojure.set/superset?`](../clojure.set/supersetQMARK.md)<br>
[`clojure.set/project`](../clojure.set/project.md)<br>

---


Source docstring:

```
Return a set that is the first set without elements of the remaining sets
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/set.cljs#L46-L58):

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

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:46-58](https://github.com/clojure/clojurescript/blob/r3178/src/cljs/clojure/set.cljs#L46-L58)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/difference` @ clojuredocs](http://clojuredocs.org/clojure.set/difference)<br>
[`clojure.set/difference` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/difference/)<br>
[`clojure.set/difference` @ crossclj](http://crossclj.info/fun/clojure.set/difference.html)<br>
[`clojure.set/difference` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/difference.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/difference.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Return a set that is the first set without elements of the remaining sets.",
 :ns "clojure.set",
 :name "difference",
 :signature ["[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.set/union"
           "clojure.set/intersection"
           "clojure.set/superset?"
           "clojure.set/project"],
 :full-name-encode "clojure.set/difference",
 :source {:code "(defn difference\n  ([s1] s1)\n  ([s1 s2] \n     (if (< (count s1) (count s2))\n       (reduce (fn [result item] \n                   (if (contains? s2 item) \n                     (disj result item) \n                     result))\n               s1 s1)\n       (reduce disj s1 s2)))\n  ([s1 s2 & sets] \n     (reduce difference s1 (conj sets s2))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/cljs/clojure/set.cljs",
          :lines [46 58]},
 :full-name "clojure.set/difference",
 :clj-symbol "clojure.set/difference",
 :docstring "Return a set that is the first set without elements of the remaining sets"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/difference"]))
```

-->
