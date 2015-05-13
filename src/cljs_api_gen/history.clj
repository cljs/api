(ns cljs-api-gen.history
  (:require
    [me.raynes.fs :refer [mkdir exists?]]
    [clojure.data :refer [diff]]
    [clojure.string :refer [split split-lines join]]
    [cljs-api-gen.config :refer [history-filename
                                 *output-dir*
                                 *docs-repo-dir*
                                 changes-filename]]
    [cljs-api-gen.repo-docs :as docs-repo]
    [cljs-api-gen.repo-cljs :refer [*cljs-tag*]]
    ))

(def ^:dynamic *history*)

(defmacro with-history
  [history-atom & body]
  `(binding [*history* ~history-atom]
     ~@body))

(defn initial-symbol-history
  "Build initial history from the readable output files."
  []
  ;; TODO: when autodocs.edn has this information, replace this file-reading
  ;; and parsing ceremony with just a (read-string "autodocs.edn")
  (let [history (atom {:symbols #{}     ;; symbols present in this version
                       :version-map {}  ;; map all symbols => version history
                       :changes ""      ;; file contents of the changes file
                       })
        repo-history-filename (str *docs-repo-dir* "/" history-filename)
        repo-changes-filename (str *docs-repo-dir* "/" changes-filename)]

    (when (exists? repo-changes-filename)
      (swap! history assoc :changes (slurp repo-changes-filename)))

    (if-not (exists? repo-history-filename)
      [nil history]
      (let [latest (docs-repo/docs-tag->cljs (docs-repo/get-current-tag))
            lines (split-lines (slurp repo-history-filename))]
        (doseq [line lines]
          (let [[name- & versions] (split line #"\s+")]
            (swap! history assoc-in [:version-map name-] (vec versions))
            (let [c (first (last versions))]
              (when (= \+ c)
                (swap! history update-in [:symbols] conj name-)))))
        [latest history]))))

(defn make-history-line
  [name- versions pad]
  (let [name- (format (str "%-" pad "s") name-)]
    (join " " (concat [name-] versions))))

(defn make-history-lines
  [version-map]
  (let [names (keys version-map)
        pad (->> names (map count) (apply max) (+ 2))]
    (for [[name- versions] (sort-by first version-map)]
      (make-history-line name- versions pad))))

(defn write-history!
  [version-map]
  (let [table (join "\n" (make-history-lines version-map))]
    (spit (str *docs-repo-dir* "/" history-filename) table)))

(defn mark-symbol-added!
  [s]
  (let [v-change (str "+" *cljs-tag*)]
    (if-not (contains? (:version-map @*history*) s)
      (swap! *history* assoc-in [:version-map s] [v-change])
      (when-not (first (filter #(= % v-change) (get-in @*history* [:version-map s])))
        (swap! *history* update-in [:version-map s] conj v-change)))))

(defn mark-symbol-removed!
  [s]
  (let [v-change (str "-" *cljs-tag*)]
    (swap! *history* update-in [:version-map s] conj v-change)))

(defn write-changes!
  [added removed]
  (let [current (:changes @*history*)
        changed-lines (->> (concat (map #(vector "+" %) added)
                                   (map #(vector "-" %) removed))
                           (sort-by second)
                           (map (fn [[a b]] (str "  " a " " b))))
        version-changes (join "\n" (cons *cljs-tag* changed-lines))
        content (str version-changes "\n\n" current)]
    (spit (str *output-dir* "/" changes-filename) content)
    (swap! *history* assoc :changes content)))

(defn update-history!
  [symbols]
  (let [[added removed _] (diff symbols (:symbols @*history*))]
    (doseq [s added]
      (mark-symbol-added! s))
    (doseq [s removed]
      (mark-symbol-removed! s))
    (swap! *history* assoc :symbols symbols)
    (write-changes! added removed)
    (write-history! (:version-map @*history*))))

(defn attach-history
  [item]
  (let [name- (:full-name item)
        history (get-in @*history* [:version-map name-])]
    (assoc item :history history)))

(defn attach-history-to-items
  [items]
  (map attach-history items))

