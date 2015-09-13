(ns cljs-api-gen.cljsdoc.doclink)

;;; Whenever we want to reference another doc page in markdown, we use the
;;; following forms
;;;
;;; - unnamed:              [doc:cljs.core/foo]
;;; - named:     [some name][doc:cljs.core/foo]
;;;
;;; To give these 'doc' forms meaning, we do the following:
;;;
;;;  Step 1: Insert display names for unnamed links:
;;;
;;;     [doc:cljs.core/foo] --> [<short display name>][doc:cljs.core/foo]
;;;
;;;  Step 2: Append links to the end of the body for all detected 'doc' forms:
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
  ;;    do not allow a preceding "]" char
  ;;    |
  ;;    |   same as doclink-pattern
  ;;    |   |
  ;;    |   |                do not allow a trailing "[" or "(" chars
  ;;    |   |                |
  ;;    |   |                |
  #"(?<!])\[doc:([^\]]+)\](?![\(\[])")
