## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/or

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/or</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/or)
</td>
</tr>
</table>

 <samp>
(__or__)<br>
(__or__ x)<br>
(__or__ x & next)<br>
</samp>

```
Evaluates exprs one at a time, from left to right. If a form
returns a logical true value, or returns that value and doesn't
evaluate any of the other expressions, otherwise it returns the
value of the last expression. (or) returns nil.
```

---

 <pre>
clojure @ clojure-1.4.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:790-800](https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L790-L800)</ins>
</pre>

```clj
(defmacro or
  ([] nil)
  ([x] x)
  ([x & next]
      `(let [or# ~x]
         (if or# or# (or ~@next)))))
```


---

```clj
{:ns "cljs.core",
 :name "or",
 :signature ["[]" "[x]" "[x & next]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_or",
 :source {:code "(defmacro or\n  ([] nil)\n  ([x] x)\n  ([x & next]\n      `(let [or# ~x]\n         (if or# or# (or ~@next)))))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [790 800],
          :link "https://github.com/clojure/clojure/blob/clojure-1.4.0/src/clj/clojure/core.clj#L790-L800"},
 :full-name "cljs.core/or",
 :clj-symbol "clojure.core/or",
 :docstring "Evaluates exprs one at a time, from left to right. If a form\nreturns a logical true value, or returns that value and doesn't\nevaluate any of the other expressions, otherwise it returns the\nvalue of the last expression. (or) returns nil."}

```
