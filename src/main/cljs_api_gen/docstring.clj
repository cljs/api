(ns cljs-api-gen.docstring
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [split-lines join replace trim]]
    [cljs-api-gen.read :refer [read-forms-from-str]]))


(defn get-docstring-indent
  [docstring]
  (let [lines (split-lines docstring)]
    (if (> (count lines) 1)
      (let [[first-line & indented-lines] lines
            get-indent-length #(count (re-find #"^ *" %))
            has-content? #(pos? (count (trim %)))]
        (->> indented-lines
             (filter has-content?)
             (map get-indent-length)
             (apply min 3)))
      0)))

(defn fix-docstring
  "Remove indentation from docstring."
  [docstring]
  (when (string? docstring)
    (let [indent-length (get-docstring-indent docstring)]
      (if (zero? indent-length)
        docstring
        (let [[first-line & indented-lines] (split-lines docstring)
              indent (re-pattern (str "^ {" indent-length "}"))
              remove-indent #(replace % indent "")]
          (->> indented-lines
               (map remove-indent)
               (cons first-line)
               (join "\n")))))))

(defn try-remove-docs
  "Try to remove docstring/attr-map from source if they are on their expected lines."
  [source {:keys [start-line end-line forms] :as expected-docs}]
  (if (nil? expected-docs)
    source
    (let [i-lines (map-indexed vector (split-lines source))
          to-str #(join "\n" (map second %))
          doc-line? #(<= start-line (first %) end-line)
          doc-str (to-str (filter doc-line? i-lines))
          actual-forms (read-forms-from-str doc-str)]
      (if (= actual-forms forms)
        (to-str (remove doc-line? i-lines))
        (do
          (binding [*out* *err*]
            (println "=====================================")
            (println "Warning: couldn't remove docstring:")
            (println "expected:" (pr-str forms))
            (println "actual:" (pr-str actual-forms))
            (println "source:" (pr-str source))
            (println "====================================="))
          source)))))

(defn try-locate-docs
  "Try to guess which lines the given docs are on (for defn/defmacro)."
  [{:keys [whole head doc sig-body] :as forms}]
  (when (seq doc)
    (let [get-line #(:line (meta %))
          first-line (get-line whole)
          before-line (or (get-line (second head))
                          (get-line (first head)))
          after-line (get-line (first sig-body))]
      (when (< before-line after-line)
        {:start-line (-> before-line inc (- first-line))
         :end-line (-> after-line dec (- first-line))
         :forms doc}))))
