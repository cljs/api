## cljs.pprint/\*print-right-margin\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-right-margin\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-right-margin*)
</td>
</tr>
</table>







Source docstring:

```
Pretty printing will try to avoid anything going beyond this column.
Set it to nil to have pprint let the line be arbitrarily long. This will ignore all
non-mandatory newlines.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/pprint.cljs#L625-L630):

```clj
(def ^:dynamic
 ^{:doc "Pretty printing will try to avoid anything going beyond this column.
Set it to nil to have pprint let the line be arbitrarily long. This will ignore all
non-mandatory newlines.",
   :added "1.2"}
 *print-right-margin* 72)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.107
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:625-630](https://github.com/clojure/clojurescript/blob/r1.7.107/src/main/cljs/cljs/pprint.cljs#L625-L630)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-right-margin*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-right-margin*)<br>
[`clojure.pprint/*print-right-margin*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-right-margin*/)<br>
[`clojure.pprint/*print-right-margin*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-right-margin*.html)<br>
[`cljs.pprint/*print-right-margin*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-right-margin*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-right-marginSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-right-margin*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint/STARprint-right-marginSTAR",
 :source {:code "(def ^:dynamic\n ^{:doc \"Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all\nnon-mandatory newlines.\",\n   :added \"1.2\"}\n *print-right-margin* 72)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.107",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [625 630]},
 :full-name "cljs.pprint/*print-right-margin*",
 :clj-symbol "clojure.pprint/*print-right-margin*",
 :docstring "Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all\nnon-mandatory newlines."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-right-margin*"]))
```

-->
