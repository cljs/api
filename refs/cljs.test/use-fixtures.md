## cljs.test/use-fixtures



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2498"><img valign="middle" alt="[+] 0.0-2498" title="Added in 0.0-2498" src="https://img.shields.io/badge/+-0.0--2498-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/use-fixtures</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/use-fixtures)
</td>
</tr>
</table>


 <samp>
(__use-fixtures__ type & fns)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/test.clj#L370-L380):

```clj
(defmacro use-fixtures [type & fns]
  (condp = type
    :once
    `(def ~'cljs-test-once-fixtures
       [~@fns])
    :each
    `(def ~'cljs-test-each-fixtures
       [~@fns])
    :else
    (throw
      (Exception. "First argument to cljs.test/use-fixtures must be :once or :each"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[test.clj:370-380](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/test.clj#L370-L380)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/use-fixtures` @ clojuredocs](http://clojuredocs.org/clojure.test/use-fixtures)<br>
[`clojure.test/use-fixtures` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/use-fixtures/)<br>
[`clojure.test/use-fixtures` @ crossclj](http://crossclj.info/fun/clojure.test/use-fixtures.html)<br>
[`cljs.test/use-fixtures` @ crossclj](http://crossclj.info/fun/cljs.test/use-fixtures.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/use-fixtures.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "use-fixtures",
 :signature ["[type & fns]"],
 :history [["+" "0.0-2498"]],
 :type "macro",
 :full-name-encode "cljs.test/use-fixtures",
 :source {:code "(defmacro use-fixtures [type & fns]\n  (condp = type\n    :once\n    `(def ~'cljs-test-once-fixtures\n       [~@fns])\n    :each\n    `(def ~'cljs-test-each-fixtures\n       [~@fns])\n    :else\n    (throw\n      (Exception. \"First argument to cljs.test/use-fixtures must be :once or :each\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/test.clj",
          :lines [370 380]},
 :full-name "cljs.test/use-fixtures",
 :clj-symbol "clojure.test/use-fixtures"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/use-fixtures"]))
```

-->
