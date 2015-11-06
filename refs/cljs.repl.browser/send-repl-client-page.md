## cljs.repl.browser/send-repl-client-page



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__send-repl-client-page__ request conn opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/browser.clj#L54-L65):

```clj
(defn send-repl-client-page
  [request conn opts]
  (server/send-and-close conn 200
    (str "<html><head><meta charset=\"UTF-8\"></head><body>
          <script type=\"text/javascript\">"
         (repl-client-js)
         "</script>"
         "<script type=\"text/javascript\">
          clojure.browser.repl.client.start(\"http://" (-> request :headers :host) "\");
          </script>"
         "</body></html>")
    "text/html"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2816
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:54-65](https://github.com/clojure/clojurescript/blob/r2816/src/clj/cljs/repl/browser.clj#L54-L65)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/send-repl-client-page` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/send-repl-client-page.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/send-repl-client-page.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "send-repl-client-page",
 :type "function",
 :signature ["[request conn opts]"],
 :source {:code "(defn send-repl-client-page\n  [request conn opts]\n  (server/send-and-close conn 200\n    (str \"<html><head><meta charset=\\\"UTF-8\\\"></head><body>\n          <script type=\\\"text/javascript\\\">\"\n         (repl-client-js)\n         \"</script>\"\n         \"<script type=\\\"text/javascript\\\">\n          clojure.browser.repl.client.start(\\\"http://\" (-> request :headers :host) \"\\\");\n          </script>\"\n         \"</body></html>\")\n    \"text/html\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2816",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [54 65]},
 :full-name "cljs.repl.browser/send-repl-client-page",
 :full-name-encode "cljs.repl.browser/send-repl-client-page",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/send-repl-client-page"]))
```

-->
