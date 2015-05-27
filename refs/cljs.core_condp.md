## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/condp

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/condp</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/condp)
</td>
</tr>
</table>

 <samp>
(__condp__ pred expr & clauses)<br>
</samp>

```
Takes a binary predicate, an expression, and a set of clauses.
Each clause can take the form of either:

test-expr result-expr

test-expr :>> result-fn

Note :>> is an ordinary keyword.

For each clause, (pred test-expr expr) is evaluated. If it returns
logical true, the clause is a match. If a binary clause matches, the
result-expr is returned, if a ternary clause matches, its result-fn,
which must be a unary function, is called with the result of the
predicate as its argument, the result of that call being the return
value of condp. A single default expression can follow the clauses,
and its value will be returned if no clause matches. If no default
expression is provided and no clause matches, an
IllegalArgumentException is thrown.
```

---

 <pre>
clojurescript @ r1576
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:784-824](https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L784-L824)</ins>
</pre>

```clj
(defmacro condp
  [pred expr & clauses]
  (let [gpred (gensym "pred__")
        gexpr (gensym "expr__")
        emit (fn emit [pred expr args]
               (let [[[a b c :as clause] more]
                       (split-at (if (= :>> (second args)) 3 2) args)
                       n (count clause)]
                 (cond
                  (= 0 n) `(throw (js/Error. (core/str "No matching clause: " ~expr)))
                  (= 1 n) a
                  (= 2 n) `(if (~pred ~a ~expr)
                             ~b
                             ~(emit pred expr more))
                  :else `(if-let [p# (~pred ~a ~expr)]
                           (~c p#)
                           ~(emit pred expr more)))))
        gres (gensym "res__")]
    `(let [~gpred ~pred
           ~gexpr ~expr]
       ~(emit gpred gexpr clauses))))
```


---

```clj
{:ns "cljs.core",
 :name "condp",
 :signature ["[pred expr & clauses]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_condp",
 :source {:code "(defmacro condp\n  [pred expr & clauses]\n  (let [gpred (gensym \"pred__\")\n        gexpr (gensym \"expr__\")\n        emit (fn emit [pred expr args]\n               (let [[[a b c :as clause] more]\n                       (split-at (if (= :>> (second args)) 3 2) args)\n                       n (count clause)]\n                 (cond\n                  (= 0 n) `(throw (js/Error. (core/str \"No matching clause: \" ~expr)))\n                  (= 1 n) a\n                  (= 2 n) `(if (~pred ~a ~expr)\n                             ~b\n                             ~(emit pred expr more))\n                  :else `(if-let [p# (~pred ~a ~expr)]\n                           (~c p#)\n                           ~(emit pred expr more)))))\n        gres (gensym \"res__\")]\n    `(let [~gpred ~pred\n           ~gexpr ~expr]\n       ~(emit gpred gexpr clauses))))",
          :filename "clojurescript/src/clj/cljs/core.clj",
          :lines [784 824],
          :link "https://github.com/clojure/clojurescript/blob/r1576/src/clj/cljs/core.clj#L784-L824"},
 :full-name "cljs.core/condp",
 :clj-symbol "clojure.core/condp",
 :docstring "Takes a binary predicate, an expression, and a set of clauses.\nEach clause can take the form of either:\n\ntest-expr result-expr\n\ntest-expr :>> result-fn\n\nNote :>> is an ordinary keyword.\n\nFor each clause, (pred test-expr expr) is evaluated. If it returns\nlogical true, the clause is a match. If a binary clause matches, the\nresult-expr is returned, if a ternary clause matches, its result-fn,\nwhich must be a unary function, is called with the result of the\npredicate as its argument, the result of that call being the return\nvalue of condp. A single default expression can follow the clauses,\nand its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an\nIllegalArgumentException is thrown."}

```
