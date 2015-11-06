## cljs.repl/repl\*



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-2629"><img valign="middle" alt="[+] 0.0-2629" title="Added in 0.0-2629" src="https://img.shields.io/badge/+-0.0--2629-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__repl\*__ repl-env {:keys \[init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline\], :or {caught repl-caught, eval eval-cljs, print-no-newline print, flush flush, read repl-read, init (fn\* \[\] ()), print println, source-map-inline true, prompt repl-prompt, reader (fn\* \[\] (readers/source-logging-push-back-reader (PushbackReader. (io/reader \*in\*)) 1 "NO_SOURCE_FILE")), need-prompt (fn\* \[\] (if (readers/indexing-reader? \*in\*) (== (readers/get-column-number \*in\*) 1) (identity true)))}, :as opts})<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl.clj#L575-L696):

```clj
(defn repl*
  [repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline]
             :or {init #()
                  need-prompt #(if (readers/indexing-reader? *in*)
                                 (== (readers/get-column-number *in*) 1)
                                 (identity true))
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
                  source-map-inline true}
             :as opts}]
  (print "To quit, type:" :cljs/quit)
  (let [ups-deps (cljsc/get-upstream-deps)
        {:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts
         :or   {warn-on-undeclared true}}
        (assoc (merge (-repl-options repl-env) opts)
          :init init
          :need-prompt prompt
          :flush flush
          :read read
          :print print
          :caught caught
          :reader reader
          :print-no-newline print-no-newline
          :source-map-inline source-map-inline
          :ups-libs (:libs ups-deps)
          :ups-foreign-libs (:foreign-libs ups-deps))]
    (env/with-compiler-env
     (or (::env/compiler repl-env) (env/default-compiler-env opts))
     (binding [ana/*cljs-ns* 'cljs.user
               *cljs-verbose* repl-verbose
               ana/*cljs-warnings*
               (assoc ana/*cljs-warnings*
                 :unprovided warn-on-undeclared
                 :undeclared-var warn-on-undeclared
                 :undeclared-ns warn-on-undeclared
                 :undeclared-ns-form warn-on-undeclared)
               ana/*cljs-static-fns* static-fns
               *repl-opts* opts]
       ;; TODO: the follow should become dead code when the REPL is
       ;; sufficiently enhanced to understand :cache-analysis - David
       (let [env {:context :expr :locals {}}
             special-fns (merge default-special-fns special-fns)
             is-special-fn? (set (keys special-fns))
             request-prompt (Object.)
             request-exit (Object.)
             opts (try
                    (if-let [merge-opts (:merge-opts (-setup repl-env opts))]
                      (merge opts merge-opts)
                      opts)
                    (catch Throwable e
                      (caught e repl-env opts)
                      opts))
             read-eval-print
             (fn []
               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)
                                     reader/*data-readers* tags/*cljs-data-readers*
                                     reader/*alias-map*
                                     (apply merge
                                       ((juxt :requires :require-macros)
                                         (ana/get-namespace ana/*cljs-ns*)))]
                             (repl-read request-prompt request-exit))]
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
             (try
               (when analyze-path
                 (analyze-source analyze-path opts))
               (evaluate-form repl-env env "<cljs repl>"
                 (with-meta
                   '(ns cljs.user
                      (:require [cljs.repl :refer-macros [doc]]))
                   {:line 1 :column 1})
                 identity opts)
               (catch Throwable e
                 (caught e repl-env opts)))
             (when-let [src (:watch opts)]
               (future
                 (let [log-file (io/file (util/output-directory opts) "watch.log")]
                   (print "Watch compilation log available at:" (str log-file))
                   (try
                     (binding [*out* (FileWriter. log-file)]
                       (cljsc/watch src (dissoc opts :watch)))
                     (catch Throwable e
                       (caught e repl-env opts))))))
             (binding [*in* (if (true? (:source-map-inline opts))
                              *in*
                              (reader))]
               (try
                 (init)
                 (catch Throwable e
                   (caught e repl-env opts)))
               ;; try to let things flush before printing prompt
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
                   (recur)))))))
         (-tear-down repl-env)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2911
└── src
    └── clj
        └── cljs
            └── <ins>[repl.clj:575-696](https://github.com/clojure/clojurescript/blob/r2911/src/clj/cljs/repl.clj#L575-L696)</ins>
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
 :signature ["[repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline], :or {caught repl-caught, eval eval-cljs, print-no-newline print, flush flush, read repl-read, init (fn* [] ()), print println, source-map-inline true, prompt repl-prompt, reader (fn* [] (readers/source-logging-push-back-reader (PushbackReader. (io/reader *in*)) 1 \"NO_SOURCE_FILE\")), need-prompt (fn* [] (if (readers/indexing-reader? *in*) (== (readers/get-column-number *in*) 1) (identity true)))}, :as opts}]"],
 :source {:code "(defn repl*\n  [repl-env {:keys [init need-prompt prompt flush read eval print caught reader print-no-newline source-map-inline]\n             :or {init #()\n                  need-prompt #(if (readers/indexing-reader? *in*)\n                                 (== (readers/get-column-number *in*) 1)\n                                 (identity true))\n                  prompt repl-prompt\n                  flush flush\n                  read repl-read\n                  eval eval-cljs\n                  print println\n                  caught repl-caught\n                  reader #(readers/source-logging-push-back-reader\n                           (PushbackReader. (io/reader *in*))\n                           1 \"NO_SOURCE_FILE\")\n                  print-no-newline print\n                  source-map-inline true}\n             :as opts}]\n  (print \"To quit, type:\" :cljs/quit)\n  (let [ups-deps (cljsc/get-upstream-deps)\n        {:keys [analyze-path repl-verbose warn-on-undeclared special-fns static-fns] :as opts\n         :or   {warn-on-undeclared true}}\n        (assoc (merge (-repl-options repl-env) opts)\n          :init init\n          :need-prompt prompt\n          :flush flush\n          :read read\n          :print print\n          :caught caught\n          :reader reader\n          :print-no-newline print-no-newline\n          :source-map-inline source-map-inline\n          :ups-libs (:libs ups-deps)\n          :ups-foreign-libs (:foreign-libs ups-deps))]\n    (env/with-compiler-env\n     (or (::env/compiler repl-env) (env/default-compiler-env opts))\n     (binding [ana/*cljs-ns* 'cljs.user\n               *cljs-verbose* repl-verbose\n               ana/*cljs-warnings*\n               (assoc ana/*cljs-warnings*\n                 :unprovided warn-on-undeclared\n                 :undeclared-var warn-on-undeclared\n                 :undeclared-ns warn-on-undeclared\n                 :undeclared-ns-form warn-on-undeclared)\n               ana/*cljs-static-fns* static-fns\n               *repl-opts* opts]\n       ;; TODO: the follow should become dead code when the REPL is\n       ;; sufficiently enhanced to understand :cache-analysis - David\n       (let [env {:context :expr :locals {}}\n             special-fns (merge default-special-fns special-fns)\n             is-special-fn? (set (keys special-fns))\n             request-prompt (Object.)\n             request-exit (Object.)\n             opts (try\n                    (if-let [merge-opts (:merge-opts (-setup repl-env opts))]\n                      (merge opts merge-opts)\n                      opts)\n                    (catch Throwable e\n                      (caught e repl-env opts)\n                      opts))\n             read-eval-print\n             (fn []\n               (let [input (binding [*ns* (create-ns ana/*cljs-ns*)\n                                     reader/*data-readers* tags/*cljs-data-readers*\n                                     reader/*alias-map*\n                                     (apply merge\n                                       ((juxt :requires :require-macros)\n                                         (ana/get-namespace ana/*cljs-ns*)))]\n                             (repl-read request-prompt request-exit))]\n                 (or ({request-exit request-exit\n                       :cljs/quit request-exit\n                       request-prompt request-prompt} input)\n                   (if (and (seq? input) (is-special-fn? (first input)))\n                     (do\n                       ((get special-fns (first input)) repl-env env input opts)\n                       (print nil))\n                     (let [value (eval repl-env env input opts)]\n                       (print value))))))]\n         (comp/with-core-cljs opts\n           (fn []\n             (try\n               (when analyze-path\n                 (analyze-source analyze-path opts))\n               (evaluate-form repl-env env \"<cljs repl>\"\n                 (with-meta\n                   '(ns cljs.user\n                      (:require [cljs.repl :refer-macros [doc]]))\n                   {:line 1 :column 1})\n                 identity opts)\n               (catch Throwable e\n                 (caught e repl-env opts)))\n             (when-let [src (:watch opts)]\n               (future\n                 (let [log-file (io/file (util/output-directory opts) \"watch.log\")]\n                   (print \"Watch compilation log available at:\" (str log-file))\n                   (try\n                     (binding [*out* (FileWriter. log-file)]\n                       (cljsc/watch src (dissoc opts :watch)))\n                     (catch Throwable e\n                       (caught e repl-env opts))))))\n             (binding [*in* (if (true? (:source-map-inline opts))\n                              *in*\n                              (reader))]\n               (try\n                 (init)\n                 (catch Throwable e\n                   (caught e repl-env opts)))\n               ;; try to let things flush before printing prompt\n               (prompt)\n               (flush)\n               (loop []\n                 (when-not\n                   (try\n                     (identical? (read-eval-print) request-exit)\n                     (catch Throwable e\n                       (caught e repl-env opts)\n                       nil))\n                   (when (need-prompt)\n                     (prompt)\n                     (flush))\n                   (recur)))))))\n         (-tear-down repl-env)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2911",
          :filename "src/clj/cljs/repl.clj",
          :lines [575 696]},
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
