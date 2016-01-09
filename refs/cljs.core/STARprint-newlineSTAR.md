## cljs.core/\*print-newline\*



 <table border="1">
<tr>
<td>dynamic var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2060"><img valign="middle" alt="[+] 0.0-2060" title="Added in 0.0-2060" src="https://img.shields.io/badge/+-0.0--2060-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
When set to logical false will drop newlines from printing calls.
This is to work around the implicit newlines emitted by standard JavaScript
console objects.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L74-L79):

```clj
(def
  ^{:dynamic true
    :doc "When set to logical false will drop newlines from printing calls.
  This is to work around the implicit newlines emitted by standard JavaScript
  console objects."}
  *print-newline* true)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.228
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:74-79](https://github.com/clojure/clojurescript/blob/r1.7.228/src/main/cljs/cljs/core.cljs#L74-L79)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/*print-newline*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*print-newline*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARprint-newlineSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*print-newline*",
 :docstring "When set to logical false will drop newlines from printing calls.\nThis is to work around the implicit newlines emitted by standard JavaScript\nconsole objects.",
 :type "dynamic var",
 :source {:code "(def\n  ^{:dynamic true\n    :doc \"When set to logical false will drop newlines from printing calls.\n  This is to work around the implicit newlines emitted by standard JavaScript\n  console objects.\"}\n  *print-newline* true)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.228",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [74 79]},
 :full-name "cljs.core/*print-newline*",
 :full-name-encode "cljs.core/STARprint-newlineSTAR",
 :history [["+" "0.0-2060"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*print-newline*"]))
```

-->
