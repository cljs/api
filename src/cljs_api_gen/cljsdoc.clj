(ns cljs-api-gen.cljsdoc
  (:require
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.display :refer [sort-symbols]]
    [cljs-api-gen.cljsdoc.validate :refer [valid-doc?]]
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [cljs-api-gen.cljsdoc.transform :refer [transform-doc post-transform-doc]]
    [cljs-api-gen.state :refer [*result* cljsdoc-map]]
    [cljs-api-gen.util :refer [mapmap]]
    [me.raynes.fs :refer [mkdir list-dir base-name exists? parent directory?]]
    [stencil.core :as stencil]
    [clansi.core :refer [style]]))

(defn build-doc
  [file]
  (let [filename (base-name file)
        parentdir (base-name (parent file))
        doc (-> (slurp file)
                (parse-doc filename parentdir)
                (transform-doc))]
    (when (valid-doc? doc)
      doc)))

(defn format-status
  [parsed skipped]
  (cond-> (str "Parsed " parsed " files")
    (pos? skipped) (str ", skipped " skipped)
    true (str ".")))

(defn cljsdoc-files [dir]
  (let [all (list-dir dir)
        files (->> all
                (remove directory?)
                (filter #(.endsWith (.getName %) ".cljsdoc")))
        subfiles (->> all
                      (filter directory?)
                      (map cljsdoc-files)
                      (apply concat))]
    (cond-> files
      (seq subfiles) (concat subfiles))))

(defn create-cljsdoc-stubs!
  [known-symbols]
  (doseq [full-name (sort-symbols known-symbols)]
    (let [filename (str cljsdoc-dir "/" (encode/encode-fullname full-name) ".cljsdoc")]
      (when-not (exists? filename)
        (encode/assert-lossless full-name)
        (mkdir (parent filename))
        (println "Creating new cljsdoc stub for" (style full-name :yellow) "at" (style filename :cyan))
        (spit filename (str "===== Name\n" full-name))))))

(defn build-cljsdoc! []
  (println (cond-> (style "\nCompiling cljsdoc/ files" :cyan)
             (nil? *result*) (str " (without parsed API info)"))
           "...")

  (let [files (cljsdoc-files cljsdoc-dir)
        mandocs (keep build-doc files)
        mandoc-map (zipmap (map :full-name mandocs)
                           (map #(dissoc % :empty-sections) mandocs))
        skipped (- (count files) (count mandocs))
        parsed (- (count files) skipped)]

    (reset! cljsdoc-map mandoc-map)
    (reset! cljsdoc-map (mapmap post-transform-doc @cljsdoc-map))

    (if (zero? skipped)
      (println (style "Done with no errors." :green))
      (println (style "\nDone with some errors." :red)))
    (println (format-status parsed skipped))

    skipped))
