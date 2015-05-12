(ns cljs-api-gen.parse
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.core.match :refer [match]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [lower-case split split-lines join replace]]
    [me.raynes.fs :refer [base-name exists?]]
    [cljs-api-gen.read :refer [read-ns-forms
                               read-clj-core-forms]]
    [cljs-api-gen.config :refer [repo-dir]]
    [cljs-api-gen.docstring :refer [try-locate-docs
                                    fix-docstring
                                    try-remove-docs]]
    [cljs-api-gen.repo-cljs :refer [get-github-file-link
                                    *cljs-tag*
                                    *cljs-num*]]
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

(def normally-parsed-ns?
  #{"cljs.pprint" "cljs.reader"
    "clojure.set" "clojure.string" "clojure.walk" "clojure.zip" "clojure.data"})

(def custom-parsed-ns?
  #{"cljs.core" "cljs.test"
    "special" "specialrepl"}) ;; <-- pseudo-namespaces for special forms

(def cljs-namespaces
  (into normally-parsed-ns? custom-parsed-ns?))

;;--------------------------------------------------------------------------------
;; Functions marked as macros
;;--------------------------------------------------------------------------------

(def ^:dynamic *fn-macros* #{})

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
;; High-level namespace parsing functions
;;--------------------------------------------------------------------------------

(defn parse-forms
  "Parse given forms from a given namespace and repo."
  [ns- repo forms]
  (binding [*cur-ns* ns-
            *cur-repo* repo]
    (doall (keep parse-form forms))))

(defn parse-ns*
  "Parse namespace of the given source types, :compiler or :library or both."
  [ns- repo src-types]
  (->> (read-ns-forms ns- src-types)
       (mapcat #(parse-forms ns- repo %))))

(defn parse-clj-core
  "Parse clojure.core forms."
  []
  (->> (read-clj-core-forms)
       (mapcat #(parse-forms "cljs.core" "clojure" %))))

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
  [form doc-map]
  (when-let [special (parse-special* form)]
    (let [location (parse-location form)
          extras {:full-name (str *cur-ns* "/" (:name special))
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
  [form doc-map]
  (when-let [specials (parse-repl-specials* form)]
    (let [location (parse-location form)
          make-map (fn [name-]
                     (let [attrs {:name name-
                                  :full-name (str *cur-ns* "/" name-)
                                  :type "special form (repl)"}
                           docs (get doc-map name-)]
                       (merge location attrs docs)))]
     (doall (map make-map specials)))))

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

(defn parse-extra-macros-from-clj
  "cljs.core uses some macros from clojure.core, so find those here"
  []
  (let [clj-api (->> (parse-clj-core)
                     (filter #(= "macro" (:type %))))
        cljs-forms   (apply concat (read-ns-forms "cljs.core" :compiler))
        imports      (get-imported-macro-api     cljs-forms clj-api)
        non-excludes (get-non-excluded-macro-api cljs-forms clj-api)]
    (println "   " (count imports) "macros imported from clojure.core")
    (println "   " (count non-excludes) "macros non-excluded clojure.core")
    (concat imports non-excludes)))

;;------------------------------------------------------------
;; Top-level namespace parsing
;; (with custom corrections)
;;------------------------------------------------------------

(defmulti parse-ns
  (fn [ns-]
    (cond
      (custom-parsed-ns?   ns-) ns-
      (normally-parsed-ns? ns-) :default
      :else nil)))

(defmethod parse-ns "cljs.core" [ns-]
  ;; NOTE: Concatenation order is important here for allowing
  ;; write/dump-doc-file! to overwrite previously defined
  ;; macros/functions with subsequent ones.
  ;; Many compiler macros share same names as library functions.
  ;; The library functions are intended to be used over the macros.
  ;; And the imported macros from "clojure.core" should be overwritten
  ;; by cljs.core's macros.
  (concat (parse-extra-macros-from-clj)
          (parse-ns* ns- "clojurescript" [:compiler :library])))

;; pseudo-namespace since special forms don't have a namespace
(defmethod parse-ns "special" [ns-]
  (let [docs (->> (read-ns-forms "cljs.repl" :compiler)
                  (apply concat)
                  (keep #(parse-special-docs %))
                  first)
        ns-with-specials (cond
                           (>= *cljs-num* 1424) "cljs.analyzer"
                           (>= *cljs-num* 0)    "cljs.compiler"
                           :else nil)
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (->> (read-ns-forms ns-with-specials :compiler)
                        (apply concat)
                        (keep #(parse-special % docs))
                        doall))]
    (println "   " (count specials) "special forms in" ns-with-specials)
    specials))

;; pseudo-namespace since repl special forms don't have a namespace
(defmethod parse-ns "specialrepl" [ns-]
  (let [forms (apply concat (read-ns-forms "cljs.repl" :compiler))
        docs (first (keep parse-repl-special-docs forms))
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (first (keep #(parse-repl-specials % docs) forms)))]
    (println "   " (count specials) "repl special forms in cljs.repl")
    specials))

(defmethod parse-ns "cljs.test" [ns-]
  (parse-ns* ns- "clojurescript"
    (cond
      (>  *cljs-num* 3269) [:library]
      (>= *cljs-num* 0)    [:library :compiler]
      :else nil)))

(defmethod parse-ns :default [ns-]
  (parse-ns* ns- "clojurescript" :library))

(defn parse-all
  []
  (doall (mapcat parse-ns cljs-namespaces)))

