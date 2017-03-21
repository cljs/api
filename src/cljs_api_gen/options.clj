(ns cljs-api-gen.options)

;; Compiler Options are tracked in cljs.closure/known-opts >= 1.8.34
;; REPL Options are tracked in cljs.repl/known-repl-opts >= 1.8.34
;; After clojure.spec is finalized, david will accept a PR for adding a spec
;; for compiler options.

;; found version added with git. for example:
;; $ git log -S :emit-constants --source --all

(def compiler-options
  {;; Common options
   :output-to {:added "0.0-971"}
   :output-dir {:added "0.0-971"}
   :optimizations {:added "0.0-971"}
   :main {:added "0.0-971"}
   :asset-path {:added "0.0-2727"}
   :source-map {:added "0.0-1798"}
   :verbose {:added "0.0-971"}
   :pretty-print {:added "0.0-971"}
   :target {:added "0.0-971"}
   :foreign-libs {:added "0.0-971"}
   :externs {:added "0.0-971"}
   :modules {:added "0.0-2911"}
   :preloads {:added "1.9.85"}

   ;; Less Common Options
   :source-map-path {:added "0.0-2060"}
   :source-map-asset-path {:added "1.9.90"}
   :source-map-timestamp {:added "0.0-2505"}
   :cache-analysis {:added "0.0-2511"}
   :recompile-dependents {:added "0.0-2814"}
   :static-fns {:added "0.0-1424"}
   :warnings {:added "0.0-1443"}
   :elide-asserts {:added "0.0-2156"}
   :pseudo-names {:added "0.0-2227"}
   :print-input-delimiter {:added "0.0-971"}
   :output-wrapper {:added "0.0-1513"}
   :libs {:added "0.0-971"}
   :preamble {:added "0.0-2127"}
   :hashbang {:added "0.0-2197"}
   :compiler-stats {:added "0.0-2629"}
   :language-in {:added "0.0-2197"}
   :language-out {:added "0.0-2197"}
   :closure-warnings {:added "0.0-2120"}
   :closure-defines {:added "0.0-2120"}
   :closure-extra-annotations {:added "0.0-2814"}
   :anon-fn-naming-policy {:added "0.0-2411"}
   :optimize-constants {:added "0.0-1877"}
   :parallel-build {:added "1.7.189"}
   :watch-fn {:added "0.0-3030"}
   :watch-error-fn {:added "1.9.456"}
   ;; TODO: :npm-deps {:added ""}

   ;; undocumented
   :dump-core {:added "1.7.10"}
   :ups-externs {:added "0.0-993"}
   :ups-foreign-libs {:added "0.0-993"}
   :ups-libs {:added "0.0-993"}
   :warning-handlers {:added "1.7.10"}
   :browser-repl {:added "1.9.183"}
   :cache-analysis-format {:added "1.9.456"}
   :infer-externs {:added "1.9.456"}
   :closure-generate-exports {:added "1.9.473"}
   :emit-constants {:added "0.0-2014"}
   :use-only-custom-externs {:added "0.0-971"}})

(def repl-options
  {:analyze-path {:added "0.0-1552"}
   :def-emits-var {:added "1.7.10"}
   :repl-requires {:added "0.0-3115"}
   :repl-verbose {:added "0.0-2719"}
   :watch {:added "0.0-2850"}

   ;; undocumented
   :bind-err {:added "0.0-3148"}
   :caught {:added "0.0-2911"}
   :compiler-env {:added "0.0-3148"}
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
   :source-map-inline {:added "0.0-2911"}
   :wrap {:added "0.0-2985"}})
