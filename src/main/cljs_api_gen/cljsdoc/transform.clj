(ns cljs-api-gen.cljsdoc.transform
  (:refer-clojure :exclude [replace])
  (:require
    [cljs-api-gen.util :refer [mapmap]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [split-lines trim lower-case replace]]))

(defn section-as-list
  "Turn section body text into non-empty trimmed lines vector"
  [body-text]
  (->> (split-lines body-text)
       (map trim)
       (remove #{""})
       vec))

(defn transform-name [doc]
  (if-let [body (get doc "name")]
    (let [[full-name & search-terms] (section-as-list body)
          [ns- name-] (fullname->ns-name full-name)]
      (-> doc
          (assoc :ns ns-
                 :name name-
                 :full-name full-name
                 :search-terms (vec search-terms))
          (dissoc "name")))
    doc))

(defn transform-known-as [doc]
  (if-let [known-as (get doc "known as")]
    (-> doc
        (assoc :known-as known-as)
        (dissoc "known-as"))
    doc))

(defn transform-display [doc]
  (if-let [display (get doc "display")]
    (-> doc
        (assoc :display display)
        (dissoc "display"))
    doc))

(defn transform-description [doc]
  (if-let [desc (get doc "description")]
    (-> doc
        ;; TODO: markdown process desc
        (assoc :description desc)
        (dissoc "description"))
    doc))

(defn transform-signature [doc]
  (if-let [sig (get doc "signature")]
    (-> doc
        (assoc :signature (section-as-list sig))
        (dissoc "signature"))
    doc))

(defn transform-usage [doc]
  (if-let [sig (get doc "usage")]
    (-> doc
        (assoc :usage (section-as-list sig))
        (dissoc "usage"))
    doc))

(defn transform-type [doc]
  (if-let [type- (get doc "type")]
    (-> doc
        (assoc :type (lower-case type-))
        (dissoc "type"))
    doc))

(defn make-example
  [name- doc]
  {:id (replace name- #"example#?" "")
   ;; TODO: markdown process content
   :content (get doc name-)})

(defn transform-examples [doc]
  (let [example? #(re-find #"^example(#[a-z0-9]+)?$" %)
        example-names (filter example? (:sections doc))
        examples (mapv #(make-example % doc) example-names)]
    (if (seq examples)
      (as-> doc d
        (assoc d :examples examples)
        (apply dissoc d example-names))
      doc)))

(defn transform-related [doc]
  (if-let [related (get doc "related")]
    (-> doc
        (assoc :related (section-as-list related))
        (dissoc "related"))
    doc))

(defn transform-moved [doc]
  (if-let [moved (get doc "moved")]
    (-> doc
        (assoc :moved moved)
        (dissoc "moved"))
    doc))

(defn transform-tags [doc]
  (if-let [tags (get doc "tags")]
    (-> doc
        (assoc :tags (set (section-as-list tags)))
        (dissoc "tags"))
    doc))

(defn transform-doc [doc]
  (-> doc
      transform-name
      transform-known-as
      transform-display
      transform-description
      transform-signature
      transform-usage
      transform-type
      transform-examples
      transform-related
      transform-moved
      transform-tags))

(defn transform-versioned-doc [doc]
  (let [docs (mapmap transform-doc (:docs doc))
        {:keys [ns name full-name]} (get docs nil)]
    (assoc doc
      :docs docs
      :ns ns
      :name name
      :full-name full-name)))

