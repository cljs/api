(ns cljs-api-gen.core
  (:require
    [clojure.pprint :refer [print-table]]
    [clojure.edn :as edn]
    [cljs-api-gen.config :refer [*output-dir*]]
    [cljs-api-gen.repo-cljs :refer [clone-or-fetch-repos!
                                    get-latest-repo-tag
                                    get-published-cljs-tags!
                                    get-published-clj-versions!]]
    [cljs-api-gen.catalog :refer [create-catalog!
                                  create-single-version!]]
    [cljs-api-gen.clojure-api :refer [get-version-apis!]]
    [cljs-api-gen.docset :as docset]
    [cljs-api-gen.cljsdoc :refer [build-cljsdoc!]]
    ))

;;--------------------------------------------------------------------------------
;; Usage
;;--------------------------------------------------------------------------------

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

(defn run-catalog!
  [n-or-all out-dir]
  (prep!)
  (let [out-dir (or out-dir "catalog")]
    (binding [*output-dir* out-dir]
      (create-catalog! n-or-all))))

(defn run-single-version!
  [tag out-dir]
  (prep!)
  (let [tag (if (= :latest tag)
              (get-latest-repo-tag "clojurescript")
              tag)
        out-dir (or out-dir (str "docs-" tag))]
    (binding [*output-dir* out-dir]
      (create-single-version! tag))))

(defn run-docset!
  [out-dir]
  (binding [*output-dir* (or out-dir "catalog")]
    (docset/create!)))

(defn main
  [{:keys [cljsdoc catalog version docset out-dir] :as options}]

  (cond
    catalog (run-catalog! catalog out-dir)
    version (run-single-version! version out-dir)
    docset  (run-docset! out-dir)
    cljsdoc (run-cljsdoc!)
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
    (let [opt (edn/read-string (first args))
          option-map (if (map? opt)
                       opt
                       {opt true})]
      (main option-map))
    (show-usage-and-exit!)))

