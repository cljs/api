## cljs.repl.node/socket



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__socket__ host port)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/node.clj#L24-L28):

```clj
(defn socket [host port]
  (let [socket (Socket. host port)
        in     (io/reader socket)
        out    (io/writer socket)]
    {:socket socket :in in :out out}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3269
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:24-28](https://github.com/clojure/clojurescript/blob/r3269/src/main/clojure/cljs/repl/node.clj#L24-L28)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/socket` @ crossclj](http://crossclj.info/fun/cljs.repl.node/socket.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/socket.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "socket",
 :type "function",
 :signature ["[host port]"],
 :source {:code "(defn socket [host port]\n  (let [socket (Socket. host port)\n        in     (io/reader socket)\n        out    (io/writer socket)]\n    {:socket socket :in in :out out}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3269",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [24 28]},
 :full-name "cljs.repl.node/socket",
 :full-name-encode "cljs.repl.node/socket",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/socket"]))
```

-->
