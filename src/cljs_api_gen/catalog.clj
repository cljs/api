(ns cljs-api-gen.catalog
  (:require
    [clansi.core :refer [style]]
    [me.raynes.fs :refer [mkdir]]
    [clojure.string :refer [join]]
    [cljs-api-gen.config :refer [*output-dir*
                                 *docs-repo-dir*
                                 history-filename
                                 docs-dir]]
    [cljs-api-gen.parse :refer [parse-all]]
    [cljs-api-gen.repo-cljs :refer [get-cljs-tags-to-parse
                                    with-checkout!
                                    cljs-tag->version
                                    *cljs-tag*
                                    *clj-tag*
                                    *cljs-version*]]
    [cljs-api-gen.repo-docs :as docs-repo]
    [cljs-api-gen.history :refer [initial-symbol-history
                                  with-history
                                  update-history!
                                  attach-history-to-items]]
    [cljs-api-gen.result :refer [get-result]]
    [cljs-api-gen.write :refer [dump-result!]]
    [cljs-api-gen.clojure-api :refer [attach-clj-symbol-to-items
                                      get-clojure-symbols-not-in-items]]
    ))

(defn print-summary
  [parsed]
  (let [ns-groups (group-by :ns parsed)
        pairs (sort-by first ns-groups)]
    (doseq [[ns- symbols] pairs]
      (println "   " ns- ": parsed" (count symbols) "symbols"))))

(defn create-catalog!
  "Create a docs catalog repo, or resume progress from its previous state.

  The docs catalog repo has one commit per cljs version, with each commit containing:
    - doc files for that version
    - current history information for each symbol
    - a git tag with that version

  The argument `n-or-all` is either:
    - keyword `:all` to catalog whatever versions are remaining
    - number `n` of the next remaining versions to catalog before stopping.
  "
  [n-or-all]

  (println "Creating or using catalog repo at"
           (str "'" (style *docs-repo-dir* :cyan) "'"))

  (docs-repo/init!)

  (let [prev-result (atom nil) ;; TODO: set prev-result from autodocs.edn if exists
        latest-tag nil ;; TODO: set latest-tag to current catalog repo tag if exists
        ]
    (doseq [tag (get-cljs-tags-to-parse latest-tag n-or-all)]
      (with-checkout! tag

        (println "\n=========================================================")
        (println "\nChecked out ClojureScript " (style *cljs-tag* :yellow))
        (println "with Clojure:" (style *clj-tag* :yellow))

        (println "\nParsing...")
        (let [parsed (parse-all)
              symbols (set (map :full-name parsed))]

          (print-summary parsed)

          (docs-repo/clear!)

          (println "\nWriting docs to" (style *output-dir* :cyan))
          (mkdir *output-dir*)
          (mkdir (str *output-dir* "/" docs-dir))

          (let [result (get-result parsed @prev-result)]
            (dump-result! result)
            (reset! prev-result result))

          (println "\nCommitting docs at tag" *cljs-version* "...")
          (docs-repo/commit!))

        (println "\nDone.")))

    (println (style "Success!" :green))))

(defn create-single-version!
  [tag]

  (with-checkout! tag

    (println "\n=========================================================")
    (println "\nChecked out ClojureScript " (style *cljs-tag* :yellow))
    (println "with Clojure:" (style *clj-tag* :yellow))

    (println "\nParsing...")
    (let [parsed (parse-all)]

      (print-summary parsed)

      (println "\nWriting docs to" (style *output-dir* :cyan))
      (mkdir *output-dir*)
      (mkdir (str *output-dir* "/" docs-dir))

      (let [result (get-result parsed)]
        (dump-result! result)))

    (println (style "Success!" :green))))
