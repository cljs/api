## cljs.core/\*print-readably\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-readably\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-readably*)
</td>
</tr>
</table>







Source docstring:

```
When set to logical false, strings and characters will be printed with
non-alphanumeric characters converted to the appropriate escape sequences.

Defaults to true
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/core.cljs#L81-L87):

```clj
(def
  ^{:dynamic true
    :doc "When set to logical false, strings and characters will be printed with
  non-alphanumeric characters converted to the appropriate escape sequences.

  Defaults to true"}
  *print-readably* true)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.166
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:81-87](https://github.com/clojure/clojurescript/blob/r1.7.166/src/main/cljs/cljs/core.cljs#L81-L87)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-readably*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-readably*)<br>
[`clojure.core/*print-readably*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-readably*/)<br>
[`clojure.core/*print-readably*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-readably*.html)<br>
[`cljs.core/*print-readably*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-readably*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-readablySTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-readably*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-readablySTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical false, strings and characters will be printed with\n  non-alphanumeric characters converted to the appropriate escape sequences.\n\n  Defaults to true\"}\n  *print-readably* true)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.166",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [81 87]},
 :full-name "cljs.core/*print-readably*",
 :clj-symbol "clojure.core/*print-readably*",
 :docstring "When set to logical false, strings and characters will be printed with\nnon-alphanumeric characters converted to the appropriate escape sequences.\n\nDefaults to true"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-readably*"]))
```

-->
