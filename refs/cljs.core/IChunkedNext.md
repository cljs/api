## cljs.core/IChunkedNext



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L345-L346):

```clj
(defprotocol IChunkedNext
  (-chunked-next [coll]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1909
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:345-346](https://github.com/clojure/clojurescript/blob/r1909/src/cljs/cljs/core.cljs#L345-L346)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/IChunkedNext` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IChunkedNext.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IChunkedNext.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IChunkedNext",
 :type "protocol",
 :full-name-encode "cljs.core/IChunkedNext",
 :source {:code "(defprotocol IChunkedNext\n  (-chunked-next [coll]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1909",
          :filename "src/cljs/cljs/core.cljs",
          :lines [345 346]},
 :methods [{:name "-chunked-next",
            :signature ["[coll]"],
            :docstring nil}],
 :full-name "cljs.core/IChunkedNext",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IChunkedNext"]))
```

-->
