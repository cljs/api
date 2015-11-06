## cljs.repl.node/close-socket



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__close-socket__ s)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/repl/node.clj#L29-L32):

```clj
(defn close-socket [s]
  (.close (:in s))
  (.close (:out s))
  (.close (:socket s)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2985
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:29-32](https://github.com/clojure/clojurescript/blob/r2985/src/clj/cljs/repl/node.clj#L29-L32)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/close-socket` @ crossclj](http://crossclj.info/fun/cljs.repl.node/close-socket.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/close-socket.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "close-socket",
 :type "function",
 :signature ["[s]"],
 :source {:code "(defn close-socket [s]\n  (.close (:in s))\n  (.close (:out s))\n  (.close (:socket s)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2985",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [29 32]},
 :full-name "cljs.repl.node/close-socket",
 :full-name-encode "cljs.repl.node/close-socket",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/close-socket"]))
```

-->
