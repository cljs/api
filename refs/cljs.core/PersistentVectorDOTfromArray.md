## cljs.core/PersistentVector.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1006"><img valign="middle" alt="[+] 0.0-1006" title="Added in 0.0-1006" src="https://img.shields.io/badge/+-0.0--1006-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentVector.fromArray__ xs no-clone)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L3284-L3295):

```clj
(set! cljs.core.PersistentVector/fromArray
  (fn [xs ^boolean no-clone]
    (let [l (alength xs)
          xs (if no-clone xs (aclone xs))]
      (if (< l 32)
        (PersistentVector. nil l 5 cljs.core.PersistentVector/EMPTY_NODE xs nil)
        (let [node (.slice xs 0 32)
              v (PersistentVector. nil 32 5 cljs.core.PersistentVector/EMPTY_NODE node nil)]
          (loop [i 32 out (-as-transient v)]
            (if (< i l)
              (recur (inc i) (conj! out (aget xs i)))
              (persistent! out))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3284-3295](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/core.cljs#L3284-L3295)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentVector.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentVector.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentVectorDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentVector.fromArray",
 :signature ["[xs no-clone]"],
 :history [["+" "0.0-1006"]],
 :parent-type "PersistentVector",
 :type "function",
 :full-name-encode "cljs.core/PersistentVectorDOTfromArray",
 :source {:code "(set! cljs.core.PersistentVector/fromArray\n  (fn [xs ^boolean no-clone]\n    (let [l (alength xs)\n          xs (if no-clone xs (aclone xs))]\n      (if (< l 32)\n        (PersistentVector. nil l 5 cljs.core.PersistentVector/EMPTY_NODE xs nil)\n        (let [node (.slice xs 0 32)\n              v (PersistentVector. nil 32 5 cljs.core.PersistentVector/EMPTY_NODE node nil)]\n          (loop [i 32 out (-as-transient v)]\n            (if (< i l)\n              (recur (inc i) (conj! out (aget xs i)))\n              (persistent! out))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3284 3295]},
 :full-name "cljs.core/PersistentVector.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentVector.fromArray"]))
```

-->
