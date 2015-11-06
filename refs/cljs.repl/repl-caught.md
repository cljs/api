## cljs.repl/repl-caught



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" title="Added in 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl-caught__ e repl-env opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L696-L710):

```clj
(defn repl-caught [e repl-env opts]
  (if (and (instance? IExceptionInfo e)
           (#{:js-eval-error :js-eval-exception} (:type (ex-data e))))
    (let [{:keys [type repl-env error form js]} (ex-data e)]
      (case type
        :js-eval-error
        (display-error repl-env error form opts)

        :js-eval-exception
        (display-error repl-env error form
          (if (:repl-verbose opts)
            #(prn "Error evaluating:" form :as js)
            (constantly nil))
          opts)))
    (.printStackTrace e *err*)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:696-710](https://github.com/clojure/clojurescript/blob/r3196/src/clj/cljs/repl.clj#L696-L710)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl-caught` @ crossclj](http://crossclj.info/fun/cljs.repl/repl-caught.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/repl-caught.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl-caught",
 :type "function",
 :signature ["[e repl-env opts]"],
 :source {:code "(defn repl-caught [e repl-env opts]\n  (if (and (instance? IExceptionInfo e)\n           (#{:js-eval-error :js-eval-exception} (:type (ex-data e))))\n    (let [{:keys [type repl-env error form js]} (ex-data e)]\n      (case type\n        :js-eval-error\n        (display-error repl-env error form opts)\n\n        :js-eval-exception\n        (display-error repl-env error form\n          (if (:repl-verbose opts)\n            #(prn \"Error evaluating:\" form :as js)\n            (constantly nil))\n          opts)))\n    (.printStackTrace e *err*)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/clj/cljs/repl.clj",
          :lines [696 710]},
 :full-name "cljs.repl/repl-caught",
 :full-name-encode "cljs.repl/repl-caught",
 :history [["+" "0.0-2911"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl-caught"]))
```

-->
