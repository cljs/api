(ns cljs-api-gen.encode
  (:refer-clojure :exclude [replace])
  (:require
    [clojure.string :refer [replace]]))

;;--------------------------------------------------------------------------------
;; Our custom encoding scheme for symbols <-> filenames
;;--------------------------------------------------------------------------------

(def encoding
  {"."  "DOT"
   ">"  "GT"
   "<"  "LT"
   "!"  "BANG"
   "?"  "QMARK"
   "*"  "STAR"
   "+"  "PLUS"
   "="  "EQ"
   "/"  "SLASH"})


(defn fullname->ns-name
  "fullname has a special meaning:

  foo     <-- we consider a standalone symbol a namespace
  foo/bar <-- normal qualified symbol

  return [ns name] pair for the given 'fullname'
  "
  [fullname]
  (let [[ns- name-] ((juxt namespace name) (symbol fullname))
        qualified? (not (nil? ns-))]

    (if qualified?
      [ns- name-]
      [name- nil])))

(defn encode-name [name-]
  (reduce (fn [s [a b]] (replace s a b))
    (name name-) encoding))

(defn decode-name [name-]
  (reduce (fn [s [a b]] (replace s b a))
    (name name-) encoding))

(defn decode-fullname
  [fullname]
  (let [[ns- name-] (fullname->ns-name fullname)
        decoded (cond-> ns-
                  name- (str "/" (decode-name name-)))]
    decoded))

(defn encode-fullname
  [fullname]
  (let [[ns- name-] (fullname->ns-name fullname)
        encoded (cond-> ns-
                  name- (str "/" (encode-name name-)))]
    encoded))

(defn assert-lossless
  [fullname]
  (let [encoded (encode-fullname fullname)
        decoded (decode-fullname encoded)]
    (assert (= decoded fullname)
            (str "Symbol name was lost during encoding and decoding:\n"
                 "  " fullname "  ->  " encoded "  ->  " decoded))))
