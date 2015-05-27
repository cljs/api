## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/if

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if)
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
            └── <ins>[compiler.clj:639-646](https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L639-L646)</ins>
</pre>

```clj
(defmethod parse 'if
  [op env [_ test then else :as form] name]
  (let [test-expr (disallowing-recur (analyze (assoc env :context :expr) test))
        then-expr (analyze env then)
        else-expr (analyze env else)]
    {:env env :op :if :form form
     :test test-expr :then then-expr :else else-expr
     :children [test-expr then-expr else-expr]}))
```


---

```clj
{:full-name "special/if",
 :ns "special",
 :name "if",
 :type "special form",
 :source {:code "(defmethod parse 'if\n  [op env [_ test then else :as form] name]\n  (let [test-expr (disallowing-recur (analyze (assoc env :context :expr) test))\n        then-expr (analyze env then)\n        else-expr (analyze env else)]\n    {:env env :op :if :form form\n     :test test-expr :then then-expr :else else-expr\n     :children [test-expr then-expr else-expr]}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [639 646],
          :link "https://github.com/clojure/clojurescript/blob/r993/src/clj/cljs/compiler.clj#L639-L646"},
 :full-name-encode "special_if",
 :clj-symbol "clojure.core/if",
 :history [["+" "0.0-927"]]}

```
