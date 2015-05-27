## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/defrecord\*

 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
</samp>

```
(no docstring)
```

---

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── <ins>[analyzer.clj:716-727](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/analyzer.clj#L716-L727)</ins>
</pre>

```clj
(defmethod parse 'defrecord*
  [_ env [_ tsym fields pmasks :as form] _]
  (let [t (:name (resolve-var (dissoc env :locals) tsym))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {}) :name t :type true)]
               (merge m
                 {:protocols (-> tsym meta :protocols)}
                 (when-let [line (:line env)]
                   {:file *cljs-file*
                    :line line})))))
    {:env env :op :defrecord* :form form :t t :fields fields :pmasks pmasks}))
```


---

```clj
{:full-name "special/defrecord*",
 :ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env [_ tsym fields pmasks :as form] _]\n  (let [t (:name (resolve-var (dissoc env :locals) tsym))]\n    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {}) :name t :type true)]\n               (merge m\n                 {:protocols (-> tsym meta :protocols)}\n                 (when-let [line (:line env)]\n                   {:file *cljs-file*\n                    :line line})))))\n    {:env env :op :defrecord* :form form :t t :fields fields :pmasks pmasks}))",
          :filename "clojurescript/src/clj/cljs/analyzer.clj",
          :lines [716 727],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/analyzer.clj#L716-L727"},
 :full-name-encode "special_defrecord_STAR_",
 :history [["+" "0.0-927"]]}

```
