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

(defn transform-key
  ([doc key- new-key] (transform-key doc key- new-key identity))
  ([doc key- new-key process]
   (if-let [value (get doc key-)]
     (-> doc
         (assoc new-key (process value))
         (dissoc key-))
     doc)))

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

(defn make-example
  [name- doc]
  {:id (replace name- #"example#?" "")
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

(defn transform-doc [doc]
  (-> doc
      transform-name
      transform-examples
      (transform-key "known as" :known-as)
      (transform-key "display" :display)
      (transform-key "caption" :caption)
      (transform-key "caption for library" :caption-library)
      (transform-key "caption for compiler" :caption-compiler)
      (transform-key "description" :description)
      (transform-key "description for library" :description-library)
      (transform-key "description for compiler" :description-compiler)
      (transform-key "signature" :signature section-as-list)
      (transform-key "usage" :usage section-as-list)
      (transform-key "type" :type lower-case)
      (transform-key "related" :related section-as-list)
      (transform-key "moved" :moved)
      (transform-key "tags" :tags section-as-list)))

(defn transform-versioned-doc [doc]
  (let [docs (mapmap transform-doc (:docs doc))
        {:keys [ns name full-name]} (get docs nil)]
    (assoc doc
      :docs docs
      :ns ns
      :name name
      :full-name full-name)))

