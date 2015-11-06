## letfn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L433-L457):

```clj
(defmethod parse 'letfn*
  [op env [_ bindings & exprs :as form] name]
  (assert (and (vector? bindings) (even? (count bindings))) "bindings must be vector of even number of elements")
  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))
        names    (keys n->fexpr)
        context  (:context env)
        [meth-env bes]
        (reduce (fn [[{:keys [locals] :as env} bes] n]
                  (let [be {:name   n
                            :tag    (-> n meta :tag)
                            :local  true
                            :shadow (locals n)}]
                    [(assoc-in env [:locals n] be)
                     (conj bes be)]))
                [env []] names)
        meth-env (assoc meth-env :context :expr)
        bes (vec (map (fn [{:keys [name shadow] :as be}]
                        (let [env (assoc-in meth-env [:locals name] shadow)]
                          (assoc be :init (analyze env (n->fexpr name)))))
                      bes))
        {:keys [statements ret]}
        (analyze-block (assoc meth-env :context (if (= :expr context) :return context)) exprs)]
    {:env env :op :letfn :bindings bes :statements statements :ret ret :form form
     :children (into (vec (map :init bes))
                     (conj (vec statements) ret))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:433-457](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L433-L457)</ins>
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
 :source {:code "(defmethod parse 'letfn*\n  [op env [_ bindings & exprs :as form] name]\n  (assert (and (vector? bindings) (even? (count bindings))) \"bindings must be vector of even number of elements\")\n  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))\n        names    (keys n->fexpr)\n        context  (:context env)\n        [meth-env bes]\n        (reduce (fn [[{:keys [locals] :as env} bes] n]\n                  (let [be {:name   n\n                            :tag    (-> n meta :tag)\n                            :local  true\n                            :shadow (locals n)}]\n                    [(assoc-in env [:locals n] be)\n                     (conj bes be)]))\n                [env []] names)\n        meth-env (assoc meth-env :context :expr)\n        bes (vec (map (fn [{:keys [name shadow] :as be}]\n                        (let [env (assoc-in meth-env [:locals name] shadow)]\n                          (assoc be :init (analyze env (n->fexpr name)))))\n                      bes))\n        {:keys [statements ret]}\n        (analyze-block (assoc meth-env :context (if (= :expr context) :return context)) exprs)]\n    {:env env :op :letfn :bindings bes :statements statements :ret ret :form form\n     :children (into (vec (map :init bes))\n                     (conj (vec statements) ret))}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [433 457]},
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