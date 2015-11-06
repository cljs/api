## cljs.core/chunk-buffer



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunk-buffer__ capacity)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1814-L1815):

```clj
(defn chunk-buffer [capacity]
  (ChunkBuffer. (make-array capacity) 0))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1449
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1814-1815](https://github.com/clojure/clojurescript/blob/r1449/src/cljs/cljs/core.cljs#L1814-L1815)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunk-buffer` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk-buffer.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk-buffer.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk-buffer",
 :type "function",
 :signature ["[capacity]"],
 :source {:code "(defn chunk-buffer [capacity]\n  (ChunkBuffer. (make-array capacity) 0))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1814 1815]},
 :full-name "cljs.core/chunk-buffer",
 :full-name-encode "cljs.core/chunk-buffer",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-buffer"]))
```

-->
