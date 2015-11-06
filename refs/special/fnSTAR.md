## fn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/analyzer.clj#L640-L710):

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        locals (:locals env)
        name-var (if name
                   (merge
                     {:name name
                      :info {:shadow (or (locals name)
                                       (get-in env [:js-globals name]))}}
                     (when-let [tag (-> name meta :tag)]
                       {:tag tag}))) 
        locals (if (and locals name) (assoc locals name name-var) locals)
        type (-> form meta ::type)
        fields (-> form meta ::fields)
        protocol-impl (-> form meta :protocol-impl)
        protocol-inline (-> form meta :protocol-inline)
        locals (reduce (fn [m fld]
                         (assoc m fld
                                {:name fld
                                 :line (get-line fld env)
                                 :column (get-col fld env)
                                 :field true
                                 :mutable (-> fld meta :mutable)
                                 :unsynchronized-mutable (-> fld meta :unsynchronized-mutable)
                                 :volatile-mutable (-> fld meta :volatile-mutable)
                                 :tag (-> fld meta :tag)
                                 :shadow (m fld)}))
                       locals fields)

        menv (if (> (count meths) 1) (assoc env :context :expr) env)
        menv (merge menv
               {:protocol-impl protocol-impl
                :protocol-inline protocol-inline})
        methods (map #(analyze-fn-method menv locals % type) meths)
        max-fixed-arity (apply max (map :max-fixed-arity methods))
        variadic (boolean (some :variadic methods))
        locals (if name
                 (update-in locals [name] assoc
                   ;; TODO: can we simplify? - David
                   :fn-var true
                   :variadic variadic
                   :max-fixed-arity max-fixed-arity
                   :method-params (map :params methods)
                   :methods methods)
                 locals)
        methods (if name
                  ;; a second pass with knowledge of our function-ness/arity
                  ;; lets us optimize self calls
                  (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))
                  methods)]
    (let [variadic-methods (filter :variadic methods)
          variadic-params (count (:params (first variadic-methods)))
          param-counts (map (comp count :params) methods)]
      (when (and (:multiple-variadic-overloads *cljs-warnings*) (< 1 (count variadic-methods)))
        (warning :multiple-variadic-overloads env {:name name-var}))
      (when (and (:variadic-max-arity *cljs-warnings*)
                 (not (or (zero? variadic-params) (= variadic-params (+ 1 max-fixed-arity)))))
        (warning :variadic-max-arity env {:name name-var}))
      (when (and (:overload-arity *cljs-warnings*) (not= (distinct param-counts) param-counts))
        (warning :overload-arity env {:name name-var})))
    {:env env :op :fn :form form :name name-var :methods methods :variadic variadic
     :recur-frames *recur-frames* :loop-lets *loop-lets*
     :jsdoc [(when variadic "@param {...*} var_args")]
     :max-fixed-arity max-fixed-arity
     :protocol-impl protocol-impl
     :protocol-inline protocol-inline
     :children (mapv :expr methods)}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:640-710](https://github.com/clojure/clojurescript/blob/r2067/src/clj/cljs/analyzer.clj#L640-L710)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "special",
 :name "fn*",
 :type "special form",
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;;turn (fn [] ...) into (fn ([]...))\n        meths (if (vector? (first meths)) (list meths) meths)\n        locals (:locals env)\n        name-var (if name\n                   (merge\n                     {:name name\n                      :info {:shadow (or (locals name)\n                                       (get-in env [:js-globals name]))}}\n                     (when-let [tag (-> name meta :tag)]\n                       {:tag tag}))) \n        locals (if (and locals name) (assoc locals name name-var) locals)\n        type (-> form meta ::type)\n        fields (-> form meta ::fields)\n        protocol-impl (-> form meta :protocol-impl)\n        protocol-inline (-> form meta :protocol-inline)\n        locals (reduce (fn [m fld]\n                         (assoc m fld\n                                {:name fld\n                                 :line (get-line fld env)\n                                 :column (get-col fld env)\n                                 :field true\n                                 :mutable (-> fld meta :mutable)\n                                 :unsynchronized-mutable (-> fld meta :unsynchronized-mutable)\n                                 :volatile-mutable (-> fld meta :volatile-mutable)\n                                 :tag (-> fld meta :tag)\n                                 :shadow (m fld)}))\n                       locals fields)\n\n        menv (if (> (count meths) 1) (assoc env :context :expr) env)\n        menv (merge menv\n               {:protocol-impl protocol-impl\n                :protocol-inline protocol-inline})\n        methods (map #(analyze-fn-method menv locals % type) meths)\n        max-fixed-arity (apply max (map :max-fixed-arity methods))\n        variadic (boolean (some :variadic methods))\n        locals (if name\n                 (update-in locals [name] assoc\n                   ;; TODO: can we simplify? - David\n                   :fn-var true\n                   :variadic variadic\n                   :max-fixed-arity max-fixed-arity\n                   :method-params (map :params methods)\n                   :methods methods)\n                 locals)\n        methods (if name\n                  ;; a second pass with knowledge of our function-ness/arity\n                  ;; lets us optimize self calls\n                  (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))\n                  methods)]\n    (let [variadic-methods (filter :variadic methods)\n          variadic-params (count (:params (first variadic-methods)))\n          param-counts (map (comp count :params) methods)]\n      (when (and (:multiple-variadic-overloads *cljs-warnings*) (< 1 (count variadic-methods)))\n        (warning :multiple-variadic-overloads env {:name name-var}))\n      (when (and (:variadic-max-arity *cljs-warnings*)\n                 (not (or (zero? variadic-params) (= variadic-params (+ 1 max-fixed-arity)))))\n        (warning :variadic-max-arity env {:name name-var}))\n      (when (and (:overload-arity *cljs-warnings*) (not= (distinct param-counts) param-counts))\n        (warning :overload-arity env {:name name-var})))\n    {:env env :op :fn :form form :name name-var :methods methods :variadic variadic\n     :recur-frames *recur-frames* :loop-lets *loop-lets*\n     :jsdoc [(when variadic \"@param {...*} var_args\")]\n     :max-fixed-arity max-fixed-arity\n     :protocol-impl protocol-impl\n     :protocol-inline protocol-inline\n     :children (mapv :expr methods)}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [640 710]},
 :full-name "special/fn*",
 :full-name-encode "special/fnSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/fn*"]))
```

-->
