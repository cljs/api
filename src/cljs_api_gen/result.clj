(ns cljs-api-gen.result
  (:require
    [clojure.string :as string]
    [clojure.set :refer [rename-keys]]
    [clojure.data :refer [diff]]
    [cljs-api-gen.docfile.doclink :refer [doclink-url]]
    [cljs-api-gen.docfile.transform :refer [add-doclink-names]]
    [cljs-api-gen.encode :refer [encode-fullname
                                 encode-name]]
    [cljs-api-gen.util :refer [mapmap filtermap]]
    [cljs-api-gen.clojure-api :refer [get-clojure-symbols-not-in-items
                                      clj-equiv]]
    [cljs-api-gen.state :refer [*result* *docfiles*]]
    [cljs-api-gen.repo-cljs :refer [*cljs-version*
                                    *cljs-tag*
                                    *cljs-date*
                                    *clj-version*
                                    *clj-tag*
                                    *treader-version*
                                    *treader-tag*
                                    *gclosure-lib*
                                    *gclosure-com*
                                    cljs-cmp]]))

(defn removable? [v]
  (or (nil? v) (= "" v) (and (coll? v) (empty? v))))

(defn prune-map [m]
  (->> m
       (remove (comp removable? second))
       (into {})))

;;----------------------------------------------------------------------
;; Cached item result
;;----------------------------------------------------------------------

(defn fix-source-lines*
  "Turn the line range into a single line if the end line is the same as the first."
  [source]
  (if source
    (update source :lines (fn [[a b]] (if (= a b) [a] [a b])))
    source))

(defn fix-source-lines
  [item]
  (-> item
      (update :source fix-source-lines*)
      (update :extra-sources #(map fix-source-lines* %))))

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
        full-encoded (encode-fullname fullname)
        name-encoded (cond-> (:name item)
                       (not ns?) encode-name)]
    (assoc item
      :full-name fullname
      :full-name-encode full-encoded
      :name-encode name-encoded)))

(defn cached-item
  "Data that we should cache from this parsed item."
  [x]
  (-> x
      (select-keys [:ns
                    :pseudo-ns?
                    :sub-options-ns
                    :sub-options-sym
                    :repl-only?
                    :name
                    :docstring
                    :author
                    :type
                    :parent-type
                    :signature
                    :methods
                    :history
                    :return-type
                    :syntax-equiv
                    :source
                    :extra-sources])

      (update-in [:signature] #(mapv str %))
      (update-in [:name] str)
      (assign-full-names)
      (handle-ns-item)
      (fix-source-lines)
      (prune-map)))

;;----------------------------------------------------------------------
;; Combining items
;;----------------------------------------------------------------------

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
          (assoc :type "function/macro")
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
  ;; we choose the last since the read.clj parses with the order:
  ;; .clj, .cljs, .cljc (priority last)
  (last items))

(defn resolve-duplicates
  [items]
  (if (= (count items) 1)
    (first items)
    (first (keep #(% items) [combine-fn-macro-pair
                             combine-multimethods
                             combine-namespaces
                             #(-> % shadow-duplicates-by-order :merged)]))))

(defn cached-items
  "transforms a sequence of parsed items to a processed map of full-name -> item"
  [items]
  (->> items
       (map cached-item)
       (group-by :full-name)
       (mapmap resolve-duplicates)

       ;; dangling defmethods probably means its defmulti is private
       (filtermap #(not= "method" (:type %)))))

;;----------------------------------------------------------------------
;; Cached API result with history
;;----------------------------------------------------------------------

(def ignored-change
  "Fix symbol history noise if a symbol was accidentally removed or added in
   the given versions.  Will still be listed in [:library :changes] structure though."
  {;; These symbols were accidentally made private in 1.4.493 then fixed in 1.9.494
   ;; so we want to ignore the resulting removal and addition, respectively.
   "cljs.core/copy-arguments" #{"1.9.493" "1.9.494"}
   "cljs.core/es6-iterable" #{"1.9.493" "1.9.494"}
   "cljs.core/gen-apply-to" #{"1.9.493" "1.9.494"}
   "cljs.core/js-comment" #{"1.9.493" "1.9.494"}
   "cljs.core/js-debugger" #{"1.9.493" "1.9.494"}
   "cljs.core/js-in" #{"1.9.493" "1.9.494"}
   "cljs.core/js-inline-comment" #{"1.9.493" "1.9.494"}
   "cljs.core/js-str" #{"1.9.493" "1.9.494"}
   "cljs.core/unsafe-cast" #{"1.9.493" "1.9.494"}})

(defn mark-removed
  [prev-item prev-hist prev-version]
  (if (contains? (ignored-change (:full-name prev-item)) *cljs-version*)
    prev-item
    (-> (update-in prev-item [:history] conj ["-" *cljs-version*])
        (assoc :removed {:in *cljs-version*
                         :last-seen prev-version}))))

(defn mark-added
  [curr-item prev-hist prev-version]
  (if (contains? (ignored-change (:full-name curr-item)) *cljs-version*)
    curr-item
    (let [prev-hist (or prev-hist [])]
      (-> (assoc curr-item :history (conj prev-hist ["+" *cljs-version*]))
          (dissoc :removed)))))

(defn cached-api-result
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

        prev-changes (:changes prev-api)
        prev-version (:version prev-result)

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
        (fn [name- prevs {:keys [removed? added? stayed?] :as diff}]
          (let [prev (get prevs name-)
                prev-hist (:history prev)
                curr (get items name-)]
            (cond
              (contains? removed? name-) (mark-removed prev prev-hist prev-version) ;; newly removed
              (contains? added? name-)   (mark-added curr prev-hist prev-version)   ;; newly added
              (contains? stayed? name-)  (assoc curr :history prev-hist)            ;; still here
              :else                      prev)))                                    ;; still removed

        new-sym-items (map #(make-item % prev-syms syms-diff) (:all-names syms-diff))
        new-syms (zipmap (map :full-name new-sym-items) new-sym-items)

        new-ns-items (map #(make-item % prev-nss nss-diff) (:all-names nss-diff))
        new-nss (zipmap (map :full-name new-ns-items) new-ns-items)

        change (prune-map {;; FIXME: add namespace changes once we decide we want it
                           ;; (will have to fix write.clj to not assume all changes are symbol changes)
                           :added (:added? syms-diff)
                           :removed (:removed? syms-diff)})
        new-changes (assoc prev-changes *cljs-version* change)]
    {:symbols new-syms
     :namespaces new-nss
     :changes new-changes}))

(defn cached-result
  ([parsed] (cached-result parsed nil))
  ([parsed prev-result]
   (let [
         ;;; We create the API information here.
         ;;; Each API is {:symbols {} :changes []}
         syntax-items (cached-items (:syntax parsed))
         syntax-api (cached-api-result syntax-items :syntax prev-result)

         options-items (cached-items (:options parsed))
         options-api (cached-api-result options-items :options prev-result)

         lib-items (cached-items (:library parsed))
         library-api (cached-api-result lib-items :library prev-result)

         compiler-items (cached-items (:compiler parsed))
         compiler-api (cached-api-result compiler-items :compiler prev-result)

         ;;; We want a global symbol map. So we strip out the symbol data from each
         ;;; API, leaving only the symbol names which can be used to lookup the data
         ;;; in said global symbol map.

         ;; NOTE: Since we are merging symbols from multiple APIs which may
         ;;       refer to the same symbols (e.g. cljs.repl symbols span Library and Compiler API),
         ;;       the history key part [["+" "0.0-927"]] will be overwritten by whichever comes last.
         ;;       This should be okay for the cljs.repl since their histories should be the same.
         ;;       Supporting the general case will require creating separate symbol references
         ;;       for each API, which I don't want to do.
         symbols (apply merge (map :symbols [syntax-api options-api library-api compiler-api]))
         namespaces (apply merge (map :namespaces [syntax-api options-api library-api compiler-api]))

         strip-data #(-> %
                         (assoc :symbol-names (-> % :symbols keys set))
                         (dissoc :symbols)
                         (assoc :namespace-names (-> % :namespaces keys set))
                         (dissoc :namespaces))

         syntax-api   (strip-data syntax-api)
         options-api   (strip-data options-api)
         library-api  (strip-data library-api)
         compiler-api (strip-data compiler-api)

         prev-versions (get-in prev-result [:history :versions])
         prev-details (get-in prev-result [:history :details])

         version-details {:tag *cljs-tag*
                          :date *cljs-date*
                          :clj-version *clj-version*
                          :clj-tag *clj-tag*
                          :treader-version *treader-version*
                          :treader-tag *treader-tag*
                          :gclosure-lib *gclosure-lib*
                          :gclosure-com *gclosure-com*}]

     {:version *cljs-version*
      :history {:versions (conj prev-versions *cljs-version*)
                :details (assoc prev-details *cljs-version* version-details)}

      ;; clojure symbols unavailable in clojurescript
      :clj-not-cljs (get-clojure-symbols-not-in-items (vals lib-items))

      :symbols symbols
      :namespaces namespaces

      :api {:syntax syntax-api
            :options options-api
            :library library-api
            :compiler compiler-api}})))

;;----------------------------------------------------------------------
;; Annotated result
;;----------------------------------------------------------------------

(defn add-github-link
  [{:keys [lines repo tag filename] :as source}]
  (when source
    (let [url (str "https://github.com/clojure/" repo "/blob/" tag "/" filename
                "#" (string/join "-" (map #(str "L" %) lines)))]
      (assoc source :url url))))

(defn add-github-links
  [item]
  (-> item
      (update :source add-github-link)
      (update :extra-sources #(map add-github-link %))))


(defn add-syntax-equiv
  [{:keys [clj-doc edn-doc] :as item}]
  (cond-> item
    clj-doc (assoc-in [:syntax-equiv :clj-url] clj-doc)
    edn-doc (assoc-in [:syntax-equiv :edn-url] edn-doc)
    clj-doc (dissoc :clj-doc)
    edn-doc (dissoc :edn-doc)))

(defn assign-display-name
  [item]
  (cond-> item
    (#{"option" "warning"} (:type item))
    (assoc :display-as (str ":" (:name item)))))

(defn add-clj-equiv
  [item]
  (if-let [equiv (clj-equiv item)]
    (assoc item :clj-equiv equiv)
    item))

(defn add-edit-url
  [item]
  (assoc item :edit-url (doclink-url (:full-name item))))

(defn signature->usage
  [sig item]
  (let [name (:name item)
        type? (= "type" (:type item))
        cmd (cond-> name
              type? (str "."))
        args (second (re-find #"^\[(.*)\]$" sig))
        all-args (if (string/blank? args)
                   cmd
                   (string/join " " [cmd args]))]
    (str "(" all-args ")")))

(defn add-usage
  [{:keys [signature name] :as item}]
  (if signature
    (assoc item :usage
      (mapv #(signature->usage % item) signature))
    item))

(defn annotate-item
  "Merge the given item with extra data (e.g. docfile, github links)
  We do this only at the end instead of after each version parse, allowing us
  to change extra details without parsing every version again."
  [item]
  (let [docfile (*docfiles* (:full-name item))
        docfile-data (select-keys docfile
                       [:examples
                        :known-as
                        :display-as
                        :summary
                        :summary-compiler
                        :details
                        :details-compiler
                        :signature
                        :see-also
                        :search-terms
                        :moved
                        :tags
                        :md-biblio
                        :clj-doc
                        :edn-doc])]
     (-> item
         (assign-display-name)
         (merge docfile-data)
         (add-usage)
         (add-github-links)
         (add-edit-url)
         (add-clj-equiv)
         (add-syntax-equiv))))

(defn post-process-item
  "This is a second pass to allow us to use data populated from first pass"
  [item]
  (-> item
      (add-doclink-names)))

(defn update-result-items
  "Update every symbol or namespace item with the given function."
  [result update-item]
  (let [update-all #(mapmap (comp prune-map update-item) %)]
    (-> result
        (update-in [:symbols] update-all)
        (update-in [:namespaces] update-all))))

(defn annotate-result []
  (binding [*result* (update-result-items *result* annotate-item)]
    (update-result-items *result* post-process-item)))
