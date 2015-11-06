## clojure.browser.repl/connect



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__connect__ repl-server-url)<br>
</samp>

---





Source docstring:

```
Connects to a REPL server from an HTML document. After the
connection is made, the REPL will evaluate forms in the context of
the document that called this function.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/clojure/browser/repl.cljs#L95-L132):

```clj
(defn connect
  [repl-server-url]
  (let [repl-connection
        (net/xpc-connection
          {:peer_uri repl-server-url})]
    (swap! xpc-connection (constantly repl-connection))
    (net/register-service repl-connection
      :evaluate-javascript
      (fn [js]
        (net/transmit
          repl-connection
          :send-result
          (evaluate-javascript repl-connection js))))
    (net/connect repl-connection
      (constantly nil)
      (fn [iframe]
        (set! (.-display (.-style iframe))
          "none")))
    ;; Monkey-patch goog.provide if running under optimizations :none - David
    (when-not js/COMPILED
      (set! (.-provide__ js/goog) js/goog.provide)
      (set! (.-isProvided___ js/goog) js/goog.isProvided_)
      (set! (.-provide js/goog)
        (fn [name]
          (set! (.-isProvided_ js/goog) (fn [name] false))
          (.provide__ js/goog name)
          (set! (.-isProvided_ js/goog) js/goog.isProvided___)))
      (set! (.-writeScriptTag_ js/goog)
        (fn [src opt_sourceText]
          (let [doc js/goog.global.document]
            (if (nil? opt_sourceText)
              (.write doc
                (str "<script type=\"text/javascript\" src=\"" src "\"></script>"))
              (.write doc
                (str "<script type=\"text/javascript\">" opt_sourceText "</script>")))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3030
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:95-132](https://github.com/clojure/clojurescript/blob/r3030/src/cljs/clojure/browser/repl.cljs#L95-L132)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/connect` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/connect.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/connect.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "connect",
 :signature ["[repl-server-url]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/connect",
 :source {:code "(defn connect\n  [repl-server-url]\n  (let [repl-connection\n        (net/xpc-connection\n          {:peer_uri repl-server-url})]\n    (swap! xpc-connection (constantly repl-connection))\n    (net/register-service repl-connection\n      :evaluate-javascript\n      (fn [js]\n        (net/transmit\n          repl-connection\n          :send-result\n          (evaluate-javascript repl-connection js))))\n    (net/connect repl-connection\n      (constantly nil)\n      (fn [iframe]\n        (set! (.-display (.-style iframe))\n          \"none\")))\n    ;; Monkey-patch goog.provide if running under optimizations :none - David\n    (when-not js/COMPILED\n      (set! (.-provide__ js/goog) js/goog.provide)\n      (set! (.-isProvided___ js/goog) js/goog.isProvided_)\n      (set! (.-provide js/goog)\n        (fn [name]\n          (set! (.-isProvided_ js/goog) (fn [name] false))\n          (.provide__ js/goog name)\n          (set! (.-isProvided_ js/goog) js/goog.isProvided___)))\n      (set! (.-writeScriptTag_ js/goog)\n        (fn [src opt_sourceText]\n          (let [doc js/goog.global.document]\n            (if (nil? opt_sourceText)\n              (.write doc\n                (str \"<script type=\\\"text/javascript\\\" src=\\\"\" src \"\\\"></script>\"))\n              (.write doc\n                (str \"<script type=\\\"text/javascript\\\">\" opt_sourceText \"</script>\")))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3030",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [95 132]},
 :full-name "clojure.browser.repl/connect",
 :docstring "Connects to a REPL server from an HTML document. After the\nconnection is made, the REPL will evaluate forms in the context of\nthe document that called this function."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/connect"]))
```

-->
