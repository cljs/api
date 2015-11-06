## % arg



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>



Special vars for accessing implicit function arguments.

Only usable inside [`function`][doc:syntax/function].

- `%` or `%1` for first argument.
- `%2`, `%3` and so on for subsequent arguments
- `%&` for the rest of the arguments after the highest individually referenced argument

[doc:syntax/function]:../syntax/function.md

---

###### Examples:

```clj
(map #(* 2 %) [1 2 3])
;;=> (2 4 6)

(def f #(println %1 %2 %&))
(f 1 2 3 4 5)
;; prints: 1 2 (3 4 5)
```



---

###### See Also:

[`#() function`](../syntax/function.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L412-L431):

```clj
(defn- read-arg
  [rdr pct]
  (if-not (thread-bound? #'arg-env)
    (read-symbol rdr pct)
    (let [ch (peek-char rdr)]
      (cond
       (or (whitespace? ch)
           (macro-terminating? ch)
           (nil? ch))
       (register-arg 1)

       (identical? ch \&)
       (do (read-char rdr)
           (register-arg -1))

       :else
       (let [n (read rdr true nil true)]
         (if-not (integer? n)
           (throw (IllegalStateException. "Arg literal must be %, %& or %integer"))
           (register-arg n)))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:412-431](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L412-L431)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L588-L607):

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
tools.reader @ tools.reader-0.8.16
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:588-607](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.16/src/main/clojure/clojure/tools/reader.clj#L588-L607)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/arg.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Special vars for accessing implicit function arguments.\n\nOnly usable inside [doc:syntax/function].\n\n- `%` or `%1` for first argument.\n- `%2`, `%3` and so on for subsequent arguments\n- `%&` for the rest of the arguments after the highest individually referenced argument",
 :ns "syntax",
 :name "arg",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/function"],
 :full-name-encode "syntax/arg",
 :extra-sources ({:code "(defn- read-arg\n  [rdr pct]\n  (if-not (thread-bound? #'arg-env)\n    (read-symbol rdr pct)\n    (let [ch (peek-char rdr)]\n      (cond\n       (or (whitespace? ch)\n           (macro-terminating? ch)\n           (nil? ch))\n       (register-arg 1)\n\n       (identical? ch \\&)\n       (do (read-char rdr)\n           (register-arg -1))\n\n       :else\n       (let [n (read rdr true nil true)]\n         (if-not (integer? n)\n           (throw (IllegalStateException. \"Arg literal must be %, %& or %integer\"))\n           (register-arg n)))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [412 431]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.16",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [588 607]}),
 :examples [{:id "d17825",
             :content "```clj\n(map #(* 2 %) [1 2 3])\n;;=> (2 4 6)\n\n(def f #(println %1 %2 %&))\n(f 1 2 3 4 5)\n;; prints: 1 2 (3 4 5)\n```"}],
 :full-name "syntax/arg",
 :display "% arg",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/arg"]))
```

-->
