## clojure.core.reducers/Cat



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/Cat</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/Cat)
</td>
</tr>
</table>


 <samp>
(__Cat.__ cnt left right)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/clojure/core/reducers.cljs#L193-L211):

```clj
(deftype Cat [cnt left right]
  cljs.core/ICounted
  (-count [_] cnt)

  cljs.core/ISeqable
  (-seq [_] (concat (seq left) (seq right)))

  cljs.core/IReduce
  (-reduce [this f1] (-reduce this f1 (f1)))
  (-reduce
    [_  f1 init]
    (-reduce
     right f1
     (-reduce left f1 init)))

  CollFold
  (coll-fold
    [this n combinef reducef]
    (-reduce this reducef)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── clojure
                └── core
                    └── <ins>[reducers.cljs:193-211](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/clojure/core/reducers.cljs#L193-L211)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/Cat` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/Cat)<br>
[`clojure.core.reducers/Cat` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/Cat/)<br>
[`clojure.core.reducers/Cat` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/Cat.html)<br>
[`clojure.core.reducers/Cat` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/Cat.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/Cat.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "Cat",
 :signature ["[cnt left right]"],
 :history [["+" "0.0-1236"]],
 :type "type",
 :full-name-encode "clojure.core.reducers/Cat",
 :source {:code "(deftype Cat [cnt left right]\n  cljs.core/ICounted\n  (-count [_] cnt)\n\n  cljs.core/ISeqable\n  (-seq [_] (concat (seq left) (seq right)))\n\n  cljs.core/IReduce\n  (-reduce [this f1] (-reduce this f1 (f1)))\n  (-reduce\n    [_  f1 init]\n    (-reduce\n     right f1\n     (-reduce left f1 init)))\n\n  CollFold\n  (coll-fold\n    [this n combinef reducef]\n    (-reduce this reducef)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/clojure/core/reducers.cljs",
          :lines [193 211]},
 :full-name "clojure.core.reducers/Cat",
 :clj-symbol "clojure.core.reducers/Cat"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/Cat"]))
```

-->
