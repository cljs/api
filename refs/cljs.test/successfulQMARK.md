## cljs.test/successful?



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/successful?</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/successful?)
</td>
</tr>
</table>


 <samp>
(__successful?__ summary)<br>
</samp>

---





Source docstring:

```
Returns true if the given test summary indicates all tests
were successful, false otherwise.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/test.cljs#L588-L593):

```clj
(defn successful?
  [summary]
  (and (zero? (:fail summary 0))
       (zero? (:error summary 0))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:588-593](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/cljs/cljs/test.cljs#L588-L593)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/successful?` @ clojuredocs](http://clojuredocs.org/clojure.test/successful_q)<br>
[`clojure.test/successful?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/successful%3F/)<br>
[`clojure.test/successful?` @ crossclj](http://crossclj.info/fun/clojure.test/successful%3F.html)<br>
[`cljs.test/successful?` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/successful%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/successfulQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "successful?",
 :signature ["[summary]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/successfulQMARK",
 :source {:code "(defn successful?\n  [summary]\n  (and (zero? (:fail summary 0))\n       (zero? (:error summary 0))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [588 593]},
 :full-name "cljs.test/successful?",
 :clj-symbol "clojure.test/successful?",
 :docstring "Returns true if the given test summary indicates all tests\nwere successful, false otherwise."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/successful?"]))
```

-->
