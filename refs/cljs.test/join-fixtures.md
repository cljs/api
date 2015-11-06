## cljs.test/join-fixtures



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/join-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/join-fixtures)
</td>
</tr>
</table>


 <samp>
(__join-fixtures__ fixtures)<br>
</samp>

---





Source docstring:

```
Composes a collection of fixtures, in order.  Always returns a valid
fixture function, even if the collection is empty.

NOTE: Incompatible with map fixtures.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/test.cljs#L479-L485):

```clj
(defn join-fixtures
  [fixtures]
  (reduce compose-fixtures default-fixture fixtures))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3195
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:479-485](https://github.com/clojure/clojurescript/blob/r3195/src/cljs/cljs/test.cljs#L479-L485)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/join-fixtures` @ clojuredocs](http://clojuredocs.org/clojure.test/join-fixtures)<br>
[`clojure.test/join-fixtures` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/join-fixtures/)<br>
[`clojure.test/join-fixtures` @ crossclj](http://crossclj.info/fun/clojure.test/join-fixtures.html)<br>
[`cljs.test/join-fixtures` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/join-fixtures.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/join-fixtures.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "join-fixtures",
 :signature ["[fixtures]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/join-fixtures",
 :source {:code "(defn join-fixtures\n  [fixtures]\n  (reduce compose-fixtures default-fixture fixtures))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3195",
          :filename "src/cljs/cljs/test.cljs",
          :lines [479 485]},
 :full-name "cljs.test/join-fixtures",
 :clj-symbol "clojure.test/join-fixtures",
 :docstring "Composes a collection of fixtures, in order.  Always returns a valid\nfixture function, even if the collection is empty.\n\nNOTE: Incompatible with map fixtures."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/join-fixtures"]))
```

-->
