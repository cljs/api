## cljs.core/string-print



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__string-print__ x)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L7166-L7168):

```clj
(defn string-print [x]
  (*print-fn* x)
  nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2277
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:7166-7168](https://github.com/clojure/clojurescript/blob/r2277/src/cljs/cljs/core.cljs#L7166-L7168)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/string-print` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/string-print.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/string-print.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "string-print",
 :type "function",
 :signature ["[x]"],
 :source {:code "(defn string-print [x]\n  (*print-fn* x)\n  nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2277",
          :filename "src/cljs/cljs/core.cljs",
          :lines [7166 7168]},
 :full-name "cljs.core/string-print",
 :full-name-encode "cljs.core/string-print",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/string-print"]))
```

-->
