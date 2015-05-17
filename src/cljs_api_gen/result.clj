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

(defn prune-map [m]
  (->> m
       (remove (comp removable? second))
       (into {})))

(defn transform-item
  [x]
  (as-> x $
    (select-keys $ [:full-name
                    :ns
                    :name
                    :docstring
                    :type
                    :signature
                    :history
                    :return-type
                    :source-filename
                    :source-link
                    :source-lines
                    :clj-symbol
                    :source])
    (update-in $ [:signature] #(mapv str %))
    (update-in $ [:name] str)
    (assoc $ :full-name-encode (str (:ns $) "_" (symbol->filename (:name $))))
    (prune-map $)
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
        all-prev-names (->> (vals prev-items)
                            (map :full-name))
        prev-names (->> (vals prev-items)
                        (remove :removed)
                        (map :full-name)
                        set)
        curr-names (-> items keys set)
        all-names (set (into all-prev-names curr-names))
        [removed? added? stayed?] (diff prev-names curr-names)

        make-item
        (fn [name-]
          (let [prev (get prev-items name-)
                prev-hist (:history prev)
                curr (get items name-)]
            (cond
              (contains? removed? name-) (mark-removed prev prev-hist prev-version) ;; newly removed
              (contains? added? name-)   (mark-added curr prev-hist prev-version)   ;; newly added
              (contains? stayed? name-)  (assoc curr :history prev-hist)            ;; still here
              :else                      prev)))                                    ;; still removed

        new-items (map make-item all-names)
        new-symbols (zipmap (map :full-name new-items) new-items)
        change (prune-map {:version *cljs-version*
                           :added added?
                           :removed removed?})
        new-changes (conj prev-changes change)]
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


