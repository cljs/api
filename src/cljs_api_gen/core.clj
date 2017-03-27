(ns cljs-api-gen.core
  (:require
    [clansi.core :refer [style]]
    [clojure.edn :as edn]
    [me.raynes.fs :refer [mkdir
                          exists?]]
    [cljs-api-gen.config :refer [cache-dir]]
    [cljs-api-gen.docfile :refer [lint-docfiles!]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos!
                                    get-published-cljs-tags!
                                    get-published-clj-versions!
                                    new-maven-release]]
    [cljs-api-gen.catalog :refer [create-catalog!]]
    [cljs-api-gen.clojure-api :refer [get-version-apis!]]))


;;--------------------------------------------------------------------------------
;; Runners
;;--------------------------------------------------------------------------------

(defn prep!
  []
  ;; create cache directory
  (when-not (exists? cache-dir)
    (mkdir cache-dir))

  (clone-or-fetch-repos!)
  (get-published-cljs-tags!)
  (get-published-clj-versions!)
  (get-version-apis!)
  (println (style "\n DONE PREPPING " :bg-green)))

(defn main
  [{:keys [task new-release] :as options}]
  (when new-release
    (reset! new-maven-release new-release))
  (prep!)
  (cond
    (= task :lint) (lint-docfiles!)
    :else (create-catalog! options))

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))


;;--------------------------------------------------------------------------------
;; Entry
;;--------------------------------------------------------------------------------

(defn -main
  [& args]
  (main (edn/read-string (first args))))
