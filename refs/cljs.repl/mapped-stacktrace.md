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


Source code @ [github](https://github.com/clojure/clojurescript/blob/r3190/src/clj/cljs/repl.clj#L265-L330):

```clj
(defn mapped-stacktrace
  ([stacktrace] (mapped-stacktrace stacktrace nil))
  ([stacktrace opts]
   (vec
     (let [with-calls
           (for [{:keys [function file line column] :as frame} stacktrace]
             ;; need to convert file, a relative URL style path, to host-specific file
             (let [no-source-file? (if-not file
                                     true
                                     (.startsWith file "<"))
                   rfile (when-not no-source-file?
                           (io/file (URL. (.toURL (io/file (util/output-directory opts))) file)))
                   [sm {:keys [ns source-file] :as ns-info}]
                   (when-not no-source-file?
                     ((juxt read-source-map ns-info) rfile))
                   [line' column' call] (if ns-info
                                          (mapped-line-column-call sm line column)
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
                   url (or (and ns-info (util/ns->source ns))
                           (and file (io/resource file)))]
               (merge
                 {:function name'
                  :call call
                  :file (if no-source-file?
                          (str "NO_SOURCE_FILE"
                            (when file
                              (str " " file)))
                          (io/file file'))
                  :line line'
                  :column column'}
                 (when url
                   {:url url}))))]
       ;; take each non-nil :call and optionally merge it into :function one-level up
       ;; to avoid replacing with local symbols, we only replace munged name if we can munge call symbol back to it
       (map #(merge-with (fn [munged-fn-name unmunged-call-name]
                           (if (= munged-fn-name (string/replace (cljs.compiler/munge unmunged-call-name) "." "$"))
                             unmunged-call-name
                             munged-fn-name)) %1 %2)
         (map #(dissoc % :call) with-calls)
         (concat (rest (map #(if (:call %)
                              (hash-map :function (:call %))
                              {})
                         with-calls)) [{}]))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3190
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:265-330](https://github.com/clojure/clojurescript/blob/r3190/src/clj/cljs/repl.clj#L265-L330)</ins>
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
 :source {:code "(defn mapped-stacktrace\n  ([stacktrace] (mapped-stacktrace stacktrace nil))\n  ([stacktrace opts]\n   (vec\n     (let [with-calls\n           (for [{:keys [function file line column] :as frame} stacktrace]\n             ;; need to convert file, a relative URL style path, to host-specific file\n             (let [no-source-file? (if-not file\n                                     true\n                                     (.startsWith file \"<\"))\n                   rfile (when-not no-source-file?\n                           (io/file (URL. (.toURL (io/file (util/output-directory opts))) file)))\n                   [sm {:keys [ns source-file] :as ns-info}]\n                   (when-not no-source-file?\n                     ((juxt read-source-map ns-info) rfile))\n                   [line' column' call] (if ns-info\n                                          (mapped-line-column-call sm line column)\n                                          [line column])\n                   name' (when (and ns-info function)\n                           function)\n                   file' (if no-source-file?\n                           file\n                           (string/replace\n                             (.getCanonicalFile\n                               (if ns-info\n                                 source-file\n                                 (io/file rfile)))\n                             (str (System/getProperty \"user.dir\") File/separator) \"\"))\n                   url (or (and ns-info (util/ns->source ns))\n                           (and file (io/resource file)))]\n               (merge\n                 {:function name'\n                  :call call\n                  :file (if no-source-file?\n                          (str \"NO_SOURCE_FILE\"\n                            (when file\n                              (str \" \" file)))\n                          (io/file file'))\n                  :line line'\n                  :column column'}\n                 (when url\n                   {:url url}))))]\n       ;; take each non-nil :call and optionally merge it into :function one-level up\n       ;; to avoid replacing with local symbols, we only replace munged name if we can munge call symbol back to it\n       (map #(merge-with (fn [munged-fn-name unmunged-call-name]\n                           (if (= munged-fn-name (string/replace (cljs.compiler/munge unmunged-call-name) \".\" \"$\"))\n                             unmunged-call-name\n                             munged-fn-name)) %1 %2)\n         (map #(dissoc % :call) with-calls)\n         (concat (rest (map #(if (:call %)\n                              (hash-map :function (:call %))\n                              {})\n                         with-calls)) [{}]))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3190",
          :filename "src/clj/cljs/repl.clj",
          :lines [265 330]},
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
