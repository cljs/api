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

(def syntax
  "list of syntax forms, in the desired display order of reference table."

  ;; POSSIBLE KEYS
  ;;
  ;; :display       human readable display name
  ;; :id            ID used for indexing (as pseudo-symbol `syntax/<id>`)
  ;; :char          identifying character in reader map of tools.reader
  ;; :dchar         identifying character in dispatch reader map of tools.reader
  ;; :parent        if this is a sub-form, include parent form (use parent's :form)
  ;; :type          special syntax type (if applicable)
  ;; :form          string or array of strings showing syntax prefix or empty syntax form
  ;; :clj-doc       link to official clojure doc (signifies clojure relationship)
  ;; :edn-doc       link to official edn doc (signifies edn relationship)
  ;; :clj-added     version this was added to Clojure's lisp reader
  ;; :usage         if :form is not sufficient to show usage, use this

  [;; core syntax
   {:display "\"\" string"                      :id "string"             :char  \"    :form "\"\""           :clj-doc doc1     :edn-doc (edn-doc "strings")}
   {:display "\\ character"                     :id "character"          :char  \\    :form "\\"             :clj-doc doc1     :edn-doc (edn-doc "characters")}
   {:display ": keyword"                        :id "keyword"            :char  \:    :form ":"              :clj-doc doc1     :edn-doc (edn-doc "keywords")}
   {:display ":: keyword qualify"               :id "keyword-qualify"    :parent ":"  :form "::"             :clj-doc doc1}
   {:display "symbol (syntax)"                  :id "symbol"                                                 :clj-doc doc1     :edn-doc (edn-doc "symbols")}
   {:display "number (syntax)"                  :id "number"                                                 :clj-doc doc1     :edn-doc (edn-doc "integers")}
   {:display "; comment"                        :id "comment"            :char  \;    :form ";"              :clj-doc doc2     :edn-doc (edn-doc "comments")}
   {:display "() list"                          :id "list"               :char  \(    :form "()"             :clj-doc doc1     :edn-doc (edn-doc "lists")}
   {:display "[] vector"                        :id "vector"             :char  \[    :form "[]"             :clj-doc doc1     :edn-doc (edn-doc "vectors")}
   {:display "{} map"                           :id "map"                :char  \{    :form "{}"             :clj-doc doc1     :edn-doc (edn-doc "maps")}
   {:display "@ deref"                          :id "deref"              :char  \@    :form "@"              :clj-doc doc2}
   {:display "^ meta"                           :id "meta"               :char  \^    :form "^"              :clj-doc doc2}
   {:display "' quote"                          :id "quote"              :char  \'    :form "'"              :clj-doc doc2}
   {:display "` syntax quote"                   :id "syntax-quote"       :char  \`    :form "`"              :clj-doc doc2}
   {:display "~ unquote"                        :id "unquote"            :char  \~    :form "~"              :clj-doc doc2}
   {:display "~@ unquote splicing"              :id "unquote-splicing"   :parent "~"  :form "~@"             :clj-doc doc2}
   {:display "% arg"                            :id "arg"                :char  \%    :form "%"              :clj-doc doc2}
   {:display "# dispatch"                       :id "dispatch"           :char  \#    :form "#"              :clj-doc doc2     :edn-doc (edn-doc "-dispatch-character")}

   ;; dispatch syntax
   {:display "# tagged literal"                 :id "tagged-literal"                  :form "#"              :clj-doc doc4     :edn-doc (edn-doc "tagged-elements") :clj-added "1.4.0"}
   {:display "#\"\" regex"                      :id "regex"              :dchar \"    :form "#\"\""          :clj-doc doc2}
   {:display "#{} set"                          :id "set"                :dchar \{    :form "#{}"            :clj-doc doc1     :edn-doc (edn-doc "sets")}
   {:display "#() function"                     :id "function"           :dchar \(    :form "#()"            :clj-doc doc2}
   {:display "#' var"                           :id "var"                :dchar \'    :form "#'"             :clj-doc doc2}
   {:display "#_ ignore"                        :id "ignore"             :dchar \_    :form "#_"             :clj-doc doc2     :edn-doc (edn-doc "discard")}
   {:display "#= eval"                          :id "eval"               :dchar \=    :form "#="             :clj-doc doc-eval}
   {:display "#<> unreadable"                   :id "unreadable"         :dchar \<    :form "#<>"            :clj-doc doc-unread}
   {:display "#! hashbang"                      :id "hashbang"           :dchar \!    :form "#!"             :clj-doc doc-hashbang}
   {:display "#? reader conditional"            :id "cond"               :dchar \?    :form "#?"             :clj-doc doc5 :clj-added "1.7.0-beta1"}
   {:display "#?@ reader conditional splicing"  :id "cond-splicing"      :parent "#?" :form "#?@"            :clj-doc doc5 :clj-added "1.7.0-beta1"}

   ;; special symbols
   {:display "true|false"                       :id "boolean"  :type "special symbol" :form ["true" "false"] :clj-doc doc1     :edn-doc (edn-doc "booleans")}
   {:display "nil"                              :id "nil"      :type "special symbol" :form "nil"            :clj-doc doc1     :edn-doc (edn-doc "nil")}
   {:display "NaN"                              :id "NaN"      :type "special symbol" :form "NaN"}
   {:display "Infinity"                         :id "Infinity" :type "special symbol" :form ["Infinity" "-Infinity" "+Infinity"]}

   ;; available tagged literals
   {:display "#uuid \"\" literal"               :id "uuid-literal"  :type "tagged literal" :form "#uuid \"\"" :clj-doc doc-clj-tags :edn-doc (edn-doc "uuid-f81d4fae-7dec-11d0-a765-00a0c91e6bf6") :clj-added "1.4.0"
    :usage ["#uuid \"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\""]}
   {:display "#inst \"\" literal"               :id "inst-literal"  :type "tagged literal" :form "#inst \"\"" :clj-doc doc-clj-tags :edn-doc (edn-doc "inst-rfc-3339-format") :clj-added "1.4.0"
    :usage ["#inst \"yyyy-mm-dd\""
            "#inst \"yyyy-mm-ddThh:mm:ss\""
            "#inst \"yyyy-mm-ddThh:mm:ssZ\""
            "#inst \"yyyy-mm-ddThh:mm:ss-hh:mm\""]}
   {:display "#queue [] literal"                :id "queue-literal" :type "tagged literal" :form "#queue []"}
   {:display "#js []|{} literal"                :id "js-literal"    :type "tagged literal" :form ["#js {}" "#js []"]}

   ;; special namespaces
   {:display "js/ namespace"                    :id "js-namespace"   :type "special namespace" :form "js/"}
   {:display "Math/ namespace"                  :id "Math-namespace" :type "special namespace" :form "Math/" :clj-doc doc-interop}

   ;; destructuring pattern
   {:display "[]|{} destructure"                :id "destructure" :type "binding" :form [":keys" ":syms" ":strs" ":or" ":as" "&"] :clj-doc doc-destruct
    :usage ["{:keys [] :strs [] :syms [] :or {} :as name}"
            "[arg1 arg2 & args :as name]"]
    }

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
       (remove #(= (:type %) "tagged literal"))  ;; tag literals are handled separately
       (filter #(clj-syntax? version %))         ;; select syntax forms available for this clojure version
       (remove #(= (:id %) "destructure"))     ;; already added by the parser
       ))
