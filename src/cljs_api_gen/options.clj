(ns cljs-api-gen.options)

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
