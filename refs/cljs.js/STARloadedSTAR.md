## cljs.js/\*loaded\*



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/js.cljs#L159):

```clj
(def *loaded* (atom #{}))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[js.cljs:159](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/js.cljs#L159)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.js/*loaded*` @ crossclj](http://crossclj.info/fun/cljs.js.cljs/*loaded*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.js/STARloadedSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.js",
 :name "*loaded*",
 :type "var",
 :source {:code "(def *loaded* (atom #{}))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/cljs/cljs/js.cljs",
          :lines [159]},
 :full-name "cljs.js/*loaded*",
 :full-name-encode "cljs.js/STARloadedSTAR",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.js/*loaded*"]))
```

-->
