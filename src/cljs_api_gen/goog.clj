(ns cljs-api-gen.goog
  (:require
    [clojure.pprint :refer [pprint]]
    [clojure.java.shell :refer [sh]]
    [clojure.java.io :as io]
    [clojure.string :as str]))

(def goog-dir "repos/closure-library")

(defn goog-ns-class? [n]
  (not= n (str/lower-case n)))

(defn parse-goog-ns [line]
  (when-let [[_ filename type ns]
             (re-matches #"(.*):goog\.(provide|module)\('(.*)'\);" line)]
    {:filename filename
     :type type
     :ns ns
     :level (count (str/split ns #"\."))
     :class? (goog-ns-class? ns)}))

(defn table [entries keys]
  (let [sep "|"
        row #(str/join sep (map % keys))
        header (str/join sep keys)
        text (str/join "\n" (list* header (map row entries)))]
    (println (:out (sh "column" "-s" sep "-t" :in (str text "\n"))))))

(defn first-sentence [s]
  (if-let [i (str/index-of s ". ")]
    (subs s 0 (inc i))
    s))

(defn get-overview [filename]
  (with-open [reader (io/reader (str goog-dir "/" filename))]
    (let [lines (line-seq reader)
          start? #(str/includes? % "@fileoverview")
          end? #(or (str/starts-with? % " * @")
                    (#{"*/" "*" ""} (str/trim %)))
          match-lines (loop [[line & etc :as lines] lines, result []]
                        (cond
                          (not (seq lines)) result
                          (seq result) (if (end? line) result (recur etc (conj result line)))
                          :else        (recur etc (if (start? line) (conj result line) result))))
          clean-line #(-> (str/replace % #" \* " "")
                          (str/replace #"@fileoverview" "")
                          (str/trim))
          overview (->> match-lines
                        (map clean-line)
                        (str/join " ")
                        (str/trim)
                        (first-sentence))]
      overview)))

(defn find-goog-namespaces []
  (->> (sh "git" "grep" "^goog\\.\\(provide\\|module\\)('goog" "closure" :dir goog-dir)
       (:out)
       (str/split-lines) 
       (map parse-goog-ns)
       (filter #(str/ends-with? (:filename %) ".js"))         ;; only .js files
       (remove #(str/ends-with? (:filename %) "_test.js"))    ;; remove test files
       (group-by :filename)                                   ;; keep only the first occurrence in each file...
       (map (comp first val))                                 ;; ...assuming multiple namespaces are never in one file.
       (remove :class?)                                       ;; remove everything we think is a class (capitals)
       (sort-by :ns)
       (map #(assoc % :overview (get-overview (:filename %))))
       (map-indexed #(assoc %2 :i %1))))

(defn print-goog-table []
  (println "\nGoogle Closure Library - main namespaces\n")
  (table (find-goog-namespaces) [:i :ns :type :filename :overview]))
