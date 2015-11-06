## cljs.core/chunk-first



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunk-first__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L2253-L2254):

```clj
(defn chunk-first [s]
  (-chunked-first s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2024
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2253-2254](https://github.com/clojure/clojurescript/blob/r2024/src/cljs/cljs/core.cljs#L2253-L2254)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunk-first` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk-first.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk-first.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk-first",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-first [s]\n  (-chunked-first s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2024",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2253 2254]},
 :full-name "cljs.core/chunk-first",
 :full-name-encode "cljs.core/chunk-first",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-first"]))
```

-->
