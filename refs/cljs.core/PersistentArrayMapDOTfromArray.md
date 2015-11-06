## cljs.core/PersistentArrayMap.fromArray



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1798"><img valign="middle" alt="[+] 0.0-1798" title="Added in 0.0-1798" src="https://img.shields.io/badge/+-0.0--1798-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__PersistentArrayMap.fromArray__ arr no-clone)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/cljs/core.cljs#L4213-L4217):

```clj
(set! cljs.core.PersistentArrayMap/fromArray
  (fn [arr ^boolean no-clone]
    (let [arr (if no-clone arr (aclone arr))] 
      (let [cnt (/ (alength arr) 2)]
        (PersistentArrayMap. nil cnt arr nil)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1877
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4213-4217](https://github.com/clojure/clojurescript/blob/r1877/src/cljs/cljs/core.cljs#L4213-L4217)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/PersistentArrayMap.fromArray` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/PersistentArrayMap.fromArray.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/PersistentArrayMapDOTfromArray.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "PersistentArrayMap.fromArray",
 :signature ["[arr no-clone]"],
 :history [["+" "0.0-1798"]],
 :parent-type "PersistentArrayMap",
 :type "function",
 :full-name-encode "cljs.core/PersistentArrayMapDOTfromArray",
 :source {:code "(set! cljs.core.PersistentArrayMap/fromArray\n  (fn [arr ^boolean no-clone]\n    (let [arr (if no-clone arr (aclone arr))] \n      (let [cnt (/ (alength arr) 2)]\n        (PersistentArrayMap. nil cnt arr nil)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1877",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4213 4217]},
 :full-name "cljs.core/PersistentArrayMap.fromArray"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/PersistentArrayMap.fromArray"]))
```

-->
