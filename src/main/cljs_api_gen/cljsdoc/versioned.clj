(ns cljs-api-gen.cljsdoc.versioned
  (:require
    [cljs-api-gen.repo-cljs :refer [cljs-version->num]]
    [cljs-api-gen.util :refer [mapmap]]))

(comment
;; TODO: test this

(defn versioned-docmap
  [doc]
  (let [;; get map of section-title -> content
        doc (select-keys doc (:sections doc))

        ;; raw title/content pair -> {:title - :content - :version -}
        make-info
        (fn [[full-title content]]
          (merge {:title full-title
                  :content content}
                 (when-let [[title version] (re-find #"(.+)\((.+)\)\s*$" full-title)]
                   {:title (trim title)
                    :version (trim version)})))]

    (as-> doc $

      ;; create sorted version/sections pairs
      (map make-info $)
      (group-by :version $)
      (sort-by #(cljs-version->num (first %)) $)

      ;; version/sections pairs -> version/section-map pairs
      (map (fn [[version sections]]
             (let [section-map
                   (into {}
                     (for [{:keys [title content]} sections]
                       [title content]))]
               [version section-map])) $)

      ;; create version/doc-map map
      (reduce
        (fn [{:keys [previous] :as result} [version section-map]]
          (let [new-map (merge previous section-map)]
            (assoc result
              version new-map
              :previous new-map)))
        {} $)
      (dissoc $ :previous)))))
