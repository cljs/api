(ns cljs-api-gen.write
  (:require
    [clojure.edn :as edn]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join split]]
    [fipp.edn :refer [pprint]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version]]
    [cljs-api-gen.config :refer [*output-dir*
                                 refs-dir
                                 edn-result-file]]
    [cljs-api-gen.util :refer [symbol->filename mapmap]]
    [me.raynes.fs :refer [exists? mkdir]]
    [stencil.core :as stencil]
    ))

(defn item-filename
  [item]
  (str *output-dir* "/" refs-dir "/" (:ns item) "_" (symbol->filename (:name item))))

(defn make-history-text
  [text]
  (let [plus-or-minus (first text)
        change (if (= \+ plus-or-minus) "Added" "Removed")
        [_ version] (split text #"\s+")]
    (str change " in " version)))

(defn cljsref-section
  [title content]
  (when (and (not (nil? content))
             (not= "" content))
    (str "===== " title "\n" content "\n")))

(defn make-cljsref
  [item]
  (join "\n"
    (keep identity
      [(cljsref-section "Name" (:full-name item))
       (cljsref-section "Type" (:type item))
       (cljsref-section "Return Type" (:return-type item))
       (cljsref-section "Clojure" (:clj-symbol item))
       (cljsref-section "Docstring" (:docstring item))
       (cljsref-section "Signature" (join "\n" (:signature item)))
       (cljsref-section "Filename" (:source-filename item))
       (cljsref-section "Source" (:source item))
       (cljsref-section "Github" (:source-link item))
       (cljsref-section "History" (join "\n" (map make-history-text (:history item))))
       (cljsref-section "EDN" (with-out-str (pprint item)))
       ""])))

(defn dump-ref-file!
  [item]
  (let [filename (item-filename item)]
    (spit (str filename ".cljsref") (make-cljsref item))))

(defn dump-clj-not-cljs-file!
  [clj-not-cljs]
  (let [content (->> clj-not-cljs
                     (group-by #(namespace (symbol %)))
                     (mapmap #(join "\n" (sort %)))
                     (sort-by first)
                     (map second)
                     (join "\n\n"))
        outfile (str *output-dir* "/not-in-cljs")]
    (spit outfile content)))

(defn get-edn-path []
  (str *output-dir* "/" edn-result-file))

(defn get-last-written-result []
  (let [path (get-edn-path)]
    (when (exists? path)
      (edn/read-string (slurp path)))))

(defn dump-readme! [result]
  (spit (str *output-dir* "/README.md")
        (stencil/render-string (slurp "readme-template.md")
          {:cljs-version (-> result :release :cljs)
           :clj-version  (-> result :release :clj)
           :cljs-date  (-> result :release :cljs-date)})))

(defn dump-edn-file! [result]
  (spit (get-edn-path) (with-out-str (pprint result))))

(defn dump-result! [result]
  (mkdir *output-dir*)
  (mkdir (str *output-dir* "/" refs-dir))

  (doseq [item (vals (:symbols (:library-api result)))]
    (dump-ref-file! item))

  (dump-readme! result)
  (dump-clj-not-cljs-file! (:clj-not-cljs result))
  (dump-edn-file! result))

