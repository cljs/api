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
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:690-715](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L690-L715)</ins>
</pre>

```clj
(defmethod parse 'def
  [op env form name]
  (let [pfn (fn ([_ sym] {:sym sym})
              ([_ sym init] {:sym sym :init init})
              ([_ sym doc init] {:sym sym :doc doc :init init}))
        args (apply pfn form)
        sym (:sym args)]
    (assert (not (namespace sym)) "Can't def ns-qualified name")
    (let [name (munge (:name (resolve-var (dissoc env :locals) sym)))
          init-expr (when (contains? args :init) (disallowing-recur
                                                  (analyze (assoc env :context :expr) (:init args) sym)))
          export-as (when-let [export-val (-> sym meta :export)]
                      (if (= true export-val) name export-val))
          doc (or (:doc args) (-> sym meta :doc))]
      (swap! namespaces update-in [(-> env :ns :name) :defs sym]
             (fn [m]
               (let [m (assoc (or m {}) :name name)]
                 (if-let [line (:line env)]
                   (-> m
                       (assoc :file *cljs-file*)
                       (assoc :line line))
                   m))))
      (merge {:env env :op :def :form form
              :name name :doc doc :init init-expr}
             (when init-expr {:children [init-expr]})
             (when export-as {:export export-as})))))
```


---

```clj
{:full-name "special/def",
 :ns "special",
 :name "def",
 :type "special form",
 :source {:code "(defmethod parse 'def\n  [op env form name]\n  (let [pfn (fn ([_ sym] {:sym sym})\n              ([_ sym init] {:sym sym :init init})\n              ([_ sym doc init] {:sym sym :doc doc :init init}))\n        args (apply pfn form)\n        sym (:sym args)]\n    (assert (not (namespace sym)) \"Can't def ns-qualified name\")\n    (let [name (munge (:name (resolve-var (dissoc env :locals) sym)))\n          init-expr (when (contains? args :init) (disallowing-recur\n                                                  (analyze (assoc env :context :expr) (:init args) sym)))\n          export-as (when-let [export-val (-> sym meta :export)]\n                      (if (= true export-val) name export-val))\n          doc (or (:doc args) (-> sym meta :doc))]\n      (swap! namespaces update-in [(-> env :ns :name) :defs sym]\n             (fn [m]\n               (let [m (assoc (or m {}) :name name)]\n                 (if-let [line (:line env)]\n                   (-> m\n                       (assoc :file *cljs-file*)\n                       (assoc :line line))\n                   m))))\n      (merge {:env env :op :def :form form\n              :name name :doc doc :init init-expr}\n             (when init-expr {:children [init-expr]})\n             (when export-as {:export export-as})))))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [690 715],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L690-L715"},
 :full-name-encode "special_def",
 :clj-symbol "clojure.core/def",
 :history [["+" "0.0-927"]]}

```
