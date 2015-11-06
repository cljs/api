## fn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/analyzer.clj#L377-L422):

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        locals (:locals env)
        locals (if name (assoc locals name {:name name}) locals)
        fields (-> form meta ::fields)
        protocol-impl (-> form meta :protocol-impl)
        protocol-inline (-> form meta :protocol-inline)
        gthis (and fields (gensym "this__"))
        locals (reduce (fn [m fld]
                         (assoc m fld
                                {:name (symbol (str gthis "." fld))
                                 :field true
                                 :mutable (-> fld meta :mutable)
                                 :tag (-> fld meta :tag)}))
                       locals fields)

        menv (if (> (count meths) 1) (assoc env :context :expr) env)
        menv (merge menv
               {:protocol-impl protocol-impl
                :protocol-inline protocol-inline})
        methods (map #(analyze-fn-method menv locals % gthis) meths)
        max-fixed-arity (apply max (map :max-fixed-arity methods))
        variadic (boolean (some :variadic methods))
        locals (if name (assoc locals name {:name name :fn-var true
                                            :variadic variadic
                                            :max-fixed-arity max-fixed-arity
                                            :method-params (map :params methods)}))
        methods (if name
                  ;; a second pass with knowledge of our function-ness/arity
                  ;; lets us optimize self calls
                  (map #(analyze-fn-method menv locals % gthis) meths)
                  methods)]
    ;;todo - validate unique arities, at most one variadic, variadic takes max required args
    {:env env :op :fn :form form :name name :methods methods :variadic variadic
     :recur-frames *recur-frames* :loop-lets *loop-lets*
     :jsdoc [(when variadic "@param {...*} var_args")]
     :max-fixed-arity max-fixed-arity
     :protocol-impl protocol-impl
     :protocol-inline protocol-inline
     :children (vec (mapcat block-children
                            methods))}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:377-422](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/analyzer.clj#L377-L422)</ins>
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
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;;turn (fn [] ...) into (fn ([]...))\n        meths (if (vector? (first meths)) (list meths) meths)\n        locals (:locals env)\n        locals (if name (assoc locals name {:name name}) locals)\n        fields (-> form meta ::fields)\n        protocol-impl (-> form meta :protocol-impl)\n        protocol-inline (-> form meta :protocol-inline)\n        gthis (and fields (gensym \"this__\"))\n        locals (reduce (fn [m fld]\n                         (assoc m fld\n                                {:name (symbol (str gthis \".\" fld))\n                                 :field true\n                                 :mutable (-> fld meta :mutable)\n                                 :tag (-> fld meta :tag)}))\n                       locals fields)\n\n        menv (if (> (count meths) 1) (assoc env :context :expr) env)\n        menv (merge menv\n               {:protocol-impl protocol-impl\n                :protocol-inline protocol-inline})\n        methods (map #(analyze-fn-method menv locals % gthis) meths)\n        max-fixed-arity (apply max (map :max-fixed-arity methods))\n        variadic (boolean (some :variadic methods))\n        locals (if name (assoc locals name {:name name :fn-var true\n                                            :variadic variadic\n                                            :max-fixed-arity max-fixed-arity\n                                            :method-params (map :params methods)}))\n        methods (if name\n                  ;; a second pass with knowledge of our function-ness/arity\n                  ;; lets us optimize self calls\n                  (map #(analyze-fn-method menv locals % gthis) meths)\n                  methods)]\n    ;;todo - validate unique arities, at most one variadic, variadic takes max required args\n    {:env env :op :fn :form form :name name :methods methods :variadic variadic\n     :recur-frames *recur-frames* :loop-lets *loop-lets*\n     :jsdoc [(when variadic \"@param {...*} var_args\")]\n     :max-fixed-arity max-fixed-arity\n     :protocol-impl protocol-impl\n     :protocol-inline protocol-inline\n     :children (vec (mapcat block-children\n                            methods))}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/analyzer.clj",
          :lines [377 422]},
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
