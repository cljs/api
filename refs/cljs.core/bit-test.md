## cljs.core/bit-test



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/bit-test</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/bit-test)
</td>
</tr>
</table>


 <samp>
(__bit-test__ x n)<br>
</samp>

---

Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.



---

###### Examples:

Bits can be entered using radix notation:

```clj
(bit-test 2r0100 2)
;;=> true

(bit-test 2r0100 1)
;;=> false
```

Same numbers in decimal:

```clj
(bit-test 4 2)
;;=> true

(bit-test 4 1)
;;=> false
```



---



Source docstring:

```
Test bit at index n
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L1688-L1691):

```clj
(defn bit-test
  [x n]
  (cljs.core/bit-test x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2014
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1688-1691](https://github.com/clojure/clojurescript/blob/r2014/src/cljs/cljs/core.cljs#L1688-L1691)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r2014/src/clj/cljs/core.clj#L496-L497):

```clj
(defmacro bit-test [x n]
  (list 'js* "((~{} & (1 << ~{})) != 0)" x n))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2014
└── src
    └── clj
        └── cljs
            └── <ins>[core.clj:496-497](https://github.com/clojure/clojurescript/blob/r2014/src/clj/cljs/core.clj#L496-L497)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/bit-test` @ clojuredocs](http://clojuredocs.org/clojure.core/bit-test)<br>
[`clojure.core/bit-test` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/bit-test/)<br>
[`clojure.core/bit-test` @ crossclj](http://crossclj.info/fun/clojure.core/bit-test.html)<br>
[`cljs.core/bit-test` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/bit-test.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/bit-test.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Test bit at index `n`. Returns `true` if 1, and `false` if 0. Same as `(x & (1 << y)) != 0` in JavaScript.",
 :ns "cljs.core",
 :name "bit-test",
 :signature ["[x n]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/bit-test",
 :source {:code "(defn bit-test\n  [x n]\n  (cljs.core/bit-test x n))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r2014",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1688 1691]},
 :extra-sources [{:code "(defmacro bit-test [x n]\n  (list 'js* \"((~{} & (1 << ~{})) != 0)\" x n))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r2014",
                  :filename "src/clj/cljs/core.clj",
                  :lines [496 497]}],
 :examples [{:id "f64664",
             :content "Bits can be entered using radix notation:\n\n```clj\n(bit-test 2r0100 2)\n;;=> true\n\n(bit-test 2r0100 1)\n;;=> false\n```\n\nSame numbers in decimal:\n\n```clj\n(bit-test 4 2)\n;;=> true\n\n(bit-test 4 1)\n;;=> false\n```"}],
 :full-name "cljs.core/bit-test",
 :clj-symbol "clojure.core/bit-test",
 :docstring "Test bit at index n"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/bit-test"]))
```

-->
