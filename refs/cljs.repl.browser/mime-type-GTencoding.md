## cljs.repl.browser/mime-type->encoding



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3297"><img valign="middle" alt="[+] 0.0-3297" title="Added in 0.0-3297" src="https://img.shields.io/badge/+-0.0--3297-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/browser.clj#L44-L52):

```clj
(def mime-type->encoding
  {"text/html" "UTF-8"
   "text/css" "UTF-8"
   "image/jpeg" "ISO-8859-1"
   "image/png" "ISO-8859-1"
   "image/gif" "ISO-8859-1"
   "text/javascript" "UTF-8"
   "text/x-clojure" "UTF-8"
   "application/json" "UTF-8"})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[browser.clj:44-52](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/browser.clj#L44-L52)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.browser/mime-type->encoding` @ crossclj](http://crossclj.info/fun/cljs.repl.browser/mime-type-%3Eencoding.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.browser/mime-type-GTencoding.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.browser",
 :name "mime-type->encoding",
 :type "var",
 :source {:code "(def mime-type->encoding\n  {\"text/html\" \"UTF-8\"\n   \"text/css\" \"UTF-8\"\n   \"image/jpeg\" \"ISO-8859-1\"\n   \"image/png\" \"ISO-8859-1\"\n   \"image/gif\" \"ISO-8859-1\"\n   \"text/javascript\" \"UTF-8\"\n   \"text/x-clojure\" \"UTF-8\"\n   \"application/json\" \"UTF-8\"})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl/browser.clj",
          :lines [44 52]},
 :full-name "cljs.repl.browser/mime-type->encoding",
 :full-name-encode "cljs.repl.browser/mime-type-GTencoding",
 :history [["+" "0.0-3297"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.browser/mime-type->encoding"]))
```

-->
