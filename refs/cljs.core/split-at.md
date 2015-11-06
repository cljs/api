## cljs.core/split-at



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/split-at</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/split-at)
</td>
</tr>
</table>


 <samp>
(__split-at__ n coll)<br>
</samp>

---

Returns a vector of `[(take n coll) (drop n coll)]`.



---


###### See Also:

[`cljs.core/split-with`](../cljs.core/split-with.md)<br>
[`clojure.string/split`](../clojure.string/split.md)<br>

---


Source docstring:

```
Returns a vector of [(take n coll) (drop n coll)]
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L4311-L4314):

```clj
(defn split-at
  [n coll]
  [(take n coll) (drop n coll)])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:4311-4314](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/cljs/cljs/core.cljs#L4311-L4314)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/split-at` @ clojuredocs](http://clojuredocs.org/clojure.core/split-at)<br>
[`clojure.core/split-at` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/split-at/)<br>
[`clojure.core/split-at` @ crossclj](http://crossclj.info/fun/clojure.core/split-at.html)<br>
[`cljs.core/split-at` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/split-at.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/split-at.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Returns a vector of `[(take n coll) (drop n coll)]`.",
 :ns "cljs.core",
 :name "split-at",
 :signature ["[n coll]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :related ["cljs.core/split-with" "clojure.string/split"],
 :full-name-encode "cljs.core/split-at",
 :source {:code "(defn split-at\n  [n coll]\n  [(take n coll) (drop n coll)])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [4311 4314]},
 :full-name "cljs.core/split-at",
 :clj-symbol "clojure.core/split-at",
 :docstring "Returns a vector of [(take n coll) (drop n coll)]"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/split-at"]))
```

-->
