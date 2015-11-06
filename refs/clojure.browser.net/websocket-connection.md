## clojure.browser.net/websocket-connection



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" title="Added in 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__websocket-connection__)<br>
</samp>
 <samp>
(__websocket-connection__ auto-reconnect?)<br>
</samp>
 <samp>
(__websocket-connection__ auto-reconnect? next-reconnect-fn)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/clojure/browser/net.cljs#L174-L180):

```clj
(defn websocket-connection
  ([]
     (websocket-connection nil nil))
  ([auto-reconnect?]
     (websocket-connection auto-reconnect? nil))
  ([auto-reconnect? next-reconnect-fn]
     (WebSocket. auto-reconnect? next-reconnect-fn)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[net.cljs:174-180](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/clojure/browser/net.cljs#L174-L180)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.net/websocket-connection` @ crossclj](http://crossclj.info/fun/clojure.browser.net.cljs/websocket-connection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.net/websocket-connection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.net",
 :name "websocket-connection",
 :type "function",
 :signature ["[]"
             "[auto-reconnect?]"
             "[auto-reconnect? next-reconnect-fn]"],
 :source {:code "(defn websocket-connection\n  ([]\n     (websocket-connection nil nil))\n  ([auto-reconnect?]\n     (websocket-connection auto-reconnect? nil))\n  ([auto-reconnect? next-reconnect-fn]\n     (WebSocket. auto-reconnect? next-reconnect-fn)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/clojure/browser/net.cljs",
          :lines [174 180]},
 :full-name "clojure.browser.net/websocket-connection",
 :full-name-encode "clojure.browser.net/websocket-connection",
 :history [["+" "0.0-2911"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.net/websocket-connection"]))
```

-->
