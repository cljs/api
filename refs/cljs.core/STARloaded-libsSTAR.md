## cljs.core/\*loaded-libs\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2655"><img valign="middle" alt="[+] 0.0-2655" title="Added in 0.0-2655" src="https://img.shields.io/badge/+-0.0--2655-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L99):

```clj
(defonce ^:dynamic *loaded-libs* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:99](https://github.com/clojure/clojurescript/blob/r3165/src/cljs/cljs/core.cljs#L99)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/*loaded-libs*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*loaded-libs*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARloaded-libsSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*loaded-libs*",
 :type "dynamic var",
 :source {:code "(defonce ^:dynamic *loaded-libs* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/cljs/cljs/core.cljs",
          :lines [99]},
 :full-name "cljs.core/*loaded-libs*",
 :full-name-encode "cljs.core/STARloaded-libsSTAR",
 :history [["+" "0.0-2655"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*loaded-libs*"]))
```

-->
