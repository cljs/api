## cljs.test/try-expr



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.test/try-expr</samp>](http://clojure.github.io/clojure/branch-master/clojure.test-api.html#clojure.test/try-expr)
</td>
</tr>
</table>


 <samp>
(__try-expr__ msg form)<br>
</samp>

---





Source docstring:

```
Used by the 'is' macro to catch unexpected exceptions.
You don't call this.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/test.clj#L135-L144):

```clj
(defmacro try-expr
  [msg form]
  `(try
     ~(cljs.test/assert-expr &env msg form)
     (catch :default t#
       (cljs.test/do-report 
         {:type :error, :message ~msg,
          :expected '~form, :actual t#}))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3263
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[test.clj:135-144](https://github.com/clojure/clojurescript/blob/r3263/src/main/clojure/cljs/test.clj#L135-L144)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.test/try-expr` @ clojuredocs](http://clojuredocs.org/clojure.test/try-expr)<br>
[`clojure.test/try-expr` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.test/try-expr/)<br>
[`clojure.test/try-expr` @ crossclj](http://crossclj.info/fun/clojure.test/try-expr.html)<br>
[`cljs.test/try-expr` @ crossclj](http://crossclj.info/fun/cljs.test/try-expr.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/try-expr.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "try-expr",
 :signature ["[msg form]"],
 :history [["+" "0.0-2496"]],
 :type "macro",
 :full-name-encode "cljs.test/try-expr",
 :source {:code "(defmacro try-expr\n  [msg form]\n  `(try\n     ~(cljs.test/assert-expr &env msg form)\n     (catch :default t#\n       (cljs.test/do-report \n         {:type :error, :message ~msg,\n          :expected '~form, :actual t#}))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3263",
          :filename "src/main/clojure/cljs/test.clj",
          :lines [135 144]},
 :full-name "cljs.test/try-expr",
 :clj-symbol "clojure.test/try-expr",
 :docstring "Used by the 'is' macro to catch unexpected exceptions.\nYou don't call this."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/try-expr"]))
```

-->
