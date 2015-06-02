(ns cljs-api-gen.encode
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [replace]]))

;; FIXME: if encoding/decoding fails to be lossless, and we need to add another underscore to each side
;;        create a encoding name decorator function #(str "__" % "__")
(def encoding
  {"."  "_DOT_"
   ">"  "_GT_"
   "<"  "_LT_"
   "!"  "_BANG_"
   "?"  "_QMARK_"
   "*"  "_STAR_"
   "+"  "_PLUS_"
   "="  "_EQ_"
   "/"  "_SLASH_"

   ";"  "_SEMICOLON_" ;; syntax - comment
   "\\" "_BSLASH_"    ;; syntax - character
   "#"  "_HASH_"      ;; syntax - tagged literal
   "["  "_LSQUARE_"   ;; syntax - vector
   "]"  "_RSQUARE_"
   "{"  "_LCURLY_"    ;; syntax - map
   "}"  "_RCURLY_"
   "("  "_LPAREN_"    ;; syntax - list
   ")"  "_RPAREN_"
   "^"  "_CARET_"     ;; syntax - meta
   "\"" "_DQUOTE_"    ;; syntax - string
   "'"  "_SQUOTE_"    ;; syntax - quote
   "@"  "_ATSIGN_"    ;; syntax - reader-conditional splice
   })

(defn encode-name [name-]
  (reduce (fn [s [a b]] (replace s a b))
    (name name-) encoding))

(defn decode-name [name-]
  (reduce (fn [s [a b]] (replace s b a))
    (name name-) encoding))

(defn decode-fullname
  [fullname]
  (let [[_ ns- name-] (re-find #"([^_]*)_(.*)" fullname)]
    (str ns- "/" (decode-name name-))))

(defn encode-fullname
  [fullname]
  (let [[ns- name-] ((juxt namespace name) (symbol fullname))
        encoded (str ns- "_" (encode-name name-))]
    encoded))

(defn assert-lossless
  [fullname]
  (let [encoded (encode-fullname fullname)
        decoded (decode-fullname encoded)]
    (assert (= decoded fullname)
            (str "Symbol name was lost during encoding and decoding:\n"
                 "  " fullname "  ->  " encoded "  ->  " decoded))))

