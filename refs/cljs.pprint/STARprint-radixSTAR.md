## cljs.pprint/\*print-radix\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3255"><img valign="middle" alt="[+] 0.0-3255" title="Added in 0.0-3255" src="https://img.shields.io/badge/+-0.0--3255-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.pprint/\*print-radix\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.pprint-api.html#clojure.pprint/*print-radix*)
</td>
</tr>
</table>







Source docstring:

```
Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,
or 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the
radix specifier is in the form #XXr where XX is the decimal value of *print-base* 
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.cljs#L666-L671):

```clj
(def ^:dynamic
^{:doc "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,
or 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the
radix specifier is in the form #XXr where XX is the decimal value of *print-base* "
  :added "1.2"}
*print-radix* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3291
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[pprint.cljs:666-671](https://github.com/clojure/clojurescript/blob/r3291/src/main/cljs/cljs/pprint.cljs#L666-L671)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.pprint/*print-radix*` @ clojuredocs](http://clojuredocs.org/clojure.pprint/*print-radix*)<br>
[`clojure.pprint/*print-radix*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.pprint/*print-radix*/)<br>
[`clojure.pprint/*print-radix*` @ crossclj](http://crossclj.info/fun/clojure.pprint/*print-radix*.html)<br>
[`cljs.pprint/*print-radix*` @ crossclj](http://crossclj.info/fun/cljs.pprint.cljs/*print-radix*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.pprint/STARprint-radixSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.pprint",
 :name "*print-radix*",
 :history [["+" "0.0-3255"]],
 :type "dynamic var",
 :full-name-encode "cljs.pprint/STARprint-radixSTAR",
 :source {:code "(def ^:dynamic\n^{:doc \"Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,\nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the\nradix specifier is in the form #XXr where XX is the decimal value of *print-base* \"\n  :added \"1.2\"}\n*print-radix* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3291",
          :filename "src/main/cljs/cljs/pprint.cljs",
          :lines [666 671]},
 :full-name "cljs.pprint/*print-radix*",
 :clj-symbol "clojure.pprint/*print-radix*",
 :docstring "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8,\nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the\nradix specifier is in the form #XXr where XX is the decimal value of *print-base* "}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.pprint/*print-radix*"]))
```

-->
