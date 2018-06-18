(ns cljs-api-gen.options
  (:require
    [clansi.core :refer [style]]
    [clojure.string :refer [split-lines]]
    [cljs-api-gen.read :refer [read-all-ns-forms]]
    [cljs-api-gen.repo-cljs :refer [with-version! published-cljs-tags]]))

;; Compiler Options are tracked in cljs.closure/known-opts >= 1.8.34
;; REPL Options are tracked in cljs.repl/known-repl-opts >= 1.8.34
;; After clojure.spec is finalized, david will accept a PR for adding a spec
;; for compiler options.

;; found version added with git. for example:
;; $ git log -S :emit-constants --source --all

(def compiler-options
  {:anon-fn-naming-policy {:added "0.0-2411"}
   :asset-path {:added "0.0-2727"}
   :browser-repl {:added "1.9.183"}
   :cache-analysis {:added "0.0-2511"}
   :cache-analysis-format {:added "1.9.456"}
   :closure-defines {:added "0.0-2120"}
   :closure-extra-annotations {:added "0.0-2814"}
   :closure-generate-exports {:added "1.9.473"}
   :closure-module-roots {:added "1.9.456"}
   :closure-warnings {:added "0.0-2120"}
   :compiler-stats {:added "0.0-2629"}
   :dump-core {:added "1.7.10"}
   :elide-asserts {:added "0.0-2156"}
   ; :emit-constants {:added "0.0-2014"} ; this is implicitly computed from optimize-constants (user input ignored)
   :externs {:added "0.0-971"}
   :fn-invoke-direct {:added "1.9.660"}
   :foreign-libs {:added "0.0-971"}
   :hashbang {:added "0.0-2197"}
   :infer-externs {:added "1.9.456"}
   :language-in {:added "0.0-2197"}
   :language-out {:added "0.0-2197"}
   :libs {:added "0.0-971"}
   :main {:added "0.0-971"}
   :modules {:added "0.0-2911"}
   :npm-deps {:added "r1.9.518"}
   :optimizations {:added "0.0-971"}
   :optimize-constants {:added "0.0-1877"}
   :output-dir {:added "0.0-971"}
   :output-to {:added "0.0-971"}
   :output-wrapper {:added "0.0-1513"}
   :parallel-build {:added "1.7.189"}
   :preamble {:added "0.0-2127"}
   :preloads {:added "1.9.85"}
   :pretty-print {:added "0.0-971"}
   :print-input-delimiter {:added "0.0-971"}
   :pseudo-names {:added "0.0-2227"}
   :recompile-dependents {:added "0.0-2814"}
   :rewrite-polyfills {:added "1.9.562"}
   :source-map {:added "0.0-1798"}
   :source-map-asset-path {:added "1.9.90"}
   ; :source-map-inline {:added "0.0-2911"} ; this is listed in known-opts, but only applies to repl
   :source-map-path {:added "0.0-2060"}
   :source-map-timestamp {:added "0.0-2505"}
   :static-fns {:added "0.0-1424"}
   :target {:added "0.0-971"}
   ; :ups-externs {:added "0.0-993"}      ; this is implicitly computed from upstream deps (user input ignored)
   ; :ups-foreign-libs {:added "0.0-993"} ; this is implicitly computed from upstream deps (user input ignored)
   ; :ups-libs {:added "0.0-993"}         ; this is implicitly computed from upstream deps (user input ignored)
   :use-only-custom-externs {:added "0.0-971"}
   :verbose {:added "0.0-971"}
   :warning-handlers {:added "1.7.10"}
   :warnings {:added "0.0-1443"}
   :watch-error-fn {:added "1.9.456"}
   :watch-fn {:added "0.0-3030"}})

(def repl-options
  {:analyze-path {:added "0.0-1552"}
   :bind-err {:added "0.0-3148"}
   :caught {:added "0.0-2911"}
   :compiler-env {:added "0.0-3148"}
   :def-emits-var {:added "1.7.10"}
   :eval {:added "0.0-2911"}
   :flush {:added "0.0-2911"}
   :init {:added "0.0-2911"}
   :need-prompt {:added "0.0-2911"}
   :print {:added "0.0-2911"}
   :print-no-newline {:added "0.0-2911"}
   :prompt {:added "0.0-2911"}
   :quit-prompt {:added "0.0-3148"}
   :read {:added "0.0-2911"}
   :reader {:added "0.0-2911"}
   :repl-requires {:added "0.0-3115"}
   :repl-verbose {:added "0.0-2719"}
   :source-map-inline {:added "0.0-2911"}
   :watch {:added "0.0-2850"}
   :wrap {:added "0.0-2985"}})

;; Sub-options can complicate things. To keep it simple, we just assign a
;; pseudo-namespace to hold the options instead of nesting them.
;;
;; For example 'compiler-options/warnings' has the following sub-options:
;; - 'warnings/fn-deprecated'
;; - 'warnings/invalid-arithmetic'
;;
;; 'warnings' is the pseudo-namespace assigned to hold options for 'compiler-options/warnings'.

(def sub-options-ns
  {"compiler-options/warnings"         "warnings"
   "compiler-options/closure-warnings" "closure-warnings"})

;; Provide the inverse mapping
(def sub-options-sym
  (zipmap
    (vals sub-options-ns)
    (keys sub-options-ns)))

;;--------------------------------------------------------------------------------
;; New option notifications
;;
;; No source is exact, but we use the following for hints:
;; - site: use hints from clojurescript.org
;; - repo: use hints from clojurescript repo
;;--------------------------------------------------------------------------------

(defn fetch-site-options* [title]
  (let [hint "=== :" ; options start with "=== :"
        url (str "https://raw.githubusercontent.com/clojure/clojurescript-site/master/content/reference/" title ".adoc")]
    (->> (slurp url)
         (split-lines)
         (filter #(.startsWith % hint))
         (map #(keyword (subs % (count hint))))
         (set))))

(defn fetch-site-options []
  {:compiler (fetch-site-options* "compiler-options")
   :repl (fetch-site-options* "repl-options")})

(defn parse-known-opts [form]
  (when (and (list? form)
             (= (take 2 form) '(def known-opts)))
    (nth form 3)))

(defn parse-known-repl-opts [form]
  (when (and (list? form)
             (= (take 2 form) '(def known-repl-opts)))
    (nth form 3)))

(defn fetch-repo-compiler-options []
  (first (keep parse-known-opts (read-all-ns-forms "cljs.closure" :compiler))))

(defn fetch-repo-repl-options []
  (first (keep parse-known-repl-opts (read-all-ns-forms "cljs.repl" :compiler))))

(defn fetch-repo-options []
  (with-version! (last @published-cljs-tags)
    {:compiler (fetch-repo-compiler-options)
     :repl (fetch-repo-repl-options)}))

;; TODO: track ignored compiler/repl options (for each source?)

(defn notify-new-options-from-site []
  (let [{:keys [compiler repl]} (fetch-site-options)
        new-compiler (apply disj compiler (keys compiler-options))
        new-repl (apply disj repl (keys repl-options))]
    (when (seq new-compiler)
      (println "\nNew Compiler Options (via site):\n")
      (doseq [opt (sort new-compiler)]
        (println opt "-" (str "https://clojurescript.org/reference/compiler-options#" (name opt)))))
    (when (seq new-repl)
      (println "\nNew REPL Options (via site):\n")
      (doseq [opt (sort new-repl)]
        (println opt "-" (str "https://clojurescript.org/reference/repl-options#" (name opt)))))))

(defn notify-new-options-from-repo []
  (let [{:keys [compiler repl]} (fetch-repo-options)
        new-compiler (apply disj compiler (keys compiler-options))
        new-repl (apply disj repl (keys repl-options))]
    (when (seq new-compiler)
      (println "\nNew Compiler Options (via repo var):\n")
      (doseq [opt (sort new-compiler)]
        (println opt)))
    (when (seq new-repl)
      (println "\nNew REPL Options (via repo var):\n")
      (doseq [opt (sort new-repl)]
        (println opt)))))

(defn notify-new-options []
  (println (style "\nChecking for potentially new compiler options...\n" :cyan))
  (notify-new-options-from-site)
  (notify-new-options-from-repo))
