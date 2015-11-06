## cljs.test/\*current-env\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2496"><img valign="middle" alt="[+] 0.0-2496" title="Added in 0.0-2496" src="https://img.shields.io/badge/+-0.0--2496-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/test.cljs#L224):

```clj
(def ^:dynamic *current-env* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2740
└── src
    └── cljs
        └── cljs
            └── <ins>[test.cljs:224](https://github.com/clojure/clojurescript/blob/r2740/src/cljs/cljs/test.cljs#L224)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.test/*current-env*` @ crossclj](http://crossclj.info/fun/cljs.test.cljs/*current-env*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.test/STARcurrent-envSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.test",
 :name "*current-env*",
 :type "dynamic var",
 :source {:code "(def ^:dynamic *current-env* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2740",
          :filename "src/cljs/cljs/test.cljs",
          :lines [224]},
 :full-name "cljs.test/*current-env*",
 :full-name-encode "cljs.test/STARcurrent-envSTAR",
 :history [["+" "0.0-2496"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.test/*current-env*"]))
```

-->
