## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/do

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/do</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/do)
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
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:447-456](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/analyzer.clj#L447-L456)</ins>
</pre>

```clj
(defmethod parse 'do
  [op env [_ & exprs :as form] _]
  (let [statements (disallowing-recur
                     (seq (map #(analyze (assoc env :context :statement) %) (butlast exprs))))
        ret (if (<= (count exprs) 1)
              (analyze env (first exprs))
              (analyze (assoc env :context (if (= :statement (:context env)) :statement :return)) (last exprs)))]
    {:env env :op :do :form form
     :statements statements :ret ret
     :children (conj (vec statements) ret)}))
```


---

```clj
{:full-name "special/do",
 :ns "special",
 :name "do",
 :type "special form",
 :source {:code "(defmethod parse 'do\n  [op env [_ & exprs :as form] _]\n  (let [statements (disallowing-recur\n                     (seq (map #(analyze (assoc env :context :statement) %) (butlast exprs))))\n        ret (if (<= (count exprs) 1)\n              (analyze env (first exprs))\n              (analyze (assoc env :context (if (= :statement (:context env)) :statement :return)) (last exprs)))]\n    {:env env :op :do :form form\n     :statements statements :ret ret\n     :children (conj (vec statements) ret)}))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [447 456],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/analyzer.clj#L447-L456"},
 :full-name-encode "special_do",
 :clj-symbol "clojure.core/do",
 :history [["+" "0.0-927"]]}

```
