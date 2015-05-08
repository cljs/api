(ns core
  (:refer-clojure :exclude [replace])
  (:require
    [me.raynes.fs :refer [mkdir exists?]]))

(defn -main
  [& args]

  ;; have to do this because `sh` leaves futures hanging,
  ;; preventing exit, so we must do it manually.
  (System/exit 0))

