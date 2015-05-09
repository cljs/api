(ns cljs-api-gen.catalog
  (:require
    [me.raynes.fs :refer [mkdir]]
    [cljs-api-gen.config :refer [docs-repo-dir
                                 *output-dir*
                                 *repo-version*
                                 history-filename
                                 docs-dir]]
    [cljs-api-gen.parse :refer [parse-all]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos
                                    get-versions-to-parse
                                    checkout-version!
                                    get-repo-version
                                    cljs-tag->version]]
    [cljs-api-gen.repo-docs :refer [prepare-docs-repo!
                                    clear-docs-repo!
                                    commit-docs-repo!
                                    verify-docs-repo-sync!]]
    [cljs-api-gen.history :refer [get-symbol-history
                                  update-history!
                                  attach-history-to-items]]
    [cljs-api-gen.write :refer [dump-api-docs!]]

    ))

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

  (prepare-docs-repo!)

  (let [[latest history] (get-symbol-history)
        [past-versions versions-left] (get-versions-to-parse latest)
        versions (if (= :all n-or-all)
                   versions-left
                   (try
                     (take n-or-all versions-left)
                     (catch Exception e
                       versions-left)))]

    (println "\nVerifying docs-repo is in sync with symbol-history...")
    (verify-docs-repo-sync! past-versions versions-left)

    (doseq [version versions]

      (println "\n=========================================================")
      (println "\nChecking out" version "...")
      (checkout-version! version)

      (binding [*output-dir* docs-repo-dir
                *repo-version* {"clojurescript" version
                                "clojure" (get-repo-version "clojure")}]
        (println "using Clojure version:" (get *repo-version* "clojure"))

        (println "\nParsing...")
        (let [parsed (parse-all)
              symbols (set (map :full-name parsed))]

          (clear-docs-repo!)

          (println "\nWriting updated history to" history-filename "...")
          (mkdir *output-dir*)
          (update-history! history version symbols)

          (println "\nWriting docs to" *output-dir*)
          (mkdir (str *output-dir* "/" docs-dir))
          (let [parsed (attach-history-to-items parsed (:version-map @history))]
            (dump-api-docs! parsed))

          (println "\nCommitting docs at tag" (cljs-tag->version version) "...")
          (commit-docs-repo!))

        (println "\nDone.")))))
