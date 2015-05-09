(ns cljs-api-gen.write
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.set :refer [rename-keys]]
    [clojure.string :refer [join replace]]
    [cljs-api-gen.repo-cljs :refer [cljs-tag->version]]
    [cljs-api-gen.config :refer [*output-dir*
                                 docs-dir
                                 edn-output-file]]
    ))

(defn symbol->filename
  [s]
  (-> (name s)
      (replace "." "DOT")
      (replace ">" "GT")
      (replace "<" "LT")
      (replace "!" "BANG")
      (replace "?" "QMARK")
      (replace "*" "STAR")
      (replace "+" "PLUS")
      (replace "=" "EQ")
      (replace "/" "SLASH")))

(defn item-filename
  [item]
  (str *output-dir* "/" docs-dir "/" (:ns item) "_" (symbol->filename (:name item))))

(defn make-history-text
  [text]
  (let [plus-or-minus (first text)
        change (if (= \+ plus-or-minus) "Added" "Removed")
        tag (subs text 1)
        version (cljs-tag->version tag)]
    (str change " in " version)))

(defn cljsdoc-section
  [title content]
  (when content
    (str "===== " title "\n" content "\n")))

(defn make-cljsdoc
  [item]
  (join "\n"
    (keep identity
      [(cljsdoc-section "Name" (:full-name item))
       (cljsdoc-section "Type" (:type item))
       (cljsdoc-section "Return Type" (:return-type item))
       (cljsdoc-section "Docstring" (:docstring item))
       (cljsdoc-section "Signature" (join "\n" (:signatures item)))
       (cljsdoc-section "Filename" (:filename item))
       (cljsdoc-section "Source" (:source item))
       (cljsdoc-section "Github" (:github-link item))
       (cljsdoc-section "History" (join "\n" (map make-history-text (:history item))))
       ""])))

(defn dump-doc-file!
  [item]
  (let [filename (str (item-filename item) ".cljsdoc")
        cljsdoc-content (make-cljsdoc item)]
    (spit filename cljsdoc-content) ;; use `:append true` to see overwrites
    ))

(defn dump-edn-file!
  [api]
  (let [outfile (str *output-dir* "/" edn-output-file)
        transform (fn [x]
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
                                        :source])
                        (rename-keys $ {:filename    :source-filename
                                        :github-link :source-link
                                        :signatures  :signature})
                        (update-in $ [:signature] #(map str %))
                        (update-in $ [:name] str)
                        (assoc $ :filename (str (:ns $) "_" (symbol->filename (:name $)) ".cljsdoc"))
                        (filter (comp not nil? second) $)
                        (into {} $)))
        outdata (map transform api)]
  (spit outfile (pr-str outdata))))

(defn dump-api-docs!
  [api]
  (doseq [item api]
    (dump-doc-file! item))
  (dump-edn-file! api))

