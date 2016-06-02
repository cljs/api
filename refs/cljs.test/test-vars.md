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

<samp>(test-vars vars)</samp><br>

---

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


Source code @ [github]():

```clj
(defn test-vars
  [vars]
  (run-block (concat (test-vars-block vars)
                     [(fn []
                        (report {:type :end-test-vars :vars vars}))])))
```

<!--
Repo - tag - source tree - lines:

 <pre>

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
 :name-encode "test-vars",
 :history [["+" "0.0-2496"]],
 :type "function",
 :clj-equiv {:full-name "clojure.test/test-vars",
             :url "http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-vars"},
 :full-name-encode "cljs.test/test-vars",
 :source {:code "(defn test-vars\n  [vars]\n  (run-block (concat (test-vars-block vars)\n                     [(fn []\n                        (report {:type :end-test-vars :vars vars}))])))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [576 583],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/test.cljs#L576-L583"},
 :usage ["(test-vars vars)"],
 :full-name "cljs.test/test-vars",
 :docstring "Groups vars by their namespace and runs test-vars on them with\nappropriate fixtures assuming they are present in the current\ntesting environment.",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-vars.cljsdoc"}

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
