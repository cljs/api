## cljs.repl.node/write



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__write__ out js)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/node.clj#L34-L37):

```clj
(defn write [^BufferedWriter out ^String js]
  (.write out js)
  (.write out (int 0)) ;; terminator
  (.flush out))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[node.clj:34-37](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl/node.clj#L34-L37)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/write` @ crossclj](http://crossclj.info/fun/cljs.repl.node/write.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/write.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "write",
 :type "function",
 :signature ["[out js]"],
 :source {:code "(defn write [^BufferedWriter out ^String js]\n  (.write out js)\n  (.write out (int 0)) ;; terminator\n  (.flush out))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/clj/cljs/repl/node.clj",
          :lines [34 37]},
 :full-name "cljs.repl.node/write",
 :full-name-encode "cljs.repl.node/write",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/write"]))
```

-->
