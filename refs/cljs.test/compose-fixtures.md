## cljs.test/compose-fixtures



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/compose-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/compose-fixtures)
</td>
</tr>
</table>


 <samp>
(__compose-fixtures__ f1 f2)<br>
</samp>

---





Source docstring:

```
Composes two fixture functions, creating a new fixture function
that combines their behavior.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/test.cljs#L383-L387):

```clj
(defn compose-fixtures
  [f1 f2]
  (fn [g] (f1 (fn [] (f2 g)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2665
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:383-387](https://github.com/clojure/clojurescript/blob/r2665/src/cljs/cljs/test.cljs#L383-L387)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/compose-fixtures` @ clojuredocs](http://clojuredocs.org/clojure.test/compose-fixtures)<br>
[`clojure.test/compose-fixtures` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/compose-fixtures/)<br>
[`clojure.test/compose-fixtures` @ crossclj](http://crossclj.info/fun/clojure.test/compose-fixtures.html)<br>
[`cljs.test/compose-fixtures` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/compose-fixtures.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/compose-fixtures.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "compose-fixtures",
 :signature ["[f1 f2]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/compose-fixtures",
 :source {:code "(defn compose-fixtures\n  [f1 f2]\n  (fn [g] (f1 (fn [] (f2 g)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2665",
          :filename "src/cljs/cljs/test.cljs",
          :lines [383 387]},
 :full-name "cljs.test/compose-fixtures",
 :clj-symbol "clojure.test/compose-fixtures",
 :docstring "Composes two fixture functions, creating a new fixture function\nthat combines their behavior."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/compose-fixtures"]))
```

-->
