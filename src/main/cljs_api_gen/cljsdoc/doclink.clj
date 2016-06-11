(ns cljs-api-gen.cljsdoc.doclink
  (:require
    [cljs-api-gen.encode :refer [fullname->ns-name]]))

;;; ================ NAMING CONVENTION ==================
;;;
;;; Whenever we want to reference another doc page in markdown, we use the
;;; following nomenclature:
;;;
;;;   cljs.core/foo         <--- var
;;;
;;; Referencing namespaces is a little trickier, because we have a page for
;;; each API type (compiler or library), since they have different APIs.
;;;
;;;   library/cljs.core     <--- ns in the library API
;;;   compiler/cljs.repl    <--- ns in the compiler API
;;;
;;; The syntax page is its own thing:
;;;
;;;   syntax                <--- syntax forms
;;;
;;; The special forms namespaces are also in the library API for consistency
;;; even though there aren't compiler API versions for them:
;;;
;;;   library/special       <--- special forms ns
;;;
;;; Vars such as `cljs.core/foo` don't require an API type prefix like
;;; `library/cljs.core/foo` because we are (safely I hope) assuming that symbols
;;; of the same name between APIs have the same usages.


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

(def doclink-pattern
  "Pattern for potential doclinks in markdown."
  #"\[doc:([^\]]+)\]")

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

(defn valid-doclink?
  [result full-name]
  (let [[a b] (fullname->ns-name full-name)]
    (if (nil? b)
      (= "syntax" a)
      (if (#{"library" "compiler"} a)
        (get-in result [:api (keyword a) :namespace-names b])
        (get-in result [:symbols full-name])))))
