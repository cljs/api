## do



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/do</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)
</td>
</tr>
</table>


 <samp>
(__do__ exprs\*)<br>
</samp>

---





Source docstring:

```
Evaluates the expressions in order and returns the value of
the last. If no expressions are supplied, returns nil.
```


Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/analyzer.cljc#L1385-L1406):

```clj
(defmethod parse 'do
  [op env [_ & exprs :as form] _ _]
  (let [statements (analyze-do-statements env exprs)]
    (if (<= (count exprs) 1)
      (let [ret      (analyze env (first exprs))
            children (conj (vec statements) ret)]
        {:op :do
         :env env
         :form form
         :statements statements :ret ret
         :children children})
      (let [ret-env  (if (= :statement (:context env))
                       (assoc env :context :statement)
                       (assoc env :context :return))
            ret      (analyze ret-env (last exprs))
            children (conj (vec statements) ret)]
        {:op :do
         :env env
         :form form
         :statements statements
         :ret ret
         :children children}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.58
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:1385-1406](https://github.com/clojure/clojurescript/blob/r1.7.58/src/main/clojure/cljs/analyzer.cljc#L1385-L1406)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/do` @ clojuredocs](http://clojuredocs.org/clojure.core/do)<br>
[`clojure.core/do` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/do/)<br>
[`clojure.core/do` @ crossclj](http://crossclj.info/fun/clojure.core/do.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/do.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "do",
 :signature ["[exprs*]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :full-name-encode "special/do",
 :source {:code "(defmethod parse 'do\n  [op env [_ & exprs :as form] _ _]\n  (let [statements (analyze-do-statements env exprs)]\n    (if (<= (count exprs) 1)\n      (let [ret      (analyze env (first exprs))\n            children (conj (vec statements) ret)]\n        {:op :do\n         :env env\n         :form form\n         :statements statements :ret ret\n         :children children})\n      (let [ret-env  (if (= :statement (:context env))\n                       (assoc env :context :statement)\n                       (assoc env :context :return))\n            ret      (analyze ret-env (last exprs))\n            children (conj (vec statements) ret)]\n        {:op :do\n         :env env\n         :form form\n         :statements statements\n         :ret ret\n         :children children}))))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.58",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [1385 1406]},
 :full-name "special/do",
 :clj-symbol "clojure.core/do",
 :docstring "Evaluates the expressions in order and returns the value of\nthe last. If no expressions are supplied, returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/do"]))
```

-->
