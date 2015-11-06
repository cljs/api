## cljs.reader/read-set



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-set__ rdr _)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/reader.cljs#L381-L383):

```clj
(defn read-set
  [rdr _]
  (set (read-delimited-list "}" rdr true)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3308
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:381-383](https://github.com/clojure/clojurescript/blob/r3308/src/main/cljs/cljs/reader.cljs#L381-L383)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-set` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-set.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-set.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-set",
 :type "function",
 :signature ["[rdr _]"],
 :source {:code "(defn read-set\n  [rdr _]\n  (set (read-delimited-list \"}\" rdr true)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3308",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [381 383]},
 :full-name "cljs.reader/read-set",
 :full-name-encode "cljs.reader/read-set",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-set"]))
```

-->
