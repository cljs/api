## cljs.reader/parse-timestamp



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__parse-timestamp__ ts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/reader.cljs#L517-L524):

```clj
(defn parse-timestamp
  [ts]
  (if-let [[years months days hours minutes seconds ms offset]
           (parse-and-validate-timestamp ts)]
    (js/Date.
     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)
        (* offset 60 1000)))
    (reader-error nil (str "Unrecognized date/time syntax: " ts))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2725
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:517-524](https://github.com/clojure/clojurescript/blob/r2725/src/cljs/cljs/reader.cljs#L517-L524)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/parse-timestamp` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/parse-timestamp.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/parse-timestamp.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "parse-timestamp",
 :type "function",
 :signature ["[ts]"],
 :source {:code "(defn parse-timestamp\n  [ts]\n  (if-let [[years months days hours minutes seconds ms offset]\n           (parse-and-validate-timestamp ts)]\n    (js/Date.\n     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)\n        (* offset 60 1000)))\n    (reader-error nil (str \"Unrecognized date/time syntax: \" ts))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2725",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [517 524]},
 :full-name "cljs.reader/parse-timestamp",
 :full-name-encode "cljs.reader/parse-timestamp",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/parse-timestamp"]))
```

-->
