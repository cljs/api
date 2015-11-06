## cljs.core/IIndexed



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.lang/Indexed</samp>](https://github.com/clojure/clojure/blob//src/jvm/clojure/lang/Indexed.java)
</td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L245-L246):

```clj
(defprotocol IIndexed
  (-nth [coll n] [coll n not-found]))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2311
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:245-246](https://github.com/clojure/clojurescript/blob/r2311/src/cljs/cljs/core.cljs#L245-L246)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.lang/Indexed` @ clojuredocs](http://clojuredocs.org/clojure.lang/Indexed)<br>
[`clojure.lang/Indexed` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.lang/Indexed/)<br>
[`clojure.lang/Indexed` @ crossclj](http://crossclj.info/fun/clojure.lang/Indexed.html)<br>
[`cljs.core/IIndexed` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/IIndexed.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/IIndexed.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "IIndexed",
 :history [["+" "0.0-927"]],
 :type "protocol",
 :full-name-encode "cljs.core/IIndexed",
 :source {:code "(defprotocol IIndexed\n  (-nth [coll n] [coll n not-found]))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2311",
          :filename "src/cljs/cljs/core.cljs",
          :lines [245 246]},
 :methods [{:name "-nth",
            :signature ["[coll n]" "[coll n not-found]"],
            :docstring nil}],
 :full-name "cljs.core/IIndexed",
 :clj-symbol "clojure.lang/Indexed"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/IIndexed"]))
```

-->
