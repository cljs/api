## cljs.core/ex-message



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__ex-message__ ex)<br>
</samp>

---





Source docstring:

```
Alpha - subject to change.
Returns the message attached to the given Error / ExceptionInfo object.
For non-Errors returns nil.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L9081-L9087):

```clj
(defn ex-message
  [ex]
  (when (instance? js/Error ex)
    (.-message ex)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2498
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9081-9087](https://github.com/clojure/clojurescript/blob/r2498/src/cljs/cljs/core.cljs#L9081-L9087)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/ex-message` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ex-message.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ex-message.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ex-message",
 :signature ["[ex]"],
 :history [["+" "0.0-1576"]],
 :type "function",
 :full-name-encode "cljs.core/ex-message",
 :source {:code "(defn ex-message\n  [ex]\n  (when (instance? js/Error ex)\n    (.-message ex)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2498",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9081 9087]},
 :full-name "cljs.core/ex-message",
 :docstring "Alpha - subject to change.\nReturns the message attached to the given Error / ExceptionInfo object.\nFor non-Errors returns nil."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ex-message"]))
```

-->
