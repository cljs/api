## cljs.core/LazyTransformer.createMulti



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2301"><img valign="middle" alt="[+] 0.0-2301" title="Added in 0.0-2301" src="https://img.shields.io/badge/+-0.0--2301-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__LazyTransformer.createMulti__ xform colls)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L3356-L3363):

```clj
(set! (.-createMulti LazyTransformer)
  (fn [xform colls]
    (let [iters (array)]
      (doseq [coll colls]
        (.push iters (iter coll)))
      (LazyTransformer.
        (multi-stepper xform iters (make-array (alength iters)))
        nil nil nil))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3356-3363](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/cljs/core.cljs#L3356-L3363)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/LazyTransformer.createMulti` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/LazyTransformer.createMulti.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/LazyTransformerDOTcreateMulti.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "LazyTransformer.createMulti",
 :signature ["[xform colls]"],
 :history [["+" "0.0-2301"]],
 :parent-type "LazyTransformer",
 :type "function",
 :full-name-encode "cljs.core/LazyTransformerDOTcreateMulti",
 :source {:code "(set! (.-createMulti LazyTransformer)\n  (fn [xform colls]\n    (let [iters (array)]\n      (doseq [coll colls]\n        (.push iters (iter coll)))\n      (LazyTransformer.\n        (multi-stepper xform iters (make-array (alength iters)))\n        nil nil nil))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3356 3363]},
 :full-name "cljs.core/LazyTransformer.createMulti"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/LazyTransformer.createMulti"]))
```

-->
