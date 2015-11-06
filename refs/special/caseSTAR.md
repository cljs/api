## case\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2227"><img valign="middle" alt="[+] 0.0-2227" title="Added in 0.0-2227" src="https://img.shields.io/badge/+-0.0--2227-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/analyzer.cljc#L973-L991):

```clj
(defmethod parse 'case*
  [op env [_ sym tests thens default :as form] name _]
  (assert (symbol? sym) "case* must switch on symbol")
  (assert (every? vector? tests) "case* tests must be grouped in vectors")
  (let [expr-env (assoc env :context :expr)
        v        (disallowing-recur (analyze expr-env sym))
        tests    (mapv #(mapv (fn [t] (analyze expr-env t)) %) tests)
        thens    (mapv #(analyze env %) thens)
        default  (analyze env default)]
    (assert (every? (fn [t]
                      (or
                        (-> t :info :const)
                        (and (= :constant (:op t))
                             ((some-fn number? string? char?) (:form t)))))
              (apply concat tests))
      "case* tests must be numbers, strings, or constants")
    {:env env :op :case* :form form
     :v v :tests tests :thens thens :default default
     :children (vec (concat [v] tests thens (if default [default])))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:973-991](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/analyzer.cljc#L973-L991)</ins>
</pre>

-->

---




 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/caseSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "case*",
 :type "special form",
 :source {:code "(defmethod parse 'case*\n  [op env [_ sym tests thens default :as form] name _]\n  (assert (symbol? sym) \"case* must switch on symbol\")\n  (assert (every? vector? tests) \"case* tests must be grouped in vectors\")\n  (let [expr-env (assoc env :context :expr)\n        v        (disallowing-recur (analyze expr-env sym))\n        tests    (mapv #(mapv (fn [t] (analyze expr-env t)) %) tests)\n        thens    (mapv #(analyze env %) thens)\n        default  (analyze env default)]\n    (assert (every? (fn [t]\n                      (or\n                        (-> t :info :const)\n                        (and (= :constant (:op t))\n                             ((some-fn number? string? char?) (:form t)))))\n              (apply concat tests))\n      \"case* tests must be numbers, strings, or constants\")\n    {:env env :op :case* :form form\n     :v v :tests tests :thens thens :default default\n     :children (vec (concat [v] tests thens (if default [default])))}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [973 991]},
 :full-name "special/case*",
 :full-name-encode "special/caseSTAR",
 :history [["+" "0.0-2227"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/case*"]))
```

-->
