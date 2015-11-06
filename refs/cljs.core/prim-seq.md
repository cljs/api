## cljs.core/prim-seq



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__prim-seq__ prim)<br>
</samp>
 <samp>
(__prim-seq__ prim i)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L644-L649):

```clj
(defn prim-seq
  ([prim]
     (prim-seq prim 0))
  ([prim i]
     (when (< i (alength prim))
       (IndexedSeq. prim i))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1552
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:644-649](https://github.com/clojure/clojurescript/blob/r1552/src/cljs/cljs/core.cljs#L644-L649)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/prim-seq` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/prim-seq.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/prim-seq.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "prim-seq",
 :type "function",
 :signature ["[prim]" "[prim i]"],
 :source {:code "(defn prim-seq\n  ([prim]\n     (prim-seq prim 0))\n  ([prim i]\n     (when (< i (alength prim))\n       (IndexedSeq. prim i))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1552",
          :filename "src/cljs/cljs/core.cljs",
          :lines [644 649]},
 :full-name "cljs.core/prim-seq",
 :full-name-encode "cljs.core/prim-seq",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/prim-seq"]))
```

-->
