## <img width="48px" valign="middle" src="http://i.imgur.com/Hi20huC.png"> clojure.browser.repl/connect

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/api-refs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

 <samp>
(__connect__ repl-server-url)<br>
</samp>

```
Connects to a REPL server from an HTML document. After the
connection is made, the REPL will evaluate forms in the context of
the document that called this function.
```

---

 <pre>
clojurescript @ r1798
└── src
    └── cljs
        └── clojure
            └── browser
                └── <ins>[repl.cljs:90-109](https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/browser/repl.cljs#L90-L109)</ins>
</pre>

```clj
(defn connect
  [repl-server-url]
  (let [repl-connection (net/xpc-connection
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
                         "none")))))
```


---

```clj
{:full-name "clojure.browser.repl/connect",
 :ns "clojure.browser.repl",
 :name "connect",
 :docstring "Connects to a REPL server from an HTML document. After the\nconnection is made, the REPL will evaluate forms in the context of\nthe document that called this function.",
 :type "function",
 :signature ["[repl-server-url]"],
 :source {:code "(defn connect\n  [repl-server-url]\n  (let [repl-connection (net/xpc-connection\n                         {:peer_uri repl-server-url})]\n    (swap! xpc-connection (constantly repl-connection))\n    (net/register-service repl-connection\n                          :evaluate-javascript\n                          (fn [js]\n                            (net/transmit\n                             repl-connection\n                             :send-result\n                             (evaluate-javascript repl-connection js))))\n    (net/connect repl-connection\n                 (constantly nil)\n                 (fn [iframe]\n                   (set! (.-display (.-style iframe))\n                         \"none\")))))",
          :filename "clojurescript/src/cljs/clojure/browser/repl.cljs",
          :lines [90 109],
          :link "https://github.com/clojure/clojurescript/blob/r1798/src/cljs/clojure/browser/repl.cljs#L90-L109"},
 :full-name-encode "clojure.browser.repl_connect",
 :history [["+" "0.0-927"]]}

```
