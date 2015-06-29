(ns cljs-api-gen.cljsdoc
  (:require
    [cljs-api-gen.config :refer [cljsdoc-dir]]
    [cljs-api-gen.encode :as encode]
    [cljs-api-gen.util :refer [sym-sort-key]]
    [cljs-api-gen.cljsdoc.transform :refer [transform-doc]]
    [cljs-api-gen.cljsdoc.validate :refer [valid-doc? *known-symbols*]]
    [cljs-api-gen.cljsdoc.parse :refer [parse-doc]]
    [me.raynes.fs :refer [list-dir base-name exists?]]
    [stencil.core :as stencil]
    [clansi.core :refer [style]]))

(def cljsdoc-map
  "Holds the result of the cljsdoc compiler."
  (atom nil))

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

(defn create-cljsdoc-stubs!
  [known-symbols]
  (doseq [full-name (sort-by sym-sort-key known-symbols)]
    (let [filename (str cljsdoc-dir "/" (encode/encode-fullname full-name) ".cljsdoc")]
      (when-not (exists? filename)
        (encode/assert-lossless full-name)
        (println "Creating new cljsdoc stub for" (style full-name :yellow) "at" (style filename :cyan))
        (spit filename
              (stencil/render-string
                (slurp "templates/stub.cljsdoc")
                {:full-name full-name}))))))

(defn build-cljsdoc!
  ([] (build-cljsdoc! nil))
  ([known-symbols]

   (println (cond-> "Compiling cljsdoc/ files"
              (nil? known-symbols) (str " (without symbol-existence check)"))
            "...")

   (let [files (cljsdoc-files cljsdoc-dir)
         mandocs (binding [*known-symbols* known-symbols]
                   (doall (keep build-doc files)))
         mandoc-map (zipmap (map :full-name mandocs)
                            (map #(dissoc % :empty-sections) mandocs))
         skipped (- (count files) (count mandocs))
         parsed (- (count files) skipped)]

     (reset! cljsdoc-map mandoc-map)

     (if (zero? skipped)
       (println (style "Done with no errors." :green))
       (println (style "\nDone with some errors." :red)))
     (println (format-status parsed skipped))

     skipped)))

