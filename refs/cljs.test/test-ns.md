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
*initial-report-counters*.  Returns the final, dereferenced state of
*report-counters*.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/test.clj#L276-L299):

```clj
(defmacro test-ns
  ([ns] `(cljs.test/test-ns (cljs.test/empty-env) ~ns))
  ([env [quote ns :as form]]
   (assert (and (= quote 'quote) (symbol? ns)) "Argument to test-ns must be a quoted symbol")
   (assert (ana-api/find-ns ns) (str "Namespace " ns " does not exist"))
   `(do
      (cljs.test/set-env! ~env)
      (cljs.test/do-report {:type :begin-test-ns, :ns ~form})
      ;; If the namespace has a test-ns-hook function, call that:
      ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]
         `(~(symbol (name ns) "test-ns-hook"))
         ;; Otherwise, just test every var in the namespace.
         `(cljs.test/test-all-vars ~form))
      (cljs.test/do-report {:type :end-test-ns, :ns ~form})
      (let [ret# (cljs.test/get-current-env)]
        (cljs.test/clear-env!)
        ret#))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── clj
        └── cljs
            └── <ins>[test.clj:276-299](https://github.com/clojure/clojurescript/blob/r2498/src/clj/cljs/test.clj#L276-L299)</ins>
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
 :source {:code "(defmacro test-ns\n  ([ns] `(cljs.test/test-ns (cljs.test/empty-env) ~ns))\n  ([env [quote ns :as form]]\n   (assert (and (= quote 'quote) (symbol? ns)) \"Argument to test-ns must be a quoted symbol\")\n   (assert (ana-api/find-ns ns) (str \"Namespace \" ns \" does not exist\"))\n   `(do\n      (cljs.test/set-env! ~env)\n      (cljs.test/do-report {:type :begin-test-ns, :ns ~form})\n      ;; If the namespace has a test-ns-hook function, call that:\n      ~(if-let [v (ana-api/ns-resolve ns 'test-ns-hook)]\n         `(~(symbol (name ns) \"test-ns-hook\"))\n         ;; Otherwise, just test every var in the namespace.\n         `(cljs.test/test-all-vars ~form))\n      (cljs.test/do-report {:type :end-test-ns, :ns ~form})\n      (let [ret# (cljs.test/get-current-env)]\n        (cljs.test/clear-env!)\n        ret#))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/clj/cljs/test.clj",
          :lines [276 299]},
 :full-name "cljs.test/test-ns",
 :clj-symbol "clojure.test/test-ns",
 :docstring "If the namespace defines a function named test-ns-hook, calls that.\nOtherwise, calls test-all-vars on the namespace.  'ns' is a\nnamespace object or a symbol.\n\nInternally binds *report-counters* to a ref initialized to\n*initial-report-counters*.  Returns the final, dereferenced state of\n*report-counters*."}

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
