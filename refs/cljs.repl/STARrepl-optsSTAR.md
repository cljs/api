## cljs.repl/\*repl-opts\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2911"><img valign="middle" alt="[+] 0.0-2911" title="Added in 0.0-2911" src="https://img.shields.io/badge/+-0.0--2911-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/repl.clj#L35):

```clj
(def ^:dynamic *repl-opts* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3178
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:35](https://github.com/clojure/clojurescript/blob/r3178/src/clj/cljs/repl.clj#L35)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/*repl-opts*` @ crossclj](http://crossclj.info/fun/cljs.repl/*repl-opts*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/STARrepl-optsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "*repl-opts*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *repl-opts* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3178",
          :filename "src/clj/cljs/repl.clj",
          :lines [35]},
 :full-name "cljs.repl/*repl-opts*",
 :full-name-encode "cljs.repl/STARrepl-optsSTAR",
 :history [["+" "0.0-2911"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/*repl-opts*"]))
```

-->
