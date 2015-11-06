## cljs.core/interleave



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/interleave</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/interleave)
</td>
</tr>
</table>


 <samp>
(__interleave__ c1 c2)<br>
</samp>
 <samp>
(__interleave__ c1 c2 & colls)<br>
</samp>

---

Returns a lazy seq of the first item in each collection, then the second items,
then the third, etc.



---


###### See Also:

[`cljs.core/interpose`](../cljs.core/interpose.md)<br>
[`cljs.core/zipmap`](../cljs.core/zipmap.md)<br>

---


Source docstring:

```
Returns a lazy seq of the first item in each coll, then the second etc.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L4207-L4219):

```clj
(defn interleave
  ([c1 c2]
     (lazy-seq
      (let [s1 (seq c1) s2 (seq c2)]
        (when (and s1 s2)
          (cons (first s1) (cons (first s2)
                                 (interleave (rest s1) (rest s2))))))))
  ([c1 c2 & colls]
     (lazy-seq
      (let [ss (map seq (conj colls c2 c1))]
        (when (every? identity ss)
          (concat (map first ss) (apply interleave (map rest ss))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4207-4219](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/core.cljs#L4207-L4219)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/interleave` @ clojuredocs](http://clojuredocs.org/clojure.core/interleave)<br>
[`clojure.core/interleave` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/interleave/)<br>
[`clojure.core/interleave` @ crossclj](http://crossclj.info/fun/clojure.core/interleave.html)<br>
[`cljs.core/interleave` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/interleave.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/interleave.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a lazy seq of the first item in each collection, then the second items,\nthen the third, etc.",
 :ns "cljs.core",
 :name "interleave",
 :signature ["[c1 c2]" "[c1 c2 & colls]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/interpose" "cljs.core/zipmap"],
 :full-name-encode "cljs.core/interleave",
 :source {:code "(defn interleave\n  ([c1 c2]\n     (lazy-seq\n      (let [s1 (seq c1) s2 (seq c2)]\n        (when (and s1 s2)\n          (cons (first s1) (cons (first s2)\n                                 (interleave (rest s1) (rest s2))))))))\n  ([c1 c2 & colls]\n     (lazy-seq\n      (let [ss (map seq (conj colls c2 c1))]\n        (when (every? identity ss)\n          (concat (map first ss) (apply interleave (map rest ss))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4207 4219]},
 :full-name "cljs.core/interleave",
 :clj-symbol "clojure.core/interleave",
 :docstring "Returns a lazy seq of the first item in each coll, then the second etc."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/interleave"]))
```

-->
