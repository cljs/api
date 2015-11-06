## cljs.js/load-analysis-cache!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-analysis-cache!__ state ns cache)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/js.cljs#L115-L116):

```clj
(defn load-analysis-cache! [state ns cache]
  (swap! state assoc-in [::ana/namespaces ns] cache))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:115-116](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/js.cljs#L115-L116)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/load-analysis-cache!` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/load-analysis-cache%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/load-analysis-cacheBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "load-analysis-cache!",
 :type "function",
 :signature ["[state ns cache]"],
 :source {:code "(defn load-analysis-cache! [state ns cache]\n  (swap! state assoc-in [::ana/namespaces ns] cache))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [115 116]},
 :full-name "cljs.js/load-analysis-cache!",
 :full-name-encode "cljs.js/load-analysis-cacheBANG",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/load-analysis-cache!"]))
```

-->
