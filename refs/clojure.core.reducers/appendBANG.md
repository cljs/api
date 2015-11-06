## clojure.core.reducers/append!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/append!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/append!)
</td>
</tr>
</table>


 <samp>
(__append!__ acc x)<br>
</samp>

---





Source docstring:

```
.adds x to acc and returns acc
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/clojure/core/reducers.cljs#L226-L229):

```clj
(defn append!
  [acc x]
  (doto acc (.push x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1885
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:226-229](https://github.com/clojure/clojurescript/blob/r1885/src/cljs/clojure/core/reducers.cljs#L226-L229)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/append!` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/append!)<br>
[`clojure.core.reducers/append!` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/append%21/)<br>
[`clojure.core.reducers/append!` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/append%21.html)<br>
[`clojure.core.reducers/append!` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/append%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/appendBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "append!",
 :signature ["[acc x]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/appendBANG",
 :source {:code "(defn append!\n  [acc x]\n  (doto acc (.push x)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1885",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [226 229]},
 :full-name "clojure.core.reducers/append!",
 :clj-symbol "clojure.core.reducers/append!",
 :docstring ".adds x to acc and returns acc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/append!"]))
```

-->
