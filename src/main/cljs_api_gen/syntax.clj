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

(def doc-interop "http://clojure.org/java_interop#toc6")

(def doc-clj-tags
  "https://github.com/clojure/clojure/blob/clojure-1.6.0/src/clj/clojure/core.clj#L6947")

(defn edn-doc
  [name-]
  (str "https://github.com/edn-format/edn#" name-))

(def doc-cheatsheet "http://clojure.org/cheatsheet")
(def doc-syntax-quote "http://clojure.org/reader#syntax-quote")

(def syntax
  "list of syntax forms, in the desired display order of reference table."

  ;; POSSIBLE KEYS
  ;;
  ;; :id            ID used for indexing (as pseudo-symbol `syntax/<id>`)
  ;; :char          identifying character in reader map of tools.reader
  ;; :dchar         identifying character in dispatch reader map of tools.reader
  ;; :parent        if this is a sub-form, include parent form (use parent's :form)
  ;; :type          special syntax type (if applicable)
  ;; :clj-doc       link to official clojure doc (signifies clojure relationship)
  ;; :edn-doc       link to official edn doc (signifies edn relationship)
  ;; :clj-added     version this was added to Clojure's lisp reader

  [;; core syntax
   {:id "string"             :char  \"     :clj-doc doc1     :edn-doc (edn-doc "strings")}
   {:id "character"          :char  \\     :clj-doc doc1     :edn-doc (edn-doc "characters")}
   {:id "keyword"            :char  \:     :clj-doc doc1     :edn-doc (edn-doc "keywords")}
   {:id "keyword-qualify"    :parent "keyword"   :clj-doc doc1}
   {:id "symbol"                           :clj-doc doc1     :edn-doc (edn-doc "symbols")}
   {:id "number"                           :clj-doc doc1     :edn-doc (edn-doc "integers")}
   {:id "comment"            :char  \;     :clj-doc doc2     :edn-doc (edn-doc "comments")}
   {:id "list"               :char  \(     :clj-doc doc1     :edn-doc (edn-doc "lists")}
   {:id "vector"             :char  \[     :clj-doc doc1     :edn-doc (edn-doc "vectors")}
   {:id "map"                :char  \{     :clj-doc doc1     :edn-doc (edn-doc "maps")}
   {:id "deref"              :char  \@     :clj-doc doc2}
   {:id "meta"               :char  \^     :clj-doc doc2}
   {:id "quote"              :char  \'     :clj-doc doc2}
   {:id "syntax-quote"       :char  \`     :clj-doc doc2}
   {:id "unquote"            :char  \~     :clj-doc doc2}
   {:id "unquote-splicing"   :parent "unquote"   :clj-doc doc2}
   {:id "arg"                :char  \%     :clj-doc doc2}
   {:id "dispatch"           :char  \#     :clj-doc doc2     :edn-doc (edn-doc "-dispatch-character")}

   ;; dispatch syntax
   {:id "tagged-literal"                   :clj-doc doc4     :edn-doc (edn-doc "tagged-elements") :clj-added "1.4.0"}
   {:id "regex"              :dchar \"     :clj-doc doc2}
   {:id "set"                :dchar \{     :clj-doc doc1     :edn-doc (edn-doc "sets")}
   {:id "function"           :dchar \(     :clj-doc doc2}
   {:id "var"                :dchar \'     :clj-doc doc2}
   {:id "ignore"             :dchar \_     :clj-doc doc2     :edn-doc (edn-doc "discard")}
   {:id "eval"               :dchar \=     :clj-doc doc-eval}
   {:id "unreadable"         :dchar \<     :clj-doc doc-unread}
   {:id "hashbang"           :dchar \!     :clj-doc doc-hashbang}
   {:id "cond"               :dchar \?     :clj-doc doc5 :clj-added "1.7.0-beta1"}
   {:id "cond-splicing"   :parent "cond"  :clj-doc doc5 :clj-added "1.7.0-beta1"}

   ;; special symbols
   {:id "boolean"  :type "special symbol" :clj-doc doc1     :edn-doc (edn-doc "booleans")}
   {:id "nil"      :type "special symbol" :clj-doc doc1     :edn-doc (edn-doc "nil")}
   {:id "NaN"      :type "special symbol"}
   {:id "Infinity" :type "special symbol"}

   ;; available tagged literals
   {:id "uuid-literal"  :type "tagged literal" :clj-doc doc-clj-tags :edn-doc (edn-doc "uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6") :clj-added "1.4.0"}
   {:id "inst-literal"  :type "tagged literal" :clj-doc doc-clj-tags :edn-doc (edn-doc "inst-rfc-3339-format") :clj-added "1.4.0"}
   {:id "queue-literal" :type "tagged literal"}
   {:id "js-literal"    :type "tagged literal"}

   ;; special namespaces
   {:id "js-namespace"   :type "special namespace"}
   {:id "Math-namespace" :type "special namespace" :clj-doc doc-interop}

   ;; destructuring pattern
   ;; (uses destructure source)
   {:id "destructure-vector" :type "binding"  :clj-doc doc-destruct}
   {:id "destructure-map"    :type "binding"  :clj-doc doc-destruct}

   ;; conventions
   {:id "predicate" :type "convention" :clj-doc doc-cheatsheet}
   {:id "impure"    :type "convention" :clj-doc doc-cheatsheet}
   {:id "earmuffs"  :type "convention" :clj-doc doc-cheatsheet}
   {:id "unused"    :type "convention" :clj-doc doc-cheatsheet}

   ;; characters
   {:id "comma"         :type "special character" :clj-doc doc-cheatsheet :edn-doc (edn-doc "general-considerations")}
   {:id "ns-separator"  :type "special character" :clj-doc doc-cheatsheet :edn-doc (edn-doc "symbols")}
   {:id "gensym"        :type "special character" :clj-doc doc-syntax-quote}

   ])

(def syntax-order
  "name -> ordered index"
  (into {} (map-indexed (fn [i v] [(:id v) i]) syntax)))

(def syntax-map
  "name -> item"
  (zipmap (map :id syntax) syntax))

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
       (filter :clj-doc)                         ;; all clojure syntax forms should have an associated doc link
       (remove :parent)                          ;; already added by the parser if parents are present
       (filter #(clj-syntax? version %))         ;; select syntax forms available for this clojure version
       (remove #(#{"tagged-literal"
                   "binding"
                   "convention"
                   "special character"} (:type %)))  ;; handled manually
       ))
