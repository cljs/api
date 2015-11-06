## cljs.core/when-some



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/when-some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/when-some)
</td>
</tr>
</table>


 <samp>
(__when-some__ \[x test\] & body)<br>
</samp>

---

When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.



---


###### See Also:

[`cljs.core/if-some`](../cljs.core/if-some.md)<br>

---


Source docstring:

```
bindings => binding-form test

When test is not nil, evaluates body with binding-form bound to the
value of test
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L1780-L1795):

```clj
(defmacro when-some
  [bindings & body]
  (assert-args
     (vector? bindings) "a vector for its binding"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (if (nil? temp#)
         nil
         (let [~form temp#]
           ~@body)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0-beta2
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1780-1795](https://github.com/clojure/clojure/blob/clojure-1.7.0-beta2/src/clj/clojure/core.clj#L1780-L1795)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/when-some` @ clojuredocs](http://clojuredocs.org/clojure.core/when-some)<br>
[`clojure.core/when-some` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/when-some/)<br>
[`clojure.core/when-some` @ crossclj](http://crossclj.info/fun/clojure.core/when-some.html)<br>
[`cljs.core/when-some` @ crossclj](http://crossclj.info/fun/cljs.core/when-some.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/when-some.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "When `test` is not nil, evaluates `body` with `x` bound to the value of `test`.",
 :ns "cljs.core",
 :name "when-some",
 :signature ["[[x test] & body]"],
 :history [["+" "0.0-2261"]],
 :type "macro",
 :related ["cljs.core/if-some"],
 :full-name-encode "cljs.core/when-some",
 :source {:code "(defmacro when-some\n  [bindings & body]\n  (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n    `(let [temp# ~tst]\n       (if (nil? temp#)\n         nil\n         (let [~form temp#]\n           ~@body)))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0-beta2",
          :filename "src/clj/clojure/core.clj",
          :lines [1780 1795]},
 :full-name "cljs.core/when-some",
 :clj-symbol "clojure.core/when-some",
 :docstring "bindings => binding-form test\n\nWhen test is not nil, evaluates body with binding-form bound to the\nvalue of test"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/when-some"]))
```

-->
