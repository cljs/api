## cljs.repl.rhino/goog-require



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__goog-require__ repl-env opts rule)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L78-L109):

```clj
(defn goog-require [repl-env opts rule]
  (let [path        (string/replace (comp/munge rule) \. File/separatorChar)
        output-dir  (util/output-directory opts)
        cljsc-path  (str output-dir File/separator (str path ".js"))
        cljs-path   (str path ".cljs")
        gpath       (-eval (str "goog.dependencies_.nameToPath['" rule "']")
                      repl-env "<cljs repl>" 1)
        js-path     (str "goog/" gpath)
        js-out-path (io/file output-dir "goog"
                      (string/replace gpath \/ File/separatorChar))]
    (let [compiled (io/file cljsc-path)]
      (if (.exists compiled)
        ;; TODO: only take this path if analysis cache is available
        ;; - David
        (do
          (with-open [reader (io/reader compiled)]
            (-eval reader repl-env cljsc-path 1)))
        (if-let [res (io/resource cljs-path)]
          (binding [ana/*cljs-ns* 'cljs.user]
            (repl/load-stream repl-env cljs-path res))
          (if-let [res (io/resource js-path)]
            (with-open [reader (io/reader res)]
              (-eval reader repl-env js-path 1))
            (if (.exists js-out-path)
              (with-open [reader (io/reader js-out-path)]
                (-eval reader repl-env js-path 1))
              (throw
               (Exception.
                 (str "Cannot find "
                   cljs-path " or "
                   js-path " or "
                   (.getName js-out-path) " in classpath"))))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2913
└── src
    └── clj
        └── cljs
            └── repl
                └── <ins>[rhino.clj:78-109](https://github.com/clojure/clojurescript/blob/r2913/src/clj/cljs/repl/rhino.clj#L78-L109)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/goog-require` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/goog-require.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/goog-require.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "goog-require",
 :type "function",
 :signature ["[repl-env opts rule]"],
 :source {:code "(defn goog-require [repl-env opts rule]\n  (let [path        (string/replace (comp/munge rule) \\. File/separatorChar)\n        output-dir  (util/output-directory opts)\n        cljsc-path  (str output-dir File/separator (str path \".js\"))\n        cljs-path   (str path \".cljs\")\n        gpath       (-eval (str \"goog.dependencies_.nameToPath['\" rule \"']\")\n                      repl-env \"<cljs repl>\" 1)\n        js-path     (str \"goog/\" gpath)\n        js-out-path (io/file output-dir \"goog\"\n                      (string/replace gpath \\/ File/separatorChar))]\n    (let [compiled (io/file cljsc-path)]\n      (if (.exists compiled)\n        ;; TODO: only take this path if analysis cache is available\n        ;; - David\n        (do\n          (with-open [reader (io/reader compiled)]\n            (-eval reader repl-env cljsc-path 1)))\n        (if-let [res (io/resource cljs-path)]\n          (binding [ana/*cljs-ns* 'cljs.user]\n            (repl/load-stream repl-env cljs-path res))\n          (if-let [res (io/resource js-path)]\n            (with-open [reader (io/reader res)]\n              (-eval reader repl-env js-path 1))\n            (if (.exists js-out-path)\n              (with-open [reader (io/reader js-out-path)]\n                (-eval reader repl-env js-path 1))\n              (throw\n               (Exception.\n                 (str \"Cannot find \"\n                   cljs-path \" or \"\n                   js-path \" or \"\n                   (.getName js-out-path) \" in classpath\"))))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2913",
          :filename "src/clj/cljs/repl/rhino.clj",
          :lines [78 109]},
 :full-name "cljs.repl.rhino/goog-require",
 :full-name-encode "cljs.repl.rhino/goog-require",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/goog-require"]))
```

-->
