(ns cljs-api-gen.options
  (:require
    [clansi.core :refer [style]]
    [clojure.string :refer [split-lines]]
    [clojure.set :refer [difference]]
    [cljs-api-gen.read :refer [read-all-ns-forms]]
    [cljs-api-gen.repo-cljs :refer [with-version! published-cljs-tags]]))

;; Compiler Options are tracked in cljs.closure/known-opts >= 1.8.34
;; REPL Options are tracked in cljs.repl/known-repl-opts >= 1.8.34
;; After clojure.spec is finalized, david will accept a PR for adding a spec
;; for compiler options.

;; found relevant commits mentioning the option in git. for example:
;; (use -G to use regex)
;; $ git log -S :emit-constants --source --all

;; found first release tag containing the commit with:
;; $ git tag --contains=<hash> --sort=committerdate

(def compiler-options
  {:aot-cache {:added "1.10.126"} ; 1969c36161b1000a36f28e5acb73d55916775d26
   :anon-fn-naming-policy {:added "0.0-2411"}
   :asset-path {:added "0.0-2727"}
   :browser-repl {:added "1.9.183"}
   :cache-analysis {:added "0.0-2511"}
   :cache-analysis-format {:added "1.9.456"}
   :checked-arrays {:added "1.9.854"} ; 84a2128dab9f52e67ee227a66be4f849d83de0a3
   :closure-defines {:added "0.0-2120"}
   :closure-extra-annotations {:added "0.0-2814"}
   :closure-generate-exports {:added "1.9.473"}
   :closure-output-charset {:added "1.8.34"} ; 404d6444cb6419658a7dacb343a5fed5b9451e0c
   :closure-module-roots {:added "1.9.456"}
   :closure-property-map-in {:added "1.10.63"} ; 072677dc0678c3f06acc612d438275d845881f9b
   :closure-property-map-out {:added "1.10.63"} ; b48023595f90b8567d64e1d1e8162ad12e7d0d18
   :closure-variable-map-in {:added "1.10.63"} ; 072677dc0678c3f06acc612d438275d845881f9b
   :closure-variable-map-out {:added "1.10.63"} ; 072677dc0678c3f06acc612d438275d845881f9b
   :closure-warnings {:added "0.0-2120"}
   :compiler-stats {:added "0.0-2629"}
   :dump-core {:added "1.7.10"}
   :elide-asserts {:added "0.0-2156"}
   :elide-strict {:added "1.10.312"} ; 03455b4ba4338ab05ffccefc9ddb41c8fd128cfa
   ; :emit-constants {:added "0.0-2014"} ; (see ignored below)
   :externs {:added "0.0-971"}
   :fingerprint {:added "1.10.439"} ; 5cc0e6c064132cb3e122177a1a110d5b0d98fceb
   :fn-invoke-direct {:added "1.9.660"}
   :foreign-libs {:added "0.0-971"}
   :hashbang {:added "0.0-2197"}
   :ignore-js-module-exts {:added "1.10.63"} ; f7d611d87f6ea8a605eae7c0339f30b79a840b49
   :infer-externs {:added "1.9.456"}
   :install-deps {:added "1.9.854"} ; fb8ce05143dac9e9feb602be2544b72c87b337a3
   :language-in {:added "0.0-2197"}
   :language-out {:added "0.0-2197"}
   :libs {:added "0.0-971"}
   :main {:added "0.0-971"}
   :modules {:added "0.0-2911"}
   :npm-deps {:added "r1.9.518"}
   :optimizations {:added "0.0-971"}
   :optimize-constants {:added "0.0-1877"}
   :opts-cache {:added "1.10.126"} ; 542d3fad1ff499a5e3b00e7e08eff4037083a59d
   :output-dir {:added "0.0-971"}
   :output-to {:added "0.0-971"}
   :output-wrapper {:added "0.0-1513"}
   :package-json-resolution {:added "1.10.191"} ; 233b42338c182e72391466eba2d00bae34271e58
   :parallel-build {:added "1.7.189"}
   :preamble {:added "0.0-2127"}
   :preloads {:added "1.9.85"}
   :pretty-print {:added "0.0-971"}
   :print-input-delimiter {:added "0.0-971"}
   :process-shim {:added "1.9.854"} ; 537f60c975a29983c62647b4ea67b0bc08979366
   :pseudo-names {:added "0.0-2227"}
   :recompile-dependents {:added "0.0-2814"}
   :rename-prefix {:added "1.9.946"} ; 7a8803ef70cb84c686341353e7ab29928487e388
   :rename-prefix-namespace {:added "1.9.946"} ; 7a8803ef70cb84c686341353e7ab29928487e388
   :rewrite-polyfills {:added "1.9.562"}
   :source-map {:added "0.0-1798"}
   :source-map-asset-path {:added "1.9.90"}
   ; :source-map-inline {:added "0.0-2911"} ; (see ignored below)
   :source-map-path {:added "0.0-2060"}
   :source-map-timestamp {:added "0.0-2505"}
   :spec-skip-macros {:added "1.10.439"} ; 6b9a37a294746148d3f4f8c1b6839823fe6e23f3
   :stable-names {:added "1.10.63"} ; 072677dc0678c3f06acc612d438275d845881f9b
   :static-fns {:added "0.0-1424"}
   :target {:added "0.0-971"}
   ; :ups-externs {:added "0.0-993"}      ; (see ignored below)
   ; :ups-foreign-libs {:added "0.0-993"} ; (see ignored below)
   ; :ups-libs {:added "0.0-993"}         ; (see ignored below)
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
   :host {:added "1.10.63"} ; ae34de7c316461b3dbce49bbc4e5ab2ae4d9bde9
   :init {:added "0.0-2911"}
   :inits {:added "1.10.63"} ; d9408cb07263252df5e752427bfdb78b90dd10cb
   :launch-browser {:added "1.10.126"} ; 0d455574df757f0667b2821753e60dcceea7fdaf
   :need-prompt {:added "0.0-2911"}
   :port {:added "1.10.63"} ; ae34de7c316461b3dbce49bbc4e5ab2ae4d9bde9
   :print {:added "0.0-2911"}
   :print-no-newline {:added "0.0-2911"}
   :prompt {:added "0.0-2911"}
   :quit-prompt {:added "0.0-3148"}
   :read {:added "0.0-2911"}
   :reader {:added "0.0-2911"}
   :repl-requires {:added "0.0-3115"}
   :repl-verbose {:added "0.0-2719"}
   :source-map-inline {:added "0.0-2911"}
   :src {:added "0.0-1503"} ; b5b20fdc4fa5c9f8a12e527407a72a7e6957bcd6
   :static-dir {:added "0.0-1211"} ; 267605f9ff06ce65212e3e3e29e94d760958e995
   :watch {:added "0.0-2850"} ; 606ccce775706b9f9f6f40ecdcc40d6947226824
   :working-dir {:added "0.0-971"} ; 23d29f174c7a2d454019dca0cde8c1f025d1f21a
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

(def ignored-site-options
  {:compiler
   #{(keyword "language-in and :language-out")} ; we don't combine these
   :repl
   #{:watch-fn}}) ; already in compiler options

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

(def ignored-repo-options
  {:compiler
   #{:ups-externs       ; this is implicitly computed from upstream deps (user input ignored)
     :ups-foreign-libs  ; this is implicitly computed from upstream deps (user input ignored)
     :ups-libs          ; this is implicitly computed from upstream deps (user input ignored)
     :source-map-inline ; only applies to repl
     :emit-constants    ; this is implicitly computed from optimize-constants (user input ignored)
     :watch}             ; only available via repl option (also as --watch from cli)
   :repl
   #{:watch-fn}}) ; already in compiler options

(defn fetch-repo-options []
  (with-version! (last @published-cljs-tags)
    {:compiler (fetch-repo-compiler-options)
     :repl (fetch-repo-repl-options)}))

(defn notify-new-options-from-site []
  (let [{:keys [compiler repl]} (fetch-site-options)
        new-compiler (difference compiler
                       (set (keys compiler-options))
                       (:compiler ignored-site-options))
        new-repl (difference repl
                   (set (keys repl-options))
                   (:repl ignored-site-options))]
    (when (seq new-compiler)
      (println "\nNew Compiler Options (via site):\n")
      (doseq [opt (sort new-compiler)]
        (println " " (style opt :yellow) "-" (str "https://clojurescript.org/reference/compiler-options#" (name opt)))))
    (when (seq new-repl)
      (println "\nNew REPL Options (via site):\n")
      (doseq [opt (sort new-repl)]
        (println " " (style opt :yellow) "-" (str "https://clojurescript.org/reference/repl-options#" (name opt)))))))

(defn notify-new-options-from-repo []
  (let [{:keys [compiler repl]} (fetch-repo-options)
        new-compiler (difference compiler
                       (set (keys compiler-options))
                       (:compiler ignored-repo-options))
        new-repl (difference repl
                   (set (keys repl-options))
                   (:repl ignored-repo-options))]
    (when (seq new-compiler)
      (println "\nNew Compiler Options (via repo var):\n")
      (doseq [opt (sort new-compiler)]
        (println " " (style opt :yellow))))
    (when (seq new-repl)
      (println "\nNew REPL Options (via repo var):\n")
      (doseq [opt (sort new-repl)]
        (println " " (style opt :yellow))))))

(defn notify-new-options []
  (println (style "\nChecking for potentially new compiler options...\n" :cyan))
  (notify-new-options-from-site)
  (notify-new-options-from-repo))
