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
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:902-913](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L902-L913)</ins>
</pre>

```clj
(defmethod parse 'defrecord*
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
    {:env env :op :defrecord* :t t :fields fields}))
```


---

```clj
{:full-name "special/defrecord*",
 :ns "special",
 :name "defrecord*",
 :type "special form",
 :source {:code "(defmethod parse 'defrecord*\n  [_ env [_ tsym fields] _]\n  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]\n    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]\n           (fn [m]\n             (let [m (assoc (or m {}) :name t)]\n               (if-let [line (:line env)]\n                 (-> m\n                     (assoc :file *cljs-file*)\n                     (assoc :line line))\n                 m))))\n    {:env env :op :defrecord* :t t :fields fields}))",
          :filename "clojurescript/src/clj/cljs/compiler.clj",
          :lines [902 913],
          :link "https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L902-L913"},
 :full-name-encode "special_defrecord_STAR_",
 :history [["+" "0.0-927"]]}

```
