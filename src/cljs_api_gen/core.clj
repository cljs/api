(ns cljs-api-gen.core
  (:require
    [clojure.pprint :refer [print-table]]
    [cljs-api-gen.config :refer [*output-dir*
                                 *docs-repo-dir*]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos]]
    [cljs-api-gen.catalog :refer [create-catalog!]]
    ))

;;--------------------------------------------------------------------------------
;; Usage
;;--------------------------------------------------------------------------------

;; TODO: add config for output directory
(def usage-examples
  [{:opts  {:catalog :all}    :desc "Start or resume building docs catalog for all cljs versions"}
   {:opts  {:catalog 3}       :desc "Start or resume the next 3 cljs versions"}
   {:opts  {:version "r3211"} :desc "Process and output docs for single cljs version r3211"}
   {:opts  {:version :latest} :desc "Process and output docs for latest cljs version"}])

(defn show-usage-and-exit! []
  (binding [*out* *err*]
    (println)
    (println "Usage: lein run '{}'.  For example:")
    (print-table [:opts :desc] usage-examples)
    (System/exit 1)))

;;--------------------------------------------------------------------------------
;; Runners
;;--------------------------------------------------------------------------------

(defn run-catalog!
  [n-or-all out-dir]

  (let [out-dir (or out-dir "catalog")]
    (binding [*docs-repo-dir* out-dir
              *output-dir* out-dir]
      (create-catalog! n-or-all))))

(defn run-version!
  [version out-dir]
  (binding [*output-dir* out-dir]
    (println "NOT IMPLEMENTED YET...")))

(defn main
  [{:keys [catalog version out-dir] :as options}]

  (println "\nCloning or updating repos...")
  (clone-or-fetch-repos)

  (cond
    catalog (run-catalog! catalog out-dir)
    version (run-version! version out-dir)
    :else   (show-usage-and-exit!))

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))

;;--------------------------------------------------------------------------------
;; Entry
;;--------------------------------------------------------------------------------

(defn -main
  [& args]
  (if (= 1 (count args))
    (let [option-map (read-string (first args))]
      (main option-map))
    (show-usage-and-exit!)))

