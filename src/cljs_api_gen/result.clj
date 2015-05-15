(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [clojure.data :refer [diff]]
    [cljs-api-gen.util :refer [symbol->filename
                               mapmap]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items
                                      attach-clj-symbol]]
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

(defn present?
  [item]
  (= (.startsWith (last (:history item)) "+")))

(defn make-api-result
  [items prev-api]
  (let [prev-items (:symbols prev-api)
        prev-changes (or (:changes prev-api) [])

        ;; get symbol names
        prev-names (->> (filter present? prev-items)
                       (map (comp set keys)))
        curr-names (map (comp set keys) items)
        all-names (set (into prev-syms curr-syms))

        [removed? added? stayed?] (diff prev-names curr-names)

        make-item
        (fn [name-]
          (let [prev (get prev-items name-)
                prev-hist (:history prev)
                curr (get items name-)]
            (cond
              (removed? name-)
              (-> (update-in prev [:history] conj (str "-" *cljs-tag*))
                  (select-keys [:ns :name :full-name :history]))

              (added? name-)
              (assoc curr :history (conj prev-hist (str "+" *cljs-tag*)))

              (stayed? name-)
              (assoc curr :history prev-hist)

              :else nil)))

        new-items (map make-item all-names)
        new-symbols (zipmap (map :full-name new-items) new-items)
        new-changes (conj prev-changes {:version *cljs-version*
                                        :added added?
                                        :removed removed?})]
    {:symbols new-symbols
     :changes new-changes}))

(defn get-result
  ([lib-parsed] (get-result lib-parsed nil))
  ([lib-parsed prev-result]
   (let [lib-items (->> lib-parsed
                        (map attach-clj-symbol)
                        (map transform-item)
                        (group-by :full-name)
                        (mapmap last))
         library-api (make-api-result lib-items (:library-api prev-result))]

     {:versions {:cljs *cljs-version*  ;; clojurescript version
                 :clj *clj-version*    ;; clojure version
                 ;; :closure nil       ;; TODO: google closure version
                 }

      ;; clojure symbols unavailable in clojurescript
      :clj-not-cljs (get-clojure-symbols-not-in-items (vals lib-items))

      :library-api library-api

      :compiler-api {:symbols {}
                     :changes []}})))


