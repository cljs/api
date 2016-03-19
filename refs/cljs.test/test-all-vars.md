## cljs.test/test-all-vars



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-all-vars</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-all-vars)
</td>
</tr>
</table>


 <samp>
(__test-all-vars__ \[quote ns :as form\])<br>
</samp>

---





Source docstring:

```
Calls test-vars on every var with :test metadata interned in the
namespace, with fixtures.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/test.clj#L334-L341):

```clj
(defmacro test-all-vars
  [[quote ns :as form]]
  `(cljs.test/run-block
     (concat (test-all-vars-block ~form)
             [(fn []
                (report {:type :end-test-all-vars :ns ~form}))])))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.8.34
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.clj:334-341](https://github.com/clojure/clojurescript/blob/r1.8.34/src/main/cljs/cljs/test.clj#L334-L341)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/test-all-vars` @ clojuredocs](http://clojuredocs.org/clojure.test/test-all-vars)<br>
[`clojure.test/test-all-vars` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/test-all-vars/)<br>
[`clojure.test/test-all-vars` @ crossclj](http://crossclj.info/fun/clojure.test/test-all-vars.html)<br>
[`cljs.test/test-all-vars` @ crossclj](http://crossclj.info/fun/cljs.test/test-all-vars.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-all-vars.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-all-vars",
 :signature ["[[quote ns :as form]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/test-all-vars",
 :source {:code "(defmacro test-all-vars\n  [[quote ns :as form]]\n  `(cljs.test/run-block\n     (concat (test-all-vars-block ~form)\n             [(fn []\n                (report {:type :end-test-all-vars :ns ~form}))])))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.34",
          :filename "src/main/cljs/cljs/test.clj",
          :lines [334 341]},
 :full-name "cljs.test/test-all-vars",
 :clj-symbol "clojure.test/test-all-vars",
 :docstring "Calls test-vars on every var with :test metadata interned in the\nnamespace, with fixtures."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-all-vars"]))
```

-->
