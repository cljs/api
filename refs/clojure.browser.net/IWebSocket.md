## clojure.browser.net/IWebSocket



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" title="Added in 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/clojure/browser/net.cljs#L143-L144):

```clj
(defprotocol IWebSocket
  (open? [this]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── clojure
                └── browser
                    └── <ins>[net.cljs:143-144](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/clojure/browser/net.cljs#L143-L144)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/IWebSocket` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/IWebSocket.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/IWebSocket.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "IWebSocket",
 :type "protocol",
 :full-name-encode "clojure.browser.net/IWebSocket",
 :source {:code "(defprotocol IWebSocket\n  (open? [this]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/clojure/browser/net.cljs",
          :lines [143 144]},
 :methods [{:name "open?", :signature ["[this]"], :docstring nil}],
 :full-name "clojure.browser.net/IWebSocket",
 :history [["+" "0.0-2911"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/IWebSocket"]))
```

-->
