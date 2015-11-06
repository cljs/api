## cljs.test/test-ns



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/test-ns</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/test-ns)
</td>
</tr>
</table>


 <samp>
(__test-ns__ ns)<br>
</samp>
 <samp>
(__test-ns__ env \[quote ns :as form\])<br>
</samp>

---





Source docstring:

```
If the namespace defines a function named test-ns-hook, calls that.
Otherwise, calls test-all-vars on the namespace.  'ns' is a
namespace object or a symbol.

Internally binds *report-counters* to a ref initialized to
*initial-report-counters*.  
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/test.clj#L352-L364):

```clj
(defmacro test-ns
  ([ns] `(cljs.test/test-ns (cljs.test/empty-env) ~ns))
  ([env [quote ns :as form]]
   `(cljs.test/run-block
     (concat (cljs.test/test-ns-block ~env ~form)
             [(fn []
                (cljs.test/clear-env!))]))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:352-364](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/test.clj#L352-L364)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/test-ns` @ clojuredocs](http://clojuredocs.org/clojure.test/test-ns)<br>
[`clojure.test/test-ns` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/test-ns/)<br>
[`clojure.test/test-ns` @ crossclj](http://crossclj.info/fun/clojure.test/test-ns.html)<br>
[`cljs.test/test-ns` @ crossclj](http://crossclj.info/fun/cljs.test/test-ns.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/test-ns.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "test-ns",
 :signature ["[ns]" "[env [quote ns :as form]]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/test-ns",
 :source {:code "(defmacro test-ns\n  ([ns] `(cljs.test/test-ns (cljs.test/empty-env) ~ns))\n  ([env [quote ns :as form]]\n   `(cljs.test/run-block\n     (concat (cljs.test/test-ns-block ~env ~form)\n             [(fn []\n                (cljs.test/clear-env!))]))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/test.clj",
          :lines [352 364]},
 :full-name "cljs.test/test-ns",
 :clj-symbol "clojure.test/test-ns",
 :docstring "If the namespace defines a function named test-ns-hook, calls that.\nOtherwise, calls test-all-vars on the namespace.  'ns' is a\nnamespace object or a symbol.\n\nInternally binds *report-counters* to a ref initialized to\n*initial-report-counters*.  "}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/test-ns"]))
```

-->
