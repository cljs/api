## cljs.core/\*main-cli-fn\*



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>







Source docstring:

```
When compiled for a command-line target, whatever
function *main-fn* is set to will be called with the command-line
argv as arguments
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L99-L103):

```clj
(def
  ^{:doc "When compiled for a command-line target, whatever
  function *main-fn* is set to will be called with the command-line
  argv as arguments"}
  *main-cli-fn* nil)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1806
└── src
    └── cljs
        └── cljs
            └── <ins>[core.cljs:99-103](https://github.com/clojure/clojurescript/blob/r1806/src/cljs/cljs/core.cljs#L99-L103)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/*main-cli-fn*` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/*main-cli-fn*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/STARmain-cli-fnSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "*main-cli-fn*",
 :docstring "When compiled for a command-line target, whatever\nfunction *main-fn* is set to will be called with the command-line\nargv as arguments",
 :type "var",
 :source {:code "(def\n  ^{:doc \"When compiled for a command-line target, whatever\n  function *main-fn* is set to will be called with the command-line\n  argv as arguments\"}\n  *main-cli-fn* nil)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1806",
          :filename "src/cljs/cljs/core.cljs",
          :lines [99 103]},
 :full-name "cljs.core/*main-cli-fn*",
 :full-name-encode "cljs.core/STARmain-cli-fnSTAR",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/*main-cli-fn*"]))
```

-->
