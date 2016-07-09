(ns cljs.process
  (:require
    [planck.shell :refer [sh]]
    [planck.core :refer [slurp spit]]
    [clojure.string :as string]))

(defn files []
  (string/split-lines (slurp "files")))

(defn process-file [filename]
  (println "processing" filename)
  (spit (str filename ".bak") (slurp filename))
  (spit filename
    (string/join "\n"
      (reduce
        (fn [lines line]
          (if (or (= (last lines) "## Name")
                  (= (last lines) "## Display"))
            (conj lines (str "`" line "`"))
            (conj lines line)))
        []
        (string/split-lines (slurp filename))))))

(doseq [f (files)]
  (process-file f))
