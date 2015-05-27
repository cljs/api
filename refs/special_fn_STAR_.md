## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/fn\*

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:382-431](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L382-L431)</ins>
</pre>

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        locals (:locals env)
        locals (if name (assoc locals name {:name name :shadow (locals name)}) locals)
        type (-> form meta ::type)
        fields (-> form meta ::fields)
        protocol-impl (-> form meta :protocol-impl)
        protocol-inline (-> form meta :protocol-inline)
        locals (reduce (fn [m fld]
                         (assoc m fld
                                {:name fld
                                 :field true
                                 :mutable (-> fld meta :mutable)
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
                            :fn-var true
                            :variadic variadic
                            :max-fixed-arity max-fixed-arity
                            :method-params (map :params methods))
                 locals)
        methods (if name
                  ;; a second pass with knowledge of our function-ness/arity
                  ;; lets us optimize self calls
                  (map #(analyze-fn-method menv locals % type) meths)
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


---

```clj
{:full-name "special/fn*",
 :ns "special",
 :name "fn*",
 :type "special form",
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;;turn (fn [] ...) into (fn ([]...))\n        meths (if (vector? (first meths)) (list meths) meths)\n        locals (:locals env)\n        locals (if name (assoc locals name {:name name :shadow (locals name)}) locals)\n        type (-> form meta ::type)\n        fields (-> form meta ::fields)\n        protocol-impl (-> form meta :protocol-impl)\n        protocol-inline (-> form meta :protocol-inline)\n        locals (reduce (fn [m fld]\n                         (assoc m fld\n                                {:name fld\n                                 :field true\n                                 :mutable (-> fld meta :mutable)\n                                 :tag (-> fld meta :tag)\n                                 :shadow (m fld)}))\n                       locals fields)\n\n        menv (if (> (count meths) 1) (assoc env :context :expr) env)\n        menv (merge menv\n               {:protocol-impl protocol-impl\n                :protocol-inline protocol-inline})\n        methods (map #(analyze-fn-method menv locals % type) meths)\n        max-fixed-arity (apply max (map :max-fixed-arity methods))\n        variadic (boolean (some :variadic methods))\n        locals (if name\n                 (update-in locals [name] assoc\n                            :fn-var true\n                            :variadic variadic\n                            :max-fixed-arity max-fixed-arity\n                            :method-params (map :params methods))\n                 locals)\n        methods (if name\n                  ;; a second pass with knowledge of our function-ness/arity\n                  ;; lets us optimize self calls\n                  (map #(analyze-fn-method menv locals % type) meths)\n                  methods)]\n    ;;todo - validate unique arities, at most one variadic, variadic takes max required args\n    {:env env :op :fn :form form :name name :methods methods :variadic variadic\n     :recur-frames *recur-frames* :loop-lets *loop-lets*\n     :jsdoc [(when variadic \"@param {...*} var_args\")]\n     :max-fixed-arity max-fixed-arity\n     :protocol-impl protocol-impl\n     :protocol-inline protocol-inline\n     :children (vec (mapcat block-children\n                            methods))}))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [382 431],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L382-L431"},
 :full-name-encode "special_fn_STAR_",
 :history [["+" "0.0-927"]]}

```
