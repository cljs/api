## cljs.core/chunk-rest



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__chunk-rest__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L3027-L3028):

```clj
(defn chunk-rest [s]
  (-chunked-rest s))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:3027-3028](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/core.cljs#L3027-L3028)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/chunk-rest` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/chunk-rest.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/chunk-rest.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "chunk-rest",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn chunk-rest [s]\n  (-chunked-rest s))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/core.cljs",
          :lines [3027 3028]},
 :full-name "cljs.core/chunk-rest",
 :full-name-encode "cljs.core/chunk-rest",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/chunk-rest"]))
```

-->
