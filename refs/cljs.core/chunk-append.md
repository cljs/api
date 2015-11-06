## cljs.core/chunk-append



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunk-append__ b x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L3018-L3019):

```clj
(defn chunk-append [b x]
  (.add b x))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3149
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3018-3019](https://github.com/clojure/clojurescript/blob/r3149/src/cljs/cljs/core.cljs#L3018-L3019)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunk-append` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk-append.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk-append.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk-append",
 :type "function",
 :signature ["[b x]"],
 :source {:code "(defn chunk-append [b x]\n  (.add b x))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3149",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3018 3019]},
 :full-name "cljs.core/chunk-append",
 :full-name-encode "cljs.core/chunk-append",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-append"]))
```

-->
