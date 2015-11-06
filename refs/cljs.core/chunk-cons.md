## cljs.core/chunk-cons



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunk-cons__ chunk rest)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2220-L2223):

```clj
(defn chunk-cons [chunk rest]
  (if (zero? (-count chunk))
    rest
    (ChunkedCons. chunk rest nil nil)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:2220-2223](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/core.cljs#L2220-L2223)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunk-cons` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk-cons.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk-cons.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk-cons",
 :type "function",
 :signature ["[chunk rest]"],
 :source {:code "(defn chunk-cons [chunk rest]\n  (if (zero? (-count chunk))\n    rest\n    (ChunkedCons. chunk rest nil nil)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/core.cljs",
          :lines [2220 2223]},
 :full-name "cljs.core/chunk-cons",
 :full-name-encode "cljs.core/chunk-cons",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-cons"]))
```

-->
