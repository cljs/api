(ns cljs-api-gen.syntax
  (:require
    [cljs-api-gen.repo-cljs :refer [compare-clj-versions]]))

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

(def doc-destruct (str "http://clojure.org/special_forms#toc18")) ;; Destructuring

(def undoc (str doc-url "#undocumented")) ;; not real url, just a note

(def doc-lispreader "https://github.com/clojure/clojure/blob/clojure-1.7.0-RC1/src/jvm/clojure/lang/LispReader.java")
(def doc-eval     (str doc-lispreader "#L113"))
(def doc-hashbang (str doc-lispreader "#L114"))
(def doc-unread   (str doc-lispreader "#L115"))

(def doc-clj-tags
  "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947")

(defn edn-doc
  [name-]
  (str "https://github.com/edn-format/edn#" name-))

(def syntax
  "list of syntax forms, in the desired display order of reference table."

  ;; (syntax description)    (type)       (syntax form)          (clojure doc link)  (edn doc link)

  [;; destructuring pattern
   {:desc "destructure"                                          :clj-doc doc-destruct}

   ;; core syntax
   {:desc "string"           :char  \"    :form "\"\""           :clj-doc doc1     :edn-doc (edn-doc "strings")}
   {:desc "character"        :char  \\    :form "\\"             :clj-doc doc1     :edn-doc (edn-doc "characters")}
   {:desc "keyword"          :char  \:    :form ":"              :clj-doc doc1     :edn-doc (edn-doc "keywords")}
   {:desc "keyword-qualify"  :parent ":"  :form "::"             :clj-doc doc1}
   {:desc "symbol"                                               :clj-doc doc1     :edn-doc (edn-doc "symbols")}
   {:desc "number"                                               :clj-doc doc1     :edn-doc (edn-doc "integers")}
   {:desc "comment"          :char  \;    :form ";"              :clj-doc doc2     :edn-doc (edn-doc "comments")}
   {:desc "list"             :char  \(    :form "()"             :clj-doc doc1     :edn-doc (edn-doc "lists")}
   {:desc "vector"           :char  \[    :form "[]"             :clj-doc doc1     :edn-doc (edn-doc "vectors")}
   {:desc "map"              :char  \{    :form "{}"             :clj-doc doc1     :edn-doc (edn-doc "maps")}
   {:desc "deref"            :char  \@    :form "@"              :clj-doc doc2}
   {:desc "meta"             :char  \^    :form "^"              :clj-doc doc2}
   {:desc "quote"            :char  \'    :form "'"              :clj-doc doc2}
   {:desc "syntax-quote"     :char  \`    :form "`"              :clj-doc doc2}
   {:desc "unquote"          :char  \~    :form "~"              :clj-doc doc2}
   {:desc "unquote-splicing" :parent "~"  :form "~@"             :clj-doc doc2}
   {:desc "arg"              :char  \%    :form "%"              :clj-doc doc2}
   {:desc "dispatch"         :char  \#    :form "#"              :clj-doc doc2     :edn-doc (edn-doc "-dispatch-character")}

   ;; dispatch syntax
   {:desc "regex"            :dchar \"    :form "#\"\""          :clj-doc doc2}
   {:desc "set"              :dchar \{    :form "#{}"            :clj-doc doc1     :edn-doc (edn-doc "sets")}
   {:desc "function"         :dchar \(    :form "#()"            :clj-doc doc2}
   {:desc "var"              :dchar \'    :form "#'"             :clj-doc doc2}
   {:desc "ignore"           :dchar \_    :form "#_"             :clj-doc doc2     :edn-doc (edn-doc "discard")}
   {:desc "eval"             :dchar \=    :form "#="             :clj-doc doc-eval}
   {:desc "unreadable"       :dchar \<    :form "#<>"            :clj-doc doc-unread}
   {:desc "hashbang"         :dchar \!    :form "#!"             :clj-doc doc-hashbang}
   {:desc "cond"             :dchar \?    :form "#?"             :clj-doc doc5
          :clj-added "1.7.0-beta1"}
   {:desc "cond-splicing"    :parent "#?" :form "#?@"            :clj-doc doc5
          :clj-added "1.7.0-beta1"}

   ;; reserved symbols
   {:desc "true"             :ssym true   :form "true"           :clj-doc doc1     :edn-doc (edn-doc "booleans")}
   {:desc "false"            :ssym true   :form "false"          :clj-doc doc1     :edn-doc (edn-doc "booleans")}
   {:desc "nil"              :ssym true   :form "nil"            :clj-doc doc1     :edn-doc (edn-doc "nil")}
   {:desc "NaN"              :ssym true   :form "NaN"}
   {:desc "Infinity"         :ssym true   :form "Infinity"}

   ;; available tagged literals
   {:desc "uuid-tag"         :tag true    :form "#uuid"          :clj-doc doc-clj-tags :edn-doc (edn-doc "uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
          :clj-added "1.4.0"}
   {:desc "inst-tag"         :tag true    :form "#inst"          :clj-doc doc-clj-tags :edn-doc (edn-doc "inst-rfc-3339-format")
          :clj-added "1.4.0"}
   {:desc "queue-tag"        :tag true    :form "#queue"}
   {:desc "js-tag"           :tag true    :form "#js"}

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

(defn clj-syntax?
  "determine if the given syntax item is available for the given clojure version"
  [version item]
  (let [added (:clj-added item)]
    (or (nil? added)
        (>= (compare-clj-versions version added) 0))))

(defn clj-syntax
  [version]
  "the syntax of clojure used by clojurescript before tools.reader was used."
  (->> syntax
       (filter :clj-doc)                      ;; all clojure syntax forms should have an associated doc link
       (remove :parent)                       ;; already added by the parser if parents are present
       (remove :tag)                          ;; tag literals are handled separately
       (filter #(clj-syntax? version %))      ;; select syntax forms available for this clojure version
       (remove #(= "destructure" (:desc %)))  ;; already added by the parser
       ))
