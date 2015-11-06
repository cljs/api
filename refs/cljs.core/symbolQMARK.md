## cljs.core/symbol?



 <table border="1">
<tr>
<td>function/macro</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/symbol?</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/symbol?)
</td>
</tr>
</table>


 <samp>
(__symbol?__ x)<br>
</samp>

---





Source docstring:

```
Return true if x is a Symbol
```


Function code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L901-L904):

```clj
(defn ^boolean symbol?
  [x]
  (instance? Symbol x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:901-904](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L901-L904)</ins>
</pre>

-->

---

Macro code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/core.cljc#L934-L935):

```clj
(core/defmacro symbol? [x]
  (bool-expr `(instance? Symbol ~x)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[core.cljc:934-935](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/clojure/cljs/core.cljc#L934-L935)</ins>
</pre>
-->

---


###### External doc links:

[`clojure.core/symbol?` @ clojuredocs](http://clojuredocs.org/clojure.core/symbol_q)<br>
[`clojure.core/symbol?` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/symbol%3F/)<br>
[`clojure.core/symbol?` @ crossclj](http://crossclj.info/fun/clojure.core/symbol%3F.html)<br>
[`cljs.core/symbol?` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/symbol%3F.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/symbolQMARK.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:return-type boolean,
 :ns "cljs.core",
 :name "symbol?",
 :signature ["[x]"],
 :history [["+" "0.0-927"]],
 :type "function/macro",
 :full-name-encode "cljs.core/symbolQMARK",
 :source {:code "(defn ^boolean symbol?\n  [x]\n  (instance? Symbol x))",
          :title "Function code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [901 904]},
 :extra-sources [{:code "(core/defmacro symbol? [x]\n  (bool-expr `(instance? Symbol ~x)))",
                  :title "Macro code",
                  :repo "clojurescript",
                  :tag "r1.7.145",
                  :filename "src/main/clojure/cljs/core.cljc",
                  :lines [934 935]}],
 :full-name "cljs.core/symbol?",
 :clj-symbol "clojure.core/symbol?",
 :docstring "Return true if x is a Symbol"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/symbol?"]))
```

-->
