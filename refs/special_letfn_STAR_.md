## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/letfn\*

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1236
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:998-1032](https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L998-L1032)</ins>
</pre>

```clj
(defmethod parse 'letfn*
  [op env [_ bindings & exprs :as form] name]
  (assert (and (vector? bindings) (even? (count bindings))) "bindings must be vector of even number of elements")
  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))
        names    (keys n->fexpr)
        n->gsym  (into {} (map (juxt identity #(gensym (str (munge %) "__"))) names))
        gsym->n  (into {} (map (juxt n->gsym identity) names))
        context  (:context env)
        bes      (reduce (fn [bes n]
                           (let [g (n->gsym n)]
                             (conj bes {:name  g
                                        :tag   (-> n meta :tag)
                                        :local true})))
                         []
                         names)
        meth-env (reduce (fn [env be]
                           (let [n (gsym->n (be :name))]
                             (assoc-in env [:locals n] be)))
                         (assoc env :context :expr)
                         bes)
        [meth-env finits]
        (reduce (fn [[env finits] n]
                  (let [finit (analyze meth-env (n->fexpr n))
                        be (-> (get-in env [:locals n])
                               (assoc :init finit))]
                    [(assoc-in env [:locals n] be)
                     (conj finits finit)]))
                [meth-env []]
                names)
        {:keys [statements ret]}
        (analyze-block (assoc meth-env :context (if (= :expr context) :return context)) exprs)
        bes (vec (map #(get-in meth-env [:locals %]) names))]
    {:env env :op :letfn :bindings bes :statements statements :ret ret :form form
     :children (into (vec (map :init bes))
                     (conj (vec statements) ret))}))
```


---

```clj
{:full-name "special/letfn*",
 :ns "special",
 :name "letfn*",
 :type "special form",
 :source {:code "(defmethod parse 'letfn*\n  [op env [_ bindings & exprs :as form] name]\n  (assert (and (vector? bindings) (even? (count bindings))) \"bindings must be vector of even number of elements\")\n  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))\n        names    (keys n->fexpr)\n        n->gsym  (into {} (map (juxt identity #(gensym (str (munge %) \"__\"))) names))\n        gsym->n  (into {} (map (juxt n->gsym identity) names))\n        context  (:context env)\n        bes      (reduce (fn [bes n]\n                           (let [g (n->gsym n)]\n                             (conj bes {:name  g\n                                        :tag   (-> n meta :tag)\n                                        :local true})))\n                         []\n                         names)\n        meth-env (reduce (fn [env be]\n                           (let [n (gsym->n (be :name))]\n                             (assoc-in env [:locals n] be)))\n                         (assoc env :context :expr)\n                         bes)\n        [meth-env finits]\n        (reduce (fn [[env finits] n]\n                  (let [finit (analyze meth-env (n->fexpr n))\n                        be (-> (get-in env [:locals n])\n                               (assoc :init finit))]\n                    [(assoc-in env [:locals n] be)\n                     (conj finits finit)]))\n                [meth-env []]\n                names)\n        {:keys [statements ret]}\n        (analyze-block (assoc meth-env :context (if (= :expr context) :return context)) exprs)\n        bes (vec (map #(get-in meth-env [:locals %]) names))]\n    {:env env :op :letfn :bindings bes :statements statements :ret ret :form form\n     :children (into (vec (map :init bes))\n                     (conj (vec statements) ret))}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [998 1032],
          :link "https://github.com/clojure/clojurescript/blob/r1236/src/clj/cljs/compiler.clj#L998-L1032"},
 :full-name-encode "special_letfn_STAR_",
 :history [["+" "0.0-1236"]]}

```
