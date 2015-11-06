## {} map



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#maps)
</td>
</tr>
</table>

<samp>{...}</samp><br>

---


Creates a map.  Must contain pairs of key-values.  Keys and values can be any type.



---

###### Examples:

```clj
{:foo 1 :bar 2}
;;=> {:foo 1, :bar 2}
```

Use any value as a key:

```clj
(def m {[1 2] 3})
(get m [1 2])
;;=> 3
```



---

###### See Also:

[`cljs.core/hash-map`](../cljs.core/hash-map.md)<br>
[`cljs.core/array-map`](../cljs.core/array-map.md)<br>
[`cljs.core/sorted-map`](../cljs.core/sorted-map.md)<br>
[`cljs.core/sorted-map-by`](../cljs.core/sorted-map-by.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.1/src/main/clojure/clojure/tools/reader.clj#L227-L247):

```clj
(defn- read-map
  [rdr _ opts pending-forms]
  (let [[start-line start-column] (starting-line-col-info rdr)
        the-map (read-delimited \} rdr opts pending-forms)
        map-count (count the-map)
        [end-line end-column] (ending-line-col-info rdr)]
    (when (odd? map-count)
      (reader-error rdr "Map literal must contain an even number of forms"))
    (with-meta
      (if (zero? map-count)
        {}
        (RT/map (to-array the-map)))
      (when start-line
        (merge
         (when-let [file (get-file-name rdr)]
           {:file file})
         {:line start-line
          :column start-column
          :end-line end-line
          :end-column end-column})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:227-247](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.1/src/main/clojure/clojure/tools/reader.clj#L227-L247)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.1/src/main/clojure/clojure/tools/reader.clj#L727-L746):

```clj
(defn- macros [ch]
  (case ch
    \" read-string*
    \: read-keyword
    \; read-comment
    \' (wrapping-reader 'quote)
    \@ (wrapping-reader 'clojure.core/deref)
    \^ read-meta
    \` read-syntax-quote ;;(wrapping-reader 'syntax-quote)
    \~ read-unquote
    \( read-list
    \) read-unmatched-delimiter
    \[ read-vector
    \] read-unmatched-delimiter
    \{ read-map
    \} read-unmatched-delimiter
    \\ read-char*
    \% read-arg
    \# read-dispatch
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.1
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:727-746](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.1/src/main/clojure/clojure/tools/reader.clj#L727-L746)</ins>
</pre>
-->

---



 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a map.  Must contain pairs of key-values.  Keys and values can be any type.",
 :ns "syntax",
 :name "map",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/hash-map"
           "cljs.core/array-map"
           "cljs.core/sorted-map"
           "cljs.core/sorted-map-by"],
 :full-name-encode "syntax/map",
 :extra-sources ({:code "(defn- read-map\n  [rdr _ opts pending-forms]\n  (let [[start-line start-column] (starting-line-col-info rdr)\n        the-map (read-delimited \\} rdr opts pending-forms)\n        map-count (count the-map)\n        [end-line end-column] (ending-line-col-info rdr)]\n    (when (odd? map-count)\n      (reader-error rdr \"Map literal must contain an even number of forms\"))\n    (with-meta\n      (if (zero? map-count)\n        {}\n        (RT/map (to-array the-map)))\n      (when start-line\n        (merge\n         (when-let [file (get-file-name rdr)]\n           {:file file})\n         {:line start-line\n          :column start-column\n          :end-line end-line\n          :end-column end-column})))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [227 247]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [727 746]}),
 :usage ["{...}"],
 :examples [{:id "4696ad",
             :content "```clj\n{:foo 1 :bar 2}\n;;=> {:foo 1, :bar 2}\n```\n\nUse any value as a key:\n\n```clj\n(def m {[1 2] 3})\n(get m [1 2])\n;;=> 3\n```"}],
 :edn-doc "https://github.com/edn-format/edn#maps",
 :full-name "syntax/map",
 :display "{} map",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/map"]))
```

-->
