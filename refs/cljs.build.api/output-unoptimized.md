## cljs.build.api/output-unoptimized



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3291"><img valign="middle" alt="[+] 0.0-3291" title="Added in 0.0-3291" src="https://img.shields.io/badge/+-0.0--3291-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__output-unoptimized__ opts & sources)<br>
</samp>

---





Source docstring:

```
Ensure that all JavaScript source files are on disk (not in jars),
write the goog deps file including only the libraries that are being
used and write the deps file for the current project.

The deps file for the current project will include third-party
libraries.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/build/api.clj#L200-L208):

```clj
(defn output-unoptimized
  [opts & sources]
  (apply closure/output-unoptimized opts sources))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.28
└── src
    └── main
        └── clojure
            └── cljs
                └── build
                    └── <ins>[api.clj:200-208](https://github.com/clojure/clojurescript/blob/r1.7.28/src/main/clojure/cljs/build/api.clj#L200-L208)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.build.api/output-unoptimized` @ crossclj](http://crossclj.info/fun/cljs.build.api/output-unoptimized.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.build.api/output-unoptimized.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.build.api",
 :name "output-unoptimized",
 :signature ["[opts & sources]"],
 :history [["+" "0.0-3291"]],
 :type "function",
 :full-name-encode "cljs.build.api/output-unoptimized",
 :source {:code "(defn output-unoptimized\n  [opts & sources]\n  (apply closure/output-unoptimized opts sources))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.28",
          :filename "src/main/clojure/cljs/build/api.clj",
          :lines [200 208]},
 :full-name "cljs.build.api/output-unoptimized",
 :docstring "Ensure that all JavaScript source files are on disk (not in jars),\nwrite the goog deps file including only the libraries that are being\nused and write the deps file for the current project.\n\nThe deps file for the current project will include third-party\nlibraries."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.build.api/output-unoptimized"]))
```

-->
