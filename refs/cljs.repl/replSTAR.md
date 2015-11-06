## cljs.repl/repl\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl\*__ repl-env {:keys \[init need-prompt quit-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap repl-requires compiler-env bind-err\], :or {caught repl-caught, quit-prompt repl-quit-prompt, eval eval-cljs, print-no-newline print, flush flush, read repl-read, bind-err true, print println, source-map-inline true, prompt repl-prompt, repl-requires (quote \[\[cljs.repl :refer-macros \[source doc find-doc apropos dir pst\]\] \[cljs.pprint :refer \[pprint\] :refer-macros \[pp\]\]\]), reader (fn\* \[\] (readers/source-logging-push-back-reader (PushbackReader. (io/reader \*in\*)) 1 "NO_SOURCE_FILE")), need-prompt (fn\* \[\] (if (readers/indexing-reader? \*in\*) (== (readers/get-column-number \*in\*) 1) (identity true)))}, :as opts})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl.cljc#L729-L883):

```clj
(defn repl*
  [repl-env {:keys [init need-prompt quit-prompt prompt flush read eval print caught reader
                    print-no-newline source-map-inline wrap repl-requires
                    compiler-env bind-err]
             :or {need-prompt #(if (readers/indexing-reader? *in*)
                                (== (readers/get-column-number *in*) 1)
                                (identity true))
                  quit-prompt repl-quit-prompt
                  prompt repl-prompt
                  flush flush
                  read repl-read
                  eval eval-cljs
                  print println
                  caught repl-caught
                  reader #(readers/source-logging-push-back-reader
                           (PushbackReader. (io/reader *in*))
                           1 "NO_SOURCE_FILE")
                  print-no-newline print
                  source-map-inline true
                  repl-requires '[[cljs.repl :refer-macros [source doc find-doc apropos dir pst]]
                                  [cljs.pprint :refer [pprint] :refer-macros [pp]]]
                  bind-err true}
             :as opts}]
  (let [repl-opts (-repl-options repl-env)
        repl-requires (into repl-requires (:repl-requires repl-opts))
        {:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts
         :or   {warn-on-undeclared true}}
        (merge
          {:cache-analysis true :source-map true :def-emits-var true}
          (cljsc/add-implicit-options
            (merge-with (fn [a b] (if (nil? b) a b))
              repl-opts
              opts
              {:prompt prompt
               :need-prompt need-prompt
               :flush flush
               :read read
               :print print
               :caught caught
               :reader reader
               :print-no-newline print-no-newline
               :source-map-inline source-map-inline})))
        done? (atom false)]
    (env/with-compiler-env (or compiler-env (env/default-compiler-env opts))
     (when (:source-map opts)
       (.start (Thread. (bound-fn [] (read-source-map "cljs/core.aot.js")))))
     (binding [*err* (if bind-err
                       (cond-> *out*
                         (not (instance? PrintWriter *out*)) (PrintWriter.))
                       *err*)
               ana/*cljs-ns* ana/*cljs-ns*
               *cljs-verbose* repl-verbose
               ana/*cljs-warnings*
               (let [warnings (opts :warnings true)]
                 (merge
                   ana/*cljs-warnings*
                   (if (or (true? warnings)
                         (false? warnings))
                     (zipmap (keys ana/*cljs-warnings*) (repeat warnings))
                     warnings)
                   (zipmap
                     [:unprovided :undeclared-var
                      :undeclared-ns :undeclared-ns-form]
                     (repeat (if (false? warnings)
                               false
                               warn-on-undeclared)))))
               ana/*cljs-static-fns* static-fns
               *repl-opts* opts]
       (let [env {:context :expr :locals {}}
             special-fns (merge default-special-fns special-fns)
             is-special-fn? (set (keys special-fns))
             request-prompt (Object.)
             request-exit (Object.)
             opts (comp/with-core-cljs opts
                    (fn []
                      (try
                        (if-let [merge-opts (:merge-opts (-setup repl-env opts))]
                          (merge opts merge-opts)
                          opts)
                        (catch Throwable e
                          (caught e repl-env opts)
                          opts))))
             init (or init
                      #(evaluate-form repl-env env "<cljs repl>"
                         (with-meta
                           `(~'ns ~'cljs.user
                              (:require ~@repl-requires))
                           {:line 1 :column 1})
                         identity opts))
             read-eval-print
             (fn []
               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)
                                     reader/resolve-symbol ana/resolve-symbol
                                     reader/*data-readers* tags/*cljs-data-readers*
                                     reader/*alias-map*
                                     (apply merge
                                       ((juxt :requires :require-macros)
                                         (ana/get-namespace ana/*cljs-ns*)))]
                             (read request-prompt request-exit))]
                 (or ({request-exit request-exit
                       :cljs/quit request-exit
                       request-prompt request-prompt} input)
                   (if (and (seq? input) (is-special-fn? (first input)))
                     (do
                       ((get special-fns (first input)) repl-env env input opts)
                       (print nil))
                     (let [value (eval repl-env env input opts)]
                       (print value))))))]
         (comp/with-core-cljs opts
           (fn []
             (binding [*repl-opts* opts]
               (try
                 (when analyze-path
                   (if (vector? analyze-path)
                     (run! #(analyze-source % opts) analyze-path)
                     (analyze-source analyze-path opts)))
                 (init)
                 (catch Throwable e
                   (caught e repl-env opts)))
               (when-let [src (:watch opts)]
                 (.start
                   (Thread.
                     ((ns-resolve 'clojure.core 'binding-conveyor-fn)
                       (fn []
                         (let [log-file (io/file (util/output-directory opts) "watch.log")]
                           (err-out (println "Watch compilation log available at:" (str log-file)))
                           (try
                             (let [log-out (FileWriter. log-file)]
                               (binding [*err* log-out
                                         *out* log-out]
                                 (cljsc/watch src (dissoc opts :watch)
                                   env/*compiler* done?)))
                             (catch Throwable e
                               (caught e repl-env opts)))))))))
               ;; let any setup async messages flush
               (Thread/sleep 50)
               (binding [*in* (if (true? (:source-map-inline opts))
                                *in*
                                (reader))]
                 (quit-prompt)
                 (prompt)
                 (flush)
                 (loop []
                   (when-not
                     (try
                       (identical? (read-eval-print) request-exit)
                       (catch Throwable e
                         (caught e repl-env opts)
                         nil))
                     (when (need-prompt)
                       (prompt)
                       (flush))
                     (recur))))))))
       (reset! done? true)
       (-tear-down repl-env)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── clojure
            └── cljs
                └── <ins>[repl.cljc:729-883](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/clojure/cljs/repl.cljc#L729-L883)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.repl/repl*` @ crossclj](http://crossclj.info/fun/cljs.repl/repl*.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.repl/replSTAR.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.repl",
 :name "repl*",
 :type "function",
 :signature ["[repl-env {:keys [init need-prompt quit-prompt prompt flush read eval print caught reader print-no-newline source-map-inline wrap repl-requires compiler-env bind-err], :or {caught repl-caught, quit-prompt repl-quit-prompt, eval eval-cljs, print-no-newline print, flush flush, read repl-read, bind-err true, print println, source-map-inline true, prompt repl-prompt, repl-requires (quote [[cljs.repl :refer-macros [source doc find-doc apropos dir pst]] [cljs.pprint :refer [pprint] :refer-macros [pp]]]), reader (fn* [] (readers/source-logging-push-back-reader (PushbackReader. (io/reader *in*)) 1 \"NO_SOURCE_FILE\")), need-prompt (fn* [] (if (readers/indexing-reader? *in*) (== (readers/get-column-number *in*) 1) (identity true)))}, :as opts}]"],
 :source {:code "(defn repl*\n  [repl-env {:keys [init need-prompt quit-prompt prompt flush read eval print caught reader\n                    print-no-newline source-map-inline wrap repl-requires\n                    compiler-env bind-err]\n             :or {need-prompt #(if (readers/indexing-reader? *in*)\n                                (== (readers/get-column-number *in*) 1)\n                                (identity true))\n                  quit-prompt repl-quit-prompt\n                  prompt repl-prompt\n                  flush flush\n                  read repl-read\n                  eval eval-cljs\n                  print println\n                  caught repl-caught\n                  reader #(readers/source-logging-push-back-reader\n                           (PushbackReader. (io/reader *in*))\n                           1 \"NO_SOURCE_FILE\")\n                  print-no-newline print\n                  source-map-inline true\n                  repl-requires '[[cljs.repl :refer-macros [source doc find-doc apropos dir pst]]\n                                  [cljs.pprint :refer [pprint] :refer-macros [pp]]]\n                  bind-err true}\n             :as opts}]\n  (let [repl-opts (-repl-options repl-env)\n        repl-requires (into repl-requires (:repl-requires repl-opts))\n        {:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts\n         :or   {warn-on-undeclared true}}\n        (merge\n          {:cache-analysis true :source-map true :def-emits-var true}\n          (cljsc/add-implicit-options\n            (merge-with (fn [a b] (if (nil? b) a b))\n              repl-opts\n              opts\n              {:prompt prompt\n               :need-prompt need-prompt\n               :flush flush\n               :read read\n               :print print\n               :caught caught\n               :reader reader\n               :print-no-newline print-no-newline\n               :source-map-inline source-map-inline})))\n        done? (atom false)]\n    (env/with-compiler-env (or compiler-env (env/default-compiler-env opts))\n     (when (:source-map opts)\n       (.start (Thread. (bound-fn [] (read-source-map \"cljs/core.aot.js\")))))\n     (binding [*err* (if bind-err\n                       (cond-> *out*\n                         (not (instance? PrintWriter *out*)) (PrintWriter.))\n                       *err*)\n               ana/*cljs-ns* ana/*cljs-ns*\n               *cljs-verbose* repl-verbose\n               ana/*cljs-warnings*\n               (let [warnings (opts :warnings true)]\n                 (merge\n                   ana/*cljs-warnings*\n                   (if (or (true? warnings)\n                         (false? warnings))\n                     (zipmap (keys ana/*cljs-warnings*) (repeat warnings))\n                     warnings)\n                   (zipmap\n                     [:unprovided :undeclared-var\n                      :undeclared-ns :undeclared-ns-form]\n                     (repeat (if (false? warnings)\n                               false\n                               warn-on-undeclared)))))\n               ana/*cljs-static-fns* static-fns\n               *repl-opts* opts]\n       (let [env {:context :expr :locals {}}\n             special-fns (merge default-special-fns special-fns)\n             is-special-fn? (set (keys special-fns))\n             request-prompt (Object.)\n             request-exit (Object.)\n             opts (comp/with-core-cljs opts\n                    (fn []\n                      (try\n                        (if-let [merge-opts (:merge-opts (-setup repl-env opts))]\n                          (merge opts merge-opts)\n                          opts)\n                        (catch Throwable e\n                          (caught e repl-env opts)\n                          opts))))\n             init (or init\n                      #(evaluate-form repl-env env \"<cljs repl>\"\n                         (with-meta\n                           `(~'ns ~'cljs.user\n                              (:require ~@repl-requires))\n                           {:line 1 :column 1})\n                         identity opts))\n             read-eval-print\n             (fn []\n               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)\n                                     reader/resolve-symbol ana/resolve-symbol\n                                     reader/*data-readers* tags/*cljs-data-readers*\n                                     reader/*alias-map*\n                                     (apply merge\n                                       ((juxt :requires :require-macros)\n                                         (ana/get-namespace ana/*cljs-ns*)))]\n                             (read request-prompt request-exit))]\n                 (or ({request-exit request-exit\n                       :cljs/quit request-exit\n                       request-prompt request-prompt} input)\n                   (if (and (seq? input) (is-special-fn? (first input)))\n                     (do\n                       ((get special-fns (first input)) repl-env env input opts)\n                       (print nil))\n                     (let [value (eval repl-env env input opts)]\n                       (print value))))))]\n         (comp/with-core-cljs opts\n           (fn []\n             (binding [*repl-opts* opts]\n               (try\n                 (when analyze-path\n                   (if (vector? analyze-path)\n                     (run! #(analyze-source % opts) analyze-path)\n                     (analyze-source analyze-path opts)))\n                 (init)\n                 (catch Throwable e\n                   (caught e repl-env opts)))\n               (when-let [src (:watch opts)]\n                 (.start\n                   (Thread.\n                     ((ns-resolve 'clojure.core 'binding-conveyor-fn)\n                       (fn []\n                         (let [log-file (io/file (util/output-directory opts) \"watch.log\")]\n                           (err-out (println \"Watch compilation log available at:\" (str log-file)))\n                           (try\n                             (let [log-out (FileWriter. log-file)]\n                               (binding [*err* log-out\n                                         *out* log-out]\n                                 (cljsc/watch src (dissoc opts :watch)\n                                   env/*compiler* done?)))\n                             (catch Throwable e\n                               (caught e repl-env opts)))))))))\n               ;; let any setup async messages flush\n               (Thread/sleep 50)\n               (binding [*in* (if (true? (:source-map-inline opts))\n                                *in*\n                                (reader))]\n                 (quit-prompt)\n                 (prompt)\n                 (flush)\n                 (loop []\n                   (when-not\n                     (try\n                       (identical? (read-eval-print) request-exit)\n                       (catch Throwable e\n                         (caught e repl-env opts)\n                         nil))\n                     (when (need-prompt)\n                       (prompt)\n                       (flush))\n                     (recur))))))))\n       (reset! done? true)\n       (-tear-down repl-env)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/clojure/cljs/repl.cljc",
          :lines [729 883]},
 :full-name "cljs.repl/repl*",
 :full-name-encode "cljs.repl/replSTAR",
 :history [["+" "0.0-2629"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.repl/repl*"]))
```

-->
