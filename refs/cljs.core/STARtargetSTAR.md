## cljs.core/\*target\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2985"><img valign="middle" alt="[+] 0.0-2985" title="Added in 0.0-2985" src="https://img.shields.io/badge/+-0.0--2985-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Var bound to the name value of the compiler build :target option.
For example, if the compiler build :target is :nodejs, *target* will be bound
to "nodejs". *target* is a Google Closure define and can be set by compiler
:closure-defines option.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L20-L27):

```clj
(def
  ^{:dynamic true
    :doc "Var bound to the name value of the compiler build :target option.
  For example, if the compiler build :target is :nodejs, *target* will be bound
  to \"nodejs\". *target* is a Google Closure define and can be set by compiler
  :closure-defines option."
    :jsdoc ["@define {string}"]}
  *target* "default")
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3211
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:20-27](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L20-L27)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/*target*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*target*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARtargetSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*target*",
 :docstring "Var bound to the name value of the compiler build :target option.\nFor example, if the compiler build :target is :nodejs, *target* will be bound\nto \"nodejs\". *target* is a Google Closure define and can be set by compiler\n:closure-defines option.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"Var bound to the name value of the compiler build :target option.\n  For example, if the compiler build :target is :nodejs, *target* will be bound\n  to \\\"nodejs\\\". *target* is a Google Closure define and can be set by compiler\n  :closure-defines option.\"\n    :jsdoc [\"@define {string}\"]}\n  *target* \"default\")",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3211",
          :filename "src/cljs/cljs/core.cljs",
          :lines [20 27]},
 :full-name "cljs.core/*target*",
 :full-name-encode "cljs.core/STARtargetSTAR",
 :history [["+" "0.0-2985"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*target*"]))
```

-->
