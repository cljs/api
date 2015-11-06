## cljs.repl.server/start



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__start__ opts)<br>
</samp>

---





Source docstring:

```
Start the server on the specified port.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2127/src/clj/cljs/repl/server.clj#L164-L169):

```clj
(defn start
  [opts]
  (let [ss (ServerSocket. (:port opts))]
    (future (server-loop opts ss))
    (swap! state (fn [old] (assoc old :socket ss :port (:port opts))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2127
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:164-169](https://github.com/clojure/clojurescript/blob/r2127/src/clj/cljs/repl/server.clj#L164-L169)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/start` @ crossclj](http://crossclj.info/fun/cljs.repl.server/start.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/start.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "start",
 :signature ["[opts]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server/start",
 :source {:code "(defn start\n  [opts]\n  (let [ss (ServerSocket. (:port opts))]\n    (future (server-loop opts ss))\n    (swap! state (fn [old] (assoc old :socket ss :port (:port opts))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2127",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [164 169]},
 :full-name "cljs.repl.server/start",
 :docstring "Start the server on the specified port."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/start"]))
```

-->
