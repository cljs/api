## #?@ reader conditional splicing



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3190"><img valign="middle" alt="[+] 0.0-3190" title="Added in 0.0-3190" src="https://img.shields.io/badge/+-0.0--3190-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc5)
</td>
</tr>
</table>

<samp>#?@(...)</samp><br>

---


(Only allowed in `.cljc` files or the REPL)

Like [`cond`][doc:syntax/cond], except:

- each conditional value must be a sequence,
- the selected sequence is spliced into the parent form,
- and it must have a parent form to be spliced into (not top level).

`(def #?@(:cljs [foo 1])` is read as `(def foo 1)`.

[doc:syntax/cond]:../syntax/cond.md

---

###### Examples:

```clj
'(def #?@(:cljs [a 1]
          :clj  [b 2]))
;;=> (def a 1)
```



---

###### See Also:

[`#? reader conditional`](../syntax/cond.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.0/src/main/clojure/clojure/tools/reader.clj#L485-L500):

```clj
(defn- read-cond
  [rdr _ opts pending-forms]
  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))
    (throw (RuntimeException. "Conditional read not allowed")))
  (if-let [ch (read-char rdr)]
    (let [splicing (= ch \@)
          ch (if splicing (read-char rdr) ch)]
      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]
        (if (not= ch \()
          (throw (RuntimeException. "read-cond body must be a list"))
          (binding [*suppress-read* true]
            (if (= :preserve (:read-cond opts))
              (reader-conditional (read-list rdr ch opts pending-forms) splicing)
              (read-cond-delimited rdr splicing opts pending-forms))))
        (reader-error rdr "EOF while reading character")))
    (reader-error rdr "EOF while reading character")))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:485-500](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.0/src/main/clojure/clojure/tools/reader.clj#L485-L500)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.0/src/main/clojure/clojure/tools/reader.clj#L750-L762):

```clj
(defn- dispatch-macros [ch]
  (case ch
    \^ read-meta                ;deprecated
    \' (wrapping-reader 'var)
    \( read-fn
    \= read-eval
    \{ read-set
    \< (throwing-reader "Unreadable form")
    \" read-regex
    \! read-comment
    \_ read-discard
    \? read-cond
    nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.9.0
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:750-762](https://github.com/clojure/tools.reader/blob/tools.reader-0.9.0/src/main/clojure/clojure/tools/reader.clj#L750-L762)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/cond-splicing.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(Only allowed in `.cljc` files or the REPL)\n\nLike [doc:syntax/cond], except:\n\n- each conditional value must be a sequence,\n- the selected sequence is spliced into the parent form,\n- and it must have a parent form to be spliced into (not top level).\n\n`(def #?@(:cljs [foo 1])` is read as `(def foo 1)`.",
 :ns "syntax",
 :name "cond-splicing",
 :history [["+" "0.0-3190"]],
 :type "syntax",
 :related ["syntax/cond"],
 :full-name-encode "syntax/cond-splicing",
 :extra-sources ({:code "(defn- read-cond\n  [rdr _ opts pending-forms]\n  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))\n    (throw (RuntimeException. \"Conditional read not allowed\")))\n  (if-let [ch (read-char rdr)]\n    (let [splicing (= ch \\@)\n          ch (if splicing (read-char rdr) ch)]\n      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]\n        (if (not= ch \\()\n          (throw (RuntimeException. \"read-cond body must be a list\"))\n          (binding [*suppress-read* true]\n            (if (= :preserve (:read-cond opts))\n              (reader-conditional (read-list rdr ch opts pending-forms) splicing)\n              (read-cond-delimited rdr splicing opts pending-forms))))\n        (reader-error rdr \"EOF while reading character\")))\n    (reader-error rdr \"EOF while reading character\")))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.0",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [485 500]}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.9.0",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [750 762]}),
 :usage ["#?@(...)"],
 :examples [{:id "9d0020",
             :content "```clj\n'(def #?@(:cljs [a 1]\n          :clj  [b 2]))\n;;=> (def a 1)\n```"}],
 :full-name "syntax/cond-splicing",
 :display "#?@ reader conditional splicing",
 :clj-doc "http://clojure.org/reader#toc5"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/cond-splicing"]))
```

-->
