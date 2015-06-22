(ns cljs-api-gen.cljsdoc.core
  (:require
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.cljsdoc.transform :refer [transform-doc]]
    [cljs-api-gen.cljsdoc.validate :refer [valid-doc?]]
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [me.raynes.fs :refer [list-dir base-name]]
    [clansi.core :refer [style]]))

(defn build-doc
  [file]
  (let [filename (base-name file)
        doc (-> (parse-doc (slurp file) filename)
                transform-doc)]
    (when (valid-doc? doc)
      doc)))

(defn format-status
  [parsed skipped]
  (cond-> (str "Parsed " parsed " files")
    (pos? skipped) (str ", skipped " skipped)
    true (str ".")))

(defn cljsdoc-files [dir]
  (let [files (list-dir dir)]
    (filter #(.endsWith (.getName %) ".cljsdoc") files)))

(defn build-docs []
  (let [files (cljsdoc-files cljsdoc-dir)
        mandocs (keep build-doc files)
        mandoc-map (zipmap (map :full-name mandocs)
                           (map #(dissoc % :empty-sections) mandocs))
        skipped (- (count files) (count mandocs))
        parsed (- (count files) skipped)]

    (println "----------------------------------------------------------------")
    (println)
    (if (zero? skipped)
      (println (style "Done with no errors." :green))
      (println (style "Done with some errors." :red)))
    (println (format-status parsed skipped))

    skipped))

