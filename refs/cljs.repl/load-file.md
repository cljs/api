## cljs.repl/load-file



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__load-file__ repl-env f)<br>
</samp>
 <samp>
(__load-file__ repl-env f opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl.clj#L483-L504):

```clj
(defn load-file
  ([repl-env f] (load-file repl-env f *repl-opts*))
  ([repl-env f opts]
    (if (:output-dir opts)
      (let [src (cond
                  (util/url? f) f
                  (.exists (io/file f)) (io/file f)
                  :else (io/resource f))
            compiled (cljsc/compile src
                       (assoc opts
                         :output-file
                         (cljsc/src-file->target-file src)))]
        ;; make sure it's been analyzed, this is because if it's already compiled
        ;; cljs.compiler/compile-file won't do anything, good for builds,
        ;; but a bit annoying here
        (ana/analyze-file src opts)
        (-evaluate repl-env f 1 (cljsc/add-dep-string opts compiled))
        (-evaluate repl-env f 1 (cljsc/src-file->goog-require src)))
      (binding [ana/*cljs-ns* ana/*cljs-ns*]
        (let [res (if (= File/separatorChar (first f)) f (io/resource f))]
          (assert res (str "Can't find " f " in classpath"))
          (load-stream repl-env f res))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r3153
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:483-504](https://github.com/clojure/clojurescript/blob/r3153/src/clj/cljs/repl.clj#L483-L504)</ins>
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
 :type "function",
 :signature ["[repl-env f]" "[repl-env f opts]"],
 :source {:code "(defn load-file\n  ([repl-env f] (load-file repl-env f *repl-opts*))\n  ([repl-env f opts]\n    (if (:output-dir opts)\n      (let [src (cond\n                  (util/url? f) f\n                  (.exists (io/file f)) (io/file f)\n                  :else (io/resource f))\n            compiled (cljsc/compile src\n                       (assoc opts\n                         :output-file\n                         (cljsc/src-file->target-file src)))]\n        ;; make sure it's been analyzed, this is because if it's already compiled\n        ;; cljs.compiler/compile-file won't do anything, good for builds,\n        ;; but a bit annoying here\n        (ana/analyze-file src opts)\n        (-evaluate repl-env f 1 (cljsc/add-dep-string opts compiled))\n        (-evaluate repl-env f 1 (cljsc/src-file->goog-require src)))\n      (binding [ana/*cljs-ns* ana/*cljs-ns*]\n        (let [res (if (= File/separatorChar (first f)) f (io/resource f))]\n          (assert res (str \"Can't find \" f \" in classpath\"))\n          (load-stream repl-env f res))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r3153",
          :filename "src/clj/cljs/repl.clj",
          :lines [483 504]},
 :full-name "cljs.repl/load-file",
 :full-name-encode "cljs.repl/load-file",
 :history [["+" "0.0-927"]]}

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
