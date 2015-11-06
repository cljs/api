## cljs.repl.server/read-headers



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-headers__ rdr)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/repl/server.clj#L70-L75):

```clj
(defn read-headers [rdr]
  (loop [next-line (.readLine rdr)
         header-lines []]
    (if (= "" next-line)
      header-lines                      ;we're done reading headers
      (recur (.readLine rdr) (conj header-lines next-line)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[server.clj:70-75](https://github.com/clojure/clojurescript/blob/r2356/src/clj/cljs/repl/server.clj#L70-L75)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.server/read-headers` @ crossclj](http://crossclj.info/fun/cljs.repl.server/read-headers.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.server/read-headers.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.server",
 :name "read-headers",
 :type "function",
 :signature ["[rdr]"],
 :source {:code "(defn read-headers [rdr]\n  (loop [next-line (.readLine rdr)\n         header-lines []]\n    (if (= \"\" next-line)\n      header-lines                      ;we're done reading headers\n      (recur (.readLine rdr) (conj header-lines next-line)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/clj/cljs/repl/server.clj",
          :lines [70 75]},
 :full-name "cljs.repl.server/read-headers",
 :full-name-encode "cljs.repl.server/read-headers",
 :history [["+" "0.0-1503"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.server/read-headers"]))
```

-->
