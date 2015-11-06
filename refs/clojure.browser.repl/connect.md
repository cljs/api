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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/clojure/browser/repl.cljs#L110-L158):

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
      (set! (.-require__ js/goog) js/goog.require)
      ;; suppress useless Google Closure error about duplicate provides
      (set! (.-isProvided_ js/goog) (fn [name] false))
      (set! (.-writeScriptTag_ js/goog)
        (fn [src opt_sourceText]
          (.appendChild js/document.body
            (as-> (.createElement js/document "script") script
              (doto script (aset "type" "text/javascript"))
              (if (nil? opt_sourceText)
                (doto script (aset "src" src))
                (doto script (gdom/setTextContext opt_sourceText)))))))
      (set! (.-require js/goog)
        (fn [src reload]
          (when (= reload "reload-all")
            (set! (.-cljsReloadAll_ js/goog) true))
          (let [reload? (or reload (.-cljsReloadAll__ js/goog))]
            (when reload?
              (let [path (aget js/goog.dependencies_.nameToPath src)]
                (js-delete js/goog.dependencies_.visited path)
                (js-delete js/goog.dependencies_.written
                  (str js/goog.basePath path))))
            (let [ret (.require__ js/goog src)]
              (when (= reload "reload-all")
                (set! (.-cljsReloadAll_ js/goog) false))
              ret)))))
    repl-connection))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3053
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:110-158](https://github.com/clojure/clojurescript/blob/r3053/src/cljs/clojure/browser/repl.cljs#L110-L158)</ins>
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
 :source {:code "(defn connect\n  [repl-server-url]\n  (let [repl-connection\n        (net/xpc-connection\n          {:peer_uri repl-server-url})]\n    (swap! xpc-connection (constantly repl-connection))\n    (net/register-service repl-connection\n      :evaluate-javascript\n      (fn [js]\n        (net/transmit\n          repl-connection\n          :send-result\n          (evaluate-javascript repl-connection js))))\n    (net/connect repl-connection\n      (constantly nil)\n      (fn [iframe]\n        (set! (.-display (.-style iframe))\n          \"none\")))\n    ;; Monkey-patch goog.provide if running under optimizations :none - David\n    (when-not js/COMPILED\n      (set! (.-require__ js/goog) js/goog.require)\n      ;; suppress useless Google Closure error about duplicate provides\n      (set! (.-isProvided_ js/goog) (fn [name] false))\n      (set! (.-writeScriptTag_ js/goog)\n        (fn [src opt_sourceText]\n          (.appendChild js/document.body\n            (as-> (.createElement js/document \"script\") script\n              (doto script (aset \"type\" \"text/javascript\"))\n              (if (nil? opt_sourceText)\n                (doto script (aset \"src\" src))\n                (doto script (gdom/setTextContext opt_sourceText)))))))\n      (set! (.-require js/goog)\n        (fn [src reload]\n          (when (= reload \"reload-all\")\n            (set! (.-cljsReloadAll_ js/goog) true))\n          (let [reload? (or reload (.-cljsReloadAll__ js/goog))]\n            (when reload?\n              (let [path (aget js/goog.dependencies_.nameToPath src)]\n                (js-delete js/goog.dependencies_.visited path)\n                (js-delete js/goog.dependencies_.written\n                  (str js/goog.basePath path))))\n            (let [ret (.require__ js/goog src)]\n              (when (= reload \"reload-all\")\n                (set! (.-cljsReloadAll_ js/goog) false))\n              ret)))))\n    repl-connection))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3053",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [110 158]},
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
