## cljs.repl.browser/handle-connection



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__handle-connection__ opts conn)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/repl/browser.clj#L248-L256):

```clj
(defn handle-connection
  [opts conn]
  (let [rdr (BufferedReader. (InputStreamReader. (.getInputStream conn)))]
    (if-let [request (read-request rdr)]
      (case (:method request)
        :get (handle-get opts conn request)
        :post (handle-post conn (read-string (:content request)))
        (.close conn))
      (.close conn))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1449
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:248-256](https://github.com/clojure/clojurescript/blob/r1449/src/clj/cljs/repl/browser.clj#L248-L256)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/handle-connection` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/handle-connection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/handle-connection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "handle-connection",
 :type "function",
 :signature ["[opts conn]"],
 :source {:code "(defn handle-connection\n  [opts conn]\n  (let [rdr (BufferedReader. (InputStreamReader. (.getInputStream conn)))]\n    (if-let [request (read-request rdr)]\n      (case (:method request)\n        :get (handle-get opts conn request)\n        :post (handle-post conn (read-string (:content request)))\n        (.close conn))\n      (.close conn))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1449",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [248 256]},
 :full-name "cljs.repl.browser/handle-connection",
 :full-name-encode "cljs.repl.browser/handle-connection",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/handle-connection"]))
```

-->
