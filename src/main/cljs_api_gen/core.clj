(ns cljs-api-gen.core
  (:require
    [clojure.pprint :refer [print-table]]
    [clojure.edn :as edn]
    [cljs-api-gen.config :refer [*output-dir*
                                 default-out-dir]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos!
                                    get-latest-repo-tag
                                    get-published-cljs-tags!
                                    get-published-clj-versions!]]
    [cljs-api-gen.catalog :refer [create-catalog!]]
    [cljs-api-gen.clojure-api :refer [get-version-apis!]]
    [cljs-api-gen.docset :as docset]
    [cljs-api-gen.cljsdoc :refer [build-cljsdoc!]]
    ))

;;--------------------------------------------------------------------------------
;; Runners
;;--------------------------------------------------------------------------------

(defn run-cljsdoc!
  []
  (let [num-skipped (build-cljsdoc!)]
    (when-not (zero? num-skipped)
      (System/exit 1))))

(defn prep!
  []
  (println "\nCloning or updating repos...")
  (clone-or-fetch-repos!)

  (println)
  (run-cljsdoc!)

  (println)
  (get-published-cljs-tags!)
  (get-published-clj-versions!)

  (println)
  (get-version-apis!))

(defn main
  [{:keys [task
           out-dir]
    :or {out-dir default-out-dir}
    :as options}]

  (binding [*output-dir* out-dir]
    (case task
      :docset  (docset/create!)
      :cljsdoc (run-cljsdoc!)
      (do
        (prep!)
        (run-catalog! options))))

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))

;;--------------------------------------------------------------------------------
;; Entry
;;--------------------------------------------------------------------------------

(defn -main
  [& args]
  (main (edn/read-string (first args))))

