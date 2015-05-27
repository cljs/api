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
clojurescript @ r1011
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:801-810](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/compiler.clj#L801-L810)</ins>
</pre>

```clj
(defmethod parse 'recur
  [op env [_ & exprs] _]
  (let [context (:context env)
        frame (first *recur-frames*)]
    (assert frame "Can't recur here")
    (assert (= (count exprs) (count (:names frame))) "recur argument count mismatch")
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur}
      :frame frame
      :exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs))))))
```


---

```clj
{:full-name "special/recur",
 :ns "special",
 :name "recur",
 :type "special form",
 :source {:code "(defmethod parse 'recur\n  [op env [_ & exprs] _]\n  (let [context (:context env)\n        frame (first *recur-frames*)]\n    (assert frame \"Can't recur here\")\n    (assert (= (count exprs) (count (:names frame))) \"recur argument count mismatch\")\n    (reset! (:flag frame) true)\n    (assoc {:env env :op :recur}\n      :frame frame\n      :exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs))))))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [801 810],
          :link "https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/compiler.clj#L801-L810"},
 :full-name-encode "special_recur",
 :clj-symbol "clojure.core/recur",
 :history [["+" "0.0-927"]]}

```
