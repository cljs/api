## cljs.reader/read-unmatched-delimiter



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-unmatched-delimiter__ rdr ch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L199-L201):

```clj
(defn read-unmatched-delimiter
  [rdr ch]
  (reader-error rdr "Unmached delimiter " ch))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r971
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:199-201](https://github.com/clojure/clojurescript/blob/r971/src/cljs/cljs/reader.cljs#L199-L201)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-unmatched-delimiter` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-unmatched-delimiter.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-unmatched-delimiter.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-unmatched-delimiter",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-unmatched-delimiter\n  [rdr ch]\n  (reader-error rdr \"Unmached delimiter \" ch))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r971",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [199 201]},
 :full-name "cljs.reader/read-unmatched-delimiter",
 :full-name-encode "cljs.reader/read-unmatched-delimiter",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-unmatched-delimiter"]))
```

-->
