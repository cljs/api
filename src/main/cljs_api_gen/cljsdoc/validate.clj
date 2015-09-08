(ns cljs-api-gen.cljsdoc.validate
  (:import
    [java.util.regex Pattern])
  (:require
    [cljs-api-gen.cljsdoc.reflink :refer [reflink-pattern
                                          named-reflink-pattern]]
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.read :refer [read-forms-from-str]]
    [cljs-api-gen.encode :refer [encode-fullname]]
    [cljs-api-gen.repo-cljs :refer [published-cljs-tag?
                                    published-cljs-tags
                                    cljs-version->tag
                                    ]]
    [me.raynes.fs :refer [exists?]]
    [clojure.string :refer [split split-lines join]]
    [clansi.core :refer [style]]
    [fuzzy-matcher.core :as fuzzy]))

(def ^:dynamic *result*
  "Parsed result containing full history API"
  nil)

(defn make-multi-version
  "Make fn to combine the messages created by the msg-fn for each doc version."
  [msg-fn]
  (fn [doc]
    (let [msgs (keep msg-fn (-> doc :docs vals))]
      (when (seq msgs)
        (join "\n" msgs)))))

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
   "description"
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
  [{:keys [full-name filename] :as doc}]
  (when full-name
    (let [expected (str (encode-fullname full-name) ".cljsdoc")]
      (when (not= filename expected)
        (str full-name " should be in a file called " expected)))))

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
        nil)
      )))

(defn examples-error-msg!
  [{:keys [examples filename] :as doc}]
  (let [msgs (keep identity (map-indexed #(example-error-msg! %1 %2 filename) examples))]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Symbol
;;--------------------------------------------------------------------------------

(defn using-latest-result? []
  (= (-> *result* :release :cljs-tag)
     (last @published-cljs-tags)))

(defn symbol-check-pass?
  "Determines if we should pass the symbol check."
  [full-name]
  (or (nil? *result*)               ;; ignore if no known symbols supplied
      (not (using-latest-result?))  ;; possible for symbols to exist later, so ignore if not latest
      (get-in *result* [:symbols full-name])))

(defn symbol-unknown-error-msg
  [{:keys [full-name] :as doc}]
  (when-not (symbol-check-pass? full-name)
    (str "This file is for an unknown symbol '" full-name "'.")))

;;--------------------------------------------------------------------------------
;; Validate Related Symbol
;;--------------------------------------------------------------------------------

(defn related-missing-error-msg*
  [full-name]
  (when-not (symbol-check-pass? full-name)
    (str "Related symbol '" full-name "' is an unknown symbol.")))

(defn related-missing-error-msg
  [{:keys [related] :as doc}]
  (let [msgs (keep related-missing-error-msg* related)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Reflinks
;;--------------------------------------------------------------------------------

(defn ref-error
  [[whole-match full-name]]
  (when-not (symbol-check-pass? full-name)
    (str "Unknown symbol reference: " full-name)))

(defn reflink-missing-error-msg*
  "Gather missing reflinks from given markdown body text."
  [md-body]
  (let [ref-links (concat (re-seq reflink-pattern md-body)
                          (re-seq named-reflink-pattern md-body))
        msgs (keep ref-error ref-links)]
    (when (seq msgs)
      (join "\n" msgs))))

(defn reflink-missing-error-msg
  "Gather missing reflinks from markdown description and examples."
  [{:keys [description examples] :as doc}]
  (let [md-bodies (keep identity (cons description (map :content examples)))
        msgs (keep reflink-missing-error-msg* md-bodies)]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate Versions
;;--------------------------------------------------------------------------------

(defn unrecognized-version-error-msg
  [version]
  (let [pass? (or (nil? version) ;; nil means apply to all versions
                  (@published-cljs-tag? (cljs-version->tag version)))]
    (when-not pass?
      (str "Version '" version "' is not a recognized published version."))))

(defn unrecognized-versions-error-msg
  [doc]
  (let [msgs (keep unrecognized-version-error-msg (keys (:docs doc)))]
    (when (seq msgs)
      (join "\n" msgs))))

;;--------------------------------------------------------------------------------
;; Validate All
;;--------------------------------------------------------------------------------

(def error-detectors
  "All error detectors, each producing error messages if problem found."
  [(make-multi-version required-sections-error-msg)
   (make-multi-version unrecognized-sections-error-msg)
   (make-multi-version signatures-error-msg)
   (make-multi-version type-error-msg)
   (make-multi-version examples-error-msg!)
   (make-multi-version symbol-unknown-error-msg)
   (make-multi-version related-missing-error-msg)
   (make-multi-version reflink-missing-error-msg)
   ;; (make-multi-version duplicate-sections-error-msg)
   filename-error-msg
   unrecognized-versions-error-msg
   ])

(def warning-detectors
  "All warning detectors, each produce warning messages if potential problem found."
  [
   ])

(defn valid-doc? [doc]
  (let [
        errors   (seq (keep #(% doc) error-detectors))
        warnings (seq (keep #(% doc) warning-detectors))
        valid? (not errors)]
    (when (or warnings errors)
      (binding [*out* *err*]
        (println)
        (println (style (:filename doc) :cyan))
        (when errors
          (println (style "  ERRORS" :red))
          (doseq [msg errors]
            (println "    " msg)))
        (when warnings
          (println (style "  WARNINGS" :yellow))
          (doseq [msg warnings]
            (println "    " msg)))
        ))
    valid?))
