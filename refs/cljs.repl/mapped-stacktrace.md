## cljs.repl/mapped-stacktrace



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2843"><img valign="middle" alt="[+] 0.0-2843" title="Added in 0.0-2843" src="https://img.shields.io/badge/+-0.0--2843-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__mapped-stacktrace__ stacktrace)<br>
</samp>
 <samp>
(__mapped-stacktrace__ stacktrace opts)<br>
</samp>

---





Source docstring:

```
Given a vector representing the canonicalized JavaScript stacktrace
return the ClojureScript stacktrace. The canonical stacktrace must be
in the form:

 [{:file <string>
   :function <string>
   :line <integer>
   :column <integer>}*]

:file must be a URL path (without protocol) relative to :output-dir or a
identifier delimited by angle brackets. The returned mapped stacktrace will
also contain :url entries to the original sources if it can be determined
from the classpath.
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl.clj#L243-L297):

```clj
(defn mapped-stacktrace
  ([stacktrace] (mapped-stacktrace stacktrace nil))
  ([stacktrace opts]
    (let [read-source-map' (memoize read-source-map)
          ns-info' (memoize ns-info)]
      (vec
        (for [{:keys [function file line column] :as frame} stacktrace]
          ;; need to convert file, a relative URL style path, to host-specific file
          (let [no-source-file? (if-not file
                                  true
                                  (.startsWith file "<"))
                rfile (when-not no-source-file?
                        (io/file (URL. (.toURL (io/file (util/output-directory opts))) file)))
                [sm {:keys [ns source-file] :as ns-info}]
                (when-not no-source-file?
                  ((juxt read-source-map' ns-info') rfile))
                [line' column'] (if ns-info
                                  (mapped-line-and-column sm line column)
                                  [line column])
                name' (when (and ns-info function)
                        function)
                file' (if no-source-file?
                        file
                        (string/replace
                         (.getCanonicalFile
                           (if ns-info
                             source-file
                             (io/file rfile)))
                         (str (System/getProperty "user.dir") File/separator) ""))
                url   (or (and ns-info (io/resource (util/ns->relpath ns)))
                          (and file (io/resource file)))]
            (merge
              {:function name'
               :file (if no-source-file?
                       (str "NO_SOURCE_FILE"
                         (when file
                           (str " " file)))
                       (io/file file'))
               :line line'
               :column column'}
              (when url
                {:url url}))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3058
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:243-297](https://github.com/clojure/clojurescript/blob/r3058/src/clj/cljs/repl.clj#L243-L297)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/mapped-stacktrace` @ crossclj](http://crossclj.info/fun/cljs.repl/mapped-stacktrace.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/mapped-stacktrace.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "mapped-stacktrace",
 :signature ["[stacktrace]" "[stacktrace opts]"],
 :history [["+" "0.0-2843"]],
 :type "function",
 :full-name-encode "cljs.repl/mapped-stacktrace",
 :source {:code "(defn mapped-stacktrace\n  ([stacktrace] (mapped-stacktrace stacktrace nil))\n  ([stacktrace opts]\n    (let [read-source-map' (memoize read-source-map)\n          ns-info' (memoize ns-info)]\n      (vec\n        (for [{:keys [function file line column] :as frame} stacktrace]\n          ;; need to convert file, a relative URL style path, to host-specific file\n          (let [no-source-file? (if-not file\n                                  true\n                                  (.startsWith file \"<\"))\n                rfile (when-not no-source-file?\n                        (io/file (URL. (.toURL (io/file (util/output-directory opts))) file)))\n                [sm {:keys [ns source-file] :as ns-info}]\n                (when-not no-source-file?\n                  ((juxt read-source-map' ns-info') rfile))\n                [line' column'] (if ns-info\n                                  (mapped-line-and-column sm line column)\n                                  [line column])\n                name' (when (and ns-info function)\n                        function)\n                file' (if no-source-file?\n                        file\n                        (string/replace\n                         (.getCanonicalFile\n                           (if ns-info\n                             source-file\n                             (io/file rfile)))\n                         (str (System/getProperty \"user.dir\") File/separator) \"\"))\n                url   (or (and ns-info (io/resource (util/ns->relpath ns)))\n                          (and file (io/resource file)))]\n            (merge\n              {:function name'\n               :file (if no-source-file?\n                       (str \"NO_SOURCE_FILE\"\n                         (when file\n                           (str \" \" file)))\n                       (io/file file'))\n               :line line'\n               :column column'}\n              (when url\n                {:url url}))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3058",
          :filename "src/clj/cljs/repl.clj",
          :lines [243 297]},
 :full-name "cljs.repl/mapped-stacktrace",
 :docstring "Given a vector representing the canonicalized JavaScript stacktrace\nreturn the ClojureScript stacktrace. The canonical stacktrace must be\nin the form:\n\n [{:file <string>\n   :function <string>\n   :line <integer>\n   :column <integer>}*]\n\n:file must be a URL path (without protocol) relative to :output-dir or a\nidentifier delimited by angle brackets. The returned mapped stacktrace will\nalso contain :url entries to the original sources if it can be determined\nfrom the classpath."}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/mapped-stacktrace"]))
```

-->
