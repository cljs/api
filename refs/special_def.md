## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/def

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/def</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/def)
</td>
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
            └── <ins>[analyzer.clj:293-361](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L293-L361)</ins>
</pre>

```clj
(defmethod parse 'def
  [op env form name]
  (let [pfn (fn
              ([_ sym] {:sym sym})
              ([_ sym init] {:sym sym :init init})
              ([_ sym doc init] {:sym sym :doc doc :init init}))
        args (apply pfn form)
        sym (:sym args)
        sym-meta (meta sym)
        tag (-> sym meta :tag)
        protocol (-> sym meta :protocol)
        dynamic (-> sym meta :dynamic)
        ns-name (-> env :ns :name)]
    (assert (not (namespace sym)) "Can't def ns-qualified name")
    (let [env (if (or (and (not= ns-name 'cljs.core)
                           (core-name? env sym))
                      (get-in @namespaces [ns-name :uses sym]))
                (let [ev (resolve-existing-var (dissoc env :locals) sym)]
                  (when *cljs-warn-on-redef*
                    (warning env
                      (str "WARNING: " sym " already refers to: " (symbol (str (:ns ev)) (str sym))
                           " being replaced by: " (symbol (str ns-name) (str sym)))))
                  (swap! namespaces update-in [ns-name :excludes] conj sym)
                  (update-in env [:ns :excludes] conj sym))
                env)
          name (:name (resolve-var (dissoc env :locals) sym))
          init-expr (when (contains? args :init)
                      (disallowing-recur
                       (analyze (assoc env :context :expr) (:init args) sym)))
          fn-var? (and init-expr (= (:op init-expr) :fn))
          export-as (when-let [export-val (-> sym meta :export)]
                      (if (= true export-val) name export-val))
          doc (or (:doc args) (-> sym meta :doc))]
      (when-let [v (get-in @namespaces [ns-name :defs sym])]
        (when (and *cljs-warn-on-fn-var*
                   (not (-> sym meta :declared))
                   (and (:fn-var v) (not fn-var?)))
          (warning env
            (str "WARNING: " (symbol (str ns-name) (str sym))
                 " no longer fn, references are stale"))))
      (swap! namespaces assoc-in [ns-name :defs sym]
                 (merge 
                   {:name name}
                   sym-meta
                   (when doc {:doc doc})
                   (when dynamic {:dynamic true})
                   (when-let [line (:line env)]
                     {:file *cljs-file* :line line})
                   ;; the protocol a protocol fn belongs to
                   (when protocol
                     {:protocol protocol})
                   ;; symbol for reified protocol
                   (when-let [protocol-symbol (-> sym meta :protocol-symbol)]
                     {:protocol-symbol protocol-symbol})
                   (when fn-var?
                     {:fn-var true
                      ;; protocol implementation context
                      :protocol-impl (:protocol-impl init-expr)
                      ;; inline protocol implementation context
                      :protocol-inline (:protocol-inline init-expr)
                      :variadic (:variadic init-expr)
                      :max-fixed-arity (:max-fixed-arity init-expr)
                      :method-params (map :params (:methods init-expr))})))
      (merge {:env env :op :def :form form
              :name name :doc doc :init init-expr}
             (when tag {:tag tag})
             (when dynamic {:dynamic true})
             (when export-as {:export export-as})
             (when init-expr {:children [init-expr]})))))
```


---

```clj
{:full-name "special/def",
 :ns "special",
 :name "def",
 :type "special form",
 :source {:code "(defmethod parse 'def\n  [op env form name]\n  (let [pfn (fn\n              ([_ sym] {:sym sym})\n              ([_ sym init] {:sym sym :init init})\n              ([_ sym doc init] {:sym sym :doc doc :init init}))\n        args (apply pfn form)\n        sym (:sym args)\n        sym-meta (meta sym)\n        tag (-> sym meta :tag)\n        protocol (-> sym meta :protocol)\n        dynamic (-> sym meta :dynamic)\n        ns-name (-> env :ns :name)]\n    (assert (not (namespace sym)) \"Can't def ns-qualified name\")\n    (let [env (if (or (and (not= ns-name 'cljs.core)\n                           (core-name? env sym))\n                      (get-in @namespaces [ns-name :uses sym]))\n                (let [ev (resolve-existing-var (dissoc env :locals) sym)]\n                  (when *cljs-warn-on-redef*\n                    (warning env\n                      (str \"WARNING: \" sym \" already refers to: \" (symbol (str (:ns ev)) (str sym))\n                           \" being replaced by: \" (symbol (str ns-name) (str sym)))))\n                  (swap! namespaces update-in [ns-name :excludes] conj sym)\n                  (update-in env [:ns :excludes] conj sym))\n                env)\n          name (:name (resolve-var (dissoc env :locals) sym))\n          init-expr (when (contains? args :init)\n                      (disallowing-recur\n                       (analyze (assoc env :context :expr) (:init args) sym)))\n          fn-var? (and init-expr (= (:op init-expr) :fn))\n          export-as (when-let [export-val (-> sym meta :export)]\n                      (if (= true export-val) name export-val))\n          doc (or (:doc args) (-> sym meta :doc))]\n      (when-let [v (get-in @namespaces [ns-name :defs sym])]\n        (when (and *cljs-warn-on-fn-var*\n                   (not (-> sym meta :declared))\n                   (and (:fn-var v) (not fn-var?)))\n          (warning env\n            (str \"WARNING: \" (symbol (str ns-name) (str sym))\n                 \" no longer fn, references are stale\"))))\n      (swap! namespaces assoc-in [ns-name :defs sym]\n                 (merge \n                   {:name name}\n                   sym-meta\n                   (when doc {:doc doc})\n                   (when dynamic {:dynamic true})\n                   (when-let [line (:line env)]\n                     {:file *cljs-file* :line line})\n                   ;; the protocol a protocol fn belongs to\n                   (when protocol\n                     {:protocol protocol})\n                   ;; symbol for reified protocol\n                   (when-let [protocol-symbol (-> sym meta :protocol-symbol)]\n                     {:protocol-symbol protocol-symbol})\n                   (when fn-var?\n                     {:fn-var true\n                      ;; protocol implementation context\n                      :protocol-impl (:protocol-impl init-expr)\n                      ;; inline protocol implementation context\n                      :protocol-inline (:protocol-inline init-expr)\n                      :variadic (:variadic init-expr)\n                      :max-fixed-arity (:max-fixed-arity init-expr)\n                      :method-params (map :params (:methods init-expr))})))\n      (merge {:env env :op :def :form form\n              :name name :doc doc :init init-expr}\n             (when tag {:tag tag})\n             (when dynamic {:dynamic true})\n             (when export-as {:export export-as})\n             (when init-expr {:children [init-expr]})))))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [293 361],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/analyzer.clj#L293-L361"},
 :full-name-encode "special_def",
 :clj-symbol "clojure.core/def",
 :history [["+" "0.0-927"]]}

```
