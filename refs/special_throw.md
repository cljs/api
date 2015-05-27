## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/throw

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/throw</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/throw)
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
clojurescript @ r971
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:612-617](https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L612-L617)</ins>
</pre>

```clj
(defmethod parse 'throw
  [op env [_ throw :as form] name]
  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]
    {:env env :op :throw :form form
     :throw throw-expr
     :children [throw-expr]}))
```


---

```clj
{:full-name "special/throw",
 :ns "special",
 :name "throw",
 :type "special form",
 :source {:code "(defmethod parse 'throw\n  [op env [_ throw :as form] name]\n  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]\n    {:env env :op :throw :form form\n     :throw throw-expr\n     :children [throw-expr]}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [612 617],
          :link "https://github.com/clojure/clojurescript/blob/r971/src/clj/cljs/compiler.clj#L612-L617"},
 :full-name-encode "special_throw",
 :clj-symbol "clojure.core/throw",
 :history [["+" "0.0-927"]]}

```
