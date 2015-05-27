## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/defn

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/defn</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/defn)
</td>
</tr>
</table>

 <samp>
(__defn__ name doc-string? attr-map? [params\*] prepost-map? body)<br>
(__defn__ name doc-string? attr-map? ([params\*] prepost-map? body) + attr-map?)<br>
</samp>

```
Same as (def name (fn [params* ] exprs*)) or (def
 name (fn ([params* ] exprs*)+)) with any doc-string or attrs added
 to the var metadata. prepost-map defines a map with optional keys
 :pre and :post that contain collections of pre or post conditions.
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:266-316](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L266-L316)</ins>
</pre>

```clj
(def 

 ^{:doc "Same as (def name (fn [params* ] exprs*)) or (def
    name (fn ([params* ] exprs*)+)) with any doc-string or attrs added
    to the var metadata. prepost-map defines a map with optional keys
    :pre and :post that contain collections of pre or post conditions."
   :arglists '([name doc-string? attr-map? [params*] prepost-map? body]
                [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])
   :added "1.0"}
 defn (fn defn [&form &env name & fdecl]
        ;; Note: Cannot delegate this check to def because of the call to (with-meta name ..)
        (if (instance? clojure.lang.Symbol name)
          nil
          (throw (IllegalArgumentException. "First argument to defn must be a symbol")))
        (let [m (if (string? (first fdecl))
                  {:doc (first fdecl)}
                  {})
              fdecl (if (string? (first fdecl))
                      (next fdecl)
                      fdecl)
              m (if (map? (first fdecl))
                  (conj m (first fdecl))
                  m)
              fdecl (if (map? (first fdecl))
                      (next fdecl)
                      fdecl)
              fdecl (if (vector? (first fdecl))
                      (list fdecl)
                      fdecl)
              m (if (map? (last fdecl))
                  (conj m (last fdecl))
                  m)
              fdecl (if (map? (last fdecl))
                      (butlast fdecl)
                      fdecl)
              m (conj {:arglists (list 'quote (sigs fdecl))} m)
              m (let [inline (:inline m)
                      ifn (first inline)
                      iname (second inline)]
                  ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)
                  (if (if (clojure.lang.Util/equiv 'fn ifn)
                        (if (instance? clojure.lang.Symbol iname) false true))
                    ;; inserts the same fn name to the inline fn if it does not have one
                    (assoc m :inline (cons ifn (cons (clojure.lang.Symbol/intern (.concat (.getName ^clojure.lang.Symbol name) "__inliner"))
                                                     (next inline))))
                    m))
              m (conj (if (meta name) (meta name) {}) m)]
          (list 'def (with-meta name m)
                ;;todo - restore propagation of fn name
                ;;must figure out how to convey primitive hints to self calls first
                (cons `fn fdecl) ))))
```


---

```clj
{:ns "cljs.core",
 :name "defn",
 :signature ["[name doc-string? attr-map? [params*] prepost-map? body]"
             "[name doc-string? attr-map? ([params*] prepost-map? body) + attr-map?]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_defn",
 :source {:code "(def \n\n ^{:doc \"Same as (def name (fn [params* ] exprs*)) or (def\n    name (fn ([params* ] exprs*)+)) with any doc-string or attrs added\n    to the var metadata. prepost-map defines a map with optional keys\n    :pre and :post that contain collections of pre or post conditions.\"\n   :arglists '([name doc-string? attr-map? [params*] prepost-map? body]\n                [name doc-string? attr-map? ([params*] prepost-map? body)+ attr-map?])\n   :added \"1.0\"}\n defn (fn defn [&form &env name & fdecl]\n        ;; Note: Cannot delegate this check to def because of the call to (with-meta name ..)\n        (if (instance? clojure.lang.Symbol name)\n          nil\n          (throw (IllegalArgumentException. \"First argument to defn must be a symbol\")))\n        (let [m (if (string? (first fdecl))\n                  {:doc (first fdecl)}\n                  {})\n              fdecl (if (string? (first fdecl))\n                      (next fdecl)\n                      fdecl)\n              m (if (map? (first fdecl))\n                  (conj m (first fdecl))\n                  m)\n              fdecl (if (map? (first fdecl))\n                      (next fdecl)\n                      fdecl)\n              fdecl (if (vector? (first fdecl))\n                      (list fdecl)\n                      fdecl)\n              m (if (map? (last fdecl))\n                  (conj m (last fdecl))\n                  m)\n              fdecl (if (map? (last fdecl))\n                      (butlast fdecl)\n                      fdecl)\n              m (conj {:arglists (list 'quote (sigs fdecl))} m)\n              m (let [inline (:inline m)\n                      ifn (first inline)\n                      iname (second inline)]\n                  ;; same as: (if (and (= 'fn ifn) (not (symbol? iname))) ...)\n                  (if (if (clojure.lang.Util/equiv 'fn ifn)\n                        (if (instance? clojure.lang.Symbol iname) false true))\n                    ;; inserts the same fn name to the inline fn if it does not have one\n                    (assoc m :inline (cons ifn (cons (clojure.lang.Symbol/intern (.concat (.getName ^clojure.lang.Symbol name) \"__inliner\"))\n                                                     (next inline))))\n                    m))\n              m (conj (if (meta name) (meta name) {}) m)]\n          (list 'def (with-meta name m)\n                ;;todo - restore propagation of fn name\n                ;;must figure out how to convey primitive hints to self calls first\n                (cons `fn fdecl) ))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [266 316],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L266-L316"},
 :full-name "cljs.core/defn",
 :clj-symbol "clojure.core/defn",
 :docstring "Same as (def name (fn [params* ] exprs*)) or (def\n name (fn ([params* ] exprs*)+)) with any doc-string or attrs added\n to the var metadata. prepost-map defines a map with optional keys\n :pre and :post that contain collections of pre or post conditions."}

```
