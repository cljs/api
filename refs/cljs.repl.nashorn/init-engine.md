## cljs.repl.nashorn/init-engine



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__init-engine__ engine output-dir debug)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl/nashorn.clj#L55-L73):

```clj
(defn init-engine [engine output-dir debug]
      (eval-resource engine "goog/base.js" debug)
      (eval-resource engine "goog/deps.js" debug)
      (eval-str engine "var global = this") ; required by React
      (eval-str engine
        (format
          (str "var nashorn_load = function(path) {"
            "  var outputPath = \"%s\" + \"/\" + path;"
            (when debug "  print(\"loading: \" + outputPath) ; ")
            "  load(outputPath);"
            "};")
          output-dir))
      (eval-str engine
        (str "goog.global.CLOSURE_IMPORT_SCRIPT = function(path) {"
          " nashorn_load(\"goog/\" + path);"
          " return true;"
          "};"))
      (eval-str engine "goog.global.isProvided_ = function(name) { return false; };")
      engine)
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[nashorn.clj:55-73](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl/nashorn.clj#L55-L73)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.nashorn/init-engine` @ crossclj](http://crossclj.info/fun/cljs.repl.nashorn/init-engine.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.nashorn/init-engine.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.nashorn",
 :name "init-engine",
 :type "function",
 :signature ["[engine output-dir debug]"],
 :source {:code "(defn init-engine [engine output-dir debug]\n      (eval-resource engine \"goog/base.js\" debug)\n      (eval-resource engine \"goog/deps.js\" debug)\n      (eval-str engine \"var global = this\") ; required by React\n      (eval-str engine\n        (format\n          (str \"var nashorn_load = function(path) {\"\n            \"  var outputPath = \\\"%s\\\" + \\\"/\\\" + path;\"\n            (when debug \"  print(\\\"loading: \\\" + outputPath) ; \")\n            \"  load(outputPath);\"\n            \"};\")\n          output-dir))\n      (eval-str engine\n        (str \"goog.global.CLOSURE_IMPORT_SCRIPT = function(path) {\"\n          \" nashorn_load(\\\"goog/\\\" + path);\"\n          \" return true;\"\n          \"};\"))\n      (eval-str engine \"goog.global.isProvided_ = function(name) { return false; };\")\n      engine)",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/repl/nashorn.clj",
          :lines [55 73]},
 :full-name "cljs.repl.nashorn/init-engine",
 :full-name-encode "cljs.repl.nashorn/init-engine",
 :history [["+" "0.0-2814"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.nashorn/init-engine"]))
```

-->
