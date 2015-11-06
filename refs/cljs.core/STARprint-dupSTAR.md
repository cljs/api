## cljs.core/\*print-dup\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> <samp>clojure.core/\*print-dup\*</samp>](http://clojure.github.io/clojure/branch-master/clojure.core-api.html#clojure.core/*print-dup*)
</td>
</tr>
</table>







Source docstring:

```
When set to logical true, objects will be printed in a way that preserves
their type when read in later.

Defaults to false.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L71-L77):

```clj
(def
  ^{:dynamic true
    :doc "When set to logical true, objects will be printed in a way that preserves
  their type when read in later.

  Defaults to false."}
  *print-dup* false)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3169
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:71-77](https://github.com/clojure/clojurescript/blob/r3169/src/cljs/cljs/core.cljs#L71-L77)</ins>
</pre>

-->

---



###### External doc links:

[`clojure.core/*print-dup*` @ clojuredocs](http://clojuredocs.org/clojure.core/*print-dup*)<br>
[`clojure.core/*print-dup*` @ grimoire](http://conj.io/store/v1/org.clojure/clojure/1.7.0-beta3/clj/clojure.core/*print-dup*/)<br>
[`clojure.core/*print-dup*` @ crossclj](http://crossclj.info/fun/clojure.core/*print-dup*.html)<br>
[`cljs.core/*print-dup*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-dup*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-dupSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-dup*",
 :history [["+" "0.0-927"]],
 :type "dynamic var",
 :full-name-encode "cljs.core/STARprint-dupSTAR",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical true, objects will be printed in a way that preserves\n  their type when read in later.\n\n  Defaults to false.\"}\n  *print-dup* false)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3169",
          :filename "src/cljs/cljs/core.cljs",
          :lines [71 77]},
 :full-name "cljs.core/*print-dup*",
 :clj-symbol "clojure.core/*print-dup*",
 :docstring "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-dup*"]))
```

-->
