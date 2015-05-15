(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [clojure.data :refer [diff]]
    [cljs-api-gen.util :refer [symbol->filename
                               mapmap]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items
                                      attach-clj-symbol]]
    [cljs-api-gen.repo-cljs :refer [*cljs-version*
                                    *clj-version*
                                    *cljs-tag*]]
    ))

(defn removable? [v]
  (or (nil? v) (= "" v) (and (coll? v) (empty? v))))

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

    ;; FIXME: don't make this confusing, just rename them at their source instead of here
    (rename-keys $ {:filename    :source-filename
                    :github-link :source-link
                    :signatures  :signature})

    (update-in $ [:signature] #(map str %))
    (update-in $ [:name] str)
    (assoc $ :filename (str (:ns $) "_" (symbol->filename (:name $)) ".cljsdoc"))
    (remove (comp removable? second) $)
    (into {} $)
    (attach-clj-symbol $)
    ;; NOTE: don't forget to add a $ for any following expressions
    ))

(defn transform-items
  [items]
  (->> items
       (map transform-item)
       (group-by :full-name)
       (mapmap last) ;; remove duplicates by preferring the last
       ))

(defn mark-removed
  [prev-item prev-hist prev-version]
  (-> (update-in prev-item [:history] conj (str "- " *cljs-version*))
      (assoc :removed {:in *cljs-version*
                       :last-seen prev-version})))

(defn mark-added
  [curr-item prev-hist prev-version]
  (let [prev-hist (or prev-hist [])]
    (-> (assoc curr-item :history (conj prev-hist (str "+ " *cljs-version*)))
        (dissoc :removed))))

(defn make-api-result
  [items items-key prev-result]
  (let [prev-api (get prev-result items-key)
        prev-items (:symbols prev-api)
        prev-changes (or (:changes prev-api) [])
        prev-version (get-in prev-result [:versions :cljs])

        ;; get symbol names
        prev-names (->> (remove :removed prev-items)
                        keys set)
        curr-names (-> items keys set)
        all-names (set (into prev-names curr-names))
        [removed? added? stayed?] (diff prev-names curr-names)

        make-item
        (fn [name-]
          (let [prev (get prev-items name-)
                prev-hist (:history prev)
                curr (get items name-)]
            (cond
              (contains? removed? name-) (mark-removed prev prev-hist prev-version)
              (contains? added? name-)   (mark-added curr prev-hist prev-version)
              (contains? stayed? name-)  (assoc curr :history prev-hist)
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
   (let [lib-items (transform-items lib-parsed)
         _ (spit "test" (keys lib-items))
         library-api (make-api-result lib-items :library-api prev-result)]

     {:versions {:cljs *cljs-version*  ;; clojurescript version
                 :clj *clj-version*    ;; clojure version
                 ;; :closure nil       ;; TODO: google closure version
                 }

      ;; clojure symbols unavailable in clojurescript
      :clj-not-cljs (get-clojure-symbols-not-in-items (vals lib-items))

      :library-api library-api

      :compiler-api {:symbols {}
                     :changes []}})))


