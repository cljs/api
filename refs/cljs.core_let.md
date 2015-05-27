## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/let

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/let)
</td>
</tr>
</table>

 <samp>
(__let__ bindings & body)<br>
</samp>

```
binding => binding-form init-expr

Evaluates the exprs in a lexical context in which the symbols in
the binding-forms are bound to their respective init-exprs or parts
therein.
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:3953-3964](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3953-L3964)</ins>
</pre>

```clj
(defmacro let
  [bindings & body]
  (assert-args let
     (vector? bindings) "a vector for its binding"
     (even? (count bindings)) "an even number of forms in binding vector")
  `(let* ~(destructure bindings) ~@body))
```


---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:32-35](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L32-L35)</ins>
</pre>

```clj
(def
  ^{:macro true
    :added "1.0"}
  let (fn* let [&form &env & decl] (cons 'let* decl)))
```

---

```clj
{:ns "cljs.core",
 :name "let",
 :signature ["[bindings & body]"],
 :shadowed-sources ({:code "(def\n  ^{:macro true\n    :added \"1.0\"}\n  let (fn* let [&form &env & decl] (cons 'let* decl)))",
                     :filename "clojure/src/clj/clojure/core.clj",
                     :lines [32 35],
                     :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L32-L35"}),
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_let",
 :source {:code "(defmacro let\n  [bindings & body]\n  (assert-args let\n     (vector? bindings) \"a vector for its binding\"\n     (even? (count bindings)) \"an even number of forms in binding vector\")\n  `(let* ~(destructure bindings) ~@body))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [3953 3964],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L3953-L3964"},
 :full-name "cljs.core/let",
 :clj-symbol "clojure.core/let",
 :docstring "binding => binding-form init-expr\n\nEvaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein."}

```
