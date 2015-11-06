## cljs.reader/read-token



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-token__ rdr initch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/reader.cljs#L78-L86):

```clj
(defn read-token
  [rdr initch]
  (loop [sb (gstring/StringBuffer. initch)
         ch (read-char rdr)]
    (if (or (nil? ch)
            (whitespace? ch)
            (macro-terminating? ch))
      (do (unread rdr ch) (. sb (toString)))
      (recur (do (.append sb ch) sb) (read-char rdr)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2120
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:78-86](https://github.com/clojure/clojurescript/blob/r2120/src/cljs/cljs/reader.cljs#L78-L86)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-token` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-token.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-token.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-token",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn read-token\n  [rdr initch]\n  (loop [sb (gstring/StringBuffer. initch)\n         ch (read-char rdr)]\n    (if (or (nil? ch)\n            (whitespace? ch)\n            (macro-terminating? ch))\n      (do (unread rdr ch) (. sb (toString)))\n      (recur (do (.append sb ch) sb) (read-char rdr)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2120",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [78 86]},
 :full-name "cljs.reader/read-token",
 :full-name-encode "cljs.reader/read-token",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-token"]))
```

-->
