## cljs.core/with-redefs



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1806"><img valign="middle" alt="[+] 0.0-1806" title="Added in 0.0-1806" src="https://img.shields.io/badge/+-0.0--1806-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/with-redefs</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/with-redefs)
</td>
</tr>
</table>


 <samp>
(__with-redefs__ bindings & body)<br>
</samp>

---





Source docstring:

```
binding => var-symbol temp-value-expr

Temporarily redefines vars while executing the body.  The
temp-value-exprs will be evaluated and each resulting value will
replace in parallel the root value of its var.  After the body is
executed, the root values of all the vars will be set back to their
old values. Useful for mocking out functions during testing.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/core.clj#L1405-L1425):

```clj
(defmacro with-redefs
  [bindings & body]
  (let [names (take-nth 2 bindings)
        vals (take-nth 2 (drop 1 bindings))
        tempnames (map (comp gensym name) names)
        binds (map core/vector names vals)
        resets (reverse (map core/vector names tempnames))
        bind-value (fn [[k v]] (core/list 'set! k v))]
    `(let [~@(interleave tempnames names)]
       ~@(map bind-value binds)
       (try
         ~@body
        (finally
          ~@(map bind-value resets))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.clj:1405-1425](https://github.com/clojure/clojurescript/blob/r3291/src/main/clojure/cljs/core.clj#L1405-L1425)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/with-redefs` @ clojuredocs](http://clojuredocs.org/clojure.core/with-redefs)<br>
[`clojure.core/with-redefs` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/with-redefs/)<br>
[`clojure.core/with-redefs` @ crossclj](http://crossclj.info/fun/clojure.core/with-redefs.html)<br>
[`cljs.core/with-redefs` @ crossclj](http://crossclj.info/fun/cljs.core/with-redefs.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/with-redefs.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "with-redefs",
 :signature ["[bindings & body]"],
 :history [["+" "0.0-1806"]],
 :type "macro",
 :full-name-encode "cljs.core/with-redefs",
 :source {:code "(defmacro with-redefs\n  [bindings & body]\n  (let [names (take-nth 2 bindings)\n        vals (take-nth 2 (drop 1 bindings))\n        tempnames (map (comp gensym name) names)\n        binds (map core/vector names vals)\n        resets (reverse (map core/vector names tempnames))\n        bind-value (fn [[k v]] (core/list 'set! k v))]\n    `(let [~@(interleave tempnames names)]\n       ~@(map bind-value binds)\n       (try\n         ~@body\n        (finally\n          ~@(map bind-value resets))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/clojure/cljs/core.clj",
          :lines [1405 1425]},
 :full-name "cljs.core/with-redefs",
 :clj-symbol "clojure.core/with-redefs",
 :docstring "binding => var-symbol temp-value-expr\n\nTemporarily redefines vars while executing the body.  The\ntemp-value-exprs will be evaluated and each resulting value will\nreplace in parallel the root value of its var.  After the body is\nexecuted, the root values of all the vars will be set back to their\nold values. Useful for mocking out functions during testing."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/with-redefs"]))
```

-->
