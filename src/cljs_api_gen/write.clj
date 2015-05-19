(ns cljs-api-gen.write
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.edn :as edn]
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join replace split trim]]
    [fipp.edn :refer [pprint]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version]]
    [cljs-api-gen.config :refer [*output-dir*
                                 refs-dir
                                 edn-result-file]]
    [cljs-api-gen.util :refer [symbol->filename mapmap]]
    [me.raynes.fs :refer [exists? mkdir]]
    [stencil.core :as stencil]
    ))

(defn md-escape
  [sym]
  (-> sym
      (replace "*" "\\*")))

(defn md-strikethru
  [s]
  (str "~~" s "~~"))

(defn md-header-link
  [s]
  (-> s
      (replace "." "")))

(defn shield-escape
  [s]
  (-> s
      (replace "-" "--")))

(defn make-clj-ref
  [item]
  (when-let [full-name (:clj-symbol item)]
    {:full-name full-name
     :link (let [ns- (-> full-name symbol namespace)]
             (str "http://clojure.github.io/clojure/" ns- "-api.html#" full-name))}))

(defn item-filename
  [item]
  (str *output-dir* "/" refs-dir "/" (:ns item) "_" (symbol->filename (:name item))))

(defn history-change
  [[change version]]
  (let [change ({"+" "Added", "-" "Removed"} change)]
    {:change change
     :version version}))

(defn history-change-shield
  [[change version]]
  (let [color ({"+" "lightgrey" "-" "red"} change)
        change ({"+" "+", "-" "×"} change)]
    (str 
      "<a href=\"https://github.com/cljsinfo/api-refs/tree/" version "\">"
      "<img valign=\"middle\" src=\"https://img.shields.io/badge/"
        change "-" (shield-escape version) "-" color ".svg\">"
      "</a>")))

(defn sig-args
  [text]
  (let [[_ args] (re-find #"^\[(.*)\]$" text)]
    args))

(defn source-link
  [filename item]
  (str "<ins>[" filename ":" (join "-" (:source-lines item)) "](" (:source-link item) ")</ins>"))

(defn source-path
  [item]
  ;; clojurescript/
  ;; └── src/
  ;;     └── cljs/
  ;;         └── cljs/
  ;;             └── <ins>[core.cljs:2109-2114](https://github.com/clojure/clojurescript/blob/r3211/src/cljs/cljs/core.cljs#L2109-L2114)</ins>
  (let [crumbs (split (:source-filename item) #"/")
        last-i (dec (count crumbs))
        branch "└── "
        space  "    "]
    (join "\n"
      (map-indexed
        (fn [i crumb]
          (if (zero? i)
            crumb
            (str (join (repeat (dec i) space))
                 branch
                 (if (= i last-i)
                   (source-link crumb item)
                   crumb))))
        crumbs))))

(defn ref-file-data
  [item]
  (-> item
      (assoc
        :display-name (cond-> (md-escape (:full-name item))
                        (:removed item) md-strikethru)
        :data (with-out-str (pprint item))
        :history (map history-change-shield (:history item))
        :signature (map #(hash-map :name (:name item)
                                   :args (sig-args %))
                        (:signature item))
        :source-path (source-path item)
        :clj-symbol (make-clj-ref item))
      (update-in [:docstring]
        #(if (or (nil? %) (= "" (trim %)))
           "(no docstring)"
           %))))

(defn dump-ref-file!
  [item]
  (let [filename (item-filename item)]
    (spit (str filename ".md")
      (stencil/render-string
        (slurp "templates/ref.md")
        (ref-file-data item)))))

(defn get-edn-path []
  (str *output-dir* "/" edn-result-file))

(defn get-last-written-result []
  (let [path (get-edn-path)]
    (when (exists? path)
      (edn/read-string (slurp path)))))

(defn readme-library-changes
  [result]
  ;; name-link tuples
  (let [api (:library-api result)
        changes (last (:changes api))
        symbols (:symbols api)
        make (fn [full-name change]
               (let [item (get symbols full-name)]
                 {:text (cond-> (md-escape full-name)
                          (= change :removed) md-strikethru)
                  :change ({:added "+" :removed "-"} change)
                  :type (:type item)
                  :name (:name item)
                  :ns (:ns item)
                  :link (str refs-dir "/" (:full-name-encode item) ".md")
                  }))
        added (map #(make % :added) (:added changes))
        removed (map #(make % :removed) (:removed changes))
        sort-key (fn [item] [(:ns item) (:name item)])
        all (sort-by sort-key (concat added removed))]
    all))

(defn readme-library-symbols
  [result]
  ;; clj-name-type-history tuples
  (let [all (-> result :library-api :symbols)
        make-item (fn [item]
                    {:display-name (cond-> (md-escape (:name item))
                                     (:removed item) md-strikethru)
                     :link (str refs-dir "/" (:full-name-encode item) ".md")
                     :clj-symbol (make-clj-ref item)
                     :name (:name item)
                     :type (:type item)
                     :history (map history-change-shield (:history item))})
        transform-syms #(sort-by :name (map make-item %))
        ns-symbols (->> (vals all)
                        (group-by :ns)
                        (mapmap transform-syms)
                        (map (fn [[k v]] {:ns k :ns-link (md-header-link k) :symbols v}))
                        (sort-by :ns))]
    ns-symbols))

(defn readme-file-data
  [result]
  (let [changes (readme-library-changes result)
        no-changes (if (zero? (count changes)) true nil)]
    {:changes changes
     :no-changes no-changes
     :ns-symbols (readme-library-symbols result)
     :cljs-version (-> result :release :cljs)
     :clj-version  (-> result :release :clj)
     :cljs-date  (-> result :release :cljs-date)}))

(defn dump-readme! [result]
  (spit (str *output-dir* "/README.md")
        (stencil/render-string
          (slurp "templates/readme.md")
          (readme-file-data result)
          )))

(defn dump-edn-file! [result]
  (spit (get-edn-path) (with-out-str (pprint result))))

(defn dump-result! [result]
  (mkdir *output-dir*)
  (mkdir (str *output-dir* "/" refs-dir))

  (doseq [item (vals (:symbols (:library-api result)))]
    (dump-ref-file! item))

  (dump-readme! result)
  (dump-edn-file! result))

