## cljs.core/test



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/test</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/test)
</td>
</tr>
</table>


 <samp>
(__test__ v)<br>
</samp>

---





Source docstring:

```
test [v] finds fn at key :test in var metadata and calls it,
presuming failure will throw exception
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L9245-L9252):

```clj
(defn test
  [v]
  (let [f (.-cljs$lang$test v)]
    (if f
      (do (f) :ok)
      :no-test)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9245-9252](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/core.cljs#L9245-L9252)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/test` @ clojuredocs](http://clojuredocs.org/clojure.core/test)<br>
[`clojure.core/test` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/test/)<br>
[`clojure.core/test` @ crossclj](http://crossclj.info/fun/clojure.core/test.html)<br>
[`cljs.core/test` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/test.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/test.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "test",
 :signature ["[v]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.core/test",
 :source {:code "(defn test\n  [v]\n  (let [f (.-cljs$lang$test v)]\n    (if f\n      (do (f) :ok)\n      :no-test)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9245 9252]},
 :full-name "cljs.core/test",
 :clj-symbol "clojure.core/test",
 :docstring "test [v] finds fn at key :test in var metadata and calls it,\npresuming failure will throw exception"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/test"]))
```

-->
