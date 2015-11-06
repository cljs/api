## cljs.reader/macros



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__macros__ c)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/reader.cljs#L382-L400):

```clj
(defn macros [c]
  (cond
   (identical? c \") read-string*
   (identical? c \:) read-keyword
   (identical? c \;) not-implemented ;; never hit this
   (identical? c \') (wrapping-reader 'quote)
   (identical? c \@) (wrapping-reader 'deref)
   (identical? c \^) read-meta
   (identical? c \`) not-implemented
   (identical? c \~) not-implemented
   (identical? c \() read-list
   (identical? c \)) read-unmatched-delimiter
   (identical? c \[) read-vector
   (identical? c \]) read-unmatched-delimiter
   (identical? c \{) read-map
   (identical? c \}) read-unmatched-delimiter
   (identical? c \\) read-char
   (identical? c \#) read-dispatch
   :else nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2027
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:382-400](https://github.com/clojure/clojurescript/blob/r2027/src/cljs/cljs/reader.cljs#L382-L400)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/macros` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/macros.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/macros.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "macros",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn macros [c]\n  (cond\n   (identical? c \\\") read-string*\n   (identical? c \\:) read-keyword\n   (identical? c \\;) not-implemented ;; never hit this\n   (identical? c \\') (wrapping-reader 'quote)\n   (identical? c \\@) (wrapping-reader 'deref)\n   (identical? c \\^) read-meta\n   (identical? c \\`) not-implemented\n   (identical? c \\~) not-implemented\n   (identical? c \\() read-list\n   (identical? c \\)) read-unmatched-delimiter\n   (identical? c \\[) read-vector\n   (identical? c \\]) read-unmatched-delimiter\n   (identical? c \\{) read-map\n   (identical? c \\}) read-unmatched-delimiter\n   (identical? c \\\\) read-char\n   (identical? c \\#) read-dispatch\n   :else nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2027",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [382 400]},
 :full-name "cljs.reader/macros",
 :full-name-encode "cljs.reader/macros",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/macros"]))
```

-->
