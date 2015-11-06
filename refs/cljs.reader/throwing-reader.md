## cljs.reader/throwing-reader



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__throwing-reader__ msg)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/reader.cljs#L366-L369):

```clj
(defn throwing-reader
  [msg]
  (fn [rdr _]
    (reader-error rdr msg)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:366-369](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/reader.cljs#L366-L369)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/throwing-reader` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/throwing-reader.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/throwing-reader.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "throwing-reader",
 :type "function",
 :signature ["[msg]"],
 :source {:code "(defn throwing-reader\n  [msg]\n  (fn [rdr _]\n    (reader-error rdr msg)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [366 369]},
 :full-name "cljs.reader/throwing-reader",
 :full-name-encode "cljs.reader/throwing-reader",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/throwing-reader"]))
```

-->
