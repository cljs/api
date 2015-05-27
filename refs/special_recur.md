## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/recur

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/recur</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/recur)
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
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:508-519](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/analyzer.clj#L508-L519)</ins>
</pre>

```clj
(defmethod parse 'recur
  [op env [_ & exprs :as form] _]
  (let [context (:context env)
        frame (first *recur-frames*)
        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]
    (assert frame "Can't recur here")
    (assert (= (count exprs) (count (:names frame))) "recur argument count mismatch")
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur :form form}
      :frame frame
      :exprs exprs
      :children exprs)))
```


---

```clj
{:full-name "special/recur",
 :ns "special",
 :name "recur",
 :type "special form",
 :source {:code "(defmethod parse 'recur\n  [op env [_ & exprs :as form] _]\n  (let [context (:context env)\n        frame (first *recur-frames*)\n        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]\n    (assert frame \"Can't recur here\")\n    (assert (= (count exprs) (count (:names frame))) \"recur argument count mismatch\")\n    (reset! (:flag frame) true)\n    (assoc {:env env :op :recur :form form}\n      :frame frame\n      :exprs exprs\n      :children exprs)))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [508 519],
          :link "https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/analyzer.clj#L508-L519"},
 :full-name-encode "special_recur",
 :clj-symbol "clojure.core/recur",
 :history [["+" "0.0-927"]]}

```
