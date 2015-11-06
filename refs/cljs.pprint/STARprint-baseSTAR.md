## cljs.pprint/\*print-base\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-base\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-base*)
</td>
</tr>
</table>







Source docstring:

```
The base to use for printing integers and rationals.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.cljs#L672-L675):

```clj
(def ^:dynamic
^{:doc "The base to use for printing integers and rationals."
  :added "1.2"}
*print-base* 10)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:672-675](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/pprint.cljs#L672-L675)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-base*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-base*)<br>
[`clojure.pprint/*print-base*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-base*/)<br>
[`clojure.pprint/*print-base*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-base*.html)<br>
[`cljs.pprint/*print-base*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-base*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-baseSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-base*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint/STARprint-baseSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"The base to use for printing integers and rationals.\"\n  :added \"1.2\"}\n*print-base* 10)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [672 675]},
 :full-name "cljs.pprint/*print-base*",
 :clj-symbol "clojure.pprint/*print-base*",
 :docstring "The base to use for printing integers and rationals."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-base*"]))
```

-->
