## cljs.core/case



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1211"><img valign="middle" alt="[+] 0.0-1211" title="Added in 0.0-1211" src="https://img.shields.io/badge/+-0.0--1211-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/case</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/case)
</td>
</tr>
</table>


 <samp>
(__case__ e & clauses)<br>
</samp>

---

Takes an expression and a set of clauses. Each clause can take the form of
either:

`test-constant result-expr`

`(test-constant1 ... test-constantN)  result-expr`

The test-constants are not evaluated. They must be compile-time literals, and
need not be quoted. If the expression is equal to a test-constant, the
corresponding `result-expr` is returned. A single default expression can follow
the clauses, and its value will be returned if no clause matches. If no default
expression is provided and no clause matches, an Error is thrown.

Unlike `cond` and `condp`, `case` does a constant-time dispatch, the clauses are
not considered sequentially. All manner of constant expressions are acceptable
in `case`, including numbers, strings, symbols, keywords, and ClojureScript
composites thereof. Note that since lists are used to group multiple constants
that map to the same expression, a vector can be used to match a list if needed.
The test-constants need not be all of the same type.



---

###### Examples:

```clj
(def a 1)
(def b 2)

(case a
  0 "zero"
  1 "one"
  "default")
;;=> "one"

(case b
  0 "zero"
  1 "one"
  "default")
;;=> "default"

(case b
  0 "zero"
  1 "one")
;; Error: No matching clause: 2
```



---

###### See Also:

[`cljs.core/cond`](../cljs.core/cond.md)<br>
[`cljs.core/condp`](../cljs.core/condp.md)<br>

---


Source docstring:

```
Takes an expression, and a set of clauses.

Each clause can take the form of either:

test-constant result-expr

(test-constant1 ... test-constantN)  result-expr

The test-constants are not evaluated. They must be compile-time
literals, and need not be quoted.  If the expression is equal to a
test-constant, the corresponding result-expr is returned. A single
default expression can follow the clauses, and its value will be
returned if no clause matches. If no default expression is provided
and no clause matches, an Error is thrown.

Unlike cond and condp, case does a constant-time dispatch, the
clauses are not considered sequentially.  All manner of constant
expressions are acceptable in case, including numbers, strings,
symbols, keywords, and (ClojureScript) composites thereof. Note that since
lists are used to group multiple constants that map to the same
expression, a vector can be used to match a list if needed. The
test-constants need not be all of the same type.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/core.clj#L1495-L1564):

```clj
(defmacro case
  [e & clauses]
  (core/let [default (if (odd? (count clauses))
                       (last clauses)
                       `(throw
                          (js/Error.
                            (core/str "No matching clause: " ~e))))
             env     &env
             pairs   (reduce
                       (fn [m [test expr]]
                         (core/cond
                           (seq? test)
                           (reduce
                             (fn [m test]
                               (let [test (if (core/symbol? test)
                                            (core/list 'quote test)
                                            test)]
                                 (assoc-test m test expr env)))
                             m test)
                           (core/symbol? test)
                           (assoc-test m (core/list 'quote test) expr env)
                           :else
                           (assoc-test m test expr env)))
                     {} (partition 2 clauses))
             esym    (gensym)
             tests   (keys pairs)]
    (cond
      (every? (some-fn core/number? core/string? core/char? #(const? env %)) tests)
      (core/let [no-default (if (odd? (count clauses)) (butlast clauses) clauses)
                 tests      (mapv #(if (seq? %) (vec %) [%]) (take-nth 2 no-default))
                 thens      (vec (take-nth 2 (drop 1 no-default)))]
        `(let [~esym ~e] (case* ~esym ~tests ~thens ~default)))

      (every? core/keyword? tests)
      (let [tests (->> tests
                       (map #(.substring (core/str %) 1))
                       vec
                       (mapv #(if (seq? %) (vec %) [%])))
            thens (vec (vals pairs))]
        `(let [~esym (if (keyword? ~e) (.-fqn ~e) nil)]
           (case* ~esym ~tests ~thens ~default)))
      
      ;; equality
      :else
      `(let [~esym ~e]
         (cond
           ~@(mapcat (fn [[m c]] `((cljs.core/= ~m ~esym) ~c)) pairs)
           :else ~default)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1495-1564](https://github.com/clojure/clojurescript/blob/r3211/src/clj/cljs/core.clj#L1495-L1564)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/case` @ clojuredocs](http://clojuredocs.org/clojure.core/case)<br>
[`clojure.core/case` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/case/)<br>
[`clojure.core/case` @ crossclj](http://crossclj.info/fun/clojure.core/case.html)<br>
[`cljs.core/case` @ crossclj](http://crossclj.info/fun/cljs.core/case.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/case.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Takes an expression and a set of clauses. Each clause can take the form of\neither:\n\n`test-constant result-expr`\n\n`(test-constant1 ... test-constantN)  result-expr`\n\nThe test-constants are not evaluated. They must be compile-time literals, and\nneed not be quoted. If the expression is equal to a test-constant, the\ncorresponding `result-expr` is returned. A single default expression can follow\nthe clauses, and its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an Error is thrown.\n\nUnlike `cond` and `condp`, `case` does a constant-time dispatch, the clauses are\nnot considered sequentially. All manner of constant expressions are acceptable\nin `case`, including numbers, strings, symbols, keywords, and ClojureScript\ncomposites thereof. Note that since lists are used to group multiple constants\nthat map to the same expression, a vector can be used to match a list if needed.\nThe test-constants need not be all of the same type.",
 :ns "cljs.core",
 :name "case",
 :signature ["[e & clauses]"],
 :history [["+" "0.0-1211"]],
 :type "macro",
 :related ["cljs.core/cond" "cljs.core/condp"],
 :full-name-encode "cljs.core/case",
 :source {:code "(defmacro case\n  [e & clauses]\n  (core/let [default (if (odd? (count clauses))\n                       (last clauses)\n                       `(throw\n                          (js/Error.\n                            (core/str \"No matching clause: \" ~e))))\n             env     &env\n             pairs   (reduce\n                       (fn [m [test expr]]\n                         (core/cond\n                           (seq? test)\n                           (reduce\n                             (fn [m test]\n                               (let [test (if (core/symbol? test)\n                                            (core/list 'quote test)\n                                            test)]\n                                 (assoc-test m test expr env)))\n                             m test)\n                           (core/symbol? test)\n                           (assoc-test m (core/list 'quote test) expr env)\n                           :else\n                           (assoc-test m test expr env)))\n                     {} (partition 2 clauses))\n             esym    (gensym)\n             tests   (keys pairs)]\n    (cond\n      (every? (some-fn core/number? core/string? core/char? #(const? env %)) tests)\n      (core/let [no-default (if (odd? (count clauses)) (butlast clauses) clauses)\n                 tests      (mapv #(if (seq? %) (vec %) [%]) (take-nth 2 no-default))\n                 thens      (vec (take-nth 2 (drop 1 no-default)))]\n        `(let [~esym ~e] (case* ~esym ~tests ~thens ~default)))\n\n      (every? core/keyword? tests)\n      (let [tests (->> tests\n                       (map #(.substring (core/str %) 1))\n                       vec\n                       (mapv #(if (seq? %) (vec %) [%])))\n            thens (vec (vals pairs))]\n        `(let [~esym (if (keyword? ~e) (.-fqn ~e) nil)]\n           (case* ~esym ~tests ~thens ~default)))\n      \n      ;; equality\n      :else\n      `(let [~esym ~e]\n         (cond\n           ~@(mapcat (fn [[m c]] `((cljs.core/= ~m ~esym) ~c)) pairs)\n           :else ~default)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/clj/cljs/core.clj",
          :lines [1495 1564]},
 :examples [{:id "09a90c",
             :content "```clj\n(def a 1)\n(def b 2)\n\n(case a\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"one\"\n\n(case b\n  0 \"zero\"\n  1 \"one\"\n  \"default\")\n;;=> \"default\"\n\n(case b\n  0 \"zero\"\n  1 \"one\")\n;; Error: No matching clause: 2\n```"}],
 :full-name "cljs.core/case",
 :clj-symbol "clojure.core/case",
 :docstring "Takes an expression, and a set of clauses.\n\nEach clause can take the form of either:\n\ntest-constant result-expr\n\n(test-constant1 ... test-constantN)  result-expr\n\nThe test-constants are not evaluated. They must be compile-time\nliterals, and need not be quoted.  If the expression is equal to a\ntest-constant, the corresponding result-expr is returned. A single\ndefault expression can follow the clauses, and its value will be\nreturned if no clause matches. If no default expression is provided\nand no clause matches, an Error is thrown.\n\nUnlike cond and condp, case does a constant-time dispatch, the\nclauses are not considered sequentially.  All manner of constant\nexpressions are acceptable in case, including numbers, strings,\nsymbols, keywords, and (ClojureScript) composites thereof. Note that since\nlists are used to group multiple constants that map to the same\nexpression, a vector can be used to match a list if needed. The\ntest-constants need not be all of the same type."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/case"]))
```

-->
