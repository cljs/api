## cljs.repl.nashorn/bootstrap-repl



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__bootstrap-repl__ engine output-dir opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl/nashorn.clj#L118-L132):

```clj
(defn bootstrap-repl [engine output-dir opts]
  (env/ensure
    (let [deps-file ".nashorn_repl_deps.js"
          core (io/resource "cljs/core.cljs")
          core-js (closure/compile core
                    (assoc opts
                      :output-file (closure/src-file->target-file core)))
          deps (closure/add-dependencies opts core-js)]
      ;; output unoptimized code and the deps file
      ;; for all compiled namespaces
      (apply closure/output-unoptimized
        (assoc opts :output-to (.getPath (io/file output-dir deps-file)))
        deps)
      ;; load the deps file so we can goog.require cljs.core etc.
      (load-js-file engine deps-file))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3165
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[nashorn.clj:118-132](https://github.com/clojure/clojurescript/blob/r3165/src/clj/cljs/repl/nashorn.clj#L118-L132)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/bootstrap-repl` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/bootstrap-repl.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/bootstrap-repl.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "bootstrap-repl",
 :type "function",
 :signature ["[engine output-dir opts]"],
 :source {:code "(defn bootstrap-repl [engine output-dir opts]\n  (env/ensure\n    (let [deps-file \".nashorn_repl_deps.js\"\n          core (io/resource \"cljs/core.cljs\")\n          core-js (closure/compile core\n                    (assoc opts\n                      :output-file (closure/src-file->target-file core)))\n          deps (closure/add-dependencies opts core-js)]\n      ;; output unoptimized code and the deps file\n      ;; for all compiled namespaces\n      (apply closure/output-unoptimized\n        (assoc opts :output-to (.getPath (io/file output-dir deps-file)))\n        deps)\n      ;; load the deps file so we can goog.require cljs.core etc.\n      (load-js-file engine deps-file))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3165",
          :filename "src/clj/cljs/repl/nashorn.clj",
          :lines [118 132]},
 :full-name "cljs.repl.nashorn/bootstrap-repl",
 :full-name-encode "cljs.repl.nashorn/bootstrap-repl",
 :history [["+" "0.0-2814"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/bootstrap-repl"]))
```

-->
