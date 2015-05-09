(ns cljs-api-gen.history
  (:require
    [me.raynes.fs :refer [mkdir exists?]]
    [clojure.data :refer [diff]]
    [clojure.string :refer [split split-lines join]]
    [cljs-api-gen.config :refer [history-filename
                                 *output-dir*
                                 changes-filename]]
    ))

(defn get-symbol-history
  []
  (let [history (atom {:symbols #{} :version-map {}})]
    (if-not (exists? history-filename)
      [nil history]
      (let [[latest & lines] (split-lines (slurp history-filename))]
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
  [version-map latest]
  (let [table (join "\n" (make-history-lines version-map))
        version-and-table (str latest "\n" table)]
    (spit (str *output-dir* "/" history-filename) table)
    (spit history-filename version-and-table)))

(defn mark-symbol-added!
  [history version s]
  (let [v-change (str "+" version)]
    (if-not (contains? (:version-map @history) s)
      (swap! history assoc-in [:version-map s] [v-change])
      (when-not (first (filter #(= % v-change) (get-in @history [:version-map s])))
        (swap! history update-in [:version-map s] conj v-change)))))

(defn mark-symbol-removed!
  [history version s]
  (let [v-change (str "-" version)]
    (swap! history update-in [:version-map s] conj v-change)))

(defn write-changes!
  [added removed version]
  (let [current (if (exists? changes-filename) (slurp changes-filename) "")
        changed-lines (->> (concat (map #(vector "+" %) added)
                                   (map #(vector "-" %) removed))
                           (sort-by second)
                           (map (fn [[a b]] (str "  " a " " b))))
        version-changes (join "\n" (cons version changed-lines))
        content (str version-changes "\n\n" current)]
    (spit changes-filename content)
    (spit (str *output-dir* "/" changes-filename) content)))

(defn update-history!
  [history version symbols]
  (let [[added removed _] (diff symbols (:symbols @history))]
    (doseq [s added]
      (mark-symbol-added! history version s))
    (doseq [s removed]
      (mark-symbol-removed! history version s))
    (swap! history assoc :symbols symbols)
    (write-changes! added removed version)
    (write-history! (:version-map @history) version)))

(defn attach-history
  [item version-map]
  (let [name- (:full-name item)
        history (get version-map name-)]
    (assoc item :history history)))

(defn attach-history-to-items
  [items version-map]
  (map #(attach-history % version-map) items))

