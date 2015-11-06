## cljs.core/Vector.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__Vector.fromArray__ xs)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2793):

```clj
(set! cljs.core.Vector/fromArray (fn [xs] (Vector. nil xs nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2793](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/core.cljs#L2793)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/Vector.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/Vector.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/VectorDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "Vector.fromArray",
 :signature ["[xs]"],
 :history [["+" "0.0-927"]],
 :parent-type "Vector",
 :type "function",
 :full-name-encode "cljs.core/VectorDOTfromArray",
 :source {:code "(set! cljs.core.Vector/fromArray (fn [xs] (Vector. nil xs nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2793]},
 :full-name "cljs.core/Vector.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/Vector.fromArray"]))
```

-->
