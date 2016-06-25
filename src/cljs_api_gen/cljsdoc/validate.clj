(ns cljs-api-gen.cljsdoc.validate
  (:import
    [java.util.regex Pattern])
  (:require
    [cljs-api-gen.cljsdoc.doclink :refer [docname?]]
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.read :refer [read-forms-from-str]]
    [cljs-api-gen.encode :refer [encode-fullname
                                 fullname->ns-name]]
    [cljs-api-gen.repo-cljs :refer [published-cljs-tag?
                                    published-cljs-tags
                                    cljs-version->tag]]
    [cljs-api-gen.state :refer [*result*]]

    [me.raynes.fs :refer [exists?]]
    [clojure.string :refer [split split-lines join]]
    [clansi.core :refer [style]]
    [fuzzy-matcher.core :as fuzzy]))

;;--------------------------------------------------------------------------------
;; Required Sections
;;--------------------------------------------------------------------------------

(def required-sections
  ["name"])

(defn required-section-error-msg
  "Returns error message if section name is not present in doc."
  [name- doc]
  (when-not (some #{name-} (:sections doc))
    (str "'" (name name-) "' is a required section.")))

(defn required-sections-error-msg
  "Returns error messages if required sections are not present in doc."
  [doc]
  (let [msgs (keep #(required-section-error-msg % doc) required-sections)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Recognized Sections
;;--------------------------------------------------------------------------------

(def recognized-sections
  ["name"
   "known as"
   "display"
   "type"
   "tags"
   "return type"
   "caption"
   "caption for library"
   "caption for compiler"
   "description"
   "description for library"
   "description for compiler"
   "usage"
   "signature"
   "todo"
   "notes"
   "example"
   #"^example#[a-z0-9]+$"
   "related"
   "docstring"
   "history"
   "moved"])

(defn section-match?
  [name- known]
  (if (instance? Pattern known)
    (re-find known name-)
    (= known name-)))

(defn similar-section
  [name-]
  (let [knowns (filter string? recognized-sections)
        candidates (fuzzy/search name- knowns)]
    (first candidates)))

(defn recognized-section?
  [name-]
  (some #(section-match? name- %) recognized-sections))

(defn unrecognized-section-error-msg
  [name-]
  (when-not (recognized-section? name-)
    (let [similar (similar-section name-)]
      (cond-> (str "'" name- "' is not a recognized section")
        similar (str ", did you mean '" similar "'?")))))

(defn unrecognized-sections-error-msg
  [doc]
  (let [msgs (keep unrecognized-section-error-msg (:sections doc))]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Filename
;;--------------------------------------------------------------------------------

(defn filename-error-msg
  "If filename is not valid, return error message."
  [{:keys [full-name filename parentdir] :as doc}]
  (when full-name
    (let [[ns- name-] (fullname->ns-name full-name)
          actual (cond->> filename
                     name- (str parentdir "/"))
          expected (str (encode-fullname full-name) ".cljsdoc")]
      (when (not= actual expected)
        (str full-name " should be in " expected ", not " actual)))))

;;--------------------------------------------------------------------------------
;; Validate Signature
;;--------------------------------------------------------------------------------

(defn signature-error-msg
  "If signature is not valid, return error message."
  [sig]
  (let [forms (try (read-forms-from-str sig) (catch Exception e nil))
        valid? (and (= 1 (count forms))
                    (vector? (first forms)))]
    (when-not valid?
      (str "signature " (pr-str sig) " must be a single valid vector"))))

(defn signatures-error-msg
  "If signatures are not valid, return all error messages."
  [{:keys [signature] :as doc}]
  (let [msgs (keep signature-error-msg signature)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Type
;;--------------------------------------------------------------------------------

(def valid-type?
  #{"function"
    "macro"
    "special form"
    "special form (repl)"
    "macro character"
    "syntax"
    "tagged literal"
    "var"
    "special var"
    "namespace"})

(defn type-error-msg
  "If type is not valid, return error message."
  [doc]
  (when-let [type- (:type doc)]
    (when-not (valid-type? type-)
      (str "'" type- "' is not a valid type."))))

;;--------------------------------------------------------------------------------
;; Validate Examples
;;--------------------------------------------------------------------------------

(def example-id-files
  "Track used example ids and the first file that uses them."
  (atom {}))

(defn example-hash
  "Generate a unique hash used for example-linking."
  []
  (-> (java.util.UUID/randomUUID) str (subs 0 6)))

(defn unused-example-id
  "Generate an unused (so far) example id."
  []
  (let [id (example-hash)]
    (if-not (contains? @example-id-files id) id (recur))))

(defn example-error-msg!
  [i {:keys [id] :as example} filename]
  (if (= "" id)
    (str "Example " (inc i) " has no ID. "
         "Try '" (unused-example-id) "'.")
    (if-let [used-filename (get @example-id-files id)]
      (str "Example " (inc i) " uses an ID '" id "' already used by " used-filename ". "
           "Try '" (unused-example-id) "'.")
      (do
        (swap! example-id-files assoc id filename)
        nil))))


(defn examples-error-msg!
  [{:keys [examples filename] :as doc}]
  (let [msgs (keep identity (map-indexed #(example-error-msg! %1 %2 filename) examples))]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Symbol
;;--------------------------------------------------------------------------------

(defn symbol-check-pass?
  "Determines if we should pass the symbol check."
  [full-name]
  (or (nil? *result*)               ;; ignore if no known symbols supplied
      (get-in *result* [:symbols full-name])
      (get-in *result* [:namespaces full-name])))

(defn doclink-check-pass?
  "Determines if we should pass the doclink check.
  (very similar to `symbol-check-pass?`, please see `cljs-api-gen.cljsdoc.doclink` for details)"
  [full-name]
  (or (nil? *result*)               ;; ignore if no known symbols supplied
      (docname? full-name)))

(defn symbol-unknown-error-msg
  [{:keys [full-name] :as doc}]
  (when-not (symbol-check-pass? full-name)
    (str "This file is for an unknown symbol '" full-name "'.")))

;;--------------------------------------------------------------------------------
;; Validate Related Symbol
;;--------------------------------------------------------------------------------

(defn related-missing-error-msg*
  [full-name]
  (when-not (doclink-check-pass? full-name)
    (str "Related symbol '" full-name "' is an unknown symbol.")))

(defn related-missing-error-msg
  [{:keys [related] :as doc}]
  (let [msgs (keep related-missing-error-msg* related)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Doclinks
;;--------------------------------------------------------------------------------

(defn doclink-error
  [docname]
  (when-not (doclink-check-pass? docname)
    (str "Unknown doclink reference: " docname)))

(defn doclink-missing-error-msg*
  "Gather missing doclinks from given markdown body text."
  [{:keys [body biblio]}]
  (let [msgs (keep doclink-error biblio)]
    (when (seq msgs)
      (join "\n" msgs))))

(defn doclink-missing-error-msg
  "Gather missing doclinks from markdown description and examples."
  [{:keys [description examples] :as doc}]
  (let [md-bodies (keep identity (cons description (map :content examples)))
        msgs (keep doclink-missing-error-msg* md-bodies)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate All
;;--------------------------------------------------------------------------------

(def error-detectors
  "All error detectors, each producing error messages if problem found."
  [required-sections-error-msg
   unrecognized-sections-error-msg
   signatures-error-msg
   type-error-msg
   examples-error-msg!
   symbol-unknown-error-msg
   related-missing-error-msg
   doclink-missing-error-msg
   filename-error-msg])

(defn valid-doc? [doc]
  (let [errors (seq (keep #(% doc) error-detectors))
        valid? (not errors)]
    (when-not valid?
      (binding [*out* *err*]
        (println)
        (println (style (:filename doc) :cyan))
        (println (style "  ERRORS" :red))
        (doseq [msg errors]
          (println "    " msg))))
    valid?))
