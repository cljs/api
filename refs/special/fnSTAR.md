## fn\*



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/analyzer.cljc#L1252-L1323):

```clj
(defmethod parse 'fn*
  [op env [_ & args :as form] name _]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;; turn (fn [] ...) into (fn ([]...))
        meths        (if (vector? (first meths))
                       (list meths)
                       meths)
        locals       (:locals env)
        name-var     (fn-name-var env locals name)
        env          (if-not (nil? name)
                       (update-in env [:fn-scope] conj name-var)
                       env)
        locals       (if (and (not (nil? locals))
                              (not (nil? name)))
                       (assoc locals name name-var)
                       locals)
        form-meta    (meta form)
        type         (::type form-meta)
        proto-impl   (::protocol-impl form-meta)
        proto-inline (::protocol-inline form-meta)
        menv         (if (> (count meths) 1)
                       (assoc env :context :expr)
                       env)
        menv         (merge menv
                       {:protocol-impl proto-impl
                        :protocol-inline proto-inline})
        methods      (map #(analyze-fn-method menv locals % type) meths)
        mfa          (apply max (map :max-fixed-arity methods))
        variadic     (boolean (some :variadic methods))
        locals       (if-not (nil? name)
                       (update-in locals [name] assoc
                         ;; TODO: can we simplify? - David
                         :fn-var true
                         :variadic variadic
                         :max-fixed-arity mfa
                         :method-params (map :params methods))
                       locals)
        methods      (if-not (nil? name)
                       ;; a second pass with knowledge of our function-ness/arity
                       ;; lets us optimize self calls
                       (analyze-fn-methods-pass2 menv locals type meths)
                       methods)
        form         (vary-meta form dissoc ::protocol-impl ::protocol-inline ::type)
        js-doc       (when (true? variadic)
                       "@param {...*} var_args")
        children     (mapv :expr methods)
        ast          {:op :fn
                      :env env
                      :form form
                      :name name-var
                      :methods methods
                      :variadic variadic
                      :tag 'function
                      :recur-frames *recur-frames*
                      :loop-lets *loop-lets*
                      :jsdoc [js-doc]
                      :max-fixed-arity mfa
                      :protocol-impl proto-impl
                      :protocol-inline proto-inline
                      :children children}]
    (let [variadic-methods (filter :variadic methods)
          variadic-params  (count (:params (first variadic-methods)))
          param-counts     (map (comp count :params) methods)]
      (when (< 1 (count variadic-methods))
        (warning :multiple-variadic-overloads env {:name name-var}))
      (when (not (or (zero? variadic-params) (== variadic-params (+ 1 mfa))))
        (warning :variadic-max-arity env {:name name-var}))
      (when (not= (distinct param-counts) param-counts)
        (warning :overload-arity env {:name name-var})))
    (analyze-wrap-meta ast)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[analyzer.cljc:1252-1323](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/analyzer.cljc#L1252-L1323)</ins>
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
 :source {:code "(defmethod parse 'fn*\n  [op env [_ & args :as form] name _]\n  (let [[name meths] (if (symbol? (first args))\n                       [(first args) (next args)]\n                       [name (seq args)])\n        ;; turn (fn [] ...) into (fn ([]...))\n        meths        (if (vector? (first meths))\n                       (list meths)\n                       meths)\n        locals       (:locals env)\n        name-var     (fn-name-var env locals name)\n        env          (if-not (nil? name)\n                       (update-in env [:fn-scope] conj name-var)\n                       env)\n        locals       (if (and (not (nil? locals))\n                              (not (nil? name)))\n                       (assoc locals name name-var)\n                       locals)\n        form-meta    (meta form)\n        type         (::type form-meta)\n        proto-impl   (::protocol-impl form-meta)\n        proto-inline (::protocol-inline form-meta)\n        menv         (if (> (count meths) 1)\n                       (assoc env :context :expr)\n                       env)\n        menv         (merge menv\n                       {:protocol-impl proto-impl\n                        :protocol-inline proto-inline})\n        methods      (map #(analyze-fn-method menv locals % type) meths)\n        mfa          (apply max (map :max-fixed-arity methods))\n        variadic     (boolean (some :variadic methods))\n        locals       (if-not (nil? name)\n                       (update-in locals [name] assoc\n                         ;; TODO: can we simplify? - David\n                         :fn-var true\n                         :variadic variadic\n                         :max-fixed-arity mfa\n                         :method-params (map :params methods))\n                       locals)\n        methods      (if-not (nil? name)\n                       ;; a second pass with knowledge of our function-ness/arity\n                       ;; lets us optimize self calls\n                       (analyze-fn-methods-pass2 menv locals type meths)\n                       methods)\n        form         (vary-meta form dissoc ::protocol-impl ::protocol-inline ::type)\n        js-doc       (when (true? variadic)\n                       \"@param {...*} var_args\")\n        children     (mapv :expr methods)\n        ast          {:op :fn\n                      :env env\n                      :form form\n                      :name name-var\n                      :methods methods\n                      :variadic variadic\n                      :tag 'function\n                      :recur-frames *recur-frames*\n                      :loop-lets *loop-lets*\n                      :jsdoc [js-doc]\n                      :max-fixed-arity mfa\n                      :protocol-impl proto-impl\n                      :protocol-inline proto-inline\n                      :children children}]\n    (let [variadic-methods (filter :variadic methods)\n          variadic-params  (count (:params (first variadic-methods)))\n          param-counts     (map (comp count :params) methods)]\n      (when (< 1 (count variadic-methods))\n        (warning :multiple-variadic-overloads env {:name name-var}))\n      (when (not (or (zero? variadic-params) (== variadic-params (+ 1 mfa))))\n        (warning :variadic-max-arity env {:name name-var}))\n      (when (not= (distinct param-counts) param-counts)\n        (warning :overload-arity env {:name name-var})))\n    (analyze-wrap-meta ast)))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/clojure/cljs/analyzer.cljc",
          :lines [1252 1323]},
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
