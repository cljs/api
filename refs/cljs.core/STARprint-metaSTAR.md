## cljs.core/\*print-meta\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-meta\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-meta*)
</td>
</tr>
</table>







Source docstring:

```
If set to logical true, when printing an object, its metadata will also
be printed in a form that can be read back by the reader.

Defaults to false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L63-L69):

```clj
(def
  ^{:dynamic true
    :doc "If set to logical true, when printing an object, its metadata will also
  be printed in a form that can be read back by the reader.

  Defaults to false."}
  *print-meta* false)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3196
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:63-69](https://github.com/clojure/clojurescript/blob/r3196/src/cljs/cljs/core.cljs#L63-L69)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-meta*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-meta*)<br>
[`clojure.core/*print-meta*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-meta*/)<br>
[`clojure.core/*print-meta*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-meta*.html)<br>
[`cljs.core/*print-meta*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-meta*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-metaSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-meta*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-metaSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"If set to logical true, when printing an object, its metadata will also\n  be printed in a form that can be read back by the reader.\n\n  Defaults to false.\"}\n  *print-meta* false)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3196",
          :filename "src/cljs/cljs/core.cljs",
          :lines [63 69]},
 :full-name "cljs.core/*print-meta*",
 :clj-symbol "clojure.core/*print-meta*",
 :docstring "If set to logical true, when printing an object, its metadata will also\nbe printed in a form that can be read back by the reader.\n\nDefaults to false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-meta*"]))
```

-->
