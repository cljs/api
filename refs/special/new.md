## new



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/new</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/new)
</td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/compiler.clj#L1055-L1062):

```clj
(defmethod parse 'new
  [_ env [_ ctor & args :as form] _]
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         ctorexpr (analyze enve ctor)
         argexprs (vec (map #(analyze enve %) args))]
     {:env env :op :new :form form :ctor ctorexpr :args argexprs
      :children (into [ctorexpr] argexprs)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:1055-1062](https://github.com/clojure/clojurescript/blob/r1211/src/clj/cljs/compiler.clj#L1055-L1062)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/new` @ clojuredocs](http://clojuredocs.org/clojure.core/new)<br>
[`clojure.core/new` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/new/)<br>
[`clojure.core/new` @ crossclj](http://crossclj.info/fun/clojure.core/new.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/new.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "new",
 :type "special form",
 :source {:code "(defmethod parse 'new\n  [_ env [_ ctor & args :as form] _]\n  (disallowing-recur\n   (let [enve (assoc env :context :expr)\n         ctorexpr (analyze enve ctor)\n         argexprs (vec (map #(analyze enve %) args))]\n     {:env env :op :new :form form :ctor ctorexpr :args argexprs\n      :children (into [ctorexpr] argexprs)})))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/clj/cljs/compiler.clj",
          :lines [1055 1062]},
 :full-name "special/new",
 :full-name-encode "special/new",
 :clj-symbol "clojure.core/new",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/new"]))
```

-->
