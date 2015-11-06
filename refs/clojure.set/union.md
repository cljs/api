## clojure.set/union



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/union</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/union)
</td>
</tr>
</table>


 <samp>
(__union__)<br>
</samp>
 <samp>
(__union__ s1)<br>
</samp>
 <samp>
(__union__ s1 s2)<br>
</samp>
 <samp>
(__union__ s1 s2 & sets)<br>
</samp>

---

Return a set that is the union of the input sets.



---


###### See Also:

[`clojure.set/intersection`](../clojure.set/intersection.md)<br>
[`clojure.set/difference`](../clojure.set/difference.md)<br>
[`clojure.set/superset?`](../clojure.set/supersetQMARK.md)<br>

---


Source docstring:

```
Return a set that is the union of the input sets
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/set.cljs#L19-L29):

```clj
(defn union
  ([] #{})
  ([s1] s1)
  ([s1 s2]
     (if (< (count s1) (count s2))
       (reduce conj s2 s1)
       (reduce conj s1 s2)))
  ([s1 s2 & sets]
     (let [bubbled-sets (bubble-max-key count (conj sets s2 s1))]
       (reduce into (first bubbled-sets) (rest bubbled-sets)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1586
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:19-29](https://github.com/clojure/clojurescript/blob/r1586/src/cljs/clojure/set.cljs#L19-L29)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/union` @ clojuredocs](http://clojuredocs.org/clojure.set/union)<br>
[`clojure.set/union` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/union/)<br>
[`clojure.set/union` @ crossclj](http://crossclj.info/fun/clojure.set/union.html)<br>
[`clojure.set/union` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/union.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/union.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Return a set that is the union of the input sets.",
 :ns "clojure.set",
 :name "union",
 :signature ["[]" "[s1]" "[s1 s2]" "[s1 s2 & sets]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["clojure.set/intersection"
           "clojure.set/difference"
           "clojure.set/superset?"],
 :full-name-encode "clojure.set/union",
 :source {:code "(defn union\n  ([] #{})\n  ([s1] s1)\n  ([s1 s2]\n     (if (< (count s1) (count s2))\n       (reduce conj s2 s1)\n       (reduce conj s1 s2)))\n  ([s1 s2 & sets]\n     (let [bubbled-sets (bubble-max-key count (conj sets s2 s1))]\n       (reduce into (first bubbled-sets) (rest bubbled-sets)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1586",
          :filename "src/cljs/clojure/set.cljs",
          :lines [19 29]},
 :full-name "clojure.set/union",
 :clj-symbol "clojure.set/union",
 :docstring "Return a set that is the union of the input sets"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/union"]))
```

-->
