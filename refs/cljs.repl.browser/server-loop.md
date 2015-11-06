## cljs.repl.browser/server-loop



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__server-loop__ opts server-socket)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/repl/browser.clj#L240-L245):

```clj
(defn server-loop
  [opts server-socket]
  (let [conn (.accept server-socket)]
    (do (.setKeepAlive conn true)
        (future (handle-connection opts conn))
        (recur opts server-socket))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1011
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[browser.clj:240-245](https://github.com/clojure/clojurescript/blob/r1011/src/clj/cljs/repl/browser.clj#L240-L245)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/server-loop` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/server-loop.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/server-loop.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "server-loop",
 :type "function",
 :signature ["[opts server-socket]"],
 :source {:code "(defn server-loop\n  [opts server-socket]\n  (let [conn (.accept server-socket)]\n    (do (.setKeepAlive conn true)\n        (future (handle-connection opts conn))\n        (recur opts server-socket))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1011",
          :filename "src/clj/cljs/repl/browser.clj",
          :lines [240 245]},
 :full-name "cljs.repl.browser/server-loop",
 :full-name-encode "cljs.repl.browser/server-loop",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/server-loop"]))
```

-->
