## cljs.core/when-let



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-let)
</td>
</tr>
</table>


 <samp>
(__when-let__ \[x test\] & body)<br>
</samp>

---

When `test` is logical true, evaluates `body` with the value of `test` bound to
`x`.



---


###### See Also:

[`cljs.core/if-let`](../cljs.core/if-let.md)<br>
[`cljs.core/when`](../cljs.core/when.md)<br>
[`cljs.core/when-not`](../cljs.core/when-not.md)<br>
[`if`](../special/if.md)<br>
[`cljs.core/when-first`](../cljs.core/when-first.md)<br>

---


Source docstring:

```
bindings => binding-form test

When test is true, evaluates body with binding-form bound to the value of test
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core.clj#L1769-L1782):

```clj
(defmacro when-let
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (when temp#
         (let [~form temp#]
           ~@body)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.8.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1769-1782](https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core.clj#L1769-L1782)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/when-let` @ clojuredocs](http://clojuredocs.org/clojure.core/when-let)<br>
[`clojure.core/when-let` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/when-let/)<br>
[`clojure.core/when-let` @ crossclj](http://crossclj.info/fun/clojure.core/when-let.html)<br>
[`cljs.core/when-let` @ crossclj](http://crossclj.info/fun/cljs.core/when-let.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/when-let.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "When `test` is logical true, evaluates `body` with the value of `test` bound to\n`x`.",
 :ns "cljs.core",
 :name "when-let",
 :signature ["[[x test] & body]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/if-let"
           "cljs.core/when"
           "cljs.core/when-not"
           "special/if"
           "cljs.core/when-first"],
 :full-name-encode "cljs.core/when-let",
 :source {:code "(defmacro when-let\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n    `(let [temp# ~tst]\n       (when temp#\n         (let [~form temp#]\n           ~@body)))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.8.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1769 1782]},
 :full-name "cljs.core/when-let",
 :clj-symbol "clojure.core/when-let",
 :docstring "bindings => binding-form test\n\nWhen test is true, evaluates body with binding-form bound to the value of test"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-let"]))
```

-->
