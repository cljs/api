## cljs.repl/load-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(load-file repl-env f)</samp><br>
<samp>(load-file repl-env f opts)</samp><br>

---

 <samp>
(__load-file__ repl-env f)<br>
</samp>
 <samp>
(__load-file__ repl-env f opts)<br>
</samp>

---







Source code @ [github]():

```clj
(defn load-file
  ([repl-env f] (load-file repl-env f *repl-opts*))
  ([repl-env f opts]
    (if (:output-dir opts)
      (let [src (cond
                  (util/url? f) f
                  (.exists (io/file f)) (io/file f)
                  :else (io/resource f))
            compiled (binding [ana/*reload-macros* true]
                       (cljsc/compile src
                         (assoc opts
                           :output-file (cljsc/src-file->target-file src)
                           :force true
                           :mode :interactive)))]
        ;; copy over the original source file if source maps enabled
        (when-let [ns (and (:source-map opts) (first (:provides compiled)))]
          (spit
            (io/file (io/file (util/output-directory opts))
              (util/ns->relpath ns (util/ext (:source-url compiled))))
            (slurp src)))
        ;; need to load dependencies first
        (load-dependencies repl-env (:requires compiled) opts)
        (-evaluate repl-env f 1 (cljsc/add-dep-string opts compiled))
        (-evaluate repl-env f 1
          (cljsc/src-file->goog-require src
            {:wrap true :reload true :macros-ns (:macros-ns compiled)})))
      (binding [ana/*cljs-ns* ana/*cljs-ns*]
        (let [res (if (= File/separatorChar (first f)) f (io/resource f))]
          (assert res (str "Can't find " f " in classpath"))
          (load-stream repl-env f res))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.repl/load-file` @ crossclj](http://crossclj.info/fun/cljs.repl/load-file.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/load-file.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "load-file",
 :signature ["[repl-env f]" "[repl-env f opts]"],
 :name-encode "load-file",
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.repl/load-file",
 :source {:code "(defn load-file\n  ([repl-env f] (load-file repl-env f *repl-opts*))\n  ([repl-env f opts]\n    (if (:output-dir opts)\n      (let [src (cond\n                  (util/url? f) f\n                  (.exists (io/file f)) (io/file f)\n                  :else (io/resource f))\n            compiled (binding [ana/*reload-macros* true]\n                       (cljsc/compile src\n                         (assoc opts\n                           :output-file (cljsc/src-file->target-file src)\n                           :force true\n                           :mode :interactive)))]\n        ;; copy over the original source file if source maps enabled\n        (when-let [ns (and (:source-map opts) (first (:provides compiled)))]\n          (spit\n            (io/file (io/file (util/output-directory opts))\n              (util/ns->relpath ns (util/ext (:source-url compiled))))\n            (slurp src)))\n        ;; need to load dependencies first\n        (load-dependencies repl-env (:requires compiled) opts)\n        (-evaluate repl-env f 1 (cljsc/add-dep-string opts compiled))\n        (-evaluate repl-env f 1\n          (cljsc/src-file->goog-require src\n            {:wrap true :reload true :macros-ns (:macros-ns compiled)})))\n      (binding [ana/*cljs-ns* ana/*cljs-ns*]\n        (let [res (if (= File/separatorChar (first f)) f (io/resource f))]\n          (assert res (str \"Can't find \" f \" in classpath\"))\n          (load-stream repl-env f res))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [515 544],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/clojure/cljs/repl.cljc#L515-L544"},
 :usage ["(load-file repl-env f)" "(load-file repl-env f opts)"],
 :full-name "cljs.repl/load-file",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/load-file.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/load-file"]))
```

-->
