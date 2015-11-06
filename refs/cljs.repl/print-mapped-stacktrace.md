## cljs.repl/print-mapped-stacktrace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2814"><img valign="middle" alt="[+] 0.0-2814" title="Added in 0.0-2814" src="https://img.shields.io/badge/+-0.0--2814-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__print-mapped-stacktrace__ stacktrace)<br>
</samp>
 <samp>
(__print-mapped-stacktrace__ stacktrace opts)<br>
</samp>

---





Source docstring:

```
Given a vector representing the canonicalized JavaScript stacktrace
print the ClojureScript stacktrace. The canonical stacktrace must be
a vector of {:file <string> :function <string> :line <integer> :column <integer>}
maps.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/repl.clj#L197-L220):

```clj
(defn print-mapped-stacktrace
  ([stacktrace] (print-mapped-stacktrace stacktrace nil))
  ([stacktrace opts]
    (let [read-source-map' (memoize read-source-map)
          ns-info' (memoize ns-info)]
      (doseq [{:keys [function file line column] :as frame} stacktrace]
        (let [[sm {:keys [ns source-file] :as ns-info}] ((juxt read-source-map' ns-info') file)
              [line' column'] (if ns-info
                                (mapped-line-and-column sm line column)
                                [line column])
              name' (if (and ns-info function)
                      (symbol (name ns) (cljrepl/demunge function))
                      function)
              file' (string/replace
                      (.getCanonicalFile
                        (if ns-info
                          source-file
                          (io/file file)))
                      (str (System/getProperty "user.dir") File/separator) "")]
          (println "\t" (str name' " (" file' ":" line' ":" column' ")")))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:197-220](https://github.com/clojure/clojurescript/blob/r2814/src/clj/cljs/repl.clj#L197-L220)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/print-mapped-stacktrace` @ crossclj](http://crossclj.info/fun/cljs.repl/print-mapped-stacktrace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/print-mapped-stacktrace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "print-mapped-stacktrace",
 :signature ["[stacktrace]" "[stacktrace opts]"],
 :history [["+" "0.0-2814"]],
 :type "function",
 :full-name-encode "cljs.repl/print-mapped-stacktrace",
 :source {:code "(defn print-mapped-stacktrace\n  ([stacktrace] (print-mapped-stacktrace stacktrace nil))\n  ([stacktrace opts]\n    (let [read-source-map' (memoize read-source-map)\n          ns-info' (memoize ns-info)]\n      (doseq [{:keys [function file line column] :as frame} stacktrace]\n        (let [[sm {:keys [ns source-file] :as ns-info}] ((juxt read-source-map' ns-info') file)\n              [line' column'] (if ns-info\n                                (mapped-line-and-column sm line column)\n                                [line column])\n              name' (if (and ns-info function)\n                      (symbol (name ns) (cljrepl/demunge function))\n                      function)\n              file' (string/replace\n                      (.getCanonicalFile\n                        (if ns-info\n                          source-file\n                          (io/file file)))\n                      (str (System/getProperty \"user.dir\") File/separator) \"\")]\n          (println \"\\t\" (str name' \" (\" file' \":\" line' \":\" column' \")\")))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/clj/cljs/repl.clj",
          :lines [197 220]},
 :full-name "cljs.repl/print-mapped-stacktrace",
 :docstring "Given a vector representing the canonicalized JavaScript stacktrace\nprint the ClojureScript stacktrace. The canonical stacktrace must be\na vector of {:file <string> :function <string> :line <integer> :column <integer>}\nmaps."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/print-mapped-stacktrace"]))
```

-->
