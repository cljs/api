## cljs.repl.server/stop



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__stop__)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/repl/server.clj#L171-L173):

```clj
(defn stop
  []
  (.close (:socket @state)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1535
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:171-173](https://github.com/clojure/clojurescript/blob/r1535/src/clj/cljs/repl/server.clj#L171-L173)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/stop` @ crossclj](http://crossclj.info/fun/cljs.repl.server/stop.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/stop.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "stop",
 :type "function",
 :signature ["[]"],
 :source {:code "(defn stop\n  []\n  (.close (:socket @state)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1535",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [171 173]},
 :full-name "cljs.repl.server/stop",
 :full-name-encode "cljs.repl.server/stop",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/stop"]))
```

-->
