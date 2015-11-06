## cljs.core/persistent-array-map-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1820"><img valign="middle" alt="[+] 0.0-1820" title="Added in 0.0-1820" src="https://img.shields.io/badge/+-0.0--1820-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__persistent-array-map-seq__ arr i _meta)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L4485-L4487):

```clj
(defn persistent-array-map-seq [arr i _meta]
  (when (<= i (- (alength arr) 2))
    (PersistentArrayMapSeq. arr i _meta)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2268
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:4485-4487](https://github.com/clojure/clojurescript/blob/r2268/src/cljs/cljs/core.cljs#L4485-L4487)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/persistent-array-map-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/persistent-array-map-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/persistent-array-map-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "persistent-array-map-seq",
 :type "function",
 :signature ["[arr i _meta]"],
 :source {:code "(defn persistent-array-map-seq [arr i _meta]\n  (when (<= i (- (alength arr) 2))\n    (PersistentArrayMapSeq. arr i _meta)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2268",
          :filename "src/cljs/cljs/core.cljs",
          :lines [4485 4487]},
 :full-name "cljs.core/persistent-array-map-seq",
 :full-name-encode "cljs.core/persistent-array-map-seq",
 :history [["+" "0.0-1820"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/persistent-array-map-seq"]))
```

-->
