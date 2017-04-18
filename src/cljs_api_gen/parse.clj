(ns cljs-api-gen.parse
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.core.match :refer [match]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [lower-case split split-lines join replace]]
    [me.raynes.fs :refer [base-name exists?]]
    [cljs-api-gen.read :refer [read-ns-forms
                               read-all-ns-forms
                               read-clj-core-forms
                               read-treader-forms]]
    [cljs-api-gen.config :refer [repos-dir]]
    [cljs-api-gen.docstring :refer [try-locate-docs
                                    fix-docstring
                                    try-remove-docs]]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag*
                                    *clj-tag*
                                    *clj-version*
                                    master?
                                    *treader-version*
                                    *treader-tag*
                                    cljs-cmp
                                    ensure-cljs-published!]]
    [cljs-api-gen.syntax :refer [syntax
                                 char-map
                                 dchar-map
                                 syntax-map
                                 clj-syntax]]
    [cljs-api-gen.options :refer [compiler-options
                                  repl-options
                                  sub-options-ns
                                  sub-options-sym]]))

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::ana/numeric`
;; which is used by cljs.core. (the ana namespace has to exist)
(create-ns 'ana)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::env/compiler`
;; which is used by cljs.repl. (the env namespace has to exist)
(create-ns 'env)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::spec/...`
;; which is used by cljs.repl. (the env namespace has to exist)
(create-ns 'spec)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::s/...`
;; which is used by cljs.spec.test. (the env namespace has to exist)
(create-ns 's)
(create-ns 'stc)

;; HACK: We need to create this so 'tools.reader' doesn't crash on `::comp/compiled-cljs`
;; which is used by cljs.closure. (the comp namespace has to exist)
(create-ns 'comp)

;; current namespace and repo that we are parsing.
(def ^:dynamic *cur-ns*)
(def ^:dynamic *cur-repo*)

;; current API that we are parsing for (e.g. "library", "compiler")
(def ^:dynamic *cur-api*)

(defn cur-repo-tag
  []
  (case *cur-repo*
    "clojure" *clj-tag*
    "clojurescript" *cljs-tag*
    "tools.reader" *treader-tag*
    nil))

(def namespaces
  "api -> namespaces, and namespace -> parse type"

  {:syntax
   {"syntax"                :custom} ;; pseudo-namespace for syntax forms

   :options
   {"compiler-options"      :custom ;; pseudo-namespaces for options
    "repl-options"          :custom
    "warnings"              :custom
    "closure-warnings"      :custom}

   :library
   {"cljs.pprint"           :normal
    "cljs.reader"           :normal
    "clojure.set"           :normal
    "clojure.string"        :normal
    "clojure.walk"          :normal
    "clojure.zip"           :normal
    "clojure.data"          :normal
    "clojure.browser.dom"   :normal
    "clojure.browser.event" :normal
    "clojure.browser.net"   :normal
    "clojure.browser.repl"  :normal
    "clojure.core.reducers" :normal
    "clojure.reflect"       :normal
    "cljs.nodejs"           :normal
    "cljs.js"               :normal
    "cljs.spec"             :normal
    "cljs.spec.test"        :normal
    "cljs.core"             :custom
    "cljs.test"             :custom
    "cljs.repl"             :custom
    "cljs.spec.impl.gen"    :custom}

   :compiler
   {"cljs.analyzer.api"     :normal
    "cljs.build.api"        :normal
    "cljs.compiler.api"     :normal
    "cljs.repl"             :normal
    "cljs.repl.browser"     :normal
    "cljs.repl.node"        :normal
    "cljs.repl.reflect"     :normal
    "cljs.repl.rhino"       :normal
    "cljs.repl.server"      :normal

    "cljs.repl.nashorn"     :custom}})


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
        macro? (:macro attr-map)
        private? (or (#{'core/defn- 'defn-} (first form))
                     (:private meta-)
                     (:private attr-map)
                     (:skip-wiki meta-)
                     (:skip-wiki attr-map))
        doc-forms (cond-> []
                    docstring (conj docstring)
                    attr-map (conj attr-map))
        arglists (when-let [arglists (:arglists attr-map)]
                   (when (= 'quote (first arglists))
                     (second arglists)))
        signatures (if (vector? (first args))
                     (take 1 args)
                     (map first args))
        expected-docs (try-locate-docs
                        {:whole form
                         :head (take 2 form)
                         :doc doc-forms
                         :sig-body args})
        constructor? (some #{"@constructor"} (:jsdoc meta-))]
    (when (or *parse-private-defs?*
              (not private?))
      {:expected-docs expected-docs
       :docstring (fix-docstring docstring)
       :signature (or arglists signatures)
       :type (cond
               constructor? "type"
               macro? "macro"
               :else type-)})))

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

(defn parse-defmulti
  [form]
  (let [name- (second form)
        meta- (meta name-)
        private? (:private meta-)
        form (drop 2 form)
        docstring (let [d (first form)]
                    (if (string? d)
                      d
                      (:doc meta-)))
        form (if docstring (drop 1 form) form)
        dispatch (first form)
        dispatch (when (and (list? dispatch) (= (first dispatch) 'fn))
                   dispatch)
        signature (and dispatch (second dispatch))
        signature (when (vector? signature)
                    signature)]
    (when (or *parse-private-defs?*
              (not private?))
      {:docstring docstring
       :signature (when signature [signature])
       :type "multimethod"})))

(defn parse-defmethod
  [[_defmethod name- value :as form]]
  {:type "method"})

(defn pseudo-ns-item
  "added manually when parsing pseudo-namespaces"
  [ns-]
  {:type "namespace"
   :pseudo-ns? true
   :ns ns-})

(defn parse-ns-form
  [[_ns name- & args :as form]]
  (let [meta- (meta name-)
        doc (if (string? (first args))
              (first args)
              (:doc meta-))
        author (:author meta-)]
    {:type "namespace"
     :docstring doc
     :author author}))


(defmulti parse-form*
  (fn [form]
    (case (first form)
      ns            "ns"
      defn          "defn"
      defn-         "defn"
      core/defn     "defn"
      core/defn-    "defn"
      defmacro      "defmacro"
      core/defmacro "defmacro"
      defcurried    "defcurried"
      defprotocol   "defprotocol"
      deftype       "deftype"
      defmulti      "defmulti"
      defmethod     "defmethod"
      goog-define   "var"

      (def defonce) (if (and (list? (nth form 2 nil))
                             (= 'fn (first (nth form 2 nil)))
                             (not (:dynamic (meta (second form)))))
                        "def fn"
                        "var")
      nil)))

(defmethod parse-form* "ns"          [form] (parse-ns-form form))
(defmethod parse-form* "var"         [form] (parse-var form))
(defmethod parse-form* "def fn"      [form] (parse-def-fn form))
(defmethod parse-form* "defn"        [form] (parse-defn-or-macro form "function"))
(defmethod parse-form* "defmacro"    [form] (parse-defn-or-macro form "macro"))
(defmethod parse-form* "defcurried"  [form] (parse-defcurried form))
(defmethod parse-form* "defprotocol" [form] (parse-defprotocol form))
(defmethod parse-form* "deftype"     [form] (parse-deftype form))
(defmethod parse-form* "defmulti"    [form] (parse-defmulti form))
(defmethod parse-form* "defmethod"   [form] (parse-defmethod form))
(defmethod parse-form* nil           [form] nil)

;;--------------------------------------------------------------------------------
;; Ignore internal defs
;;--------------------------------------------------------------------------------

(def unlabeled-internals
  "Internal symbols that are not labeled as such.
  Each symbol will be ignored in the given version range pairs [add remove add remove ...etc]"
  {"cljs.core/INIT"     ["0.0-2301"]
   "cljs.core/START"    ["0.0-2301"]
   "cljs.core/fixture1" ["0.0-927"]
   "cljs.core/fixture2" ["0.0-927"]})

(defn unlabeled-internal?
  [form]
  (when-let [version-ranges (unlabeled-internals (str (:ns form) "/" (:name form)))]
    (some
      (fn [[start end :as vrange]]
        (and
          (or (nil? start) (cljs-cmp >= start))
          (or (nil? end)   (cljs-cmp <  end))))
      (partition 2 2 [nil] version-ranges))))

(defn internal-def-only?
  [form]
  (let [[c0 c1] (split (:potential-comment form) #"\s+")
        comment-flag? (and (#{";;" ";"} c0)
                           c1
                           (= "internal" (lower-case c1)))
        [d0] (split (or (:docstring form) "") #"\s+")
        docstring-flag? (and d0 (= "internal" (lower-case d0)))]
    (or comment-flag?
        docstring-flag?
        (unlabeled-internal? form))))

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
              :title "Source code"
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

(defn parse-form
  ([form] (parse-form form nil))
  ([form virtual-form]
   (if (and (list? form) (= 'let (first form)))
     (let [forms (drop 2 form)]
       (keep parse-form forms))
     (when-let [specific (parse-form* (or virtual-form form))]
       (let [common (parse-common-def (or virtual-form form))
             location (parse-location form)
             merged (merge specific location common)
             final (update-in merged [:source :code] try-remove-docs (:expected-docs specific))
             internal? (internal-def-only? final)]
         (when-not internal?
           (with-meta final {:form form})))))))

;;--------------------------------------------------------------------------------
;; High-level namespace parsing functions
;;--------------------------------------------------------------------------------

(defn parse-forms
  "Parse given forms from a given namespace and repo."
  [ns- repo forms]
  (binding [*cur-ns* ns- ;; TODO: maybe bind *ns* to make the reader eval `::foo` => `:*ns*/foo`
            *cur-repo* repo
            *fn-macros* (get-fn-macros forms)]
    (->> forms
         (keep parse-form)
         (flatten)
         (doall))))

(defn parse-ns*
  "Parse namespace of the given source types, :compiler or :library or both."
  [ns- repo src-type]
  (let [compiler-macros? (= src-type :compiler-macros)
        src-type (if compiler-macros? :compiler src-type)]
    (apply concat
      (for [[filename forms] (read-ns-forms ns- src-type)]
        (let [lib-macros? (and (= :library src-type)
                               (.endsWith filename ".clj")) ;; ^NOTE: need to rethink how we import macros
                                                            ;;       if we have to start taking .cljc into account.
              macros-only? (or lib-macros? compiler-macros?)]
          (cond->> (parse-forms ns- repo forms)
            macros-only? (filter #(= "macro" (:type %)))))))))

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
          docs (get doc-map (symbol (:name special)))
          final (-> special
                    (merge location docs)
                    (assoc :type "special form")
                    (assoc-in [:source :title] "Parser code"))]
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
      (let [[_let _bindings value] (nth form 2)
            form-map (if (cljs-cmp >= "1.7.145")
                       (let [[_wrap-special-fns _wrap-self form-map] value]
                         form-map)
                       value)]
        (->> (keys form-map)
             (map second) ;; (quote x) => x
             (remove namespace)))))) ;; we'll ignore namespace-qualified special forms


(defn parse-repl-specials
  [form doc-map]
  (when-let [specials (parse-repl-specials* form)]
    (let [location (parse-location form)
          make-map (fn [name-]
                     (let [base {:name (str name-)
                                 :repl-only? true
                                 :type "special form (repl)"}
                           docs (get doc-map name-)]
                       (-> base
                           (merge location docs)
                           (assoc-in [:source :title] "repl specials table"))))]
     (doall (map make-map specials)))))

;;--------------------------------------------------------------------------------
;; Parse Special Forms (main)
;;--------------------------------------------------------------------------------

(defn parse-special-items [ns-]
  (let [docs (->> (read-all-ns-forms "cljs.repl" :compiler)
                  (keep #(parse-special-docs %))
                  first)
        ns-with-specials (cond
                           (cljs-cmp >= "0.0-1424") "cljs.analyzer"
                           :else                    "cljs.compiler")
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (->> (read-all-ns-forms ns-with-specials :compiler)
                        (keep #(parse-special % docs))
                        doall))]
    specials))

;; pseudo-namespace since repl special forms don't have a namespace
(defn parse-repl-special-items [ns-]
  (let [forms (read-all-ns-forms "cljs.repl" :compiler)
        docs (first (keep parse-repl-special-docs forms))
        specials (binding [*cur-ns* ns-
                           *cur-repo* "clojurescript"]
                   (first (keep #(parse-repl-specials % docs) forms)))]
    specials))

;;--------------------------------------------------------------------------------
;; Parse syntax readers
;;--------------------------------------------------------------------------------

(defn base-syntax-item
  "A syntax API entry item using info from the syntax table"
  [{:keys [id clj-doc edn-doc] :as info}]
  {:name id
   :ns *cur-ns*
   :type (or (:type info) "syntax")
   :syntax-equiv {:edn-url edn-doc
                  :clj-url clj-doc}})

(defn parse-syntax-treader
  "Parse syntax forms from tools.reader"
  []
  (let [parsed (parse-treader-forms)
        {:strs [macros
                dispatch-macros
                read-symbol
                read-number
                read-tagged
                wrapping-reader]
         :as items} (zipmap (map :name parsed) parsed)

        make-items
        (fn [map-def info-lookup]
          (let [[_defn- _macros _args [_case _ch & args]] (:form (meta map-def))
                {:as reader-map} (drop-last args)] ;; (case ch :a 1 :b 2 :c 3 nil) => {:a 1 :b 2 :c 3}

            (for [[ch func] reader-map]
              (when-let [info (info-lookup ch)]
                (let [base (base-syntax-item info)
                      table-src (assoc (:source map-def)
                                       :title "Reader table")
                      reader-src (when-let [f (get items (str func))]
                                   (assoc (:source f)
                                          :title "Reader code"))
                      sources (keep identity [reader-src table-src])]
                  (assoc (base-syntax-item info)
                         :extra-sources sources))))))

        make-single
        (fn [info func]
          (let [src (assoc (:source func)
                           :title "Reader code")]
            (assoc (base-syntax-item info)
                   :extra-sources [src])))

        ;; syntax forms identified by a leading character (e.g. "(", "[", "#{")
        ;; NOTE: presence determined by parsed char-map and dchar-map
        macro-items    (make-items macros char-map)
        dispatch-items (make-items dispatch-macros dchar-map)

        ;; syntax forms that can't be identified by a leading character
        ;; NOTE: always present
        symbol-item    (make-single (syntax-map "symbol") read-symbol)
        number-item    (make-single (syntax-map "number") read-number)

        ;; the dispatch macro that can't be identified by a leading character
        ;; NOTE: always present (since before tools.reader)
        tag-item       (make-single (syntax-map "tagged-literal") read-tagged)

        ;; special symbols (e.g. "NaN", "Infinity", "true", "false")
        ;; NOTE: assuming NaN and Infinity were available at the time cljs started
        ;;       using tools.reader.  they are not available in clojure.
        ssym-items (->> syntax
                        (filter #(= (:type %) "special symbol"))
                        (map #(make-single % read-symbol)))

        all-items (->> (concat macro-items
                               dispatch-items
                               [symbol-item number-item tag-item]
                               ssym-items)
                       (keep identity))]
    all-items))

(defn parse-syntax-pre-treader
  "Get syntax forms available prior to tools.reader.
  Parse syntax forms from clojure's LispReader, using our base syntax list."
  []
  ;; clojure syntax forms
  ;; NOTE: presence determined by clojure version
  (for [info (clj-syntax *clj-version*)]
    (assoc (base-syntax-item info)
           ;; assuming their source is available in LispReader
           ;; FIXME: not always true
           :source {:repo "clojure"
                    :tag *clj-tag*
                    :filename "src/jvm/clojure/lang/LispReader.java"})))

(defn get-sub-syntax-forms
  "Get derived syntax forms from the given forms."
  [items]
  (let [make-sub-item (fn [info]
                        (when-let [parent (first (filter #(= (:name %) (:parent info)) items))]
                          (merge parent (base-syntax-item info))))
        sub-items (->> syntax
                       (filter :parent)
                       (map make-sub-item)
                       (keep identity))]
    sub-items))

(defn parse-syntax-forms
  []
  (let [forms (if *treader-version*
                (parse-syntax-treader)
                (parse-syntax-pre-treader))
        sub-forms (get-sub-syntax-forms forms)]
    (concat forms sub-forms)))

;;--------------------------------------------------------------------------------
;; Parse tagged literals
;;--------------------------------------------------------------------------------

(defn parse-tagged-literal-map
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def *cljs-data-readers*)))
    (let [tag-map (cond
                    (cljs-cmp <= "1.9.293") (nth form 2)
                    :else (let [[_merge _custom tag-map] (nth form 2)]
                            tag-map))]
      (->> tag-map
           (map (fn [[k v]] [(second k) v])) ;; (quote x) -> x for keys
           (into {})))))

(defn parse-tagged-literals
  []
  ;; NOTE: tagged literals were available since clojure 1.4.0's LispReader was being
  ;; used by clojurescript 0.0-1211, but cljs.tagged-literals was added 0.0-1424.
  (let [forms (read-all-ns-forms "cljs.tagged-literals" :compiler)
        reader-map (first (keep parse-tagged-literal-map forms))
        parsed (parse-ns* "cljs.tagged-literals" "clojurescript" :compiler)
        defs (zipmap (map :name parsed) parsed)
        map-form (get defs "*cljs-data-readers*")]
    (for [[name- func-name] reader-map]
      (let [base (base-syntax-item (syntax-map (str name- "-literal")))
            table-src (assoc (:source map-form)
                             :title "Reader table")
            reader-fn (get defs (str func-name))
            reader-src (assoc (:source reader-fn)
                              :title "Reader code")
            sources (keep identity [reader-src table-src])]
        (merge base
               {:type "tagged literal"
                :extra-sources sources})))))

;;--------------------------------------------------------------------------------
;; Parse destructure reader
;;--------------------------------------------------------------------------------

(defn parse-destructure
  "Pull in the source of the destructure function and file it loosely
  as a syntax pattern."
  []
  (let [items (cond
                (cljs-cmp >= "0.0-1443") (parse-ns* "cljs.core" "clojurescript" :compiler)
                :else                    (parse-clj-core))
        match? #(= "destructure" (:name %))
        destruct-fn (first (filter match? items))
        make-destruct (fn [name-]
                        (let [syntax-info (base-syntax-item (syntax-map name-))]
                          (-> destruct-fn
                              (dissoc :signature)
                              (merge syntax-info)
                              (assoc-in [:source :title] "Parser code"))))]
    (map make-destruct ["destructure-vector"
                        "destructure-map"])))

;;--------------------------------------------------------------------------------
;; Parse other syntax items
;;--------------------------------------------------------------------------------

(defn parse-misc-syntax
  []
  (let [match? #{"special namespace"
                 "convention"
                 "special character"}]
    (->> syntax
         (filter #(match? (:type %)))
         (map base-syntax-item))))

(defn parse-other-syntax
  "Parse all syntax items that are not part of the reader table"
  []
  (concat (parse-tagged-literals)
          (parse-destructure)
          (parse-misc-syntax)))

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
       cljs-forms   (read-all-ns-forms "cljs.core" :compiler)
       imports      (get-imported-macro-api     cljs-forms clj-api)
       non-excludes (get-non-excluded-macro-api cljs-forms clj-api)]
   (println "   " (count imports) "macros imported from clojure.core")
   (println "   " (count non-excludes) "macros non-excluded clojure.core")
   (concat imports non-excludes)))

;;------------------------------------------------------------
;; Type member parsing
;; (this is really messy since cljs has used a few ways to assign
;;  type attributes, and I'm just using the reader to find them.)
;;------------------------------------------------------------

(defn get-core-type-member-info
  [form type-names]
  (cond

    ;; LOOKS LIKE --->  (set! (.-EMPTY List) ...)
    (cljs-cmp >= "0.0-2301")
    (when (and (= 'set! (first form))
               (list? (second form))
               (= ".-" (subs (name (first (second form))) 0 2))
               (type-names (str (second (second form)))))
      (let [[_set! [attr parent-type] value] form
            name- (subs (name attr) 2)]
        (when-not (.contains name- "prototype")
          (let [name- (str parent-type "." name-)
                type- (if (and (list? value) (= 'fn (first value)))
                        "function" "var")
                sig (when (= type- "function")
                      [(second value)])
                result {:name name-
                        :type type-
                        :signature sig
                        :parent-type (name parent-type)}]
            result))))

    ;; LOOKS LIKE --->  (set! cljs.core.List.EMPTY ...)
    ;; (we can cover this case in the one below)
    ;;
    ;; (cljs-cmp >= "0.0-1933")
    ;; nil

    ;; LOOKS LIKE --->  (set! cljs.core.List/EMPTY ...)
    :else
    (when (and (= 'set! (first form))
               (symbol? (second form))
               (.startsWith (str (second form)) "cljs.core."))
      (let [[_set! attr-sym value] form
            [_cljs _core parent-type attr & others] (split (str attr-sym) #"\.|/")]
        (when (and (type-names parent-type)
                   (not= attr "prototype")
                   (not others))
          (let [name- (str parent-type "." attr)
                type- (if (and (list? value) (= 'fn (first value)))
                        "function" "var")
                sig (when (= type- "function")
                      [(second value)])
                result {:name name-
                        :type type-
                        :signature sig
                        :parent-type (name parent-type)}]
            result))))))



(defn parse-core-type-member
  [form type-names]
  (when-let [info (get-core-type-member-info form type-names)]
    (merge
      (binding [*cur-repo* "clojurescript"
                *cur-ns* "cljs.core"]
        (parse-location form))
      info)))

(defn get-core-type-members
  [type-names]
  (->> (read-all-ns-forms "cljs.core" :library)
       (keep #(parse-core-type-member % type-names))))

;;------------------------------------------------------------
;; cljs.spec.impl.gen Parsing
;; (Many functions are generated by a macro, but I'm just
;;  generating them here and assuming they don't change often.)
;;------------------------------------------------------------

(defn parse-lazy-combinator
  [form sym]
  (parse-form form
    (let [fqn (symbol "clojure.test.check.generators" (name sym))
          doc (str "Lazy loaded version of " fqn)]
      (list 'defn sym doc '[& args]))))

(defn parse-lazy-prim
  [form sym]
  (parse-form form
    (let [fqn (symbol "clojure.test.check.generators" (name sym))
          doc (str "Fn returning " fqn)]
      (list 'defn sym doc '[& args]))))

;;------------------------------------------------------------
;; Compiler and REPL options
;;------------------------------------------------------------

(defn base-option-item
  [[id]]
  {:name (name id)
   :ns *cur-ns*
   :type "option"
   :sub-options-ns (sub-options-ns (str *cur-ns* "/" (name id)))})

(defn option-present?
  [[id {:keys [added]}]]
  (when-not (master? *cljs-tag*)
    (ensure-cljs-published! added))
  (cljs-cmp >= added))

(defn option-items
  [options]
  (->> options
       (filter option-present?)
       (map base-option-item)))

;;------------------------------------------------------------
;; Sub-options
;;------------------------------------------------------------

(defn sub-options-ns-item
  [ns-]
  (assoc (pseudo-ns-item ns-)
    :sub-options-sym (sub-options-sym ns-)))

;;------------------------------------------------------------
;; Compiler warnings
;;------------------------------------------------------------

(defn warning-item
  [id]
  {:name (name id)
   :ns *cur-ns*
   :type "warning"})

(defn parse-warnings
  "Parse the default warning map (maps to default enabled boolean)."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def *cljs-warnings*)))
    (let [warnings-map (nth form 2)]
      warnings-map)))

(defn warning-items []
  (let [forms (read-all-ns-forms "cljs.analyzer" :compiler)
        warnings (first (keep parse-warnings forms))]
    (map warning-item (keys warnings))))

(defn parse-closure-warnings
  "Parse the default Closure warning map (maps keywords to Closure warning types)."
  [form]
  (when (and (list? form)
             (= (take 2 form) '(def warning-types)))
    (let [warnings-map (nth form 2)]
      warnings-map)))

(defn closure-warning-items []
  (let [forms (read-all-ns-forms "cljs.closure" :compiler)
        warnings (first (keep parse-closure-warnings forms))]
    (map warning-item (keys warnings))))

;;------------------------------------------------------------
;; Top-level namespace parsing
;; (with custom corrections)
;;------------------------------------------------------------

(defmulti parse-ns
  (fn [ns- api]
    (if (= :custom (get-in namespaces [api ns-]))
      [ns- api]
      [:default api])))

(defmethod parse-ns ["cljs.core" :library] [ns- api]
  ;; NOTE: Concatenation order is important here
  ;; so previously defined macros/functions are overwritten
  ;; by subsequent ones.
  ;; Many compiler macros share same names as library functions.
  ;; The library functions are intended to be used over the macros.
  ;; And the imported macros from "clojure.core" should be overwritten
  ;; by cljs.core's macros.
  (let [com-parsed (parse-ns* ns- "clojurescript" :compiler-macros)
        lib-parsed (parse-ns* ns- "clojurescript" :library)
        type-names (->> lib-parsed
                        (filter #(= "type" (:type %)))
                        (map (comp str :name))
                        set)]
    (concat (parse-extra-macros-from-clj)
            com-parsed
            lib-parsed
            (get-core-type-members type-names)
            (parse-special-items ns-)
            (parse-repl-special-items ns-))))

(defmethod parse-ns ["syntax" :syntax] [ns- api]
  (let [syntaxes (binding [*cur-ns* ns-]
                   (doall (concat (parse-syntax-forms)
                                  (parse-other-syntax))))
        all (cons (pseudo-ns-item ns-) syntaxes)]
    all))

(defmethod parse-ns ["cljs.test" :library] [ns- api]
  (cond-> (parse-ns* ns- "clojurescript" :library)
    (cljs-cmp <= "0.0-3269")
    (concat (parse-ns* ns- "clojurescript" :compiler-macros))))

(defmethod parse-ns ["cljs.repl" :library] [ns- api]
  ;; the library file "repl.cljs" has (:require-macros cljs.repl)
  ;; so we must pull those in from the compiler and add in the
  ;; library functions.
  (concat
    (parse-ns* ns- "clojurescript" :compiler-macros)
    (parse-ns* ns- "clojurescript" :library)))

(defn- first-call-to
  "Get the first form that is a call to the given sym."
  [sym forms]
  (first
    (filter
      #(and (list? %) (= sym (first %)))
      forms)))

(defmethod parse-ns ["cljs.repl.nashorn" :compiler] [ns- api]
  (cond
    (cljs-cmp >= "0.0-3255")
    (let [forms (read-all-ns-forms ns- :compiler)
          ;; get nested forms inside:
          ;;   (util/compile-if (Class/forName "jdk.nashorn.api.scripting.NashornException")
          ;;     (do ... ))
          [_compile-if _class [_do & nested-forms]] (first-call-to 'util/compile-if forms)]
      (cond-> (parse-ns* ns- "clojurescript" :compiler)
        nested-forms (concat (parse-forms ns- "clojurescript" nested-forms))))

    :else
    (parse-ns* ns- "clojurescript" :compiler)))

(defmethod parse-ns ["cljs.spec.impl.gen" :library] [ns- api]
  (let [forms (read-all-ns-forms ns- :library)
        [_ & combs :as combs-form] (first-call-to 'lazy-combinators forms)
        [_ & prims :as prims-form] (first-call-to 'lazy-prims forms)]
    (binding [*cur-ns* ns-
              *cur-repo* "clojurescript"]
      (concat
        (parse-ns* ns- "clojurescript" :library)
        (doall (map #(parse-lazy-combinator combs-form %) combs))
        (doall (map #(parse-lazy-prim prims-form %) prims))))))

(defmethod parse-ns ["compiler-options" :options] [ns- api]
  (binding [*cur-ns* ns-]
    (let [options (option-items compiler-options)
          ns-item (pseudo-ns-item ns-)]
      (when (seq options)
        (doall (cons ns-item options))))))

(defmethod parse-ns ["repl-options" :options] [ns- api]
  (binding [*cur-ns* ns-]
    (let [options (option-items repl-options)
          ns-item (pseudo-ns-item ns-)]
      (when (seq options)
        (doall (cons ns-item options))))))

(defmethod parse-ns ["warnings" :options] [ns- api]
  (binding [*cur-ns* ns-]
    (let [options (warning-items)
          ns-item (sub-options-ns-item ns-)]
      (when (seq options)
        (doall (cons ns-item options))))))

(defmethod parse-ns ["closure-warnings" :options] [ns- api]
  (binding [*cur-ns* ns-]
    (let [options (closure-warning-items)
          ns-item (sub-options-ns-item ns-)]
      (when (seq options)
        (doall (cons ns-item options))))))

(defmethod parse-ns [:default :library] [ns- api]
  (parse-ns* ns- "clojurescript" :library))

(defmethod parse-ns [:default :compiler] [ns- api]
  (parse-ns* ns- "clojurescript" :compiler))

;;------------------------------------------------------------
;; Main
;;------------------------------------------------------------

(defn add-catch-finally
  "`catch` and `finally` are handled inside the `try` special form.
  We cannot parse them, so we add them manually."
  [parsed]
  (let [try-ns-name {:ns "cljs.core" :name "try"}
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
                 :ns "cljs.core"
                 :type "special form"
                 :name name-
                 :signature (get-sigs name-)))
        extras (map make ["catch" "finally"])]
    (concat parsed extras)))

(defn parse-all*
  [api]
  (->> (get namespaces api)
       (keys)
       (mapcat #(parse-ns % api))
       (doall)))

(defn parse-all
  []
  {:syntax   (parse-all* :syntax)
   :library  (add-catch-finally (parse-all* :library))
   :compiler (parse-all* :compiler)
   :options  (parse-all* :options)})
