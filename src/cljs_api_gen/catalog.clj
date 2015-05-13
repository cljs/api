(ns cljs-api-gen.catalog
  (:require
    [clansi.core :refer [style]]
    [me.raynes.fs :refer [mkdir]]
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
    [cljs-api-gen.write :refer [dump-api-docs!]]

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

  (let [[latest-tag history] (initial-symbol-history)]
    (with-history history
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

            (println "\nWriting updated history to" history-filename "...")
            (mkdir *output-dir*)
            (update-history! symbols)

            (println "\nWriting docs to" (style *output-dir* :cyan))
            (mkdir (str *output-dir* "/" docs-dir))
            (-> parsed
                attach-history-to-items
                dump-api-docs!)

            (println "\nCommitting docs at tag" *cljs-version* "...")
            (docs-repo/commit!))

          (println "\nDone.")))

      (println (style "Success!" :green)))))

(defn create-single-version!
  [tag]

  (with-checkout! tag

    (println "\n=========================================================")
    (println "\nChecked out ClojureScript " (style *cljs-tag* :yellow))
    (println "with Clojure:" (style *clj-tag* :yellow))

    (println "\nParsing...")
    (let [parsed (parse-all)]

      (print-summary parsed)

      (mkdir *output-dir*)

      (println "\nWriting docs to" (style *output-dir* :cyan))
      (mkdir (str *output-dir* "/" docs-dir))
      (dump-api-docs! parsed))

    (println (style "Success!" :green))))
