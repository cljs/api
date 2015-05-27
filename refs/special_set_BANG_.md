## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/set!

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/set!</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/set!)
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
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:825-843](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L825-L843)</ins>
</pre>

```clj
(defmethod parse 'set!
  [_ env [_ target val] _]
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         targetexpr (if (symbol? target)
                      (do
                        (let [local (-> env :locals target)]
                          (assert (or (nil? local)
                                      (and (:field local)
                                           (:mutable local)))
                                  "Can't set! local var or non-mutable field"))
                        (analyze-symbol enve target))
                      (when (seq? target)
                        (let [targetexpr (analyze-seq enve target nil)]
                          (when (:field targetexpr)
                            targetexpr))))
         valexpr (analyze enve val)]
     (assert targetexpr "set! target must be a field or a symbol naming a var")
     {:env env :op :set! :target targetexpr :val valexpr :children [targetexpr valexpr]})))
```


---

```clj
{:full-name "special/set!",
 :ns "special",
 :name "set!",
 :type "special form",
 :source {:code "(defmethod parse 'set!\n  [_ env [_ target val] _]\n  (disallowing-recur\n   (let [enve (assoc env :context :expr)\n         targetexpr (if (symbol? target)\n                      (do\n                        (let [local (-> env :locals target)]\n                          (assert (or (nil? local)\n                                      (and (:field local)\n                                           (:mutable local)))\n                                  \"Can't set! local var or non-mutable field\"))\n                        (analyze-symbol enve target))\n                      (when (seq? target)\n                        (let [targetexpr (analyze-seq enve target nil)]\n                          (when (:field targetexpr)\n                            targetexpr))))\n         valexpr (analyze enve val)]\n     (assert targetexpr \"set! target must be a field or a symbol naming a var\")\n     {:env env :op :set! :target targetexpr :val valexpr :children [targetexpr valexpr]})))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [825 843],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L825-L843"},
 :full-name-encode "special_set_BANG_",
 :clj-symbol "clojure.core/set!",
 :history [["+" "0.0-927"]]}

```
