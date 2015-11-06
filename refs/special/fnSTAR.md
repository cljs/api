## fn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L742-L760):

```clj
(defmethod parse 'fn*
  [op env [_ & args] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        mname (when name (munge name))
        locals (:locals env)
        locals (if name (assoc locals name {:name mname}) locals)
        menv (if (> (count meths) 1) (assoc env :context :expr) env)
        methods (map #(analyze-fn-method menv locals %) meths)
        max-fixed-arity (apply max (map :max-fixed-arity methods))
        variadic (boolean (some :variadic methods))]
    ;;todo - validate unique arities, at most one variadic, variadic takes max required args
    {:env env :op :fn :name mname :methods methods :variadic variadic
     :recur-frames *recur-frames* :loop-lets *loop-lets*
     :jsdoc [(when variadic "@param {...*} var_args")]
     :max-fixed-arity max-fixed-arity}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:742-760](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L742-L760)</ins>
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
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args] name]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;;turn (fn [] ...) into (fn ([]...))\n        meths (if (vector? (first meths)) (list meths) meths)\n        mname (when name (munge name))\n        locals (:locals env)\n        locals (if name (assoc locals name {:name mname}) locals)\n        menv (if (> (count meths) 1) (assoc env :context :expr) env)\n        methods (map #(analyze-fn-method menv locals %) meths)\n        max-fixed-arity (apply max (map :max-fixed-arity methods))\n        variadic (boolean (some :variadic methods))]\n    ;;todo - validate unique arities, at most one variadic, variadic takes max required args\n    {:env env :op :fn :name mname :methods methods :variadic variadic\n     :recur-frames *recur-frames* :loop-lets *loop-lets*\n     :jsdoc [(when variadic \"@param {...*} var_args\")]\n     :max-fixed-arity max-fixed-arity}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r993",
          :filename "src/clj/cljs/compiler.clj",
          :lines [742 760]},
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
