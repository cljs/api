## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/fn

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/fn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/fn)
</td>
</tr>
</table>

 <samp>
(__fn__ & sigs)<br>
</samp>

```
params => positional-params* , or positional-params* & next-param
positional-param => binding-form
next-param => binding-form
name => symbol

Defines a function
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:4067-4127](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L4067-L4127)</ins>
</pre>

```clj
(defmacro fn
  [& sigs]
    (let [name (if (symbol? (first sigs)) (first sigs) nil)
          sigs (if name (next sigs) sigs)
          sigs (if (vector? (first sigs)) 
                 (list sigs) 
                 (if (seq? (first sigs))
                   sigs
                   ;; Assume single arity syntax
                   (throw (IllegalArgumentException. 
                            (if (seq sigs)
                              (str "Parameter declaration " 
                                   (first sigs)
                                   " should be a vector")
                              (str "Parameter declaration missing"))))))
          psig (fn* [sig]
                 ;; Ensure correct type before destructuring sig
                 (when (not (seq? sig))
                   (throw (IllegalArgumentException.
                            (str "Invalid signature " sig
                                 " should be a list"))))
                 (let [[params & body] sig
                       _ (when (not (vector? params))
                           (throw (IllegalArgumentException. 
                                    (if (seq? (first sigs))
                                      (str "Parameter declaration " params
                                           " should be a vector")
                                      (str "Invalid signature " sig
                                           " should be a list")))))
                       conds (when (and (next body) (map? (first body))) 
                                           (first body))
                       body (if conds (next body) body)
                       conds (or conds (meta params))
                       pre (:pre conds)
                       post (:post conds)                       
                       body (if post
                              `((let [~'% ~(if (< 1 (count body)) 
                                            `(do ~@body) 
                                            (first body))]
                                 ~@(map (fn* [c] `(assert ~c)) post)
                                 ~'%))
                              body)
                       body (if pre
                              (concat (map (fn* [c] `(assert ~c)) pre) 
                                      body)
                              body)]
                   (maybe-destructured params body)))
          new-sigs (map psig sigs)]
      (with-meta
        (if name
          (list* 'fn* name new-sigs)
          (cons 'fn* new-sigs))
        (meta &form))))
```


---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:42-47](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L42-L47)</ins>
</pre>

```clj
(def
 ^{:macro true
   :added "1.0"}
 fn (fn* fn [&form &env & decl] 
         (.withMeta ^clojure.lang.IObj (cons 'fn* decl) 
                    (.meta ^clojure.lang.IMeta &form))))
```

---

```clj
{:ns "cljs.core",
 :name "fn",
 :signature ["[& sigs]"],
 :shadowed-sources ({:code "(def\n ^{:macro true\n   :added \"1.0\"}\n fn (fn* fn [&form &env & decl] \n         (.withMeta ^clojure.lang.IObj (cons 'fn* decl) \n                    (.meta ^clojure.lang.IMeta &form))))",
                     :filename "clojure/src/clj/clojure/core.clj",
                     :lines [42 47],
                     :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L42-L47"}),
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_fn",
 :source {:code "(defmacro fn\n  [& sigs]\n    (let [name (if (symbol? (first sigs)) (first sigs) nil)\n          sigs (if name (next sigs) sigs)\n          sigs (if (vector? (first sigs)) \n                 (list sigs) \n                 (if (seq? (first sigs))\n                   sigs\n                   ;; Assume single arity syntax\n                   (throw (IllegalArgumentException. \n                            (if (seq sigs)\n                              (str \"Parameter declaration \" \n                                   (first sigs)\n                                   \" should be a vector\")\n                              (str \"Parameter declaration missing\"))))))\n          psig (fn* [sig]\n                 ;; Ensure correct type before destructuring sig\n                 (when (not (seq? sig))\n                   (throw (IllegalArgumentException.\n                            (str \"Invalid signature \" sig\n                                 \" should be a list\"))))\n                 (let [[params & body] sig\n                       _ (when (not (vector? params))\n                           (throw (IllegalArgumentException. \n                                    (if (seq? (first sigs))\n                                      (str \"Parameter declaration \" params\n                                           \" should be a vector\")\n                                      (str \"Invalid signature \" sig\n                                           \" should be a list\")))))\n                       conds (when (and (next body) (map? (first body))) \n                                           (first body))\n                       body (if conds (next body) body)\n                       conds (or conds (meta params))\n                       pre (:pre conds)\n                       post (:post conds)                       \n                       body (if post\n                              `((let [~'% ~(if (< 1 (count body)) \n                                            `(do ~@body) \n                                            (first body))]\n                                 ~@(map (fn* [c] `(assert ~c)) post)\n                                 ~'%))\n                              body)\n                       body (if pre\n                              (concat (map (fn* [c] `(assert ~c)) pre) \n                                      body)\n                              body)]\n                   (maybe-destructured params body)))\n          new-sigs (map psig sigs)]\n      (with-meta\n        (if name\n          (list* 'fn* name new-sigs)\n          (cons 'fn* new-sigs))\n        (meta &form))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [4067 4127],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L4067-L4127"},
 :full-name "cljs.core/fn",
 :clj-symbol "clojure.core/fn",
 :docstring "params => positional-params* , or positional-params* & next-param\npositional-param => binding-form\nnext-param => binding-form\nname => symbol\n\nDefines a function"}

```
