## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> cljs.core/->

 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/-></samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/-%3E)
</td>
</tr>
</table>

 <samp>
(__->__ x)<br>
(__->__ x form)<br>
(__->__ x form & more)<br>
</samp>

```
Threads the expr through the forms. Inserts x as the
second item in the first form, making a list of it if it is not a
list already. If there are more forms, inserts the first form as the
second item in second form, etc.
```

---

 <pre>
clojure @ clojure-1.3.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1528-1538](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1528-L1538)</ins>
</pre>

```clj
(defmacro ->
  ([x] x)
  ([x form] (if (seq? form)
              (with-meta `(~(first form) ~x ~@(next form)) (meta form))
              (list form x)))
  ([x form & more] `(-> (-> ~x ~form) ~@more)))
```


---

```clj
{:ns "cljs.core",
 :name "->",
 :signature ["[x]" "[x form]" "[x form & more]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :full-name-encode "cljs.core_-_GT_",
 :source {:code "(defmacro ->\n  ([x] x)\n  ([x form] (if (seq? form)\n              (with-meta `(~(first form) ~x ~@(next form)) (meta form))\n              (list form x)))\n  ([x form & more] `(-> (-> ~x ~form) ~@more)))",
          :filename "clojure/src/clj/clojure/core.clj",
          :lines [1528 1538],
          :link "https://github.com/clojure/clojure/blob/clojure-1.3.0/src/clj/clojure/core.clj#L1528-L1538"},
 :full-name "cljs.core/->",
 :clj-symbol "clojure.core/->",
 :docstring "Threads the expr through the forms. Inserts x as the\nsecond item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nsecond item in second form, etc."}

```
