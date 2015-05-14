(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [cljs-api-gen.util :refer [symbol->filename
                               mapmap]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items]]
    [cljs-api-gen.repo-cljs :refer [*cljs-version*
                                    *clj-version*]]
    ))

(def previous-result
  (atom nil))

(defn transform-item
  [x]
  (as-> x $
    (select-keys $ [:full-name
                    :ns
                    :name
                    :docstring
                    :type
                    :signatures
                    :history
                    :return-type
                    :filename
                    :github-link
                    :clj-symbol
                    :source])
    (rename-keys $ {:filename    :source-filename
                    :github-link :source-link
                    :signatures  :signature})
    (update-in $ [:signature] #(map str %))
    (update-in $ [:name] str)
    (assoc $ :filename (str (:ns $) "_" (symbol->filename (:name $)) ".cljsdoc"))
    (filter (comp not nil? second) $)
    (into {} $)))

(defn attach-history-addition
  [item]
  (let [new-hist-tag (str "+" *cljs-tag*)]
    (if-let [prev-hist (get-in @previous [:library-api :symbols (:full-name item) :history])]
      (if (= (.startsWith (last prev-hist) "-"))
        (assoc item :history (conj prev-hist new-hist-tag)) ;; <-- make sure history is always a vector so it is appended to the end
        (assoc item :history prev-hist))
      (assoc item :history [new-hist-tag]))))

(defn attach-history-removal
  [items]
  )

(defn attach-history-and-get-changes
  [items]
  ;; get symbols present from previous result
  ;; get parsed symbols (present)
  ;; add new symbols to added
  ;; add removed symbols to removed

  ;; update CHANGED map

  ;; update SYMBOLS map
  ;; remove attributes from except for those wanted for remove (e.g. history with "-r*" appended)
  ;; add attributes for present symbols if needed (with attach-history-addition)

  ;; return changes and symbols
  ;; (get-result should prepend(?) CHANGES and assoc SYMBOLS to the previous
  ;; result to get the new result.
  )

(defn get-result
  [parsed]
  {:versions {:cljs *cljs-version*  ;; clojurescript version
              :clj *clj-version*    ;; clojure version
              ;; :closure nil       ;; TODO: google closure version
              }

   ;; clojure symbols unavailable in clojurescript
   :clj-not-cljs (get-clojure-symbols-not-in-items parsed)

   ;; API-DATA for core library
   :library-api  {:symbols (->> parsed
                                (map transform-item)
                                (group-by :full-name)
                                (mapmap last)) ;; remove possible duplicates (favoring the last symbol)
                  :changes []
                  }

   ;; API-DATA for compiler
   :compiler-api {:symbols {}
                  :changes []}
   })


