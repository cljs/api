## cljs.core/if-some



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2261"><img valign="middle" alt="[+] 0.0-2261" title="Added in 0.0-2261" src="https://img.shields.io/badge/+-0.0--2261-lightgrey.svg"></a> </td>
<td>
imported [<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/if-some</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-some)
</td>
</tr>
</table>

<samp>(if-some \[x test\] then)</samp><br>
<samp>(if-some \[x test\] then else)</samp><br>

---

 <samp>
(__if-some__ \[x test\] then)<br>
</samp>
 <samp>
(__if-some__ \[x test\] then else)<br>
</samp>

---

If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If
not, yields `else`.



---


###### See Also:

[`cljs.core/when-some`](../cljs.core/when-some.md)<br>

---


Source docstring:

```
bindings => binding-form test

If test is not nil, evaluates then with binding-form bound to the
value of test, if not, yields else
```


Source code @ [github]():

```clj
(defmacro if-some
  ([bindings then]
   `(if-some ~bindings ~then nil))
  ([bindings then else & oldform]
   (assert-args
     (vector? bindings) "a vector for its binding"
     (nil? oldform) "1 or 2 forms after binding vector"
     (= 2 (count bindings)) "exactly 2 forms in binding vector")
   (let [form (bindings 0) tst (bindings 1)]
     `(let [temp# ~tst]
        (if (nil? temp#)
          ~else
          (let [~form temp#]
            ~then))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`clojure.core/if-some` @ clojuredocs](http://clojuredocs.org/clojure.core/if-some)<br>
[`clojure.core/if-some` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/if-some/)<br>
[`clojure.core/if-some` @ crossclj](http://crossclj.info/fun/clojure.core/if-some.html)<br>
[`cljs.core/if-some` @ crossclj](http://crossclj.info/fun/cljs.core/if-some.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/if-some.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "If `test` is not nil, evaluates `then` with `x` bound to the value of `test`. If\nnot, yields `else`.",
 :ns "cljs.core",
 :name "if-some",
 :signature ["[[x test] then]" "[[x test] then else]"],
 :name-encode "if-some",
 :history [["+" "0.0-2261"]],
 :type "macro",
 :clj-equiv {:full-name "clojure.core/if-some",
             :url "http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/if-some"},
 :related ["cljs.core/when-some"],
 :full-name-encode "cljs.core/if-some",
 :source {:code "(defmacro if-some\n  ([bindings then]\n   `(if-some ~bindings ~then nil))\n  ([bindings then else & oldform]\n   (assert-args\n     (vector? bindings) \"a vector for its binding\"\n     (nil? oldform) \"1 or 2 forms after binding vector\"\n     (= 2 (count bindings)) \"exactly 2 forms in binding vector\")\n   (let [form (bindings 0) tst (bindings 1)]\n     `(let [temp# ~tst]\n        (if (nil? temp#)\n          ~else\n          (let [~form temp#]\n            ~then))))))",
          :title "Source code",
          :repo "clojure",
          :tag "clojure-1.8.0",
          :filename "src/clj/clojure/core.clj",
          :lines [1784 1802],
          :url "https://github.com/clojure/clojure/blob/clojure-1.8.0/src/clj/clojure/core.clj#L1784-L1802"},
 :usage ["(if-some [x test] then)" "(if-some [x test] then else)"],
 :full-name "cljs.core/if-some",
 :docstring "bindings => binding-form test\n\nIf test is not nil, evaluates then with binding-form bound to the\nvalue of test, if not, yields else",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/if-some.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/if-some"]))
```

-->
