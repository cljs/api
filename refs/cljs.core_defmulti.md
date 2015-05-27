## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defmulti

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmulti</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmulti)
</td>
</tr>
</table>

 <samp>
(__defmulti__ mm-name & options)<br>
</samp>

```
Creates a new multimethod with the associated dispatch function.
The docstring and attribute-map are optional.

Options are key-value pairs and may be one of:
  :default    the default dispatch value, defaults to :default
  :hierarchy  the isa? hierarchy to use for dispatching
              defaults to the global hierarchy
```

---

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1059-1100](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L1059-L1100)</ins>
</pre>

```clj
(defmacro defmulti
  [mm-name & options]
  (let [docstring   (if (core/string? (first options))
                      (first options)
                      nil)
        options     (if (core/string? (first options))
                      (next options)
                      options)
        m           (if (map? (first options))
                      (first options)
                      {})
        options     (if (map? (first options))
                      (next options)
                      options)
        dispatch-fn (first options)
        options     (next options)
        m           (if docstring
                      (assoc m :doc docstring)
                      m)
        m           (if (meta mm-name)
                      (conj (meta mm-name) m)
                      m)]
    (when (= (count options) 1)
      (throw "The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)"))
    (let [options   (apply hash-map options)
          default   (core/get options :default :default)]
      (check-valid-options options :default :hierarchy)
      `(def ~(with-meta mm-name m)
         (let [method-table# (atom {})
               prefer-table# (atom {})
               method-cache# (atom {})
               cached-hierarchy# (atom {})
               hierarchy# (get ~options :hierarchy cljs.core/global-hierarchy)]
           (cljs.core/MultiFn. ~(name mm-name) ~dispatch-fn ~default hierarchy#
                               method-table# prefer-table# method-cache# cached-hierarchy#))))))
```


---

```clj
{:ns "cljs.core",
 :name "defmulti",
 :signature ["[mm-name & options]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defmulti",
 :source {:code "(defmacro defmulti\n  [mm-name & options]\n  (let [docstring   (if (core/string? (first options))\n                      (first options)\n                      nil)\n        options     (if (core/string? (first options))\n                      (next options)\n                      options)\n        m           (if (map? (first options))\n                      (first options)\n                      {})\n        options     (if (map? (first options))\n                      (next options)\n                      options)\n        dispatch-fn (first options)\n        options     (next options)\n        m           (if docstring\n                      (assoc m :doc docstring)\n                      m)\n        m           (if (meta mm-name)\n                      (conj (meta mm-name) m)\n                      m)]\n    (when (= (count options) 1)\n      (throw \"The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)\"))\n    (let [options   (apply hash-map options)\n          default   (core/get options :default :default)]\n      (check-valid-options options :default :hierarchy)\n      `(def ~(with-meta mm-name m)\n         (let [method-table# (atom {})\n               prefer-table# (atom {})\n               method-cache# (atom {})\n               cached-hierarchy# (atom {})\n               hierarchy# (get ~options :hierarchy cljs.core/global-hierarchy)]\n           (cljs.core/MultiFn. ~(name mm-name) ~dispatch-fn ~default hierarchy#\n                               method-table# prefer-table# method-cache# cached-hierarchy#))))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [1059 1100],
          :link "https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/core.clj#L1059-L1100"},
 :full-name "cljs.core/defmulti",
 :clj-symbol "clojure.core/defmulti",
 :docstring "Creates a new multimethod with the associated dispatch function.\nThe docstring and attribute-map are optional.\n\nOptions are key-value pairs and may be one of:\n  :default    the default dispatch value, defaults to :default\n  :hierarchy  the isa? hierarchy to use for dispatching\n              defaults to the global hierarchy"}

```
