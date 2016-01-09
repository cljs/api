## cljs.pprint/\*print-pretty\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-pretty\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-pretty*)
</td>
</tr>
</table>







Source docstring:

```
Bind to true if you want write to use pretty printing
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/pprint.cljs#L615-L617):

```clj
(def ^:dynamic
 ^{:doc "Bind to true if you want write to use pretty printing"}
 *print-pretty* true)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:615-617](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/pprint.cljs#L615-L617)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-pretty*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-pretty*)<br>
[`clojure.pprint/*print-pretty*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-pretty*/)<br>
[`clojure.pprint/*print-pretty*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-pretty*.html)<br>
[`cljs.pprint/*print-pretty*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-pretty*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-prettySTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-pretty*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint/STARprint-prettySTAR",
 :source {:code "(def ^:dynamic\n ^{:doc \"Bind to true if you want write to use pretty printing\"}\n *print-pretty* true)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [615 617]},
 :full-name "cljs.pprint/*print-pretty*",
 :clj-symbol "clojure.pprint/*print-pretty*",
 :docstring "Bind to true if you want write to use pretty printing"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-pretty*"]))
```

-->
