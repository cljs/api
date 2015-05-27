## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/when-let

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-let)
</td>
</tr>
</table>

 <samp>
(__when-let__ bindings & body)<br>
</samp>

```
bindings => binding-form test

When test is true, evaluates body with binding-form bound to the value of test
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1685-1698](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1685-L1698)</ins>
</pre>

```clj
(defmacro when-let
  [bindings & body]
  (assert-args when-let
     (vector? bindings) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (when temp#
         (let [~form temp#]
           ~@body)))))
```


---

```clj
{:ns "cljs.core",
 :name "when-let",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_when-let",
 :source {:code "(defmacro when-let\n  [bindings & body]\n  (assert-args when-let\n     (vector? bindings) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n    `(let [temp# ~tst]\n       (when temp#\n         (let [~form temp#]\n           ~@body)))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [1685 1698],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1685-L1698"},
 :full-name "cljs.core/when-let",
 :clj-symbol "clojure.core/when-let",
 :docstring "bindings => binding-form test\n\nWhen test is true, evaluates body with binding-form bound to the value of test"}

```
