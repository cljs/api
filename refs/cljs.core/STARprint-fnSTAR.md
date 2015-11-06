## cljs.core/\*print-fn\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
Each runtime environment provides a different way to print output.
Whatever function *print-fn* is bound to will be passed any
Strings which should be printed.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L20-L26):

```clj
(def
  ^{:doc "Each runtime environment provides a different way to print output.
  Whatever function *print-fn* is bound to will be passed any
  Strings which should be printed." :dynamic true}
  *print-fn*
  (fn [_]
    (throw (js/Error. "No *print-fn* fn set for evaluation environment"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2234
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:20-26](https://github.com/clojure/clojurescript/blob/r2234/src/cljs/cljs/core.cljs#L20-L26)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/*print-fn*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-fn*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-fn*",
 :docstring "Each runtime environment provides a different way to print output.\nWhatever function *print-fn* is bound to will be passed any\nStrings which should be printed.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:doc \"Each runtime environment provides a different way to print output.\n  Whatever function *print-fn* is bound to will be passed any\n  Strings which should be printed.\" :dynamic true}\n  *print-fn*\n  (fn [_]\n    (throw (js/Error. \"No *print-fn* fn set for evaluation environment\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2234",
          :filename "src/cljs/cljs/core.cljs",
          :lines [20 26]},
 :full-name "cljs.core/*print-fn*",
 :full-name-encode "cljs.core/STARprint-fnSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-fn*"]))
```

-->
