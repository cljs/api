## throw



 <table border="1">
<tr>
<td>special form</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/throw</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/throw)
</td>
</tr>
</table>


 <samp>
(__throw__ expr)<br>
</samp>

---

`expr` is evaluated and thrown, hopefully to be caught by a `try` expression.

`(throw (js/Error. "Oops!"))`



---


###### See Also:

[``](../special/try.md)<br>
[`catch`](../special/catch.md)<br>
[`finally`](../special/finally.md)<br>

---




Parser code @ [github](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L648-L653):

```clj
(defmethod parse 'throw
  [op env [_ throw :as form] name]
  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]
    {:env env :op :throw :form form
     :throw throw-expr
     :children [throw-expr]}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1006
└── src
    └── clj
        └── cljs
            └── <ins>[compiler.clj:648-653](https://github.com/clojure/clojurescript/blob/r1006/src/clj/cljs/compiler.clj#L648-L653)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/throw` @ clojuredocs](http://clojuredocs.org/clojure.core/throw)<br>
[`clojure.core/throw` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/throw/)<br>
[`clojure.core/throw` @ crossclj](http://crossclj.info/fun/clojure.core/throw.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/special/throw.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "`expr` is evaluated and thrown, hopefully to be caught by a `try` expression.\n\n`(throw (js/Error. \"Oops!\"))`",
 :ns "special",
 :name "throw",
 :signature ["[expr]"],
 :history [["+" "0.0-927"]],
 :type "special form",
 :related ["special/try" "special/catch" "special/finally"],
 :full-name-encode "special/throw",
 :source {:code "(defmethod parse 'throw\n  [op env [_ throw :as form] name]\n  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]\n    {:env env :op :throw :form form\n     :throw throw-expr\n     :children [throw-expr]}))",
          :title "Parser code",
          :repo "clojurescript",
          :tag "r1006",
          :filename "src/clj/cljs/compiler.clj",
          :lines [648 653]},
 :full-name "special/throw",
 :clj-symbol "clojure.core/throw"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "special/throw"]))
```

-->
