(ns cljs-api-gen.parse
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.core.match :refer [match]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [lower-case split split-lines join replace]]
    [me.raynes.fs :refer [base-name exists?]]
    [cljs-api-gen.read :refer [read-ns-forms
                               read-clj-core-forms
                               read-treader-forms]]
    [cljs-api-gen.config :refer [repos-dir]]
    [cljs-api-gen.docstring :refer [try-locate-docs
                                    fix-docstring
                                    try-remove-docs]]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag*
                                    *cljs-num*
                                    *clj-tag*
                                    *treader-version*
                                    *treader-tag*]]
    [cljs-api-gen.syntax :refer [char-map
                                 dchar-map
                                 syntax-map
                                 base-clj-syntax]]
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

(defn cur-repo-tag
  []
  (case *cur-repo*
    "clojure" *clj-tag*
    "clojurescript" *cljs-tag*
    "tools.reader" *treader-tag*
    nil))

(def normally-parsed-ns?
  #{"cljs.pprint"
    "cljs.reader"
    "clojure.set"
    "clojure.string"
    "clojure.walk"
    "clojure.zip"
    "clojure.data"
    "clojure.browser.dom"
    "clojure.browser.event"
    "clojure.browser.net"
    "clojure.browser.repl"
    "clojure.core.reducers"
    "clojure.reflect"
    "cljs.nodejs"
    "cljs.nodejscli"
    })

(def custom-parsed-ns?
  #{"cljs.core"
    "cljs.test"
    "cljs.repl"
    "special"     ;; <-- pseudo-namespace for special forms
    "specialrepl" ;; <-- pseudo-namespace for REPL special forms
    "syntax"      ;; <-- pseudo-namespace for syntax forms
    })

(def cljs-lib-namespaces
  (into normally-parsed-ns? custom-parsed-ns?))

(def cljs-compiler-namespaces
  #{"cljs.analyzer.api"
    "cljs.build.api"
    "cljs.compiler.api"
    })

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
;; Parse defs
;;--------------------------------------------------------------------------------

(def ^:dynamic *parse-private-defs?*
  "Determines if private defs should be parsed."
  false)

(defn parse-defn-or-macro
  [form type-]
  (let [name- (second form)
        meta- (meta name-)
        args (drop 2 form)
        docstring (let [ds (first args)]
                    (when (string? ds)
                      ds))
        args (if docstring (rest args) args)
        attr-map (let [m (first args)]
                   (when (map? m) m))
        args (if attr-map (rest args) args)
        private? (or (= 'defn- (first form))
                     (:private meta-)
                     (:private attr-map))
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
    (when (or *parse-private-defs?*
              (not private?))
      {:expected-docs expected-docs
       :docstring (fix-docstring docstring)
       :signature signatures
       :type type-})))

(defn parse-def-fn
  [form]
  (let [name- (second form)
        m (meta name-)
        private? (:private m)
        docstring (fix-docstring (:doc m))
        signatures (when-let [arglists (:arglists m)]
                     (when (= 'quote (first arglists))
                       (second arglists)))]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature signatures
       :type "function"})))

(defn parse-var
  [form]
  (let [name- (second form)
        m (meta name-)
        private? (:private m)
        docstring (fix-docstring (:doc m))
        dynamic? (:dynamic m)]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :type (if dynamic? "dynamic var" "var")})))

(defn parse-defcurried
  [form]
  (let [[_ name- docstring attr-map args] form
        private? (:private attr-map)
        cargs (vec (butlast args))
        signatures [cargs args]]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature signatures
       :type "function"})))

(defn parse-protocol-method
  [form]
  (let [name- (first form)
        form (drop 1 form)
        docstring (let [d (last form)]
                    (when (string? d) d))
        form (if docstring (butlast form) form)
        signatures (mapv str form)]
    {:name (str name-)
     :signature signatures
     :docstring docstring}))

(defn parse-defprotocol
  [form]
  (let [name- (second form)
        meta- (meta name-)
        private? (:private meta-)
        form (drop 2 form)
        docstring (let [d (first form)]
                    (when (string? d) d))
        form (if docstring (drop 1 form) form)
        method-lists form
        pmethods (mapv parse-protocol-method method-lists)]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature nil
       :methods pmethods
       :type "protocol"})))

(defn parse-deftype
  [form]
  (when (not= *cur-ns* "cljs.pprint") ;; ignore custom deftypes here
    (let [name- (second form)
          meta- (meta name-)
          private? (:private meta-)
          form (drop 2 form)
          signature (first form)]
      (when (or *parse-private-defs?*
                (not private?))
        {:signature (when signature [signature])
         :type "type"}))))

(defmulti parse-form*
  (fn [form]
    (case (first form)
      defn          "defn"
      defn-         "defn"
      core/defn     "defn"
      defmacro      "defmacro"
      defcurried    "defcurried"
      defprotocol   "defprotocol"
      deftype       "deftype"
      (def defonce) (if (and (list? (nth form 2 nil))
                               (= 'fn (first (nth form 2 nil)))
                               (not (:dynamic (meta (second form)))))
                        "def fn"
                        "var")
      nil)))

(defmethod parse-form* "var"         [form] (parse-var form))
(defmethod parse-form* "def fn"      [form] (parse-def-fn form))
(defmethod parse-form* "defn"        [form] (parse-defn-or-macro form "function"))
(defmethod parse-form* "defmacro"    [form] (parse-defn-or-macro form "macro"))
(defmethod parse-form* "defcurried"  [form] (parse-defcurried form))
(defmethod parse-form* "defprotocol" [form] (parse-defprotocol form))
(defmethod parse-form* "deftype"     [form] (parse-deftype form))
(defmethod parse-form* nil           [form] nil)

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
        filename (subs (:file m) (inc (count (str repos-dir "/" *cur-repo*))))]
    {:ns *cur-ns*
     :source {:code source
              :repo *cur-repo*
              :tag (cur-repo-tag)
              :filename filename
              :lines lines}
     :potential-comment potential-comment}))

(defn parse-common-def
  [form]
  (let [name- (second form)
        name-meta (meta name-)
        return-type (:tag name-meta)
        manual-macro? (or (*fn-macros* name-)
                          (:macro name-meta))]
    (merge
      {:name (str name-)
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
          final (update-in merged [:source :code] try-remove-docs (:expected-docs specific))
          internal? (internal-def-only? final)]
      (when-not internal?
        (with-meta final {:form form})))))

;;--------------------------------------------------------------------------------
;; High-level namespace parsing functions
;;--------------------------------------------------------------------------------

(defn parse-forms
  "Parse given forms from a given namespace and repo."
  [ns- repo forms]
  (binding [*cur-ns* ns-
            *cur-repo* repo
            *fn-macros* (get-fn-macros forms)]
    (doall (keep parse-form forms))))

(defn parse-ns*
  "Parse namespace of the given source types, :compiler or :library or both."
  [ns- repo src-types]
  (->> (read-ns-forms ns- src-types)
       (mapcat #(parse-forms ns- repo %))))

(defn parse-clj-core
  "Parse clojure.core forms."
  ;; FIXME: this could be memoized to prevent parsing twice for
  ;;        imported macros and destructure function retrieval
  []
  (->> (read-clj-core-forms)
       (mapcat #(parse-forms "cljs.core" "clojure" %))))

(defn parse-treader-forms
  "Parse tools.reader forms."
  []
  (binding [*parse-private-defs?* true]
    (parse-forms "clojure.tools.reader" "tools.reader" (read-treader-forms))))

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
                            (rename-keys {:forms :signature})))
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
      {:name (str name-)})))

(defn parse-special
  [form doc-map]
  (when-let [special (parse-special* form)]
    (let [location (parse-location form)
          extras {:type "special form"}
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
                            (rename-keys {:doc :docstring, :arglists :signature})
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
                     (let [attrs {:name (str name-)
                                  :type "special form (repl)"}
                           docs (get doc-map name-)]
                       (merge location attrs docs)))]
     (doall (map make-map specials)))))

;;--------------------------------------------------------------------------------
;; Parse tagged literals
;;--------------------------------------------------------------------------------

(defn parse-tagged-literal-map
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def *cljs-data-readers*)))
    (->> (nth form 2)
         (map (fn [[k v]] [(second k) v])) ;; (quote x) -> x for keys
         (into {}))))

(defn parse-tagged-literals
  [map- parsed-defs]
  (let [defs (zipmap (map :name parsed-defs) parsed-defs)
        map-form (get defs "*cljs-data-readers*")]
    (for [[name- func-name] map-]
      {:ns *cur-ns*
       :name name-
       :syntax-form (str "#" name-)
       :type "tagged literal"
       :source (:source map-form)
       :extra-sources [(:source (get defs (str func-name)))]})))

;;--------------------------------------------------------------------------------
;; Parse syntax readers
;;--------------------------------------------------------------------------------

(defn parse-syntax-forms
  []
  (let [ns- *cur-ns*
        type- "syntax"
        base-item (fn [{:keys [desc form] :as info}]
                    {:name desc
                     :syntax-form (or form " ") ;; <-- HACK: form needs to be non-empty string
                                                ;;      so the result parser doesn't purge it
                     :ns ns-
                     :type type-})]
    (if *treader-version*
      (let [parsed (parse-treader-forms)
            {:strs [macros
                    dispatch-macros
                    read-symbol
                    read-number
                    wrapping-reader]
             :as items} (zipmap (map :name parsed) parsed)

            make-items
            (fn [map-def info-lookup]
              (let [[_defn- _macros _args [_case _ch & args]] (:form (meta map-def))
                    {:as reader-map} (drop-last args)]
                (for [[ch func] reader-map]
                  (when-let [info (info-lookup ch)]
                    (assoc (base-item info)
                       :source (:source map-def)
                       :extra-sources (if (and (list? func)
                                               (= 'wrapping-reader (first func)))
                                        [(:source wrapping-reader)]
                                        (when-let [f (get items (str func))]
                                          [(:source f)])))))))
            make-single
            (fn [info func]
              (assoc (base-item info)
                :source (:source func)))]

        (keep identity
              (concat
                (make-items macros char-map)
                (make-items dispatch-macros dchar-map)
                [(make-single (syntax-map "symbol") read-symbol)
                 (make-single (syntax-map "number") read-number)])))
      (for [info base-clj-syntax]
        (assoc (base-item info)
          :source {:repo "clojure"
                   :tag *clj-tag*
                   :filename "src/jvm/clojure/lang/LispReader.java"})))))

;;--------------------------------------------------------------------------------
;; Parse destructure reader
;;--------------------------------------------------------------------------------

(defn parse-destructure
  []
  (let [items (cond
                (>= *cljs-num* 1424) (parse-ns* "cljs.core" "clojurescript" [:compiler])
                (>= *cljs-num* 0)    (parse-clj-core)
                :else nil)
        match? #(= "destructure" (:name %))
        item (first (filter match? items))]

    (-> item
        (assoc :ns *cur-ns*
               :name "destructure"
               :type "syntax"
               :syntax-form " " ;; <-- HACK: form needs to be non-empty string
                                ;;      so the result parser doesn't purge it
               )
        (dissoc :signature))))

;;--------------------------------------------------------------------------------
;; Clojure Macros to import or exclude
;;--------------------------------------------------------------------------------

(defn get-imported-macro-api
  [forms macro-api]
  (let [get-imports #(match % (['import-macros 'clojure.core x] :seq) x :else nil)
        macro-names (->> forms (keep get-imports) first (map str) set)]
    (filter #(macro-names (:name %)) macro-api)))

(defn get-non-excluded-macro-api
  [forms macro-api]
  (let [ns-form (first (filter #(= 'ns (first %)) forms))
        get-excludes #(match % ([:refer-clojure :exclude x] :seq) x :else nil)
        macro-names (->> ns-form (drop 2) (keep get-excludes) first (map str) set)]
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
;; Type member parsing
;;------------------------------------------------------------

(defn parse-core-type-member
  [form type-names]
  (when (and (list? form)
             (>= (count form) 3)
             (= 'set! (first form))
             (list? (second form))
             (= ".-" (subs (name (first (second form))) 0 2))
             (type-names (second (second form))))
    (let [[_set! [attr parent-type :as attr-form] value] form
          name- (str parent-type "." (subs (name attr) 2))
          type- (if (and (list? value) (= 'fn (first value)))
                  "function" "var")]
      (merge
        (binding [*cur-repo* "clojurescript"
                  *cur-ns* "cljs.core"]
          (parse-location form))
        (when (= type- "function")
          {:signature [(second value)]})
        {:name name-
         :parent-type (name parent-type)
         :type type-}))))

(defn get-core-type-members
  [type-names]
  (->> (apply concat (read-ns-forms "cljs.core" :library))
       (keep #(parse-core-type-member % type-names))))

;;------------------------------------------------------------
;; Top-level namespace parsing
;; (with custom corrections)
;;------------------------------------------------------------

(defmulti parse-ns
  (fn [ns-]
    (cond
      (custom-parsed-ns?   ns-) ns-
      (normally-parsed-ns? ns-) :default-lib
      (cljs-compiler-namespaces ns-) :default-compiler
      :else nil)))

(defmethod parse-ns "cljs.core" [ns-]
  ;; NOTE: Concatenation order is important here
  ;; so previously defined macros/functions are overwritten
  ;; by subsequent ones.
  ;; Many compiler macros share same names as library functions.
  ;; The library functions are intended to be used over the macros.
  ;; And the imported macros from "clojure.core" should be overwritten
  ;; by cljs.core's macros.
  (let [com-parsed (->> (parse-ns* ns- "clojurescript" [:compiler])
                        (filter #(= "macro" (:type %))))
        lib-parsed (parse-ns* ns- "clojurescript" [:library])
        type-names (->> lib-parsed
                        (filter #(= "type" (:type %)))
                        (map :name)
                        set)]
    (concat (parse-extra-macros-from-clj)
            com-parsed
            lib-parsed
            (get-core-type-members type-names))))

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
    specials))

;; pseudo-namespace since repl special forms don't have a namespace
(defmethod parse-ns "specialrepl" [ns-]
  (let [forms (apply concat (read-ns-forms "cljs.repl" :compiler))
        docs (first (keep parse-repl-special-docs forms))
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (first (keep #(parse-repl-specials % docs) forms)))]
    specials))

(defmethod parse-ns "syntax" [ns-]
  (binding [*cur-ns* ns-]
    (let [forms (apply concat (read-ns-forms "cljs.tagged-literals" :compiler))
          reader-map (first (keep parse-tagged-literal-map forms))
          parsed-defs (parse-ns* "cljs.tagged-literals" "clojurescript" :compiler)
          tagged-literals (parse-tagged-literals reader-map parsed-defs)
          syntax-items (parse-syntax-forms)
          destructure-item (parse-destructure)]
      (doall (concat
               tagged-literals
               syntax-items
               [destructure-item])))))

(defmethod parse-ns "cljs.test" [ns-]
  (parse-ns* ns- "clojurescript"
    (cond
      (>  *cljs-num* 3269) [:library]
      (>= *cljs-num* 0)    [:library :compiler]
      :else nil)))

(defmethod parse-ns "cljs.repl" [ns-]
  ;; the library file "repl.cljs" has (:require-macros cljs.repl)
  ;; so we must pull those in from the compiler and add in the
  ;; library functions.
  (let [macros (->> (parse-ns* ns- "clojurescript" [:compiler])
                    (filter #(= "macro" (:type %))))
        fns (parse-ns* ns- "clojurescript" [:library])]
    (concat macros fns)))

(defmethod parse-ns :default-lib [ns-]
  (parse-ns* ns- "clojurescript" :library))

(defmethod parse-ns :default-compiler [ns-]
  (parse-ns* ns- "clojurescript" :compiler))

;;------------------------------------------------------------
;; Main
;;------------------------------------------------------------

(defn add-catch-finally
  "`catch` and `finally` are handled inside the `try` special form.
  We cannot parse them, so we add them manually."
  [parsed]
  (let [try-ns-name (cond
                      (>= *cljs-num* 1933) {:ns "special" :name "try"}
                      (>= *cljs-num* 0)    {:ns "cljs.core" :name "try"}
                      :else nil)
        try-form (first (filter #(= (select-keys % [:ns :name]) try-ns-name) parsed))
        get-sigs (fn [name-]
                   ;; parse docstring for signature of `catch` and `finally`:
                   ;;
                   ;;    catch-clause => (catch classname name expr*)
                   ;;    finally-clause => (finally expr*)
                   ;;
                   (when-let [docstring (:docstring try-form)]
                     (as-> (:docstring try-form) $
                       (re-find (re-pattern (str "\\(" name- " (.*)\\)")) $)
                       (second $)
                       (split $ #"\s+")
                       (mapv symbol $)
                       (vector $))))
        make (fn [name-]
               (assoc
                 (select-keys try-form
                              [:docstring :source])
                 :ns "special"
                 :type "special form"
                 :name name-
                 :signature (get-sigs name-)))
        extras (map make ["catch" "finally"])]
    (concat parsed extras)))

(defn parse-all
  []
  (let [lib-parsed (->> cljs-lib-namespaces
                        (mapcat parse-ns)
                        doall
                        add-catch-finally)
        compiler-parsed (->> cljs-compiler-namespaces
                             (mapcat parse-ns)
                             doall)]
    {:library lib-parsed
     :compiler compiler-parsed}))

