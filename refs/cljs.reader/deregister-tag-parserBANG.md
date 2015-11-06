## cljs.reader/deregister-tag-parser!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__deregister-tag-parser!__ tag)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/reader.cljs#L595-L600):

```clj
(defn deregister-tag-parser!
  [tag]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* dissoc tag)
    old-parser))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3115
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:595-600](https://github.com/clojure/clojurescript/blob/r3115/src/cljs/cljs/reader.cljs#L595-L600)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/deregister-tag-parser!` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/deregister-tag-parser%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/deregister-tag-parserBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "deregister-tag-parser!",
 :type "function",
 :signature ["[tag]"],
 :source {:code "(defn deregister-tag-parser!\n  [tag]\n  (let [tag (str tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* dissoc tag)\n    old-parser))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3115",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [595 600]},
 :full-name "cljs.reader/deregister-tag-parser!",
 :full-name-encode "cljs.reader/deregister-tag-parserBANG",
 :history [["+" "0.0-1424"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/deregister-tag-parser!"]))
```

-->
