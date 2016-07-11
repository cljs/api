(ns cljs-api-gen.docfile.parse
  (:require
    [clojure.set :refer [difference]]
    [clojure.string :refer [split-lines join lower-case trim]]
    [frontmatter.core :as fm]))

(def section-start "## ")

(defn section-line? [line]
  (.startsWith line section-start))

(defn format-title [title]
  (-> title (subs (count section-start)) lower-case trim))

(defn format-section
  "Given title lines and body lines, create a formatted title and body pair.
  (If there was no empty line between this title and the last, they will be grouped.)"
  [[title-lines body-lines]]
  (let [title (-> title-lines last format-title) ;; ignore all but last title
        body (trim (join "\n" body-lines))]
    [title body]))

(defn frontmatter-to-section [[key val]]
  (str section-start (name key) "\n"
    (if (sequential? val)
      (join "\n" val)
      val)))

(defn expand-front-matter
  "Front matter helps make our docs more readable on github since they format
   it into a nice table.
   For parsing convenience, we parse it by expanding it to the format we used
   prior to using front matter (i.e. markdown sections with headers)."
  [file]
  (let [{:keys [frontmatter body]} (fm/parse file)
        preamble (->> frontmatter
                      (map frontmatter-to-section)
                      (join "\n"))]
    (str preamble "\n" body)))

(defn parse-doc
  "Convert docfile content to a map of section title => section body text."
  [file filename parentdir]
  (let [lines (split-lines (expand-front-matter file))

        ;; parse content as a list of section title/body pairs
        pairs (->> lines
                   (partition-by section-line?)
                   (drop-while (comp not section-line? first)) ;; ignore lines preceding first section
                   (partition 2) ;; create title/body lines pairs
                   (map format-section)
                   (remove #(= (second %) ""))) ;; remove empty sections

        ;; get titles in order
        titles (map first pairs)

        ;; get the set of empty sections
        all-titles (->> lines
                        (filter section-line?)
                        (map format-title)
                        (apply hash-set))
        empty-titles (->> (apply hash-set titles)
                          (difference all-titles))

        ;; final structure
        result (-> (into {} pairs)
                   (assoc :filename filename
                          :parentdir parentdir
                          :sections titles
                          :empty-sections empty-titles))]
    result))
