## cljs.test/test-vars



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-vars</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-vars)
</td>
</tr>
</table>


 <samp>
(__test-vars__ vars)<br>
</samp>

---





Source docstring:

```
Groups vars by their namespace and runs test-vars on them with
appropriate fixtures assuming they are present in the current
testing environment.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/test.cljs#L556-L561):

```clj
(defn test-vars
  [vars]
  (run-block (test-vars-block vars)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:556-561](https://github.com/clojure/clojurescript/blob/r2911/src/cljs/cljs/test.cljs#L556-L561)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/test-vars` @ clojuredocs](http://clojuredocs.org/clojure.test/test-vars)<br>
[`clojure.test/test-vars` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/test-vars/)<br>
[`clojure.test/test-vars` @ crossclj](http://crossclj.info/fun/clojure.test/test-vars.html)<br>
[`cljs.test/test-vars` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/test-vars.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-vars.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-vars",
 :signature ["[vars]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/test-vars",
 :source {:code "(defn test-vars\n  [vars]\n  (run-block (test-vars-block vars)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/cljs/cljs/test.cljs",
          :lines [556 561]},
 :full-name "cljs.test/test-vars",
 :clj-symbol "clojure.test/test-vars",
 :docstring "Groups vars by their namespace and runs test-vars on them with\nappropriate fixtures assuming they are present in the current\ntesting environment."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-vars"]))
```

-->
