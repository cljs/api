(ns cljs-api-gen.cljsdoc.transform
  (:refer-clojure :exclude [replace])
  (:require
    [cljs-api-gen.util :refer [mapmap]]
    [cljs-api-gen.encode :refer [fullname->ns-name]]
    [cljs-api-gen.state :refer [*result*]]
    [cljs-api-gen.cljsdoc.doclink :refer [md-biblio
                                          resolve-unnamed-doclinks]]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [split-lines trim lower-case replace join]]))

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

(def markdown-sections
  [:summary
   :summary-compiler
   :details
   :details-compiler
   :examples])

(defn add-doclink-biblio [doc]
  (if (nil? *result*)
    doc
    (let [md (join "\n" (vals (select-keys doc markdown-sections)))
          biblio (md-biblio md)]
      (cond-> doc
        (seq biblio) (assoc :md-biblio biblio)))))

(defn add-doclink-names [doc]
  (reduce
    (fn [doc section]
      (update doc section resolve-unnamed-doclinks))
    doc
    markdown-sections))

(defn transform-doc [doc]
  (-> doc
      (transform-key "name" :full-name)
      (transform-key "examples" :examples)
      (transform-key "known as" :known-as)
      (transform-key "display" :display)
      (transform-key "summary" :summary)
      (transform-key "summary for compiler" :summary-compiler)
      (transform-key "details" :details)
      (transform-key "details for compiler" :details-compiler)
      (transform-key "signature" :signature section-as-list)
      (transform-key "usage" :usage section-as-list)
      (transform-key "see also" :see-also section-as-list)
      (transform-key "moved" :moved)
      (transform-key "tags" :tags section-as-list)
      add-doclink-biblio))

(defn post-transform-doc [doc]
  (-> doc
      add-doclink-names))
