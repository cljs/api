(ns cljs-api-gen.core
  (:require
    [clansi.core :refer [style]]
    [clojure.pprint :refer [print-table]]
    [clojure.edn :as edn]
    [cljs-api-gen.cljsdoc :refer [build-cljsdoc!]]
    [cljs-api-gen.config :refer [*output-dir*
                                 default-out-dir]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos!
                                    get-latest-repo-tag
                                    get-published-cljs-tags!
                                    get-published-clj-versions!
                                    new-maven-release]]
    [cljs-api-gen.catalog :refer [create-catalog!]]
    [cljs-api-gen.clojure-api :refer [get-version-apis!]]
    [cljs-api-gen.docset :as docset]
    ))

;;--------------------------------------------------------------------------------
;; Runners
;;--------------------------------------------------------------------------------

(defn prep!
  []
  (clone-or-fetch-repos!)
  (get-published-cljs-tags!)
  (get-published-clj-versions!)
  (get-version-apis!)
  (println (style "\n DONE PREPPING " :bg-green)))

(defn main
  [{:keys [task
           out-dir
           watch?
           new-release]
    :or {out-dir default-out-dir}
    :as options}]

  (when new-release
    (reset! new-maven-release new-release))

  (prep!)

  (binding [*output-dir* out-dir]
    (case task
      :docset  (docset/create!)
      :cljsdoc (let [num-skipped (build-cljsdoc!)]
                 (when-not (zero? num-skipped)
                   (System/exit 1)))
      (create-catalog! options)))

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (when-not watch?
    (System/exit 0)))

;;--------------------------------------------------------------------------------
;; Entry
;;--------------------------------------------------------------------------------

(defn -main
  [& args]
  (main (edn/read-string (first args))))

