## cljs.repl.rhino/rhino-setup



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__rhino-setup__ repl-env opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/rhino.clj#L104-L156):

```clj
(defn rhino-setup [repl-env opts]
  (let [scope   (:scope repl-env)
        env     (ana/empty-env)
        core    (io/resource "cljs/core.cljs")
        base-js (io/resource "goog/base.js")
        core-js (closure/compile core
                  (assoc opts
                    :output-file
                    (closure/src-file->target-file core)))
        deps    (closure/add-dependencies opts core-js)
        output-dir (util/output-directory opts)
        repl-deps (io/file output-dir "rhino_repl_deps.js")]
    ;; emit core and deps
    (apply closure/output-unoptimized
      (assoc opts :output-to (.getPath repl-deps)) deps)

    ;; setup back references & output stream
    (ScriptableObject/putProperty scope
      "___repl_env" (Context/javaToJS repl-env scope))
    (ScriptableObject/putProperty scope "__repl_opts"
      (Context/javaToJS opts scope))
    (ScriptableObject/putProperty scope
      "out" (Context/javaToJS *out* scope))
    (ScriptableObject/putProperty scope
      "err" (Context/javaToJS *err* scope))

    ;; define file loading, load goog.base, load repl deps
    (rhino-eval repl-env "bootjs" 1 bootjs)
    (rhino-eval repl-env "goog/base.js" 1 (io/reader base-js))
    (rhino-eval repl-env "rhino_repl_deps.js" 1 (io/reader repl-deps))

    ;; === Bootstrap ===
    ;; load cljs.core, setup printing
    (repl/evaluate-form repl-env env "<cljs repl>"
      '(do
         (.require js/goog "cljs.core")
         (set! *print-fn* (fn [x] (.write js/out x)))
         (set! *print-err-fn* (fn [x] (.write js/err x)))))

    ;; allow namespace reloading
    (repl/evaluate-form repl-env env "<cljs repl>"
      '(set! js/goog.isProvided_ (fn [x] false)))

    ;; monkey-patch goog.require
    (repl/evaluate-form repl-env env "<cljs repl>"
      '(do
         (set! *loaded-libs* #{"cljs.core"})
         (set! (.-require js/goog)
           (fn [name reload]
             (when (or (not (contains? *loaded-libs* name)) reload)
               (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))
               (js/CLOSURE_IMPORT_SCRIPT
                 (aget (.. js/goog -dependencies_ -nameToPath) name)))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.189
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[rhino.clj:104-156](https://github.com/clojure/clojurescript/blob/r1.7.189/src/main/clojure/cljs/repl/rhino.clj#L104-L156)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.rhino/rhino-setup` @ crossclj](http://crossclj.info/fun/cljs.repl.rhino/rhino-setup.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.rhino/rhino-setup.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.rhino",
 :name "rhino-setup",
 :type "function",
 :signature ["[repl-env opts]"],
 :source {:code "(defn rhino-setup [repl-env opts]\n  (let [scope   (:scope repl-env)\n        env     (ana/empty-env)\n        core    (io/resource \"cljs/core.cljs\")\n        base-js (io/resource \"goog/base.js\")\n        core-js (closure/compile core\n                  (assoc opts\n                    :output-file\n                    (closure/src-file->target-file core)))\n        deps    (closure/add-dependencies opts core-js)\n        output-dir (util/output-directory opts)\n        repl-deps (io/file output-dir \"rhino_repl_deps.js\")]\n    ;; emit core and deps\n    (apply closure/output-unoptimized\n      (assoc opts :output-to (.getPath repl-deps)) deps)\n\n    ;; setup back references & output stream\n    (ScriptableObject/putProperty scope\n      \"___repl_env\" (Context/javaToJS repl-env scope))\n    (ScriptableObject/putProperty scope \"__repl_opts\"\n      (Context/javaToJS opts scope))\n    (ScriptableObject/putProperty scope\n      \"out\" (Context/javaToJS *out* scope))\n    (ScriptableObject/putProperty scope\n      \"err\" (Context/javaToJS *err* scope))\n\n    ;; define file loading, load goog.base, load repl deps\n    (rhino-eval repl-env \"bootjs\" 1 bootjs)\n    (rhino-eval repl-env \"goog/base.js\" 1 (io/reader base-js))\n    (rhino-eval repl-env \"rhino_repl_deps.js\" 1 (io/reader repl-deps))\n\n    ;; === Bootstrap ===\n    ;; load cljs.core, setup printing\n    (repl/evaluate-form repl-env env \"<cljs repl>\"\n      '(do\n         (.require js/goog \"cljs.core\")\n         (set! *print-fn* (fn [x] (.write js/out x)))\n         (set! *print-err-fn* (fn [x] (.write js/err x)))))\n\n    ;; allow namespace reloading\n    (repl/evaluate-form repl-env env \"<cljs repl>\"\n      '(set! js/goog.isProvided_ (fn [x] false)))\n\n    ;; monkey-patch goog.require\n    (repl/evaluate-form repl-env env \"<cljs repl>\"\n      '(do\n         (set! *loaded-libs* #{\"cljs.core\"})\n         (set! (.-require js/goog)\n           (fn [name reload]\n             (when (or (not (contains? *loaded-libs* name)) reload)\n               (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))\n               (js/CLOSURE_IMPORT_SCRIPT\n                 (aget (.. js/goog -dependencies_ -nameToPath) name)))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.189",
          :filename "src/main/clojure/cljs/repl/rhino.clj",
          :lines [104 156]},
 :full-name "cljs.repl.rhino/rhino-setup",
 :full-name-encode "cljs.repl.rhino/rhino-setup",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.rhino/rhino-setup"]))
```

-->
