(ns cljs-api-gen.syntax
  (:require
    [cljs-api-gen.repo-cljs :refer [compare-clj-versions]]))

;;--------------------------------------------------------------------------------
;; Clojure's Syntax
;;
;;   - tagged literals (from `clojure.core/default-data-readers` >= 1.4)
;;   - syntax (from `clojure.lang/LispReader`)
;;--------------------------------------------------------------------------------

(def syntax
  "list of syntax forms, in the desired display order of reference table."

  ;; POSSIBLE KEYS
  ;;
  ;; :id            ID used for indexing (as pseudo-symbol `syntax/<id>`)
  ;; :char          identifying character in reader map of tools.reader
  ;; :dchar         identifying character in dispatch reader map of tools.reader
  ;; :parent        if this is a sub-form, include parent form (use parent's :form)
  ;; :type          special syntax type (if applicable)
  ;; :clj-added     version this was added to Clojure's lisp reader

  [;; core syntax
   {:id "string"             :char  \"}
   {:id "character"          :char  \\}
   {:id "keyword"            :char  \:}
   {:id "keyword-qualify"                 :parent "keyword"}
   {:id "symbol"}
   {:id "number"}
   {:id "comment"            :char  \;}
   {:id "list"               :char  \(}
   {:id "vector"             :char  \[}
   {:id "map"                :char  \{}
   {:id "deref"              :char  \@}
   {:id "meta"               :char  \^}
   {:id "quote"              :char  \'}
   {:id "syntax-quote"       :char  \`}
   {:id "unquote"            :char  \~}
   {:id "unquote-splicing"                :parent "unquote"}
   {:id "arg"                :char  \%}
   {:id "dispatch"           :char  \#}

   ;; dispatch syntax
   {:id "tagged-literal"                                      :clj-added "1.4.0"}
   {:id "regex"              :dchar \"}
   {:id "set"                :dchar \{}
   {:id "function"           :dchar \(}
   {:id "var"                :dchar \'}
   {:id "ignore"             :dchar \_}
   {:id "eval"               :dchar \=}
   {:id "unreadable"         :dchar \<}
   {:id "shebang"            :dchar \!}
   {:id "cond"               :dchar \?                        :clj-added "1.7.0-beta1"}
   {:id "cond-splicing"                   :parent "cond"      :clj-added "1.7.0-beta1"}
   {:id "ns-map"             :dchar \:                        :clj-added "1.9.0-alpha10"}
   {:id "ns-map-alias"                    :parent "ns-map"    :clj-added "1.9.0-alpha10"}

   ; symbolic values
   ; (could have `:dchar \#`, but we don't include since we manually handle it)
   {:id "NaN"  :type "symbolic value" :clj-added "1.9.0"}
   {:id "Inf"  :type "symbolic value" :clj-added "1.9.0"}
   {:id "-Inf" :type "symbolic value" :clj-added "1.9.0"}

   ;; special symbols
   {:id "true"     :type "special symbol"}
   {:id "false"    :type "special symbol"}
   {:id "nil"      :type "special symbol"}

   ;; available tagged literals
   {:id "uuid-literal"  :type "tagged literal"                :clj-added "1.4.0"}
   {:id "inst-literal"  :type "tagged literal"                :clj-added "1.4.0"}
   {:id "queue-literal" :type "tagged literal"}
   {:id "js-literal"    :type "tagged literal"}

   ;; destructuring pattern
   ;; (uses destructure source)
   {:id "destructure-vector" :type "binding"}
   {:id "destructure-map"    :type "binding"}

   ;; special namespaces
   {:id "js-namespace"   :type "special namespace"}
   {:id "Math-namespace" :type "special namespace"}

   ;; conventions
   {:id "predicate" :type "convention"}
   {:id "impure"    :type "convention"}
   {:id "earmuffs"  :type "convention"}
   {:id "unused"    :type "convention"}

   ;; characters
   {:id "comma"         :type "special character"}
   {:id "namespace"     :type "special character"}
   {:id "auto-gensym"   :type "special character"}
   {:id "dot"           :type "special character"}
   {:id "rest"          :type "special character"}
   {:id "whitespace"    :type "special character"}])

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
       (remove #(#{"tagged-literal"              ;; these are all handled manually
                   "binding"
                   "special namespace"
                   "convention"
                   "special character"} (:type %)))))
