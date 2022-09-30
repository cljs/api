(ns cljs-api-gen.docfile.lint
  (:require
    [clojure.string :as string]
    [cljs-api-gen.docfile.parse :refer [section-start biblio-line]]
    [cljs-api-gen.docfile.doclink :refer [parse-docname doclink-url]]))

(def frontmatter-keys
  {:all [[:full-name "name:"]
         [:display-as "display as:"]
         [:known-as "known as:"]
         [:since "since:"]
         [:clj-doc "clojure doc:"]
         [:edn-doc "edn doc:"]
         [:tags "tags:"]
         [:see-also "see also:"]
         [:search-terms "search terms:"]]
   :required?        #{:full-name :see-also}
   :syntax-required? #{:full-name :see-also :display-as}
   :ns-required?     #{:full-name}
   :sub-option-required? #{:full-name}
   :list?            #{:tags :see-also :search-terms}
   :quotes?          #{:display-as :search-terms}})

(def markdown-keys
  {:all [[:summary "Summary"]
         [:details "Details"]
         [:summary-compiler "Summary for Compiler"]
         [:details-compiler "Details for Compiler"]
         [:examples "Examples"]
         [:usage "Usage"]
         [:notes "Notes"]
         [:todo "TODO"]
         [:md-biblio biblio-line]]
   :required?    #{:summary :details :examples}
   :ns-required? #{:summary :details}
   :sub-option-required? #{:summary}
   :list?        #{:usage}})

(defn yaml-list [l quote?]
  (string/join "\n" (map #(str "  - " (cond-> % quote? pr-str)) l)))

(defn blank? [x]
  (cond
    (nil? x) true
    (and (string? x) (string/blank? x)) true
    (and (sequential? x) (zero? (count x))) true
    :else false))

(defn sub-option? [m]
  ;; FIXME: update when sub-options are added, or check *result*
  (or (string/starts-with? (:full-name m) "warnings/")
      (string/starts-with? (:full-name m) "closure-warnings/")))

(defn frontmatter-item
  [[key title] m]
  (let [value (get m key)
        list? (:list? frontmatter-keys)
        quotes? (:quotes? frontmatter-keys)
        required?
        (cond
          (sub-option? m)                                (:sub-option-required? frontmatter-keys)
          (string/starts-with? (:full-name m) "syntax/") (:syntax-required? frontmatter-keys)
          (not (string/includes? (:full-name m) "/"))    (:ns-required? frontmatter-keys)
          :else                                          (:required? frontmatter-keys))]
    (when (or (not (blank? value))
              (required? key))
      (cond
        (blank? value)      (str title)
        (list? key)         (str title "\n" (yaml-list value (quotes? key)))
        (quotes? key)       (str title " " (pr-str value))
        :else               (str title " " value)))))

(defn map->frontmatter [m]
  (->> (:all frontmatter-keys)
       (map #(frontmatter-item % m))
       (keep identity)
       (string/join "\n")))

(defn biblio-link [docname]
  (str "[doc:" docname "]:" (doclink-url docname)))

(defn markdown-item
  [[key title] m]
  (let [value (get m key)
        list? (:list? markdown-keys)
        required? (cond
                    (sub-option? m)                       (:sub-option-required? markdown-keys)
                    (string/includes? (:full-name m) "/") (:required? markdown-keys)
                    :else                                 (:ns-required? markdown-keys))]
    (when (or (not (blank? value))
              (required? key))
      (cond
        (= :md-biblio key) (str title "\n" (string/join "\n" (map biblio-link value)) "\n")
        (blank? value)     (str section-start title "\n")
        (list? key)        (str section-start title "\n" (string/join "\n" value) "\n")
        :else              (str section-start title "\n\n" value "\n")))))

(defn map->markdown [m]
  (->> (:all markdown-keys)
       (map #(markdown-item % m))
       (keep identity)
       (string/join "\n")))

(defn normalize-doc [doc]
  (string/join "\n"
    ["---"
     (map->frontmatter doc)
     "---"
     ""
     (map->markdown doc)]))
