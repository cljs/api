## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/as->

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/as-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/as-%3E)
</td>
</tr>
</table>

 <samp>
(__as->__ expr name & forms)<br>
</samp>

```
Binds name to expr, evaluates the first form in the lexical context
of that binding, then binds name to that result, repeating for each
successive form, returning the result of the last form.
```

---

 <pre>
clojure @ clojure-1.5.1
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:6803-6811](https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6803-L6811)</ins>
</pre>

```clj
(defmacro as->
  [expr name & forms]
  `(let [~name ~expr
         ~@(interleave (repeat name) forms)]
     ~name))
```


---

```clj
{:ns "cljs.core",
 :name "as->",
 :signature ["[expr name & forms]"],
 :history [["+" "0.0-1798"]],
 :type "macro",
 :full-name-encode "cljs.core_as-_GT_",
 :source {:code "(defmacro as->\n  [expr name & forms]\n  `(let [~name ~expr\n         ~@(interleave (repeat name) forms)]\n     ~name))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [6803 6811],
          :link "https://github.com/clojure/clojure/blob/clojure-1.5.1/src/clj/clojure/core.clj#L6803-L6811"},
 :full-name "cljs.core/as->",
 :clj-symbol "clojure.core/as->",
 :docstring "Binds name to expr, evaluates the first form in the lexical context\nof that binding, then binds name to that result, repeating for each\nsuccessive form, returning the result of the last form."}

```
