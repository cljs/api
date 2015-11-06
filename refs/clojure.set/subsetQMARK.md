## clojure.set/subset?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/subset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/subset?)
</td>
</tr>
</table>


 <samp>
(__subset?__ a b)<br>
</samp>

---

Returns true if `a` is a subset of `b`, false otherwise.

In other words, returns true if all the elements of `a` can be found in `b`.



---


###### See Also:

[`cljs.core/set`](../cljs.core/set.md)<br>
[`cljs.core/set?`](../cljs.core/setQMARK.md)<br>
[`clojure.set/superset?`](../clojure.set/supersetQMARK.md)<br>

---


Source docstring:

```
Is set1 a subset of set2?
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/clojure/set.cljs#L131-L135):

```clj
(defn subset? 
  [set1 set2]
  (and (<= (count set1) (count set2))
       (every? #(contains? set2 %) set1)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2342
└── src
    └── cljs
        └── clojure
            └── <ins>[set.cljs:131-135](https://github.com/clojure/clojurescript/blob/r2342/src/cljs/clojure/set.cljs#L131-L135)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/subset?` @ clojuredocs](http://clojuredocs.org/clojure.set/subset_q)<br>
[`clojure.set/subset?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/subset%3F/)<br>
[`clojure.set/subset?` @ crossclj](http://crossclj.info/fun/clojure.set/subset%3F.html)<br>
[`clojure.set/subset?` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/subset%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/subsetQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `a` is a subset of `b`, false otherwise.\n\nIn other words, returns true if all the elements of `a` can be found in `b`.",
 :ns "clojure.set",
 :name "subset?",
 :signature ["[a b]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/set?" "clojure.set/superset?"],
 :full-name-encode "clojure.set/subsetQMARK",
 :source {:code "(defn subset? \n  [set1 set2]\n  (and (<= (count set1) (count set2))\n       (every? #(contains? set2 %) set1)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2342",
          :filename "src/cljs/clojure/set.cljs",
          :lines [131 135]},
 :full-name "clojure.set/subset?",
 :clj-symbol "clojure.set/subset?",
 :docstring "Is set1 a subset of set2?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/subset?"]))
```

-->
