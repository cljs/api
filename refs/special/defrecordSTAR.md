## defrecord\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L862-L873):

```clj
(defmethod parse 'defrecord*
  [_ env [_ tsym fields] _]
  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {}) :name t)]
               (if-let [line (:line env)]
                 (-> m
                     (assoc :file *cljs-file*)
                     (assoc :line line))
                 m))))
    {:env env :op :defrecord* :t t :fields fields}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:862-873](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L862-L873)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/defrecordSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env [_ tsym fields] _]\n  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]\n    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {}) :name t)]\n               (if-let [line (:line env)]\n                 (-> m\n                     (assoc :file *cljs-file*)\n                     (assoc :line line))\n                 m))))\n    {:env env :op :defrecord* :t t :fields fields}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/clj/cljs/compiler.clj",
          :lines [862 873]},
 :full-name "special/defrecord*",
 :full-name-encode "special/defrecordSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/defrecord*"]))
```

-->
