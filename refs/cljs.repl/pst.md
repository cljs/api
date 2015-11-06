## cljs.repl/pst



 <table border="1">
<tr>
<td>macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.repl/pst</samp>](http://clojure.github.io/clojure/branch-master/clojure.repl-api.html#clojure.repl/pst)
</td>
</tr>
</table>


 <samp>
(__pst__ e)<br>
</samp>

---

Print Stack Trace for a given exception `e` or the most recent
exception, stored implicitly by [`*e`][doc:cljs.core/*e].

[doc:cljs.core/*e]:../cljs.core/STARe.md

---






Source code @ [github](https://github.com/clojure/clojurescript/blob/r3030/src/clj/cljs/repl.clj#L994-L1011):

```clj
(defmacro pst
  ([] `(pst *e))
  ([e]
   (let [{:keys [repl-env] :as env} &env]
     (when (and e repl-env)
       (when-let [ret (if (satisfies? IGetError repl-env)
                   (-get-error repl-env e env *repl-opts*)
                   (edn/read-string
                     (evaluate-form repl-env env "<cljs repl>"
                       `(when ~e
                          (pr-str
                            {:value (.-message ~e)
                             :stacktrace (.-stack ~e)})))))]
         (display-error repl-env
           (if (satisfies? IParseError repl-env)
             (-parse-error repl-env ret *repl-opts*)
             ret)
           nil *repl-opts*))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3030
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:994-1011](https://github.com/clojure/clojurescript/blob/r3030/src/clj/cljs/repl.clj#L994-L1011)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.repl/pst` @ clojuredocs](http://clojuredocs.org/clojure.repl/pst)<br>
[`clojure.repl/pst` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.repl/pst/)<br>
[`clojure.repl/pst` @ crossclj](http://crossclj.info/fun/clojure.repl/pst.html)<br>
[`cljs.repl/pst` @ crossclj](http://crossclj.info/fun/cljs.repl/pst.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/pst.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Print Stack Trace for a given exception `e` or the most recent\nexception, stored implicitly by [doc:cljs.core/*e].",
 :ns "cljs.repl",
 :name "pst",
 :signature ["[e]"],
 :history [["+" "0.0-2985"]],
 :type "macro",
 :full-name-encode "cljs.repl/pst",
 :source {:code "(defmacro pst\n  ([] `(pst *e))\n  ([e]\n   (let [{:keys [repl-env] :as env} &env]\n     (when (and e repl-env)\n       (when-let [ret (if (satisfies? IGetError repl-env)\n                   (-get-error repl-env e env *repl-opts*)\n                   (edn/read-string\n                     (evaluate-form repl-env env \"<cljs repl>\"\n                       `(when ~e\n                          (pr-str\n                            {:value (.-message ~e)\n                             :stacktrace (.-stack ~e)})))))]\n         (display-error repl-env\n           (if (satisfies? IParseError repl-env)\n             (-parse-error repl-env ret *repl-opts*)\n             ret)\n           nil *repl-opts*))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/clj/cljs/repl.clj",
          :lines [994 1011]},
 :full-name "cljs.repl/pst",
 :clj-symbol "clojure.repl/pst"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/pst"]))
```

-->
