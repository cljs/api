(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [clojure.data :refer [diff]]
    [cljs-api-gen.encode :refer [encode-fullname]]
    [cljs-api-gen.util :refer [mapmap]]
    [cljs-api-gen.cljsdoc :refer [cljsdoc-map]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items
                                      attach-clj-symbol]]
    [cljs-api-gen.repo-cljs :refer [*cljs-version*
                                    *cljs-tag*
                                    *cljs-date*
                                    *clj-version*
                                    *clj-tag*
                                    *treader-version*
                                    *treader-tag*
                                    *gclosure-lib*
                                    cljs-version->num
                                    cljs-tag->num
                                    ]]
    ))

(defn removable? [v]
  (or (nil? v) (= "" v) (and (coll? v) (empty? v))))

(defn prune-map [m]
  (->> m
       (remove (comp removable? second))
       (into {})))

(defn fix-source-lines
  "Turn the line range into a single line if the end line is the same as the first."
  [item]
  (if (:source item)
    (update-in item [:source :lines] (fn [[a b]] (if (= a b) [a] [a b])))
    item))

(defn transform-item
  [x]
  (as-> x $
    (select-keys $ [:ns
                    :name
                    :docstring
                    :type
                    :parent-type
                    :signature
                    :methods
                    :history
                    :return-type
                    :edn-doc
                    :clj-doc
                    :source
                    :extra-sources])
    (update-in $ [:signature] #(mapv str %))
    (update-in $ [:name] str)
    (fix-source-lines $)
    (assoc $ :full-name (str (:ns $) "/" (:name $)))
    (assoc $ :full-name-encode (encode-fullname (:full-name $)))
    (prune-map $)
    (attach-clj-symbol $)
    ;; NOTE: don't forget to add a $ for any following expressions
    ))

(defn resolve-duplicates
  [items]
  (let [item (last items)
        shadowed (drop 1 (reverse items))
        merged (if-not (empty? shadowed)
                 (assoc item :extra-sources (map :source shadowed))
                 item)

        ;; Some core symbols have function and macro implementations.
        ;; (see: https://github.com/clojure/clojurescript/wiki/Differences-from-Clojure#macros)
        fn-macro-pair? (and (= "function" (:type item))
                            (= "macro" (:type (first shadowed))))

        final (if fn-macro-pair?
                ;; Set function and macro source titles for distinguishing the two.
                (-> merged
                    (assoc-in [:source :title] "Function code")
                    (update-in [:extra-sources] vec)
                    (assoc-in [:extra-sources 0 :title] "Macro code"))
                merged)]
    final))

(defn transform-items
  [items]
  (->> items
       (map transform-item)
       (group-by :full-name)
       (mapmap resolve-duplicates)))

(defn mark-removed
  [prev-item prev-hist prev-version]
  (-> (update-in prev-item [:history] conj ["-" *cljs-version*])
      (assoc :removed {:in *cljs-version*
                       :last-seen prev-version})))

(defn mark-added
  [curr-item prev-hist prev-version]
  (let [prev-hist (or prev-hist [])]
    (-> (assoc curr-item :history (conj prev-hist ["+" *cljs-version*]))
        (dissoc :removed))))

(defn make-api-result
  [items api-key prev-result]
  (let [prev-api (get-in prev-result [:api api-key])
        prev-symbols (:symbols prev-result)
        prev-items (select-keys prev-symbols (:symbol-names prev-api))
        prev-changes (or (:changes prev-api) [])
        prev-version (get-in prev-result [:release :cljs-version])

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
        change (prune-map {:cljs-version *cljs-version*
                           :cljs-date *cljs-date*
                           :clj-version *clj-version*
                           :gclosure-lib *gclosure-lib*
                           :treader-version *treader-version*
                           :added added?
                           :removed removed?})
        new-changes (conj prev-changes change)]
    {:symbols new-symbols
     :changes new-changes}))

(defn get-result
  ([parsed] (get-result parsed nil))
  ([parsed prev-result]
   (let [
         ;;; We create the API information here.
         ;;; Each API is {:symbols {} :changes []}
         syntax-items (transform-items (:syntax parsed))
         syntax-api (make-api-result syntax-items :syntax prev-result)

         lib-items (transform-items (:library parsed))
         library-api (make-api-result lib-items :library prev-result)

         compiler-items (transform-items (:compiler parsed))
         compiler-api (make-api-result compiler-items :compiler prev-result)

         ;;; We want a global symbol map. So we strip out the symbol data from each
         ;;; API, leaving only the symbol names which can be used to lookup the data
         ;;; in said global symbol map.

         ;; NOTE: Since we are merging symbols from multiple APIs which may
         ;;       refer to the same symbols (e.g. cljs.repl symbols span Library and Compiler API),
         ;;       the history key part [["+" "0.0-927"]] will be overwritten by whichever comes last.
         ;;       This should be okay for the cljs.repl since their histories should be the same.
         ;;       Supporting the general case will require creating separate symbol references
         ;;       for each API, which I don't want to do.
         symbols (apply merge (map :symbols [syntax-api library-api compiler-api]))

         strip-symbol-data #(-> %
                                (assoc :symbol-names (-> % :symbols keys set))
                                (dissoc :symbols))

         syntax-api   (strip-symbol-data syntax-api)
         library-api  (strip-symbol-data library-api)
         compiler-api (strip-symbol-data compiler-api)
         ]

     {:release {:cljs-version *cljs-version*
                :cljs-tag *cljs-tag*
                :cljs-date *cljs-date*

                :clj-version *clj-version*
                :clj-tag *clj-tag*

                :treader-version *treader-version*
                :treader-tag *treader-tag*

                :gclosure-lib *gclosure-lib*
                }

      ;; clojure symbols unavailable in clojurescript
      :clj-not-cljs (get-clojure-symbols-not-in-items (vals lib-items))

      :symbols symbols

      :api {:syntax syntax-api
            :library library-api
            :compiler compiler-api
            }
      })))

(def version->num
  (memoize cljs-version->num))

(def tag->num
  (memoize cljs-tag->num))

(defn add-cljsdoc
  "Merge the given item with its compiled cljsdoc, containing extra doc info."
  ([item curr-tag]
   (let [cljsdoc (and cljsdoc-map (@cljsdoc-map (:full-name item)))]
     (add-cljsdoc item curr-tag cljsdoc)))
  ([item curr-tag cljsdoc]
   (let [doc-version (last (filter #(or (nil? %)
                                        (<= (version->num %)
                                            (tag->num curr-tag)))
                                   (:versions cljsdoc)))
         doc (get-in cljsdoc [:docs doc-version])]
     (cond-> item
       ;; don't overwrite signature if it's null
       doc              (merge (select-keys doc [:examples :related :description :moved :usage]))
       (:display doc)   (merge (select-keys doc [:display]))
       (:signature doc) (merge (select-keys doc [:signature]))))))

(defn add-cljsdoc-to-result
  [result]
  (let [tag (-> result :release :cljs-tag)
        update-symbols (fn [symbols] (mapmap #(add-cljsdoc % tag) symbols))]
    (update-in result [:symbols] update-symbols)))
