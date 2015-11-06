## cljs.core/\*ns\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*ns\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*ns*)
</td>
</tr>
</table>







Source docstring:

```
Var bound to the current namespace. Only used for bootstrapping.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L29-L32):

```clj
(def
  ^{:dynamic true
    :doc "Var bound to the current namespace. Only used for bootstrapping."}
  *ns* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.48
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:29-32](https://github.com/clojure/clojurescript/blob/r1.7.48/src/main/cljs/cljs/core.cljs#L29-L32)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*ns*` @ clojuredocs](http://clojuredocs.org/clojure.core/*ns*)<br>
[`clojure.core/*ns*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*ns*/)<br>
[`clojure.core/*ns*` @ crossclj](http://crossclj.info/fun/clojure.core/*ns*.html)<br>
[`cljs.core/*ns*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*ns*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARnsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*ns*",
 :history [["+" "1.7.10"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARnsSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"Var bound to the current namespace. Only used for bootstrapping.\"}\n  *ns* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.48",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [29 32]},
 :full-name "cljs.core/*ns*",
 :clj-symbol "clojure.core/*ns*",
 :docstring "Var bound to the current namespace. Only used for bootstrapping."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*ns*"]))
```

-->
