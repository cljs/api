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
  [source docstring-location]
  (case docstring-location
    :in-string source
    :in-name-meta source
    :in-attr-map source
    nil source))


(comment
  (require '[rewrite-clj.zip :as z])
  (require '[rewrite-clj.parser :as p])
  (def src "(defn ^number sinh\n  {:doc \"Returns the hyperbolic sine of x, (e^x - e^-x)/2.\n  If x is ##NaN => ##NaN\n  If x is ##Inf or ##-Inf or zero => x\n  See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sinh\"\n   :added \"1.11.10\"}\n  [x] (Math/sinh x))")
  (println src)
  ;  (defn ^number sinh
  ;    {:doc "Returns the hyperbolic sine of x, (e^x - e^-x)/2.
  ;    If x is ##NaN => ##NaN
  ;    If x is ##Inf or ##-Inf or zero => x
  ;    See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/sinh"
  ;     :added "1.11.10"}
  ;    [x] (Math/sinh x))
  (def zloc (z/of-string src))
  (println (-> zloc z/down z/right z/tag))
  (println (z/root-string zloc)))
