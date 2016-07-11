(ns cljs-api-gen.docfile.doclink
  (:require
    [cljs-api-gen.state :refer [*result* docfile-map]]
    [cljs-api-gen.encode :refer [encode-name]]
    [cljs-api-gen.config :refer [docfile-dir docfile-ext]]
    [clojure.string :as string]))

;;; ================ MARKDOWN SYNTAX ==================
;;;
;;; We use the doclink namenclature as a markdown biblio alias with the `doc:` prefix:
;;;
;;; 1. unnamed:              [doc:cljs.core/foo]      --> name inserted and resolved to biblio link
;;; 2. named:     [some name][doc:cljs.core/foo]      --> resolved to biblio link
;;; 3. ignored:              [doc:cljs.core/foo](...)
;;; 4. ignored:              [doc:cljs.core/foo][...]
;;;
;;; To give these 'doc' forms meaning, we do the following:
;;;
;;;  A: Insert display names for unnamed links:
;;;
;;;     [doc:cljs.core/foo] --> [<short display name>][doc:cljs.core/foo]
;;;
;;;  B: Append biblio links to the end of the body for all detected 'doc' forms:
;;;
;;;     [doc:cljs.core/foo]:<full path to actual page for 'cljs.core/foo'>
;;;


;;----------------------------------------------------------------------
;; Create the set of doclinks to be resolved for a given markdown body.
;;----------------------------------------------------------------------

(def doclink-pattern
  "Pattern for potential doclinks in markdown."
  #"\[doc:([^\]]+)\]")

(defn parse-docname
  "foo/bar      <-- normal symbol
   foo          <-- namespace `foo`
   compiler/foo <-- compiler namespace `foo`"
  [docname]
  (let [[a b] ((juxt namespace name) (symbol docname))]
    (cond
      (= a "compiler") {:compiler? true, :ns a}
      (nil? a)         {:ns b}
      :else            {:ns a, :name b})))

(defn docname?
  [docname]
  (let [{:keys [ns name compiler?]} (parse-docname docname)]
    (if name
      (get-in *result* [:symbols docname])
      (get-in *result* [:namespaces ns]))))

(defn doclink-url
  [docname]
  (let [{:keys [ns name compiler?]} (parse-docname docname)
        path (if name
               (str ns "/" (encode-name name))
               ns)]
    (str "https://github.com/cljs/api/blob/master/" docfile-dir "/"
         path
         docfile-ext)))

(defn md-biblio
  "Return a set of doclinks found in a given markdown body."
  [md-body]
  (when md-body
    (->> md-body
         (re-seq doclink-pattern)
         (map second)
         (set))))

;;----------------------------------------------------------------------
;; Insert names for unnamed doclinks in a given markdown body.
;;----------------------------------------------------------------------

(def unnamed-doclink-pattern
  "Pattern for unnamed potential doclinks in markdown (i.e. not followed by () or [].)
  Example: [doc:cljs.core/foo], not:
    - [doc:cljs.core/foo](example.com)
    - [doc:cljs.core/foo][link-alias]
    - [name][doc:cljs.core/foo]
  "
  ;;    do not allow a preceding "]" char (see #2 above)
  ;;    |
  ;;    |   same as doclink-pattern
  ;;    |   |
  ;;    |   |                do not allow a trailing "[" or "(" chars (see #3 and #4 above)
  ;;    |   |                |
  ;;    |   |                |
  #"(?<!])\[doc:([^\]]+)\](?![\(\[])")

(defn get-short-display-name
  [docname]
  (let [{:keys [ns name compiler?]} (parse-docname docname)
        display (get-in @docfile-map [docname :display-as])]
    (or display name ns)))

(defn insert-doclink-name
  [[whole-match docname]]
  (let [name- (get-short-display-name docname)]
    (if (string/includes? name- "`")
      (str "[``" name- "``]" whole-match)
      (str "[`" name- "`]" whole-match))))

(defn resolve-unnamed-doclinks
  "Process doclinks in given markdown body."
  [md-body]
  (cond-> md-body
    md-body (string/replace
              unnamed-doclink-pattern
              insert-doclink-name)))
