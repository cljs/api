## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/start-evaluator

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__start-evaluator__ url)<br>
</samp>

```
Start the REPL server connection.
```

---

 <pre>
clojurescript @ r1443
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:60-88](https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/repl.cljs#L60-L88)</ins>
</pre>

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
                       (.getResponseText e/currentTarget
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


---

```clj
{:full-name "clojure.browser.repl/start-evaluator",
 :ns "clojure.browser.repl",
 :name "start-evaluator",
 :docstring "Start the REPL server connection.",
 :type "function",
 :signature ["[url]"],
 :source {:code "(defn start-evaluator\n  [url]\n  (if-let [repl-connection (net/xpc-connection)]\n    (let [connection (net/xhr-connection)]\n      (event/listen connection\n                    :success\n                    (fn [e]\n                      (net/transmit\n                       repl-connection\n                       :evaluate-javascript\n                       (.getResponseText e/currentTarget\n                                         ()))))\n\n      (net/register-service repl-connection\n                            :send-result\n                            (fn [data]\n                              (send-result connection url (wrap-message :result data))))\n\n      (net/register-service repl-connection\n                            :print\n                            (fn [data]\n                              (send-print url (wrap-message :print data))))\n      \n      (net/connect repl-connection\n                   (constantly nil))\n\n      (js/setTimeout #(send-result connection url (wrap-message :ready \"ready\")) 50))\n    (js/alert \"No 'xpc' param provided to child iframe.\")))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [60 88],
          :link "https://github.com/clojure/clojurescript/blob/r1443/src/cljs/clojure/browser/repl.cljs#L60-L88"},
 :full-name-encode "clojure.browser.repl_start-evaluator",
 :history [["+" "0.0-927"]]}

```
