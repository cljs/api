## letfn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2322/src/clj/cljs/analyzer.clj#L764-L808):

```clj
(defmethod parse 'letfn*
  [op env [_ bindings & exprs :as form] name _]
  (when-not (and (vector? bindings) (even? (count bindings))) 
    (throw (error env "bindings must be vector of even number of elements")))
  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))
        names    (keys n->fexpr)
        context  (:context env)
        ;; first pass to collect information for recursive references
        [meth-env bes]
        (reduce (fn [[{:keys [locals] :as env} bes] n]
                  (let [ret-tag (-> n meta :tag)
                        fexpr (no-warn (analyze env (n->fexpr n)))
                        be (cond->
                             {:name n
                              :fn-var true
                              :line (get-line n env)
                              :column (get-col n env)
                              :local true
                              :shadow (locals n)
                              :variadic (:variadic fexpr)
                              :max-fixed-arity (:max-fixed-arity fexpr)
                              :method-params (map :params (:methods fexpr))
                              :methods (:methods fexpr)}
                             ret-tag (assoc :ret-tag ret-tag))]
                    [(assoc-in env [:locals n] be)
                     (conj bes be)]))
                [env []] names)
        meth-env (assoc meth-env :context :expr)
        ;; the real pass
        [meth-env bes]
        (reduce (fn [[meth-env bes] {:keys [name shadow] :as be}]
                  (let [env (assoc-in meth-env [:locals name] shadow)
                        fexpr (analyze env (n->fexpr name))
                        be' (assoc be
                              :init fexpr
                              :variadic (:variadic fexpr)
                              :max-fixed-arity (:max-fixed-arity fexpr)
                              :method-params (map :params (:methods fexpr))
                              :methods (:methods fexpr))]
                    [(assoc-in env [:locals name] be')
                     (conj bes be')]))
          [meth-env []] bes)
        expr (analyze (assoc meth-env :context (if (= :expr context) :return context)) `(do ~@exprs))]
    {:env env :op :letfn :bindings bes :expr expr :form form
     :children (conj (vec (map :init bes)) expr)}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2322
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:764-808](https://github.com/clojure/clojurescript/blob/r2322/src/clj/cljs/analyzer.clj#L764-L808)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/letfnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "letfn*",
 :type "special form",
 :source {:code "(defmethod parse 'letfn*\n  [op env [_ bindings & exprs :as form] name _]\n  (when-not (and (vector? bindings) (even? (count bindings))) \n    (throw (error env \"bindings must be vector of even number of elements\")))\n  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))\n        names    (keys n->fexpr)\n        context  (:context env)\n        ;; first pass to collect information for recursive references\n        [meth-env bes]\n        (reduce (fn [[{:keys [locals] :as env} bes] n]\n                  (let [ret-tag (-> n meta :tag)\n                        fexpr (no-warn (analyze env (n->fexpr n)))\n                        be (cond->\n                             {:name n\n                              :fn-var true\n                              :line (get-line n env)\n                              :column (get-col n env)\n                              :local true\n                              :shadow (locals n)\n                              :variadic (:variadic fexpr)\n                              :max-fixed-arity (:max-fixed-arity fexpr)\n                              :method-params (map :params (:methods fexpr))\n                              :methods (:methods fexpr)}\n                             ret-tag (assoc :ret-tag ret-tag))]\n                    [(assoc-in env [:locals n] be)\n                     (conj bes be)]))\n                [env []] names)\n        meth-env (assoc meth-env :context :expr)\n        ;; the real pass\n        [meth-env bes]\n        (reduce (fn [[meth-env bes] {:keys [name shadow] :as be}]\n                  (let [env (assoc-in meth-env [:locals name] shadow)\n                        fexpr (analyze env (n->fexpr name))\n                        be' (assoc be\n                              :init fexpr\n                              :variadic (:variadic fexpr)\n                              :max-fixed-arity (:max-fixed-arity fexpr)\n                              :method-params (map :params (:methods fexpr))\n                              :methods (:methods fexpr))]\n                    [(assoc-in env [:locals name] be')\n                     (conj bes be')]))\n          [meth-env []] bes)\n        expr (analyze (assoc meth-env :context (if (= :expr context) :return context)) `(do ~@exprs))]\n    {:env env :op :letfn :bindings bes :expr expr :form form\n     :children (conj (vec (map :init bes)) expr)}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2322",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [764 808]},
 :full-name "special/letfn*",
 :full-name-encode "special/letfnSTAR",
 :history [["+" "0.0-1236"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/letfn*"]))
```

-->
