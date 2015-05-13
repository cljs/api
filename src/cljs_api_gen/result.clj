(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [cljs-api-gen.util :refer [symbol->filename
                               mapmap]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items]]
    [cljs-api-gen.repo-cljs :refer [*cljs-version*
                                    *clj-version*]]
    ))

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


