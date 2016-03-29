## #? reader conditional



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-3190"><img valign="middle" alt="[+] 0.0-3190" title="Added in 0.0-3190" src="https://img.shields.io/badge/+-0.0--3190-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc5)
</td>
</tr>
</table>

<samp>#?(...)</samp><br>

---


(Only allowed in `.cljc` files or the REPL)

Allows the reader to conditionally select from the given list of forms
depending on available "feature" keys.  For example:

```clj
#?(:clj "Clojure"
   :cljs "ClojureScript")
```

ClojureScript's reader is configured with the `:cljs` feature key, making the
expression above read as `"ClojureScript"`.  Clojure's reader is
similarly configured with the `:clj` key.

This essentially allows us to write portable code for use in both Clojure and
ClojureScript.

## For Macros

Reader conditionals are especially important when writing macros in
ClojureScript, since the macros may be handed off to Clojure for evaluation,
depending on the ClojureScript compiler version:

| compiler version  | macros evaluated by |
|-------------------|---------------------|
| ClojureScript JVM | Clojure             |
| ClojureScript JS  | ClojureScript       |

Thus, reader conditionals allow us to account for differences in both versions
of the compiler.  See [`defmacro`][doc:cljs.core/defmacro] for details.

[doc:cljs.core/defmacro]:../cljs.core/defmacro.md

---

###### Examples:

```clj
#?(:clj "Clojure" :cljs "ClojureScript")
;;=> "ClojureScript"
```

A function that works in Clojure and ClojureScript ([source]):

[source]:https://github.com/lymingtonprecision/route-ccrs/blob/c579aea05504736f2cfbd31c3c755f7e25fdad77/src/route_ccrs/manufacturing_methods.cljc#L8-L10

```clj
(defn str->int [s]
  #?(:clj  (java.lang.Integer/parseInt s)
     :cljs (js/parseInt s)))

(str->int "123")
;;=> 123
```



---

###### See Also:

[`#?@ reader conditional splicing`](../syntax/cond-splicing.md)<br>

---





Reader code @ [github]():

```clj
(defn- read-cond
  [rdr _ opts pending-forms]
  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))
    (throw (RuntimeException. "Conditional read not allowed")))
  (if-let [ch (read-char rdr)]
    (let [splicing (= ch \@)
          ch (if splicing (read-char rdr) ch)]
      (when splicing
        (when-not *read-delim*
          (reader-error rdr "cond-splice not in list")))
      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]
        (if (not= ch \()
          (throw (RuntimeException. "read-cond body must be a list"))
          (binding [*suppress-read* (or *suppress-read* (= :preserve (:read-cond opts)))]
            (if *suppress-read*
              (reader-conditional (read-list rdr ch opts pending-forms) splicing)
              (read-cond-delimited rdr splicing opts pending-forms))))
        (reader-error rdr "EOF while reading character")))
    (reader-error rdr "EOF while reading character")))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Reader table @ [github]():

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/cond.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "(Only allowed in `.cljc` files or the REPL)\n\nAllows the reader to conditionally select from the given list of forms\ndepending on available \"feature\" keys.  For example:\n\n```clj\n#?(:clj \"Clojure\"\n   :cljs \"ClojureScript\")\n```\n\nClojureScript's reader is configured with the `:cljs` feature key, making the\nexpression above read as `\"ClojureScript\"`.  Clojure's reader is\nsimilarly configured with the `:clj` key.\n\nThis essentially allows us to write portable code for use in both Clojure and\nClojureScript.\n\n## For Macros\n\nReader conditionals are especially important when writing macros in\nClojureScript, since the macros may be handed off to Clojure for evaluation,\ndepending on the ClojureScript compiler version:\n\n| compiler version  | macros evaluated by |\n|-------------------|---------------------|\n| ClojureScript JVM | Clojure             |\n| ClojureScript JS  | ClojureScript       |\n\nThus, reader conditionals allow us to account for differences in both versions\nof the compiler.  See [doc:cljs.core/defmacro] for details.",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/reader#toc5"},
 :ns "syntax",
 :name "cond",
 :name-encode "cond",
 :history [["+" "0.0-3190"]],
 :type "syntax",
 :related ["syntax/cond-splicing"],
 :full-name-encode "syntax/cond",
 :extra-sources ({:code "(defn- read-cond\n  [rdr _ opts pending-forms]\n  (when (not (and opts (#{:allow :preserve} (:read-cond opts))))\n    (throw (RuntimeException. \"Conditional read not allowed\")))\n  (if-let [ch (read-char rdr)]\n    (let [splicing (= ch \\@)\n          ch (if splicing (read-char rdr) ch)]\n      (when splicing\n        (when-not *read-delim*\n          (reader-error rdr \"cond-splice not in list\")))\n      (if-let [ch (if (whitespace? ch) (read-past whitespace? rdr) ch)]\n        (if (not= ch \\()\n          (throw (RuntimeException. \"read-cond body must be a list\"))\n          (binding [*suppress-read* (or *suppress-read* (= :preserve (:read-cond opts)))]\n            (if *suppress-read*\n              (reader-conditional (read-list rdr ch opts pending-forms) splicing)\n              (read-cond-delimited rdr splicing opts pending-forms))))\n        (reader-error rdr \"EOF while reading character\")))\n    (reader-error rdr \"EOF while reading character\")))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [496 514],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L496-L514"}
                 {:code "(defn- dispatch-macros [ch]\n  (case ch\n    \\^ read-meta                ;deprecated\n    \\' (wrapping-reader 'var)\n    \\( read-fn\n    \\= read-eval\n    \\{ read-set\n    \\< (throwing-reader \"Unreadable form\")\n    \\\" read-regex\n    \\! read-comment\n    \\_ read-discard\n    \\? read-cond\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [764 776],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L764-L776"}),
 :usage ["#?(...)"],
 :examples [{:id "eec90f",
             :content "```clj\n#?(:clj \"Clojure\" :cljs \"ClojureScript\")\n;;=> \"ClojureScript\"\n```\n\nA function that works in Clojure and ClojureScript ([source]):\n\n[source]:https://github.com/lymingtonprecision/route-ccrs/blob/c579aea05504736f2cfbd31c3c755f7e25fdad77/src/route_ccrs/manufacturing_methods.cljc#L8-L10\n\n```clj\n(defn str->int [s]\n  #?(:clj  (java.lang.Integer/parseInt s)\n     :cljs (js/parseInt s)))\n\n(str->int \"123\")\n;;=> 123\n```"}],
 :full-name "syntax/cond",
 :display "#? reader conditional",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/cond.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/cond"]))
```

-->
