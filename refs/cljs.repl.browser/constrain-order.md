## cljs.repl.browser/constrain-order



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__constrain-order__ order f)<br>
</samp>

---





Source docstring:

```
Elements to be printed in the REPL will arrive out of order. Ensure
that they are printed in the correct order.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/repl/browser.clj#L118-L123):

```clj
(defn constrain-order
  [order f]
  (send-off ordering add-in-order order f)
  (send-off ordering run-in-order))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1503
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:118-123](https://github.com/clojure/clojurescript/blob/r1503/src/clj/cljs/repl/browser.clj#L118-L123)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/constrain-order` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/constrain-order.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/constrain-order.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "constrain-order",
 :signature ["[order f]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/constrain-order",
 :source {:code "(defn constrain-order\n  [order f]\n  (send-off ordering add-in-order order f)\n  (send-off ordering run-in-order))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1503",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [118 123]},
 :full-name "cljs.repl.browser/constrain-order",
 :docstring "Elements to be printed in the REPL will arrive out of order. Ensure\nthat they are printed in the correct order."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/constrain-order"]))
```

-->
