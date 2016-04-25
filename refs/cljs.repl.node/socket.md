## cljs.repl.node/socket



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(socket host port)</samp><br>

---

 <samp>
(__socket__ host port)<br>
</samp>

---







Source code @ [github]():

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
 :signature ["[host port]"],
 :name-encode "socket",
 :history [["+" "0.0-2629"]],
 :type "function",
 :full-name-encode "cljs.repl.node/socket",
 :source {:code "(defn socket [host port]\n  (let [socket (Socket. host port)\n        in     (io/reader socket)\n        out    (io/writer socket)]\n    {:socket socket :in in :out out}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [24 28],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/clojure/cljs/repl/node.clj#L24-L28"},
 :usage ["(socket host port)"],
 :full-name "cljs.repl.node/socket",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/socket.cljsdoc"}

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
