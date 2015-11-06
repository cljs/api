## cljs.core/add-to-string-hash-cache



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__add-to-string-hash-cache__ k)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L1096-L1100):

```clj
(defn add-to-string-hash-cache [k]
  (let [h (goog.string/hashCode k)]
    (aset string-hash-cache k h)
    (set! string-hash-cache-count (inc string-hash-cache-count))
    h))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2227
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:1096-1100](https://github.com/clojure/clojurescript/blob/r2227/src/cljs/cljs/core.cljs#L1096-L1100)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/add-to-string-hash-cache` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/add-to-string-hash-cache.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/add-to-string-hash-cache.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "add-to-string-hash-cache",
 :type "function",
 :signature ["[k]"],
 :source {:code "(defn add-to-string-hash-cache [k]\n  (let [h (goog.string/hashCode k)]\n    (aset string-hash-cache k h)\n    (set! string-hash-cache-count (inc string-hash-cache-count))\n    h))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2227",
          :filename "src/cljs/cljs/core.cljs",
          :lines [1096 1100]},
 :full-name "cljs.core/add-to-string-hash-cache",
 :full-name-encode "cljs.core/add-to-string-hash-cache",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/add-to-string-hash-cache"]))
```

-->
