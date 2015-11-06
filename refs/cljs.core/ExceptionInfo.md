## cljs.core/ExceptionInfo



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/ExceptionInfo</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/ExceptionInfo.java)
</td>
</tr>
</table>


 <samp>
(__ExceptionInfo.__ message data cause)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L9047):

```clj
(deftype ExceptionInfo [message data cause])
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2655
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:9047](https://github.com/clojure/clojurescript/blob/r2655/src/cljs/cljs/core.cljs#L9047)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/ExceptionInfo` @ clojuredocs](http://clojuredocs.org/clojure.lang/ExceptionInfo)<br>
[`clojure.lang/ExceptionInfo` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/ExceptionInfo/)<br>
[`clojure.lang/ExceptionInfo` @ crossclj](http://crossclj.info/fun/clojure.lang/ExceptionInfo.html)<br>
[`cljs.core/ExceptionInfo` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/ExceptionInfo.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/ExceptionInfo.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "ExceptionInfo",
 :signature ["[message data cause]"],
 :history [["+" "0.0-1576"]],
 :type "type",
 :full-name-encode "cljs.core/ExceptionInfo",
 :source {:code "(deftype ExceptionInfo [message data cause])",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2655",
          :filename "src/cljs/cljs/core.cljs",
          :lines [9047]},
 :full-name "cljs.core/ExceptionInfo",
 :clj-symbol "clojure.lang/ExceptionInfo"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/ExceptionInfo"]))
```

-->
