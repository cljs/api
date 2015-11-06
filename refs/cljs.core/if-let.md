## cljs.core/if-let



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-let</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-let)
</td>
</tr>
</table>


 <samp>
(__if-let__ \[x test\] then)<br>
</samp>
 <samp>
(__if-let__ \[x test\] then else)<br>
</samp>

---

When `test` is logical true, evaluates `then` with the value of `test` bound to
`x`. Otherwise, evaluates `else` with no bindings.

`else` defaults to nil.



---


###### See Also:

[`cljs.core/when-let`](../cljs.core/when-let.md)<br>
[`if`](../special/if.md)<br>

---


Source docstring:

```
bindings => binding-form test

If test is true, evaluates then with binding-form bound to the value of 
test, if not, yields else
```


Source code @ [github](https://github.com/clojure/clojure/blob/clojure-1.7.0/src/clj/clojure/core.clj#L1727-L1745):

```clj
(defmacro if-let
  ([bindings then]
   `(if-let ~bindings ~then nil))
  ([bindings then else & oldform]
   (assert-args
     (vector? bindings) "a vector for its binding"
     (nil? oldform) "1 or 2 forms after binding vector"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
     `(let [temp# ~tst]
        (if temp#
          (let [~form temp#]
            ~then)
          ~else)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.7.0
└── src
    └── clj
        └── clojure
            └── <ins>[core.clj:1727-1745](https://github.com/clojure/clojure/blob/clojure-1.7.0/src/clj/clojure/core.clj#L1727-L1745)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/if-let` @ clojuredocs](http://clojuredocs.org/clojure.core/if-let)<br>
[`clojure.core/if-let` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/if-let/)<br>
[`clojure.core/if-let` @ crossclj](http://crossclj.info/fun/clojure.core/if-let.html)<br>
[`cljs.core/if-let` @ crossclj](http://crossclj.info/fun/cljs.core/if-let.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/if-let.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "When `test` is logical true, evaluates `then` with the value of `test` bound to\n`x`. Otherwise, evaluates `else` with no bindings.\n\n`else` defaults to nil.",
 :ns "cljs.core",
 :name "if-let",
 :signature ["[[x test] then]" "[[x test] then else]"],
 :history [["+" "0.0-927"]],
 :type "macro",
 :related ["cljs.core/when-let" "special/if"],
 :full-name-encode "cljs.core/if-let",
 :source {:code "(defmacro if-let\n  ([bindings then]\n   `(if-let ~bindings ~then nil))\n  ([bindings then else & oldform]\n   (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (nil? oldform) \"1 or 2 forms after binding vector\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n     `(let [temp# ~tst]\n        (if temp#\n          (let [~form temp#]\n            ~then)\n          ~else)))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.7.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1727 1745]},
 :full-name "cljs.core/if-let",
 :clj-symbol "clojure.core/if-let",
 :docstring "bindings => binding-form test\n\nIf test is true, evaluates then with binding-form bound to the value of \ntest, if not, yields else"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-let"]))
```

-->
