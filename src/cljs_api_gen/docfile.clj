(ns cljs-api-gen.docfile
  (:require
    [cljs-api-gen.config :refer [docfile-dir docfile-ext]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.docfile.validate :refer [valid-doc?]]
    [cljs-api-gen.docfile.parse :refer [parse-doc]]
    [cljs-api-gen.docfile.transform :refer [transform-doc post-transform-doc]]
    [cljs-api-gen.docfile.lint :refer [normalize-doc]]
    [cljs-api-gen.state :refer [*result* docfile-map]]
    [cljs-api-gen.util :refer [mapmap]]
    [me.raynes.fs :refer [mkdir list-dir base-name exists? parent directory?]]
    [clansi.core :refer [style]]
    [clojure.string :as string]))

(defn build-doc
  [file]
  (let [filename (base-name file)
        parentdir (base-name (parent file))
        doc (transform-doc (parse-doc file filename parentdir))]
    (when (valid-doc? doc)
      doc)))

(defn format-status
  [parsed skipped]
  (cond-> (str "Parsed " parsed " files")
    (pos? skipped) (str ", skipped " skipped)
    true (str ".")))

(defn docfiles [dir]
  (let [all (list-dir dir)
        files (->> all
                (remove directory?)
                (filter #(.endsWith (.getName %) docfile-ext)))
        subfiles (->> all
                      (filter directory?)
                      (map docfiles)
                      (apply concat))]
    (cond-> files
      (seq subfiles) (concat subfiles))))

(defn docfile-stub [full-name]
  (normalize-doc {:full-name full-name}))

(defn create-docfile-stubs!
  [known-symbols]
  (doseq [full-name (sort known-symbols)]
    (let [filename (str docfile-dir "/" (encode/encode-fullname full-name) docfile-ext)]
      (when-not (exists? filename)
        (encode/assert-lossless full-name)
        (mkdir (parent filename))
        (println "Creating new docfile stub for" (style full-name :yellow) "at" (style filename :cyan))
        (spit filename (docfile-stub full-name))))))

(defn build-docfiles! []
  (println (cond-> (style (str "\nCompiling " docfile-dir "/ files") :cyan)
             (nil? *result*) (str " (without parsed API info)"))
           "...")

  (let [files (docfiles docfile-dir)
        mandocs (keep build-doc files)
        mandoc-map (zipmap (map :full-name mandocs)
                           (map #(dissoc % :empty-sections) mandocs))
        skipped (- (count files) (count mandocs))
        parsed (- (count files) skipped)]

    (reset! docfile-map mandoc-map)
    (when *result*
      (reset! docfile-map (mapmap post-transform-doc @docfile-map)))

    (if (zero? skipped)
      (println (style "Done with no errors." :green))
      (println (style "\nDone with some errors." :red)))
    (println (format-status parsed skipped))

    skipped))

(defn lint-docfiles! []
  (println (style (str "\nLinting " docfile-dir "/ files") :cyan))
  (doseq [file (docfiles docfile-dir)]
    (spit file (normalize-doc (build-doc file)))))
