## clojure.core.reducers/reducer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core.reducers/reducer</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core.reducers/reducer)
</td>
</tr>
</table>


 <samp>
(__reducer__ coll xf)<br>
</samp>

---





Source docstring:

```
Given a reducible collection, and a transformation function xf,
returns a reducible collection, where any supplied reducing
fn will be transformed by xf. xf is a function of reducing fn to
reducing fn.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/clojure/core/reducers.cljs#L66-L77):

```clj
(defn reducer
  ([coll xf]
     (reify
       cljs.core/IReduce
       (-reduce [this f1]
         (-reduce this f1 (f1)))
       (-reduce [_ f1 init]
         (-reduce coll (xf f1) init)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── cljs
        └── clojure
            └── core
                └── <ins>[reducers.cljs:66-77](https://github.com/clojure/clojurescript/blob/r2411/src/cljs/clojure/core/reducers.cljs#L66-L77)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core.reducers/reducer` @ clojuredocs](http://clojuredocs.org/clojure.core.reducers/reducer)<br>
[`clojure.core.reducers/reducer` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core.reducers/reducer/)<br>
[`clojure.core.reducers/reducer` @ crossclj](http://crossclj.info/fun/clojure.core.reducers/reducer.html)<br>
[`clojure.core.reducers/reducer` @ crossclj](http://crossclj.info/fun/clojure.core.reducers.cljs/reducer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.core.reducers/reducer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.core.reducers",
 :name "reducer",
 :signature ["[coll xf]"],
 :history [["+" "0.0-1236"]],
 :type "function",
 :full-name-encode "clojure.core.reducers/reducer",
 :source {:code "(defn reducer\n  ([coll xf]\n     (reify\n       cljs.core/IReduce\n       (-reduce [this f1]\n         (-reduce this f1 (f1)))\n       (-reduce [_ f1 init]\n         (-reduce coll (xf f1) init)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/cljs/clojure/core/reducers.cljs",
          :lines [66 77]},
 :full-name "clojure.core.reducers/reducer",
 :clj-symbol "clojure.core.reducers/reducer",
 :docstring "Given a reducible collection, and a transformation function xf,\nreturns a reducible collection, where any supplied reducing\nfn will be transformed by xf. xf is a function of reducing fn to\nreducing fn."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.core.reducers/reducer"]))
```

-->
