(ns cljs-api-gen.result
  (:require
    [clojure.set :refer [rename-keys]]
    [clojure.data :refer [diff]]
    [cljs-api-gen.encode :refer [encode-fullname]]
    [cljs-api-gen.util :refer [mapmap filtermap]]
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
                                    cljs-cmp
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

(defn handle-ns-item
  "a namespace item does not have a :name, only a :ns"
  [item]
  (let [ns? (= "namespace" (:type item))]
    (cond-> item
      ns? (dissoc :name))))

(defn assign-full-names
  "Create the cannonical lookup names (full-name) for this item."
  [item]
  (let [ns? (= "namespace" (:type item))
        fullname (cond-> (:ns item)
                   (not ns?) (str "/" (:name item)))
        encoded (encode-fullname fullname)]
    (assoc item
      :full-name fullname
      :full-name-encode encoded)))

(defn transform-item
  [x]
  (-> x
      (select-keys [:ns
                    :name
                    :docstring
                    :author
                    :type
                    :parent-type
                    :signature
                    :methods
                    :history
                    :return-type
                    :edn-doc
                    :clj-doc
                    :source
                    :extra-sources
                    ])
      (update-in [:signature] #(mapv str %))
      (update-in [:name] str)
      (fix-source-lines)
      (handle-ns-item)
      (assign-full-names)
      (prune-map)
      (attach-clj-symbol)))

(defn shadow-duplicates-by-order
  [items]
  (let [item (last items)
        shadowed (drop 1 (reverse items))
        merged (if-not (empty? shadowed)
                 (assoc item :extra-sources (map :source shadowed))
                 item)]
    {:item item
     :shadowed shadowed
     :merged merged}))

(defn combine-fn-macro-pair
  [items]
  ;; Some core symbols have function and macro implementations.
  ;; (see: https://github.com/clojure/clojurescript/wiki/Differences-from-Clojure#macros)
  (let [{:keys  [item shadowed merged]} (shadow-duplicates-by-order items)]
    (when (and (= "function" (:type item))
               (= "macro" (:type (first shadowed))))
      (-> merged
          (assoc-in [:source :title] "Function code")
          (update-in [:extra-sources] vec)
          (assoc-in [:extra-sources 0 :title] "Macro code")))))

(defn combine-multimethods
  [items]
  (let [item (last (remove #(= "method" (:type %)) items))
        method-items (filter #(= "method" (:type %)) items)]
    (when (= "multimethod" (:type item))
      (assoc item :extra-sources
        (for [m method-items]
          (assoc (:source m)
                 :title "Dispatch method"))))))

(defn combine-namespaces
  [items]
  ;; TODO
  ;; - favor them in this order: .cljs, .cljc, .clj
  ;; - get the first docstring available
  ;; - get the first author available
  ;; - combine the sources (not sure if useful yet)
  (first items))

(defn resolve-duplicates
  [items]
  (if (= (count items) 1)
    (first items)
    (first (keep #(% items) [combine-fn-macro-pair
                             combine-multimethods
                             combine-namespaces
                             #(-> % shadow-duplicates-by-order :merged)]))))

(defn transform-items
  "transforms a sequence of parsed items to a processed map of full-name -> item"
  [items]
  (->> items
       (map transform-item)
       (group-by :full-name)
       (mapmap resolve-duplicates)

       ;; dangling defmethods probably means its defmulti is private
       (filtermap #(not= "method" (:type %)))
       ))

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
  "Create API data for the given api-type.

  items       = map full-name -> item (symbol or namespace data)
  api-type    = :syntax | :library | :compiler
  prev-result = previous result data (in its entirety)
  "
  [items api-type prev-result]
  (let [prev-api (get-in prev-result [:api api-type])
        prev-all-syms (:symbols prev-result)
        prev-syms (select-keys prev-all-syms (:symbol-names prev-api))

        prev-all-nss (:namespaces prev-result)
        prev-nss (select-keys prev-all-nss (:namespace-names prev-api))

        prev-changes (or (:changes prev-api) [])
        prev-version (get-in prev-result [:release :cljs-version])

        get-diff
        (fn [prevs curr-names]
          (let [all-prev-names (->> (vals prevs)
                                    (map :full-name))
                prev-names (->> (vals prevs)
                                (remove :removed)
                                (map :full-name)
                                set)
                all-names (set (into all-prev-names curr-names))
                [removed? added? stayed?] (diff prev-names curr-names)]
            {:all-names all-names
             :added? added?
             :removed? removed?
             :stayed? stayed?}))

        curr-sym-names (->> (vals items)
                            (remove #(= "namespace" (:type %)))
                            (map :full-name)
                            set)

        curr-ns-names (->> (vals items)
                           (filter #(= "namespace" (:type %)))
                           (map :full-name)
                           set)

        syms-diff (get-diff prev-syms curr-sym-names)
        nss-diff (get-diff prev-nss curr-ns-names)

        make-item
        (fn [name- {:keys [removed? added? stayed?] :as diff}]
          (let [prev (get prev-syms name-)
                prev-hist (:history prev)
                curr (get items name-)]
            (cond
              (contains? removed? name-) (mark-removed prev prev-hist prev-version) ;; newly removed
              (contains? added? name-)   (mark-added curr prev-hist prev-version)   ;; newly added
              (contains? stayed? name-)  (assoc curr :history prev-hist)            ;; still here
              :else                      prev)))                                    ;; still removed

        new-sym-items (map #(make-item % syms-diff) (:all-names syms-diff))
        new-syms (zipmap (map :full-name new-sym-items) new-sym-items)

        new-ns-items (map #(make-item % nss-diff) (:all-names nss-diff))
        new-nss (zipmap (map :full-name new-ns-items) new-ns-items)

        change (prune-map {:cljs-version *cljs-version*
                           :cljs-date *cljs-date*
                           :clj-version *clj-version*
                           :gclosure-lib *gclosure-lib*
                           :treader-version *treader-version*

                           ;; FIXME: add namespace changes once we decide we want it
                           ;; (will have to fix write.clj to not assume all changes are symbol changes)
                           :added (:added? syms-diff)
                           :removed (:removed? syms-diff)})
        new-changes (conj prev-changes change)]
    {:symbols new-syms
     :namespaces new-nss
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
         namespaces (apply merge (map :namespaces [syntax-api library-api compiler-api]))

         strip-data #(-> %
                         (assoc :symbol-names (-> % :symbols keys set))
                         (dissoc :symbols)
                         (assoc :namespace-names (-> % :namespaces keys set))
                         (dissoc :namespaces))

         syntax-api   (strip-data syntax-api)
         library-api  (strip-data library-api)
         compiler-api (strip-data compiler-api)
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
      :namespaces namespaces

      :api {:syntax syntax-api
            :library library-api
            :compiler compiler-api
            }
      })))

(defn add-cljsdoc
  "Merge the given item with its compiled cljsdoc, containing extra doc info."
  ([item curr-tag]
   (let [cljsdoc (and cljsdoc-map (@cljsdoc-map (:full-name item)))]
     (add-cljsdoc item curr-tag cljsdoc)))
  ([item curr-tag cljsdoc]
   (let [doc-version (last (filter #(or (nil? %) (cljs-cmp <= % curr-tag))
                                   (:versions cljsdoc)))
         doc (get-in cljsdoc [:docs doc-version])]
     (cond-> item
       ;; don't overwrite signature if it's null
       doc              (merge (select-keys doc [:examples :related :description :moved :usage :tags :known-as]))
       (:display doc)   (merge (select-keys doc [:display]))
       (:signature doc) (merge (select-keys doc [:signature]))))))

(defn add-cljsdoc-to-result
  [result]
  (let [tag (-> result :release :cljs-tag)
        update-symbols (fn [symbols] (mapmap #(add-cljsdoc % tag) symbols))]
    (update-in result [:symbols] update-symbols)))
