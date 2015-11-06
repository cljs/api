## cljs.repl.node/setup



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__setup__ repl-env)<br>
</samp>
 <samp>
(__setup__ repl-env opts)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/repl/node.clj#L99-L187):

```clj
(defn setup
  ([repl-env] (setup repl-env nil))
  ([repl-env opts]
    (let [output-dir (io/file (util/output-directory opts))
          _    (.mkdirs output-dir)
          of   (io/file output-dir "node_repl.js")
          _   (spit of
                (string/replace (slurp (io/resource "cljs/repl/node_repl.js"))
                  "var PORT = 5001;"
                  (str "var PORT = " (:port repl-env) ";")))
          proc (-> (ProcessBuilder. (into-array [(get opts :node-command "node")]))
                 (.redirectInput of)
                 .start)
          _ (do (.start (Thread. (bound-fn [] (pipe proc (.getInputStream proc) *out*))))
                (.start (Thread. (bound-fn [] (pipe proc (.getErrorStream proc) *err*)))))
          env  (ana/empty-env)
          core (io/resource "cljs/core.cljs")
          ;; represent paths as vectors so we can emit JS arrays, this is to
          ;; paper over Windows issues with minimum hassle - David
          path (.getPath (.getCanonicalFile output-dir))
          [fc & cs] (rest (util/path-seq path)) ;; remove leading empty string
          root (.substring path 0 (+ (.indexOf path fc) (count fc)))
          root-path (vec (cons root cs))
          rewrite-path (conj root-path "goog")]
      (reset! (:proc repl-env) proc)
      (loop [r nil]
        (when-not (= r "ready")
          (Thread/sleep 50)
          (try
            (reset! (:socket repl-env) (socket (:host repl-env) (:port repl-env)))
            (catch Exception e))
          (if @(:socket repl-env)
            (recur (read-response (:in @(:socket repl-env))))
            (recur nil))))
      ;; compile cljs.core & its dependencies, goog/base.js must be available
      ;; for bootstrap to load, use new closure/compile as it can handle
      ;; resources in JARs
      (let [core-js (closure/compile core
                      (assoc opts
                        :output-file
                        (closure/src-file->target-file core)))
            deps    (closure/add-dependencies opts core-js)]
        ;; output unoptimized code and the deps file
        ;; for all compiled namespaces
        (apply closure/output-unoptimized
          (assoc opts
            :output-to (.getPath (io/file output-dir "node_repl_deps.js")))
          deps))
      ;; bootstrap, replace __dirname as __dirname won't be set
      ;; properly due to how we are running it - David
      (node-eval repl-env
        (-> (slurp (io/resource "cljs/bootstrap_node.js"))
          (string/replace "path.resolve(__dirname, '..', 'base.js')"
            (platform-path (conj rewrite-path "bootstrap" ".." "base.js")))
          (string/replace
            "path.join(\".\", \"..\", src)"
            (str "path.join(" (platform-path rewrite-path) ", src)"))
          (string/replace
            "var CLJS_ROOT = \".\";"
            (str "var CLJS_ROOT = " (platform-path root-path) ";"))))
      ;; load the deps file so we can goog.require cljs.core etc.
      (node-eval repl-env
        (str "require("
             (platform-path (conj root-path "node_repl_deps.js"))
             ")"))
      ;; monkey-patch isProvided_ to avoid useless warnings - David
      (node-eval repl-env
        (str "goog.isProvided_ = function(x) { return false; };"))
      ;; monkey-patch goog.require, skip all the loaded checks
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(set! (.-require js/goog)
           (fn [name]
             (js/CLOSURE_IMPORT_SCRIPT
               (aget (.. js/goog -dependencies_ -nameToPath) name)))))
      ;; load cljs.core, setup printing
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(do
           (.require js/goog "cljs.core")
           (enable-console-print!)))
      ;; redef goog.require to track loaded libs
      (repl/evaluate-form repl-env env "<cljs repl>"
        '(do
           (set! *loaded-libs* #{"cljs.core"})
           (set! (.-require js/goog)
             (fn [name reload]
               (when (or (not (contains? *loaded-libs* name)) reload)
                 (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))
                 (js/CLOSURE_IMPORT_SCRIPT
                   (aget (.. js/goog -dependencies_ -nameToPath) name))))))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.10
└── src
    └── main
        └── clojure
            └── cljs
                └── repl
                    └── <ins>[node.clj:99-187](https://github.com/clojure/clojurescript/blob/r1.7.10/src/main/clojure/cljs/repl/node.clj#L99-L187)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl.node/setup` @ crossclj](http://crossclj.info/fun/cljs.repl.node/setup.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl.node/setup.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl.node",
 :name "setup",
 :type "function",
 :signature ["[repl-env]" "[repl-env opts]"],
 :source {:code "(defn setup\n  ([repl-env] (setup repl-env nil))\n  ([repl-env opts]\n    (let [output-dir (io/file (util/output-directory opts))\n          _    (.mkdirs output-dir)\n          of   (io/file output-dir \"node_repl.js\")\n          _   (spit of\n                (string/replace (slurp (io/resource \"cljs/repl/node_repl.js\"))\n                  \"var PORT = 5001;\"\n                  (str \"var PORT = \" (:port repl-env) \";\")))\n          proc (-> (ProcessBuilder. (into-array [(get opts :node-command \"node\")]))\n                 (.redirectInput of)\n                 .start)\n          _ (do (.start (Thread. (bound-fn [] (pipe proc (.getInputStream proc) *out*))))\n                (.start (Thread. (bound-fn [] (pipe proc (.getErrorStream proc) *err*)))))\n          env  (ana/empty-env)\n          core (io/resource \"cljs/core.cljs\")\n          ;; represent paths as vectors so we can emit JS arrays, this is to\n          ;; paper over Windows issues with minimum hassle - David\n          path (.getPath (.getCanonicalFile output-dir))\n          [fc & cs] (rest (util/path-seq path)) ;; remove leading empty string\n          root (.substring path 0 (+ (.indexOf path fc) (count fc)))\n          root-path (vec (cons root cs))\n          rewrite-path (conj root-path \"goog\")]\n      (reset! (:proc repl-env) proc)\n      (loop [r nil]\n        (when-not (= r \"ready\")\n          (Thread/sleep 50)\n          (try\n            (reset! (:socket repl-env) (socket (:host repl-env) (:port repl-env)))\n            (catch Exception e))\n          (if @(:socket repl-env)\n            (recur (read-response (:in @(:socket repl-env))))\n            (recur nil))))\n      ;; compile cljs.core & its dependencies, goog/base.js must be available\n      ;; for bootstrap to load, use new closure/compile as it can handle\n      ;; resources in JARs\n      (let [core-js (closure/compile core\n                      (assoc opts\n                        :output-file\n                        (closure/src-file->target-file core)))\n            deps    (closure/add-dependencies opts core-js)]\n        ;; output unoptimized code and the deps file\n        ;; for all compiled namespaces\n        (apply closure/output-unoptimized\n          (assoc opts\n            :output-to (.getPath (io/file output-dir \"node_repl_deps.js\")))\n          deps))\n      ;; bootstrap, replace __dirname as __dirname won't be set\n      ;; properly due to how we are running it - David\n      (node-eval repl-env\n        (-> (slurp (io/resource \"cljs/bootstrap_node.js\"))\n          (string/replace \"path.resolve(__dirname, '..', 'base.js')\"\n            (platform-path (conj rewrite-path \"bootstrap\" \"..\" \"base.js\")))\n          (string/replace\n            \"path.join(\\\".\\\", \\\"..\\\", src)\"\n            (str \"path.join(\" (platform-path rewrite-path) \", src)\"))\n          (string/replace\n            \"var CLJS_ROOT = \\\".\\\";\"\n            (str \"var CLJS_ROOT = \" (platform-path root-path) \";\"))))\n      ;; load the deps file so we can goog.require cljs.core etc.\n      (node-eval repl-env\n        (str \"require(\"\n             (platform-path (conj root-path \"node_repl_deps.js\"))\n             \")\"))\n      ;; monkey-patch isProvided_ to avoid useless warnings - David\n      (node-eval repl-env\n        (str \"goog.isProvided_ = function(x) { return false; };\"))\n      ;; monkey-patch goog.require, skip all the loaded checks\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(set! (.-require js/goog)\n           (fn [name]\n             (js/CLOSURE_IMPORT_SCRIPT\n               (aget (.. js/goog -dependencies_ -nameToPath) name)))))\n      ;; load cljs.core, setup printing\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(do\n           (.require js/goog \"cljs.core\")\n           (enable-console-print!)))\n      ;; redef goog.require to track loaded libs\n      (repl/evaluate-form repl-env env \"<cljs repl>\"\n        '(do\n           (set! *loaded-libs* #{\"cljs.core\"})\n           (set! (.-require js/goog)\n             (fn [name reload]\n               (when (or (not (contains? *loaded-libs* name)) reload)\n                 (set! *loaded-libs* (conj (or *loaded-libs* #{}) name))\n                 (js/CLOSURE_IMPORT_SCRIPT\n                   (aget (.. js/goog -dependencies_ -nameToPath) name))))))))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.10",
          :filename "src/main/clojure/cljs/repl/node.clj",
          :lines [99 187]},
 :full-name "cljs.repl.node/setup",
 :full-name-encode "cljs.repl.node/setup",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl.node/setup"]))
```

-->
