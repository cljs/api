## clojure.core.reducers/map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/map</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/map)
</td>
</tr>
</table>


 <samp>
(__map__ f)<br>
</samp>
 <samp>
(__map__ f coll)<br>
</samp>

---





Source docstring:

```
Applies f to every value in the reduction of coll. Foldable.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/clojure/core/reducers.cljs#L96-L104):

```clj
(defcurried map
  "Applies f to every value in the reduction of coll. Foldable."
  {}
  [f coll]
  (folder coll
   (fn [f1]
     (rfn [f1 k]
          ([ret k v]
             (f1 ret (f k v)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2173
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:96-104](https://github.com/clojure/clojurescript/blob/r2173/src/cljs/clojure/core/reducers.cljs#L96-L104)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/map` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/map)<br>
[`clojure.core.reducers/map` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/map/)<br>
[`clojure.core.reducers/map` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/map.html)<br>
[`clojure.core.reducers/map` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "map",
 :signature ["[f]" "[f coll]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/map",
 :source {:code "(defcurried map\n  \"Applies f to every value in the reduction of coll. Foldable.\"\n  {}\n  [f coll]\n  (folder coll\n   (fn [f1]\n     (rfn [f1 k]\n          ([ret k v]\n             (f1 ret (f k v)))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2173",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [96 104]},
 :full-name "clojure.core.reducers/map",
 :clj-symbol "clojure.core.reducers/map",
 :docstring "Applies f to every value in the reduction of coll. Foldable."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/map"]))
```

-->
