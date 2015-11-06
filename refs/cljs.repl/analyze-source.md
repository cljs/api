## cljs.repl/analyze-source



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1503"><img valign="middle" alt="[+] 0.0-1503" title="Added in 0.0-1503" src="https://img.shields.io/badge/+-0.0--1503-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__analyze-source__ src-dir)<br>
</samp>
 <samp>
(__analyze-source__ src-dir opts)<br>
</samp>

---





Source docstring:

```
Given a source directory, analyzes all .cljs files. Used to populate
(:cljs.analyzer/namespaces compiler-env) so as to support code reflection.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl.cljc#L697-L705):

```clj
(defn analyze-source
  ([src-dir] (analyze-source src-dir nil))
  ([src-dir opts]
    (if-let [src-dir (and (not (empty? src-dir))
                       (File. src-dir))]
      (doseq [file (comp/cljs-files-in src-dir)]
        (ana/analyze-file (str "file://" (.getAbsolutePath file)) opts)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:697-705](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl.cljc#L697-L705)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/analyze-source` @ crossclj](http://crossclj.info/fun/cljs.repl/analyze-source.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/analyze-source.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "analyze-source",
 :signature ["[src-dir]" "[src-dir opts]"],
 :history [["+" "0.0-1503"]],
 :type "function",
 :full-name-encode "cljs.repl/analyze-source",
 :source {:code "(defn analyze-source\n  ([src-dir] (analyze-source src-dir nil))\n  ([src-dir opts]\n    (if-let [src-dir (and (not (empty? src-dir))\n                       (File. src-dir))]\n      (doseq [file (comp/cljs-files-in src-dir)]\n        (ana/analyze-file (str \"file://\" (.getAbsolutePath file)) opts)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [697 705]},
 :full-name "cljs.repl/analyze-source",
 :docstring "Given a source directory, analyzes all .cljs files. Used to populate\n(:cljs.analyzer/namespaces compiler-env) so as to support code reflection."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/analyze-source"]))
```

-->
