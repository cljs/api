## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/cond

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/cond</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/cond)
</td>
</tr>
</table>

 <samp>
(__cond__ & clauses)<br>
</samp>

```
Takes a set of test/expr pairs. It evaluates each test one at a
time.  If a test returns logical true, cond evaluates and returns
the value of the corresponding expr and doesn't evaluate any of the
other tests or exprs. (cond) returns nil.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:535-548](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L535-L548)</ins>
</pre>

```clj
(defmacro cond
  [& clauses]
    (when clauses
      (list 'if (first clauses)
            (if (next clauses)
                (second clauses)
                (throw (IllegalArgumentException.
                         "cond requires an even number of forms")))
            (cons 'clojure.core/cond (next (next clauses))))))
```


---

```clj
{:ns "cljs.core",
 :name "cond",
 :signature ["[& clauses]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_cond",
 :source {:code "(defmacro cond\n  [& clauses]\n    (when clauses\n      (list 'if (first clauses)\n            (if (next clauses)\n                (second clauses)\n                (throw (IllegalArgumentException.\n                         \"cond requires an even number of forms\")))\n            (cons 'clojure.core/cond (next (next clauses))))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [535 548],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L535-L548"},
 :full-name "cljs.core/cond",
 :clj-symbol "clojure.core/cond",
 :docstring "Takes a set of test/expr pairs. It evaluates each test one at a\ntime.  If a test returns logical true, cond evaluates and returns\nthe value of the corresponding expr and doesn't evaluate any of the\nother tests or exprs. (cond) returns nil."}

```
