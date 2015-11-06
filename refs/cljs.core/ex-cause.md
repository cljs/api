## cljs.core/ex-cause



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ex-cause__ ex)<br>
</samp>

---





Source docstring:

```
Alpha - subject to change.
Returns exception cause (an Error / ExceptionInfo) if ex is an
ExceptionInfo.
Otherwise returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L7510-L7517):

```clj
(defn ex-cause
  [ex]
  (when (instance? ExceptionInfo ex)
    (.-cause ex)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1933
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7510-7517](https://github.com/clojure/clojurescript/blob/r1933/src/cljs/cljs/core.cljs#L7510-L7517)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ex-cause` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ex-cause.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ex-cause.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ex-cause",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core/ex-cause",
 :source {:code "(defn ex-cause\n  [ex]\n  (when (instance? ExceptionInfo ex)\n    (.-cause ex)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1933",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7510 7517]},
 :full-name "cljs.core/ex-cause",
 :docstring "Alpha - subject to change.\nReturns exception cause (an Error / ExceptionInfo) if ex is an\nExceptionInfo.\nOtherwise returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-cause"]))
```

-->
