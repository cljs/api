(ns cljs-api-gen.cljsdoc.transform
  (:refer-clojure :exclude [replace])
  (:require
    [cljs-api-gen.util :refer [mapmap]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    [cljs-api-gen.state :refer [*result*]]
    [cljs-api-gen.cljsdoc.doclink :refer [add-biblio
                                          resolve-unnamed-doclinks]]
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

(defn transform-doclinks [doc f]
  (if (nil? *result*)
    doc
    (-> doc
      (update-in [:description] f)
      (update-in [:examples] f))))

(defn transform-doc [doc]
  (-> doc
      transform-name
      (transform-key "examples" :examples)
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
      (transform-key "tags" :tags section-as-list)
      (transform-doclinks add-biblio)))

(defn post-transform-doc [doc]
  (-> doc
      (transform-doclinks resolve-unnamed-doclinks)))
