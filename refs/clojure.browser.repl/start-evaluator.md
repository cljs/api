## clojure.browser.repl/start-evaluator



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__start-evaluator__ url)<br>
</samp>

---





Source docstring:

```
Start the REPL server connection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/clojure/browser/repl.cljs#L60-L88):

```clj
(defn start-evaluator
  [url]
  (if-let [repl-connection (net/xpc-connection)]
    (let [connection (net/xhr-connection)]
      (event/listen connection
                    :success
                    (fn [e]
                      (net/transmit
                       repl-connection
                       :evaluate-javascript
                       (.getResponseText (.-currentTarget e)
                                         ()))))

      (net/register-service repl-connection
                            :send-result
                            (fn [data]
                              (send-result connection url (wrap-message :result data))))

      (net/register-service repl-connection
                            :print
                            (fn [data]
                              (send-print url (wrap-message :print data))))
      
      (net/connect repl-connection
                   (constantly nil))

      (js/setTimeout #(send-result connection url (wrap-message :ready "ready")) 50))
    (js/alert "No 'xpc' param provided to child iframe.")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:60-88](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/clojure/browser/repl.cljs#L60-L88)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.browser.repl/start-evaluator` @ crossclj](http://crossclj.info/fun/clojure.browser.repl.cljs/start-evaluator.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/clojure.browser.repl/start-evaluator.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "clojure.browser.repl",
 :name "start-evaluator",
 :signature ["[url]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "clojure.browser.repl/start-evaluator",
 :source {:code "(defn start-evaluator\n  [url]\n  (if-let [repl-connection (net/xpc-connection)]\n    (let [connection (net/xhr-connection)]\n      (event/listen connection\n                    :success\n                    (fn [e]\n                      (net/transmit\n                       repl-connection\n                       :evaluate-javascript\n                       (.getResponseText (.-currentTarget e)\n                                         ()))))\n\n      (net/register-service repl-connection\n                            :send-result\n                            (fn [data]\n                              (send-result connection url (wrap-message :result data))))\n\n      (net/register-service repl-connection\n                            :print\n                            (fn [data]\n                              (send-print url (wrap-message :print data))))\n      \n      (net/connect repl-connection\n                   (constantly nil))\n\n      (js/setTimeout #(send-result connection url (wrap-message :ready \"ready\")) 50))\n    (js/alert \"No 'xpc' param provided to child iframe.\")))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/clojure/browser/repl.cljs",
          :lines [60 88]},
 :full-name "clojure.browser.repl/start-evaluator",
 :docstring "Start the REPL server connection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "clojure.browser.repl/start-evaluator"]))
```

-->
