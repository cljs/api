## clojure.set/superset?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.set/superset?</samp>](http://clojure.github.io/clojure/branch-master/clojure.set-api.html#clojure.set/superset?)
</td>
</tr>
</table>


 <samp>
(__superset?__ a b)<br>
</samp>

---

Returns true if `a` is a superset of `b`, false otherwise.

In other words, returns true if `a` contains all the elements of `b`.



---


###### See Also:

[`cljs.core/set`](../cljs.core/set.md)<br>
[`cljs.core/set?`](../cljs.core/setQMARK.md)<br>
[`clojure.set/subset?`](../clojure.set/subsetQMARK.md)<br>

---


Source docstring:

```
Is set1 a superset of set2?
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/clojure/set.cljs#L137-L141):

```clj
(defn superset? 
  [set1 set2]
  (and (>= (count set1) (count set2))
       (every? #(contains? set1 %) set2)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── cljs
            └── clojure
                └── <ins>[set.cljs:137-141](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/cljs/clojure/set.cljs#L137-L141)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.set/superset?` @ clojuredocs](http://clojuredocs.org/clojure.set/superset_q)<br>
[`clojure.set/superset?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.set/superset%3F/)<br>
[`clojure.set/superset?` @ crossclj](http://crossclj.info/fun/clojure.set/superset%3F.html)<br>
[`clojure.set/superset?` @ crossclj](http://crossclj.info/fun/clojure.set.cljs/superset%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.set/supersetQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns true if `a` is a superset of `b`, false otherwise.\n\nIn other words, returns true if `a` contains all the elements of `b`.",
 :ns "clojure.set",
 :name "superset?",
 :signature ["[a b]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/set" "cljs.core/set?" "clojure.set/subset?"],
 :full-name-encode "clojure.set/supersetQMARK",
 :source {:code "(defn superset? \n  [set1 set2]\n  (and (>= (count set1) (count set2))\n       (every? #(contains? set1 %) set2)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/cljs/clojure/set.cljs",
          :lines [137 141]},
 :full-name "clojure.set/superset?",
 :clj-symbol "clojure.set/superset?",
 :docstring "Is set1 a superset of set2?"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.set/superset?"]))
```

-->
