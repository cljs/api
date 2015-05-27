## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> special/deftype\*

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
clojurescript @ r927
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:842-853](https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/compiler.clj#L842-L853)</ins>
</pre>

```clj
(defmethod parse 'deftype*
  [_ env [_ tsym fields] _]
  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {}) :name t)]
               (if-let [line (:line env)]
                 (-> m
                     (assoc :file *cljs-file*)
                     (assoc :line line))
                 m))))
    {:env env :op :deftype* :t t :fields fields}))
```


---

```clj
{:full-name "special/deftype*",
 :ns "special",
 :name "deftype*",
 :type "special form",
 :source {:code "(defmethod parse 'deftype*\n  [_ env [_ tsym fields] _]\n  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]\n    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {}) :name t)]\n               (if-let [line (:line env)]\n                 (-> m\n                     (assoc :file *cljs-file*)\n                     (assoc :line line))\n                 m))))\n    {:env env :op :deftype* :t t :fields fields}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [842 853],
          :link "https://github.com/clojure/clojurescript/blob/r927/src/clj/cljs/compiler.clj#L842-L853"},
 :full-name-encode "special_deftype_STAR_",
 :history [["+" "0.0-927"]]}

```
