## cljs.test/empty-env



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__empty-env__)<br>
</samp>
 <samp>
(__empty-env__ reporter)<br>
</samp>

---





Source docstring:

```
Generates a testing environment with a reporter.
(empty-env) - uses the :cljs.test/default reporter.
(empty-env :cljs.test/pprint) - pretty prints all data structures. 
(empty-env reporter) - uses a reporter of your choosing.

To create your own reporter see cljs.test/report
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/test.cljs#L252-L267):

```clj
(defn empty-env
  ([] (empty-env ::default))
  ([reporter]
   (cond-> {:report-counters {:test 0 :pass 0 :fail 0 :error 0}
            :testing-vars ()
            :testing-contexts ()
            :formatter pr-str
            :reporter reporter}
     (= ::pprint reporter) (assoc :reporter ::default
                             :formatter pprint/pprint))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[test.cljs:252-267](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/test.cljs#L252-L267)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/empty-env` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/empty-env.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/empty-env.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "empty-env",
 :signature ["[]" "[reporter]"],
 :history [["+" "0.0-2496"]],
 :type "function",
 :full-name-encode "cljs.test/empty-env",
 :source {:code "(defn empty-env\n  ([] (empty-env ::default))\n  ([reporter]\n   (cond-> {:report-counters {:test 0 :pass 0 :fail 0 :error 0}\n            :testing-vars ()\n            :testing-contexts ()\n            :formatter pr-str\n            :reporter reporter}\n     (= ::pprint reporter) (assoc :reporter ::default\n                             :formatter pprint/pprint))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/test.cljs",
          :lines [252 267]},
 :full-name "cljs.test/empty-env",
 :docstring "Generates a testing environment with a reporter.\n(empty-env) - uses the :cljs.test/default reporter.\n(empty-env :cljs.test/pprint) - pretty prints all data structures. \n(empty-env reporter) - uses a reporter of your choosing.\n\nTo create your own reporter see cljs.test/report"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/empty-env"]))
```

-->
