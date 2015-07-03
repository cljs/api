(ns cljs-api-gen.cljsdoc.versioned
  (:require
    [clojure.string :refer [trim]]
    [cljs-api-gen.repo-cljs :refer [cljs-version->num]]
    [cljs-api-gen.util :refer [mapmap]]))

;; NOTE: invalid versions will pass here just fine
;; but we should verify the versions exist, later in the validator.

(defn versioned-doc
  "Adds a version map for the parsed doc, created by `cljs-api-gen.cljsdoc.parse/parse-doc`,
  allowing sections to inherit/overwrite those in previous versions."
  [doc]
  (as-> nil $ ;; first result created by first expression

    ;;;; Add more metadata to the ordered section list.
    ;;;; Need to preserve order of appearance and
    ;;;; strip out the versions from titles.
    ;;
    ;; SECTION = {:order :title :content}
    ;;
    ;; RESULT = [SECTION]
    ;;
    (map-indexed
      (fn [i full-title]
        (merge {:order i
                :title full-title
                :content (get doc full-title)}
               (when-let [[_ title version] (re-find #"(.+)\((.+)\)\s*$" full-title)]
                 {:title (trim title)
                  :version (trim version)})))
      (:sections doc))

    ;;;; Group by version and sort by version.
    ;;;; Nil versions stand for all versions, and come first.
    ;;
    ;; RESULT = [[version, [SECTION]] ...]
    ;;
    (group-by :version $)
    (sort-by #(cljs-version->num (first %)) $)

    ;;;; Convert section lists to section maps.
    ;;;; Duplicate keys overwritten in favor of those appearing last.
    ;;
    ;; SECTION-MAP = {<title> SECTION, ...}
    ;;
    ;; RESULT = [[version, SECTION-MAP] ...]
    ;;
    (map (fn [[version sections]]
           (let [section-map
                 (into {}
                       (for [s sections]
                         [(:title s) s]))]
             [version section-map])) $)

    ;;;; Create version maps which keep or overwrite sections
    ;;;; from the previous versions.
    ;;
    ;; RESULT = {<version> {<title> SECTION,
    ;;                      ...,
    ;;                      :sections [<title> ...]}
    ;;           ...
    ;;           :previous <prev-version-data>} ;; removed afterwards
    (reduce
      (fn [{:keys [previous] :as result} [version section-map]]
        (let [new-map (merge previous section-map)
              titles (->> (vals new-map)
                          (filter map?)
                          (sort-by :order)
                          (map :title))
              new-map (assoc new-map :sections titles)]
          (assoc result
                 version new-map
                 :previous new-map)))
      {} $)
    (dissoc $ :previous)

    ;;;; Remove meta data from the sections.
    ;;
    ;; RESULT = {<version> {<title> <section content string>
    ;;                      ...,
    ;;                      :sections [<title> ...]}
    ;;           ...}
    (mapmap
      (fn [doc]
        (mapmap #(cond-> % (map? %) :content) doc)) $)

    ;;;; Add version map to final doc structure.
    ;;
    ;; RESULT = {:docs LAST-RESULT
    ;;           :versions [<version> ...] ;; sorted versions present in :docs
    ;;
    ;;           ;; original data created from parse-doc
    ;;           :filename "<filename>"
    ;;           :sections [<title> ...]
    ;;           :empty-sections #{<title> ...}}
    ;;
    (assoc
      (select-keys doc (filter keyword? (keys doc)))
      :docs $
      :versions (sort-by cljs-version->num (keys $)))))

