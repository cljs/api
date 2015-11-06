## cljs.repl.server/send-404



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__send-404__ conn path)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2411/src/clj/cljs/repl/server.clj#L130-L136):

```clj
(defn send-404 [conn path]
  (send-and-close conn 404
                  (str "<html><body>"
                       "<h2>Page not found</h2>"
                       "No page " path " found on this server."
                       "</body></html>")
                  "text/html"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2411
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:130-136](https://github.com/clojure/clojurescript/blob/r2411/src/clj/cljs/repl/server.clj#L130-L136)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/send-404` @ crossclj](http://crossclj.info/fun/cljs.repl.server/send-404.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/send-404.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "send-404",
 :type "function",
 :signature ["[conn path]"],
 :source {:code "(defn send-404 [conn path]\n  (send-and-close conn 404\n                  (str \"<html><body>\"\n                       \"<h2>Page not found</h2>\"\n                       \"No page \" path \" found on this server.\"\n                       \"</body></html>\")\n                  \"text/html\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2411",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [130 136]},
 :full-name "cljs.repl.server/send-404",
 :full-name-encode "cljs.repl.server/send-404",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/send-404"]))
```

-->
