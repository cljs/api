## cljs.core/\*print-length\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" title="Added in 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-length\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-length*)
</td>
</tr>
</table>







Source docstring:

```
When set to logical true, objects will be printed in a way that preserves
their type when read in later.

Defaults to false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L79-L85):

```clj
(def
  ^{:dynamic true
    :doc "When set to logical true, objects will be printed in a way that preserves
  their type when read in later.

  Defaults to false."}
  *print-length* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:79-85](https://github.com/clojure/clojurescript/blob/r3153/src/cljs/cljs/core.cljs#L79-L85)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-length*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-length*)<br>
[`clojure.core/*print-length*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-length*/)<br>
[`clojure.core/*print-length*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-length*.html)<br>
[`cljs.core/*print-length*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-length*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-lengthSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-length*",
 :history [["+" "0.0-2060"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-lengthSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical true, objects will be printed in a way that preserves\n  their type when read in later.\n\n  Defaults to false.\"}\n  *print-length* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/cljs/cljs/core.cljs",
          :lines [79 85]},
 :full-name "cljs.core/*print-length*",
 :clj-symbol "clojure.core/*print-length*",
 :docstring "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-length*"]))
```

-->
