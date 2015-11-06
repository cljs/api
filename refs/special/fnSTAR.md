## fn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/analyzer.cljc#L980-L1044):

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name _]
  (analyze-wrap-meta
   (let [[name meths] (if (symbol? (first args))
                        [(first args) (next args)]
                        [name (seq args)])
         ;;turn (fn [] ...) into (fn ([]...))
         meths (if (vector? (first meths)) (list meths) meths)
         locals (:locals env)
         name-var (if name
                    (merge
                      {:name name
                       :info {:fn-self-name true
                              :fn-scope (:fn-scope env)
                              :ns (-> env :ns :name)
                              :shadow (or (locals name)
                                          (get-in env [:js-globals name]))}}
                     (when-let [tag (-> name meta :tag)]
                       {:ret-tag tag})))
         env (if name
               (update-in env [:fn-scope] conj name-var)
               env)
         locals (if (and locals name) (assoc locals name name-var) locals)
         type (-> form meta ::type)
         protocol-impl (-> form meta ::protocol-impl)
         protocol-inline (-> form meta ::protocol-inline)
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
                             :method-params (map :params methods))
                  locals)
         methods (if name
                   ;; a second pass with knowledge of our function-ness/arity
                   ;; lets us optimize self calls
                   (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))
                   methods)
         form (vary-meta form dissoc ::protocol-impl ::protocol-inline ::type)]
     (let [variadic-methods (filter :variadic methods)
           variadic-params (count (:params (first variadic-methods)))
           param-counts (map (comp count :params) methods)]
       (when (< 1 (count variadic-methods))
         (warning :multiple-variadic-overloads env {:name name-var}))
       (when (not (or (zero? variadic-params) (= variadic-params (+ 1 max-fixed-arity))))
         (warning :variadic-max-arity env {:name name-var}))
       (when (not= (distinct param-counts) param-counts)
         (warning :overload-arity env {:name name-var})))
     {:env env
      :op :fn :form form :name name-var :methods methods :variadic variadic
      :tag 'function
      :recur-frames *recur-frames* :loop-lets *loop-lets*
      :jsdoc [(when variadic "@param {...*} var_args")]
      :max-fixed-arity max-fixed-arity
      :protocol-impl protocol-impl
      :protocol-inline protocol-inline
      :children (mapv :expr methods)})))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:980-1044](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/analyzer.cljc#L980-L1044)</ins>
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
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name _]\n  (analyze-wrap-meta\n   (let [[name meths] (if (symbol? (first args))\n                        [(first args) (next args)]\n                        [name (seq args)])\n         ;;turn (fn [] ...) into (fn ([]...))\n         meths (if (vector? (first meths)) (list meths) meths)\n         locals (:locals env)\n         name-var (if name\n                    (merge\n                      {:name name\n                       :info {:fn-self-name true\n                              :fn-scope (:fn-scope env)\n                              :ns (-> env :ns :name)\n                              :shadow (or (locals name)\n                                          (get-in env [:js-globals name]))}}\n                     (when-let [tag (-> name meta :tag)]\n                       {:ret-tag tag})))\n         env (if name\n               (update-in env [:fn-scope] conj name-var)\n               env)\n         locals (if (and locals name) (assoc locals name name-var) locals)\n         type (-> form meta ::type)\n         protocol-impl (-> form meta ::protocol-impl)\n         protocol-inline (-> form meta ::protocol-inline)\n         menv (if (> (count meths) 1) (assoc env :context :expr) env)\n         menv (merge menv\n                     {:protocol-impl protocol-impl\n                      :protocol-inline protocol-inline})\n         methods (map #(analyze-fn-method menv locals % type) meths)\n         max-fixed-arity (apply max (map :max-fixed-arity methods))\n         variadic (boolean (some :variadic methods))\n         locals (if name\n                  (update-in locals [name] assoc\n                             ;; TODO: can we simplify? - David\n                             :fn-var true\n                             :variadic variadic\n                             :max-fixed-arity max-fixed-arity\n                             :method-params (map :params methods))\n                  locals)\n         methods (if name\n                   ;; a second pass with knowledge of our function-ness/arity\n                   ;; lets us optimize self calls\n                   (no-warn (doall (map #(analyze-fn-method menv locals % type) meths)))\n                   methods)\n         form (vary-meta form dissoc ::protocol-impl ::protocol-inline ::type)]\n     (let [variadic-methods (filter :variadic methods)\n           variadic-params (count (:params (first variadic-methods)))\n           param-counts (map (comp count :params) methods)]\n       (when (< 1 (count variadic-methods))\n         (warning :multiple-variadic-overloads env {:name name-var}))\n       (when (not (or (zero? variadic-params) (= variadic-params (+ 1 max-fixed-arity))))\n         (warning :variadic-max-arity env {:name name-var}))\n       (when (not= (distinct param-counts) param-counts)\n         (warning :overload-arity env {:name name-var})))\n     {:env env\n      :op :fn :form form :name name-var :methods methods :variadic variadic\n      :tag 'function\n      :recur-frames *recur-frames* :loop-lets *loop-lets*\n      :jsdoc [(when variadic \"@param {...*} var_args\")]\n      :max-fixed-arity max-fixed-arity\n      :protocol-impl protocol-impl\n      :protocol-inline protocol-inline\n      :children (mapv :expr methods)})))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [980 1044]},
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
