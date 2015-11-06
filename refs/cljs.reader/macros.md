## cljs.reader/macros



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L310-L328):

```clj
(def macros
     { \" read-string
       \: read-keyword
       \; not-implemented ;; never hit this
       \' (wrapping-reader 'quote)
       \@ (wrapping-reader 'deref)
       \^ read-meta
       \` not-implemented
       \~ not-implemented
       \( read-list
       \) read-unmatched-delimiter
       \[ read-vector
       \] read-unmatched-delimiter
       \{ read-map
       \} read-unmatched-delimiter
       \\ read-char
       \% not-implemented
       \# read-dispatch
       })
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:310-328](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L310-L328)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/macros` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/macros.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/macros.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "macros",
 :type "var",
 :source {:code "(def macros\n     { \\\" read-string\n       \\: read-keyword\n       \\; not-implemented ;; never hit this\n       \\' (wrapping-reader 'quote)\n       \\@ (wrapping-reader 'deref)\n       \\^ read-meta\n       \\` not-implemented\n       \\~ not-implemented\n       \\( read-list\n       \\) read-unmatched-delimiter\n       \\[ read-vector\n       \\] read-unmatched-delimiter\n       \\{ read-map\n       \\} read-unmatched-delimiter\n       \\\\ read-char\n       \\% not-implemented\n       \\# read-dispatch\n       })",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [310 328]},
 :full-name "cljs.reader/macros",
 :full-name-encode "cljs.reader/macros",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macros"]))
```

-->
