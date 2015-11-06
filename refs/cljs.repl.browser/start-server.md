## ~~cljs.repl.browser/start-server~~


> __MOVED__, please see [`cljs.repl.server/start`](../cljs.repl.server/start.md)

 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> <a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[×] 0.0-1503" title="Removed in 0.0-1503" src="https://img.shields.io/badge/×-0.0--1503-red.svg"></a> </td>
</tr>
</table>


 <samp>
(__start-server__ opts)<br>
</samp>

---





Source docstring:

```
Start the server on the specified port.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L265-L270):

```clj
(defn start-server
  [opts]
  (let [ss (ServerSocket. (:port opts))]
    (future (server-loop opts ss))
    (swap! server-state (fn [old] (assoc old :socket ss :port (:port opts))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:265-270](https://github.com/clojure/clojurescript/blob/r1450/src/clj/cljs/repl/browser.clj#L265-L270)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/start-server` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/start-server.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/start-server.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:moved "cljs.repl.server/start",
 :ns "cljs.repl.browser",
 :name "start-server",
 :signature ["[opts]"],
 :history [["+" "0.0-927"] ["-" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.browser/start-server",
 :source {:code "(defn start-server\n  [opts]\n  (let [ss (ServerSocket. (:port opts))]\n    (future (server-loop opts ss))\n    (swap! server-state (fn [old] (assoc old :socket ss :port (:port opts))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [265 270]},
 :full-name "cljs.repl.browser/start-server",
 :docstring "Start the server on the specified port.",
 :removed {:in "0.0-1503", :last-seen "0.0-1450"}}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/start-server"]))
```

-->