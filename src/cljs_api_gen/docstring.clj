(ns cljs-api-gen.docstring
  (:require
    [clojure.string :as str]
    [rewrite-clj.zip :as z]))

(defn get-docstring-indent
  [docstring]
  (let [lines (str/split-lines docstring)]
    (if (> (count lines) 1)
      (let [[first-line & indented-lines] lines
            get-indent-length #(count (re-find #"^ *" %))
            has-content? #(pos? (count (str/trim %)))]
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
        (let [[first-line & indented-lines] (str/split-lines docstring)
              indent (re-pattern (str "^ {" indent-length "}"))
              remove-indent #(str/replace % indent "")]
          (->> indented-lines
               (map remove-indent)
               (cons first-line)
               (str/join "\n")))))))

(defn try-remove-docs*
  "Try to remove docstring from source."
  [src]
  (let [src (str/trimr src)
        zloc (try
               (z/of-string src)
               (catch Exception e
                 ;; try to remove trailing paren
                 (z/of-string
                   (cond-> src
                     (= \) (last src))
                     (subs 0 (dec (count src)))))))

        zloc (z/down zloc)

        ;; rewrite utils
        z-sexpr #(when (z/sexpr-able? %) (z/sexpr %))
        z-dissoc (fn [zm k] ;; zloc of map
                   (let [zk (-> zm z/down (z/find #(= k (z-sexpr %))));; get key
                         result (-> zk z/right z/remove z/remove)] ;; remove key and following value
                     (cond-> result
                       (not (z/leftmost? zk)) z/up))) ;; return map zloc

        ;; in name meta?
        zloc (z/right zloc) ;; skip def, defn, or defmacro

        [za a-name] (let [name- (z-sexpr zloc)
                          m (meta name-)]
                      (when (:doc m)
                        [zloc (vary-meta name- dissoc :doc)]))

        ;; in docstring arg?
        zloc (z/right zloc)
        [zb b-str] (when-let [s (z-sexpr zloc)]
                      (when (string? s)
                        [zloc s]))

        ;; in attr map?
        zloc (cond-> zloc zb z/right)
        [zc c-map] (when-let [m (z-sexpr zloc)]
                     (when (and (map? m) (:doc m))
                       [zloc (dissoc m :doc)]))]

    (or (z/root-string
          (cond
            a-name (or
                     (let [zm (-> za z/down)]
                       (when (z/map? zm)
                         (let [zm (z-dissoc zm :doc)]
                           (when (seq (z-sexpr zm))
                             zm))))
                     ;; fallback to plain-printed meta
                     (z/replace za a-name))
            b-str (z/remove zb)
            c-map (if (seq c-map)
                    (z-dissoc zc :doc)
                    (z/remove zc))
            :else zloc))
        src)))

(defn try-remove-docs [src]
  (try
    (try-remove-docs* src)
    (catch Exception e
      (println "\nFAILED TO REMOVE DOCSTRING:")
      (println src)
      (println)
      (prn src)
      (println)
      src)))

