## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cond->

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cond-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond-%3E)
</td>
</tr>
</table>

 <samp>
(__cond->__ expr & clauses)<br>
</samp>

```
Takes an expression and a set of test/form pairs. Threads expr (via ->)
through each form for which the corresponding test
expression is true. Note that, unlike cond branching, cond-> threading does
not short circuit after the first true test expression.
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:6775-6787](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6775-L6787)</ins>
</pre>

```clj
(defmacro cond->
  [expr & clauses]
  (assert (even? (count clauses)))
  (let [g (gensym)
        pstep (fn [[test step]] `(if ~test (-> ~g ~step) ~g))]
    `(let [~g ~expr
           ~@(interleave (repeat g) (map pstep (partition 2 clauses)))]
       ~g)))
```


---

```clj
{:ns "cljs.core",
 :name "cond->",
 :signature ["[expr & clauses]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core_cond-_GT_",
 :source {:code "(defmacro cond->\n  [expr & clauses]\n  (assert (even? (count clauses)))\n  (let [g (gensym)\n        pstep (fn [[test step]] `(if ~test (-> ~g ~step) ~g))]\n    `(let [~g ~expr\n           ~@(interleave (repeat g) (map pstep (partition 2 clauses)))]\n       ~g)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [6775 6787],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6775-L6787"},
 :full-name "cljs.core/cond->",
 :clj-symbol "clojure.core/cond->",
 :docstring "Takes an expression and a set of test/form pairs. Threads expr (via ->)\nthrough each form for which the corresponding test\nexpression is true. Note that, unlike cond branching, cond-> threading does\nnot short circuit after the first true test expression."}

```
