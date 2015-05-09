(ns cljs-api-gen.core
  (:require
    [clojure.pprint :refer [print-table]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos]]
    [cljs-api-gen.catalog :refer [create-catalog!]]
    ))

(defn main
  [{:keys [catalog version] :as options}]

  (println "\nCloning or updating repos...")
  (clone-or-fetch-repos)

  (if catalog
    (create-catalog! catalog)
    (when version
      (println "not yet implemented")))

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))

;; TODO: add config for output directory
(def usage-examples
  [{:opts  {:catalog :all}    :desc "Start or resume building docs catalog for all cljs versions"}
   {:opts  {:catalog 3}       :desc "Start or resume the next 3 cljs versions"}
   {:opts  {:version "r3211"} :desc "Process and output docs for single cljs version r3211"}
   {:opts  {:version :latest} :desc "Process and output docs for latest cljs version"}])

(defn -main [& args]
  (if (= 1 (count args))
    (main (read-string (first args)))
    (do
      (binding [*out* *err*]
        (println)
        (println "Usage: lein run '{}'.  For example:")
        (print-table [:opts :desc] usage-examples))
      (System/exit 1))))
