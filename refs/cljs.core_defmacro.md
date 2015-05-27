## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defmacro

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defmacro</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defmacro)
</td>
</tr>
</table>

 <samp>
(__defmacro__ name doc-string? attr-map? [params\*] body)<br>
(__defmacro__ name doc-string? attr-map? ([params\*] body) + attr-map?)<br>
</samp>

```
Like defn, but the resulting function name is declared as a
macro and will be used as a macro by the compiler when it is
called.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:406-450](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L406-L450)</ins>
</pre>

```clj
(def

 ^{:doc "Like defn, but the resulting function name is declared as a
  macro and will be used as a macro by the compiler when it is
  called."
   :arglists '([name doc-string? attr-map? [params*] body]
                 [name doc-string? attr-map? ([params*] body)+ attr-map?])
   :added "1.0"}
 defmacro (fn [&form &env 
                name & args]
             (let [prefix (loop [p (list name) args args]
                            (let [f (first args)]
                              (if (string? f)
                                (recur (cons f p) (next args))
                                (if (map? f)
                                  (recur (cons f p) (next args))
                                  p))))
                   fdecl (loop [fd args]
                           (if (string? (first fd))
                             (recur (next fd))
                             (if (map? (first fd))
                               (recur (next fd))
                               fd)))
                   fdecl (if (vector? (first fdecl))
                           (list fdecl)
                           fdecl)
                   add-implicit-args (fn [fd]
                             (let [args (first fd)]
                               (cons (vec (cons '&form (cons '&env args))) (next fd))))
                   add-args (fn [acc ds]
                              (if (nil? ds)
                                acc
                                (let [d (first ds)]
                                  (if (map? d)
                                    (conj acc d)
                                    (recur (conj acc (add-implicit-args d)) (next ds))))))
                   fdecl (seq (add-args [] fdecl))
                   decl (loop [p prefix d fdecl]
                          (if p
                            (recur (next p) (cons (first p) d))
                            d))]
               (list 'do
                     (cons `defn decl)
                     (list '. (list 'var name) '(setMacro))
                     (list 'var name)))))
```


---

```clj
{:ns "cljs.core",
 :name "defmacro",
 :signature ["[name doc-string? attr-map? [params*] body]"
             "[name doc-string? attr-map? ([params*] body) + attr-map?]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defmacro",
 :source {:code "(def\n\n ^{:doc \"Like defn, but the resulting function name is declared as a\n  macro and will be used as a macro by the compiler when it is\n  called.\"\n   :arglists '([name doc-string? attr-map? [params*] body]\n                 [name doc-string? attr-map? ([params*] body)+ attr-map?])\n   :added \"1.0\"}\n defmacro (fn [&form &env \n                name & args]\n             (let [prefix (loop [p (list name) args args]\n                            (let [f (first args)]\n                              (if (string? f)\n                                (recur (cons f p) (next args))\n                                (if (map? f)\n                                  (recur (cons f p) (next args))\n                                  p))))\n                   fdecl (loop [fd args]\n                           (if (string? (first fd))\n                             (recur (next fd))\n                             (if (map? (first fd))\n                               (recur (next fd))\n                               fd)))\n                   fdecl (if (vector? (first fdecl))\n                           (list fdecl)\n                           fdecl)\n                   add-implicit-args (fn [fd]\n                             (let [args (first fd)]\n                               (cons (vec (cons '&form (cons '&env args))) (next fd))))\n                   add-args (fn [acc ds]\n                              (if (nil? ds)\n                                acc\n                                (let [d (first ds)]\n                                  (if (map? d)\n                                    (conj acc d)\n                                    (recur (conj acc (add-implicit-args d)) (next ds))))))\n                   fdecl (seq (add-args [] fdecl))\n                   decl (loop [p prefix d fdecl]\n                          (if p\n                            (recur (next p) (cons (first p) d))\n                            d))]\n               (list 'do\n                     (cons `defn decl)\n                     (list '. (list 'var name) '(setMacro))\n                     (list 'var name)))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [406 450],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L406-L450"},
 :full-name "cljs.core/defmacro",
 :clj-symbol "clojure.core/defmacro",
 :docstring "Like defn, but the resulting function name is declared as a\nmacro and will be used as a macro by the compiler when it is\ncalled."}

```
