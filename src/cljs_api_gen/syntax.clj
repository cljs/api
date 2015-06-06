(ns cljs-api-gen.syntax)

;;--------------------------------------------------------------------------------
;; Clojure's Syntax
;;
;;   - tagged literals (from `clojure.core/default-data-readers` >= 1.4)
;;   - syntax (from `clojure.lang/LispReader`)
;;--------------------------------------------------------------------------------

(def doc-url "http://clojure.org/reader")

(def doc1 (str doc-url "#toc1")) ;; Reader forms
(def doc2 (str doc-url "#toc2")) ;; Macro characters
(def doc4 (str doc-url "#toc4")) ;; Tagged literals
(def doc5 (str doc-url "#toc5")) ;; Reader conditionals
(def undoc (str doc-url "#undocumented")) ;; not real url, just a note

(def doc-lispreader "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java")
(def doc-eval     (str doc-lispreader "#L113"))
(def doc-hashbang (str doc-lispreader "#L114"))
(def doc-unread   (str doc-lispreader "#L115"))

(def doc-edn "https://github.com/edn-format/edn")
(def doc-uuid (str doc-edn "#uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6"))
(def doc-inst (str doc-edn "#inst-rfc-3339-format"))

(def syntax
  "list of syntax forms, in the desired display order of reference table."
  [{:char  \"   :form "\"\""    :desc "string"        :clj-doc doc1}
   {:char  \\   :form "\\"      :desc "character"     :clj-doc doc1}
   {:char  \:   :form ":"       :desc "keyword"       :clj-doc doc1}
   {                            :desc "symbol"        :clj-doc doc1}
   {                            :desc "number"        :clj-doc doc1}
   {:char  \;   :form ";"       :desc "comment"       :clj-doc doc2}
   {:char  \(   :form "()"      :desc "list"          :clj-doc doc1}
   {:char  \[   :form "[]"      :desc "vector"        :clj-doc doc1}
   {:char  \{   :form "{}"      :desc "map"           :clj-doc doc1}
   {:char  \@   :form "@"       :desc "deref"         :clj-doc doc2}
   {:char  \^   :form "^"       :desc "meta"          :clj-doc doc2}
   {:char  \'   :form "'"       :desc "quote"         :clj-doc doc2}
   {:char  \`   :form "`"       :desc "syntax-quote"  :clj-doc doc2}
   {:char  \~   :form "~"       :desc "unquote"       :clj-doc doc2}
   {:char  \%   :form "%"       :desc "arg"           :clj-doc doc2}
   {:char  \#   :form "#"       :desc "dispatch"      :clj-doc doc2}
   {:dchar \"   :form "#\"\""   :desc "regex"         :clj-doc doc2}
   {:dchar \{   :form "#{}"     :desc "set"           :clj-doc doc1}
   {:dchar \(   :form "#()"     :desc "function"      :clj-doc doc2}
   {:dchar \'   :form "#'"      :desc "var"           :clj-doc doc2}
   {:dchar \_   :form "#_"      :desc "ignore"        :clj-doc doc2}
   {:dchar \=   :form "#="      :desc "eval"          :clj-doc doc-eval}
   {:dchar \<   :form "#<>"     :desc "unreadable"    :clj-doc doc-unread}
   {:dchar \!   :form "#!"      :desc "hashbang"      :clj-doc doc-hashbang}
   {:dchar \?   :form "#?"      :desc "cond"          :clj-doc doc5   :clj-added "1.7"}

   {:tag true   :form "#uuid"   :desc "uuid"          :clj-doc doc-uuid}
   {:tag true   :form "#inst"   :desc "inst"          :clj-doc doc-inst}
   {:tag true   :form "#queue"  :desc "queue"}
   {:tag true   :form "#js"     :desc "js"}
   ])

(def syntax-order
  "name -> ordered index"
  (into {} (map-indexed (fn [i v] [(:desc v) i]) syntax)))

(def syntax-map
  "name -> item"
  (zipmap (map :desc syntax) syntax))

(def char-map
  "macro character -> item"
  (let [items (filter :char syntax)]
    (zipmap (map :char items) items)))

(def dchar-map
  "dispatch macro character -> item"
  (let [items (filter :dchar syntax)]
    (zipmap (map :dchar items) items)))

(def clj-tagged-lits
  "set of tagged literals available in Clojure (e.g. #uuid, #inst)"
  (->> syntax
       (filter :tag)
       (filter :clj-doc)
       (map :form)
       set))

(def base-clj-syntax
  "the base syntax of clojure used by clojurescript before tools.reader was used."
  (->> syntax
       (remove :tag)
       (remove :clj-added)))
