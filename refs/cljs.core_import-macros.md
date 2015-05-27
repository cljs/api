## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/import-macros

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__import-macros__ ns [& vars])<br>
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
            └── <ins>[core.clj:28-35](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L28-L35)</ins>
</pre>

```clj
(defmacro import-macros [ns [& vars]]
  (core/let [ns (find-ns ns)
             vars (map #(ns-resolve ns %) vars)
             syms (map (core/fn [^clojure.lang.Var v] (core/-> v .sym (with-meta {:macro true}))) vars)
             defs (map (core/fn [sym var]
                                `(def ~sym (deref ~var))) syms vars)]
            `(do ~@defs
                 :imported)))
```


---

```clj
{:full-name "cljs.core/import-macros",
 :ns "cljs.core",
 :name "import-macros",
 :type "macro",
 :signature ["[ns [& vars]]"],
 :source {:code "(defmacro import-macros [ns [& vars]]\n  (core/let [ns (find-ns ns)\n             vars (map #(ns-resolve ns %) vars)\n             syms (map (core/fn [^clojure.lang.Var v] (core/-> v .sym (with-meta {:macro true}))) vars)\n             defs (map (core/fn [sym var]\n                                `(def ~sym (deref ~var))) syms vars)]\n            `(do ~@defs\n                 :imported)))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [28 35],
          :link "https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/core.clj#L28-L35"},
 :full-name-encode "cljs.core_import-macros",
 :history [["+" "0.0-927"]]}

```
