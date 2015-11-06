## cljs.core/nil-iter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__nil-iter__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L3346-L3351):

```clj
(defn nil-iter []
  (reify
    Object
    (hasNext [_] false)
    (next [_] (js/Error. "No such element"))
    (remove [_] (js/Error. "Unsupported operation"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3346-3351](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L3346-L3351)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/nil-iter` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/nil-iter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/nil-iter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "nil-iter",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn nil-iter []\n  (reify\n    Object\n    (hasNext [_] false)\n    (next [_] (js/Error. \"No such element\"))\n    (remove [_] (js/Error. \"Unsupported operation\"))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3346 3351]},
 :full-name "cljs.core/nil-iter",
 :full-name-encode "cljs.core/nil-iter",
 :history [["+" "0.0-2301"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/nil-iter"]))
```

-->
