## cljs.repl.browser/ext->mime-type



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/browser.clj#L27-L38):

```clj
(def ext->mime-type
  {".html" "text/html"
   ".css" "text/css"

   ".jpg" "image/jpeg"
   ".png" "image/png"
   ".gif" "image/gif"

   ".js" "text/javascript"
   ".cljs" "text/x-clojure"
   ".cljc" "text/x-clojure"
   ".map" "application/json"})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3297
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:27-38](https://github.com/clojure/clojurescript/blob/r3297/src/main/clojure/cljs/repl/browser.clj#L27-L38)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/ext->mime-type` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/ext-%3Emime-type.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/ext-GTmime-type.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "ext->mime-type",
 :type "var",
 :source {:code "(def ext->mime-type\n  {\".html\" \"text/html\"\n   \".css\" \"text/css\"\n\n   \".jpg\" \"image/jpeg\"\n   \".png\" \"image/png\"\n   \".gif\" \"image/gif\"\n\n   \".js\" \"text/javascript\"\n   \".cljs\" \"text/x-clojure\"\n   \".cljc\" \"text/x-clojure\"\n   \".map\" \"application/json\"})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3297",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [27 38]},
 :full-name "cljs.repl.browser/ext->mime-type",
 :full-name-encode "cljs.repl.browser/ext-GTmime-type",
 :history [["+" "0.0-3291"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/ext->mime-type"]))
```

-->
