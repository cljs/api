(ns cljs-api-gen.cljsdoc.lint
  (:require
    [clojure.string :as string]
    [cljs-api-gen.cljsdoc.parse :refer [section-start]]))

(def frontmatter-keys
  {:all [[:full-name "name:"]
         [:moved "moved:"]
         [:display "display:"]
         [:known-as "known as:"]
         [:tags "tags:"]
         [:see-also "see also:"]]
   :required?        #{:full-name :see-also}
   :syntax-required? #{:full-name :see-also :display}
   :list?            #{:tags :see-also}})

(def markdown-keys
  {:all [[:summary "Summary"]
         [:details "Details"]
         [:summary-compiler "Summary for Compiler"]
         [:details-compiler "Details for Compiler"]
         [:examples "Examples"]
         [:signature "Signature"]
         [:usage "Usage"]
         [:notes "Notes"]
         [:todo "TODO"]]
   :required?    #{:summary :details :examples}
   :ns-required? #{:summary :details}
   :list?        #{:signature :usage}})

(defn yaml-list [l]
  (string/join "\n" (map #(str "  - " %) l)))

(defn blank? [x]
  (cond
    (nil? x) true
    (and (string? x) (string/blank? x)) true
    (and (sequential? x) (zero? (count x))) true
    :else false))

(defn frontmatter-item
  [[key title] m]
  (let [value (get m key)
        list? (:list? frontmatter-keys)
        required? (if (string/starts-with? (:full-name m) "syntax/")
                    (:syntax-required? frontmatter-keys)
                    (:required? frontmatter-keys))]
    (when (or value (required? key))
      (cond
        (blank? value)   (str title)
        (list? key)      (str title "\n" (yaml-list value))
        (= key :display) (str title " " (pr-str value))
        :else            (str title " " value)))))

(defn map->frontmatter [m]
  (->> (:all frontmatter-keys)
       (map #(frontmatter-item % m))
       (keep identity)
       (string/join "\n")))

(defn markdown-item
  [[key title] m]
  (let [value (get m key)
        list? (:list? markdown-keys)
        required? (if (string/includes? (:full-name m) "/")
                    (:required? markdown-keys)
                    (:ns-required? markdown-keys))]
    (when (or value (required? key))
      (cond
        (blank? value)   (str section-start title "\n")
        (list? key)      (str section-start title "\n" (string/join "\n" value) "\n")
        :else            (str section-start title "\n\n" value "\n")))))

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
