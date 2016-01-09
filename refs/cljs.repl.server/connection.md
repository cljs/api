## cljs.repl.server/connection



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__connection__)<br>
</samp>

---





Source docstring:

```
Promise to return a connection when one is available. If a
connection is not available, store the promise in server/state.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/server.clj#L10-L22):

```clj
(defn connection
  []
  (let [p    (promise)
        conn (:connection @state)]
    (if (and conn (not (.isClosed conn)))
      (do
        (deliver p conn)
        p)
      (do
        (swap! state (fn [old] (assoc old :promised-conn p)))
        p))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[server.clj:10-22](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/server.clj#L10-L22)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/connection` @ crossclj](http://crossclj.info/fun/cljs.repl.server/connection.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/connection.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "connection",
 :signature ["[]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl.server/connection",
 :source {:code "(defn connection\n  []\n  (let [p    (promise)\n        conn (:connection @state)]\n    (if (and conn (not (.isClosed conn)))\n      (do\n        (deliver p conn)\n        p)\n      (do\n        (swap! state (fn [old] (assoc old :promised-conn p)))\n        p))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl/server.clj",
          :lines [10 22]},
 :full-name "cljs.repl.server/connection",
 :docstring "Promise to return a connection when one is available. If a\nconnection is not available, store the promise in server/state."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/connection"]))
```

-->
