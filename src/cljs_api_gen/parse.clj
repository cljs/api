(ns cljs-api-gen.parse
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.core.match :refer [match]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [lower-case split split-lines join replace]]
    [me.raynes.fs :refer [base-name exists?]]
    [cljs-api-gen.read :refer [read-forms-from-file]]
    [cljs-api-gen.config :refer [repo-dir]]
    [cljs-api-gen.docstring :refer [try-locate-docs
                                    fix-docstring
                                    try-remove-docs]]
    [cljs-api-gen.repo-cljs :refer [get-github-file-link]]
    ))

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::ana/numeric`
;; which is used by cljs.core. (the ana namespace has to exist)
(create-ns 'ana)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::env/compiler`
;; which is used by cljs.repl. (the env namespace has to exist)
(create-ns 'env)

;; current namespace and repo that we are parsing.
(def ^:dynamic *cur-ns*)
(def ^:dynamic *cur-repo*)

(def cljs-namespaces
  #{"cljs.core" "cljs.analyzer" "cljs.compiler" "cljs.test" "cljs.repl" "cljs.reader"
    "clojure.set" "clojure.string" "clojure.walk" "clojure.zip" "clojure.data"})

;;--------------------------------------------------------------------------------
;; Functions marked as macros
;;--------------------------------------------------------------------------------

(def ^:dynamic *fn-macros* [])

(defn get-fn-macro
  "looks for a call of the form:
  (. (var %) (setMacro))"
  [form]
  (let [to-vec #(if (seq? %) (vec %) %)]
    (match (to-vec (map to-vec form))
      ['. ['var name-] ['setMacro]] name-
      :else nil)))

(defn get-fn-macros
  [forms]
  (set (keep get-fn-macro forms)))

;;--------------------------------------------------------------------------------
;; Parse def functions/macros
;; TODO: parse vars
;;--------------------------------------------------------------------------------

(defn parse-defn-or-macro
  [form]
  (let [type- ({'defn "function" 'defmacro "macro"} (first form))
        args (drop 2 form)
        docstring (let [ds (first args)]
                    (when (string? ds)
                      ds))
        args (if docstring (rest args) args)
        attr-map (let [m (first args)]
                   (when (map? m) m))
        args (if attr-map (rest args) args)
        private? (:private attr-map)
        doc-forms (cond-> []
                    docstring (conj docstring)
                    attr-map (conj attr-map))
        signatures (if (vector? (first args))
                     (take 1 args)
                     (map first args))
        expected-docs (try-locate-docs
                        {:whole form
                         :head (take 2 form)
                         :doc doc-forms
                         :sig-body args})]
    (when-not private?
      {:expected-docs expected-docs
       :docstring (fix-docstring docstring)
       :signatures signatures
       :type type-})))

(defn parse-def-fn
  [form]
  (let [name- (second form)
        m (meta name-)
        docstring (fix-docstring (:doc m))
        signatures (when-let [arglists (:arglists m)]
                     (when (= 'quote (first arglists))
                       (second arglists)))]
    {:docstring docstring
     :signatures signatures
     :type "function"}))

(defmulti parse-form*
  (fn [form]
    (cond
      (and (= 'defn (first form))
           (not (:private (meta (second form)))))
      "defn"

      (and (= 'defmacro (first form))
           (not (:private (meta (second form)))))
      "defmacro"

      (and (= 'def (first form))
           (list? (nth form 2 nil))
           (= 'fn (first (nth form 2 nil)))
           (not (:private (meta (second form)))))
      "def fn"

      :else nil)))

(defmethod parse-form* "def fn"
  [form]
  (parse-def-fn form))

(defmethod parse-form* "defn"
  [form]
  (parse-defn-or-macro form))

(defmethod parse-form* "defmacro"
  [form]
  (parse-defn-or-macro form))

(defmethod parse-form* nil
  [form]
  nil)

;;--------------------------------------------------------------------------------
;; Parse common meta for defs
;;--------------------------------------------------------------------------------

(defn parse-location
  [form]
  (let [m (meta form)
        lines [(:line m) (:end-line m)]
        num-lines (inc (- (:end-line m) (:line m)))
        source-lines (split-lines (:source m))

        ;; the first line before the definition (potential comment)
        potential-comment (first (take-last (inc num-lines) source-lines))

        source (join "\n" (take-last num-lines source-lines))
        filename (subs (:file m) (inc (count repo-dir)))
        github-link (get-github-file-link *cur-repo* filename lines)]
    {:ns *cur-ns*
     :source source
     :potential-comment potential-comment
     :filename filename
     :lines lines
     :github-link github-link}))

(defn parse-common-def
  [form]
  (let [name- (second form)
        name-meta (meta name-)
        return-type (:tag name-meta)
        manual-macro? (or (*fn-macros* name-)
                          (:macro name-meta))]
    (merge
      {:name name-
       :full-name (str *cur-ns* "/" name-)
       :return-type return-type}

      (when manual-macro?
        {:type "macro"}))))

(defn internal-def-only?
  [form]
  (let [[c0 c1] (split (:potential-comment form) #"\s+")
        comment-flag? (and (#{";;" ";"} c0)
                           c1
                           (= "internal" (lower-case c1)))
        [d0] (split (or (:docstring form) "") #"\s+")
        docstring-flag? (and d0 (= "internal" (lower-case d0)))]
    (or comment-flag? docstring-flag?)))

(defn parse-form
  [form]
  (when-let [specific (parse-form* form)]
    (let [common (parse-common-def form)
          location (parse-location form)
          merged (merge specific location common)
          final (update-in merged [:source] try-remove-docs (:expected-docs specific))
          internal? (internal-def-only? final)]
      (when-not internal?
        final))))

;;--------------------------------------------------------------------------------
;; Parse special forms
;;--------------------------------------------------------------------------------

(defn transform-special-doc
  [doc-map]
  (let [transform-form (fn [form sym]
                         (vec (if (= (first form) sym) ;; e.g. (do exprs*) => [exprs*]
                                (rest form)
                                form)))
        transform-forms (fn [forms sym]
                          (map #(transform-form % sym) forms))
        transform-val (fn [sym value]
                        (-> value
                            (rename-keys {:doc :docstring, :url :doc-url})
                            (update-in [:docstring] fix-docstring)
                            (update-in [:forms] transform-forms sym)
                            (rename-keys {:forms :signatures})))
        values (map transform-val (keys doc-map) (vals doc-map))]
    (zipmap (keys doc-map) values)))

(defn parse-special-docs
  "Parse the special-doc-map."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def special-doc-map)))
    (let [[_quote doc-map] (nth form 2)]
      (transform-special-doc doc-map))))

(defn parse-special*
  "Parse cljs special forms of the form:
  (defmethod parse 'symbol ...)"
  [form]
  (when (and (list? form)
             (= (take 2 form) '(defmethod parse)))
    (let [quoted-name (nth form 2)
          name- (second quoted-name)]
      {:name name-})))

(defn parse-special
  [form ns- repo doc-map]
  (when-let [special (parse-special* form)]
    (let [location (parse-location form ns- repo)
          extras {:full-name (str ns- "/" (:name special))
                  :type "special form"}
          docs (get doc-map (:name special))
          final (merge special location extras docs)]
      final)))

;;--------------------------------------------------------------------------------
;; Parse REPL special forms
;;--------------------------------------------------------------------------------

(defn transform-repl-special-doc
  [doc-map]
  (let [transform-val (fn [value]
                        (-> value
                            (rename-keys {:doc :docstring, :arglists :signatures})
                            (update-in [:docstring] fix-docstring)))
        values (map transform-val (vals doc-map))]
    (zipmap (keys doc-map) values)))

(defn parse-repl-special-docs
  "Parse the repl-special-doc-map."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def repl-special-doc-map)))
    (let [[_quote doc-map] (nth form 2)]
      (transform-repl-special-doc doc-map))))

(defn parse-repl-specials*
  "Parse cljs repl special forms of the form:
  (def default-special-fns (let [...] { #_keys_are_special_form_names }))"
  [form]
  (if (and (#{"r927" "r971"} *cljs-tag*)
           (list? form)
           (= (take 2 form) '(defn repl)))
    ;; old version, just manually setting when detected
    ['in-ns 'load-file 'load-namespace]

    ;; everything >= r993
    (when (and (list? form)
               (= (take 2 form) '(def default-special-fns)))
      (let [[_let _bindings form-map] (nth form 2)]
        (->> (keys form-map)
             (map second) ;; (quote x) => x
             (remove namespace)) ;; we'll ignore namespace-qualified special forms
        ))))

(defn parse-repl-specials
  [form ns- repo doc-map]
  (when-let [specials (parse-repl-specials* form)]
    (let [location (parse-location form ns- repo)
          make-map (fn [name-]
                     (let [attrs {:name name-
                                  :full-name (str ns- "/" name-)
                                  :type "special form (repl)"}
                           docs (get doc-map name-)]
                       (merge location attrs docs)))]
     (map make-map specials))))

;;--------------------------------------------------------------------------------
;; Clojure Macros to import or exclude
;;--------------------------------------------------------------------------------

(defn get-imported-macro-api
  [forms macro-api]
  (let [get-imports #(match % (['import-macros 'clojure.core x] :seq) x :else nil)
        macro-names (->> forms (keep get-imports) first set)]
    (filter #(macro-names (:name %)) macro-api)))

(defn get-non-excluded-macro-api
  [forms macro-api]
  (let [ns-form (first (filter #(= 'ns (first %)) forms))
        get-excludes #(match % ([:refer-clojure :exclude x] :seq) x :else nil)
        macro-names (->> ns-form (drop 2) (keep get-excludes) first set)]
    (remove #(macro-names (:name %)) macro-api)))

;;------------------------------------------------------------
;; Namespace API parsing
;;------------------------------------------------------------

(defn parse-ns
  [ns- src-types]
  (let [forms (if (ns-
  )

(defn parse-api
  "Parse the functions and macros from the given repo file"
  [ns- repo file]
  (println " " ns- repo file)
  (let [forms (get-forms ns- repo file)]
    (binding [*fn-macros* (get-fn-macros forms)
              *cur-ns* ns-
              *cur-repo* repo]
      (doall (keep parse-form forms)))))

(defmulti parse-ns-api
  identity)

(defn parse-extra-macros-from-clj
  "cljs.core uses some macros from clojure.core, so find those here"
  []
  (let [clj-api (concat (parse-api "cljs.core" "clojure" "core.clj")
                        (parse-api "cljs.core" "clojure" "core_deftype.clj")
                        (parse-api "cljs.core" "clojure" "core_print.clj")
                        (parse-api "cljs.core" "clojure" "core_proxy.clj"))
        clj-api (filter #(= "macro" (:type %)) clj-api)
        cljs-forms   (get-forms "cljs.core" "clojurescript" "core.clj")
        imports      (get-imported-macro-api     cljs-forms clj-api)
        non-excludes (get-non-excluded-macro-api cljs-forms clj-api)]
    (println "   " (count imports) "macros imported from clojure.core")
    (println "   " (count non-excludes) "macros non-excluded clojure.core")
    (concat imports non-excludes)))

(defn parse-cljs-special-forms
  "cljs.core has some special forms defined in analyzer.clj, so find those here"
  []
  (let [ns- "cljs.core"
        repo "clojurescript"
        forms (concat (get-forms ns- repo "analyzer.clj")
                      (get-forms ns- repo "compiler.clj"))
        repl-forms (get-forms "cljs.repl" "clojurescript" "repl.clj")
        special-docs (first (keep #(parse-special-docs %) repl-forms))
        special-ns "special" ;; doing this because special forms are not actually in any namespace
        specials (keep #(parse-special % special-ns repo special-docs) forms)]
    (println "   " (count specials) "special forms in cljs.analyzer")
    specials))

(defmethod parse-ns-api "cljs.core" [ns-]
  (let [clj-api  (parse-cljs-api "cljs.core")
        extra-macro-api (parse-extra-macros-from-clj)]
    (concat extra-macro-api clj-api cljs-api)))

;; TODO: parse special forms separately
;; (parse-cljs-special-forms)

;; TODO: parse repl special forms separately
;; forms (get-forms ns- repo "repl.clj")
;; special-ns "specialrepl"
;; special-docs (first (keep #(parse-repl-special-docs %) forms))
;; specials (first (keep #(parse-repl-specials % special-ns repo special-docs) forms))

(defn parse-all
  []
  (doall (mapcat parse-ns-api (keys cljs-ns-paths))))

