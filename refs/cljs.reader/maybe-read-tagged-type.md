## cljs.reader/maybe-read-tagged-type



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__maybe-read-tagged-type__ rdr initch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/reader.cljs#L541-L551):

```clj
(defn maybe-read-tagged-type
  [rdr initch]
  (let [tag (read-symbol rdr initch)
        pfn (get @*tag-table* (str tag))
        dfn @*default-data-reader-fn*]
    (cond
     pfn (pfn (read rdr true nil false))
     dfn (dfn tag (read rdr true nil false))
     :else (reader-error rdr
                         "Could not find tag parser for " (str tag)
                         " in " (pr-str (keys @*tag-table*))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1895
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:541-551](https://github.com/clojure/clojurescript/blob/r1895/src/cljs/cljs/reader.cljs#L541-L551)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/maybe-read-tagged-type` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/maybe-read-tagged-type.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/maybe-read-tagged-type.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "maybe-read-tagged-type",
 :type "function",
 :signature ["[rdr initch]"],
 :source {:code "(defn maybe-read-tagged-type\n  [rdr initch]\n  (let [tag (read-symbol rdr initch)\n        pfn (get @*tag-table* (str tag))\n        dfn @*default-data-reader-fn*]\n    (cond\n     pfn (pfn (read rdr true nil false))\n     dfn (dfn tag (read rdr true nil false))\n     :else (reader-error rdr\n                         \"Could not find tag parser for \" (str tag)\n                         \" in \" (pr-str (keys @*tag-table*))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1895",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [541 551]},
 :full-name "cljs.reader/maybe-read-tagged-type",
 :full-name-encode "cljs.reader/maybe-read-tagged-type",
 :history [["+" "0.0-1236"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/maybe-read-tagged-type"]))
```

-->
