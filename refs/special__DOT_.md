## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/.

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/.</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/.)
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
clojurescript @ r1513
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:774-792](https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/analyzer.clj#L774-L792)</ins>
</pre>

```clj
(defmethod parse '.
  [_ env [_ target & [field & member+] :as form] _]
  (disallowing-recur
   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])
         enve        (assoc env :context :expr)
         targetexpr  (analyze enve target)]
     (case dot-action
           ::access {:env env :op :dot :form form
                     :target targetexpr
                     :field field
                     :children [targetexpr]
                     :tag (-> form meta :tag)}
           ::call   (let [argexprs (map #(analyze enve %) args)]
                      {:env env :op :dot :form form
                       :target targetexpr
                       :method method
                       :args argexprs
                       :children (into [targetexpr] argexprs)
                       :tag (-> form meta :tag)})))))
```


---

```clj
{:full-name "special/.",
 :ns "special",
 :name ".",
 :type "special form",
 :source {:code "(defmethod parse '.\n  [_ env [_ target & [field & member+] :as form] _]\n  (disallowing-recur\n   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])\n         enve        (assoc env :context :expr)\n         targetexpr  (analyze enve target)]\n     (case dot-action\n           ::access {:env env :op :dot :form form\n                     :target targetexpr\n                     :field field\n                     :children [targetexpr]\n                     :tag (-> form meta :tag)}\n           ::call   (let [argexprs (map #(analyze enve %) args)]\n                      {:env env :op :dot :form form\n                       :target targetexpr\n                       :method method\n                       :args argexprs\n                       :children (into [targetexpr] argexprs)\n                       :tag (-> form meta :tag)})))))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [774 792],
          :link "https://github.com/clojure/clojurescript/blob/r1513/src/clj/cljs/analyzer.clj#L774-L792"},
 :full-name-encode "special__DOT_",
 :clj-symbol "clojure.core/.",
 :history [["+" "0.0-927"]]}

```
