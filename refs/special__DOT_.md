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
clojurescript @ r993
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:981-996](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L981-L996)</ins>
</pre>

```clj
(defmethod parse '.
  [_ env [_ target & [field & member+]] _]
  (disallowing-recur
   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])
         enve        (assoc env :context :expr)
         targetexpr  (analyze enve target)
         children    [enve]]
     (case dot-action
           ::access {:env env :op :dot :children children
                     :target targetexpr
                     :field field}
           ::call   (let [argexprs (map #(analyze enve %) args)]
                      {:env env :op :dot :children (into children argexprs)
                       :target targetexpr
                       :method method
                       :args argexprs})))))
```


---

```clj
{:full-name "special/.",
 :ns "special",
 :name ".",
 :type "special form",
 :source {:code "(defmethod parse '.\n  [_ env [_ target & [field & member+]] _]\n  (disallowing-recur\n   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])\n         enve        (assoc env :context :expr)\n         targetexpr  (analyze enve target)\n         children    [enve]]\n     (case dot-action\n           ::access {:env env :op :dot :children children\n                     :target targetexpr\n                     :field field}\n           ::call   (let [argexprs (map #(analyze enve %) args)]\n                      {:env env :op :dot :children (into children argexprs)\n                       :target targetexpr\n                       :method method\n                       :args argexprs})))))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [981 996],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L981-L996"},
 :full-name-encode "special__DOT_",
 :clj-symbol "clojure.core/.",
 :history [["+" "0.0-927"]]}

```
