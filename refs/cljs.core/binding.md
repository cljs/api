## cljs.core/binding



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/binding</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/binding)
</td>
</tr>
</table>


 <samp>
(__binding__ bindings & body)<br>
</samp>

---

binding => var-symbol init-expr

Creates new bindings for the (already-existing) vars, with the
supplied initial values, executes the exprs in an implicit `do`, then
re-establishes the bindings that existed before.

The new bindings are made in parallel (unlike `let`); all init-exprs are
evaluated before the vars are bound to their new values.



---

###### Examples:

```clj
(def ^:dynamic *foo* 1)

(defn do-something []
  (println *foo*))

(binding [*foo* 2]
  (do-something))
;;=> prints 2

*foo*
;;=> 1
```



---

###### See Also:

[`cljs.core/let`](../cljs.core/let.md)<br>

---


Source docstring:

```
binding => var-symbol init-expr

Creates new bindings for the (already-existing) vars, with the
supplied initial values, executes the exprs in an implicit do, then
re-establishes the bindings that existed before.  The new bindings
are made in parallel (unlike let); all init-exprs are evaluated
before the vars are bound to their new values.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/core.clj#L1375-L1386):

```clj
(defmacro binding
  [bindings & body]
  (let [names (take-nth 2 bindings)]
    (cljs.analyzer/confirm-bindings &env names)
    `(with-redefs ~bindings ~@body)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:1375-1386](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/core.clj#L1375-L1386)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/binding` @ clojuredocs](http://clojuredocs.org/clojure.core/binding)<br>
[`clojure.core/binding` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/binding/)<br>
[`clojure.core/binding` @ crossclj](http://crossclj.info/fun/clojure.core/binding.html)<br>
[`cljs.core/binding` @ crossclj](http://crossclj.info/fun/cljs.core/binding.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/binding.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit `do`, then\nre-establishes the bindings that existed before.\n\nThe new bindings are made in parallel (unlike `let`); all init-exprs are\nevaluated before the vars are bound to their new values.",
 :ns "cljs.core",
 :name "binding",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/let"],
 :full-name-encode "cljs.core/binding",
 :source {:code "(defmacro binding\n  [bindings & body]\n  (let [names (take-nth 2 bindings)]\n    (cljs.analyzer/confirm-bindings &env names)\n    `(with-redefs ~bindings ~@body)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/core.clj",
          :lines [1375 1386]},
 :examples [{:id "7dd17f",
             :content "```clj\n(def ^:dynamic *foo* 1)\n\n(defn do-something []\n  (println *foo*))\n\n(binding [*foo* 2]\n  (do-something))\n;;=> prints 2\n\n*foo*\n;;=> 1\n```"}],
 :full-name "cljs.core/binding",
 :clj-symbol "clojure.core/binding",
 :docstring "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit do, then\nre-establishes the bindings that existed before.  The new bindings\nare made in parallel (unlike let); all init-exprs are evaluated\nbefore the vars are bound to their new values."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/binding"]))
```

-->
