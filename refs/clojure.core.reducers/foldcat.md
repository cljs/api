## clojure.core.reducers/foldcat



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/foldcat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/foldcat)
</td>
</tr>
</table>


 <samp>
(__foldcat__ coll)<br>
</samp>

---





Source docstring:

```
Equivalent to (fold cat append! coll)
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/clojure/core/reducers.cljs#L237-L240):

```clj
(defn foldcat
  [coll]
  (fold cat append! coll))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:237-240](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/clojure/core/reducers.cljs#L237-L240)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/foldcat` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/foldcat)<br>
[`clojure.core.reducers/foldcat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/foldcat/)<br>
[`clojure.core.reducers/foldcat` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/foldcat.html)<br>
[`clojure.core.reducers/foldcat` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/foldcat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/foldcat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "foldcat",
 :signature ["[coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/foldcat",
 :source {:code "(defn foldcat\n  [coll]\n  (fold cat append! coll))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [237 240]},
 :full-name "clojure.core.reducers/foldcat",
 :clj-symbol "clojure.core.reducers/foldcat",
 :docstring "Equivalent to (fold cat append! coll)"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/foldcat"]))
```

-->
