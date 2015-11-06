## cljs.reader/read-regex



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-regex__ rdr ch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/reader.cljs#L382-L384):

```clj
(defn read-regex
  [rdr ch]
  (-> (read-raw-string* rdr ch) re-pattern))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2371
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:382-384](https://github.com/clojure/clojurescript/blob/r2371/src/cljs/cljs/reader.cljs#L382-L384)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-regex` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-regex.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-regex.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-regex",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-regex\n  [rdr ch]\n  (-> (read-raw-string* rdr ch) re-pattern))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2371",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [382 384]},
 :full-name "cljs.reader/read-regex",
 :full-name-encode "cljs.reader/read-regex",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-regex"]))
```

-->
