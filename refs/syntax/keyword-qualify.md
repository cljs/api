## :: keyword



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
</tr>
</table>

<samp>::foo</samp><br>
<samp>::foo/bar</samp><br>

---


Keywords starting with `::` will evaluate to regular keywords with a namespace qualification.
The namespace will resolve to either of the following:

- current namespace if none is specified
- given namespace if it exists
- full namespace if the given one is an alias
- reader error if given namespace doesn't exist



---

###### Examples:

If we are in the `user` namespace:

```clj
::foo
;;=> :user/foo
```

We can use namespace aliases:

```clj
(require '[example.util :as util])

::util/foo
;;=> :example.util/foo
```

Existing namespaces will resolve normally:

```clj
::cljs.core/foo
;;=> :cljs.core/foo
```

Non-existing namespaces will throw a reader exception:

```clj
::foo/bar
;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...
```



---

###### See Also:

[`: keyword`](../syntax/keyword.md)<br>
[`cljs.core/keyword`](../cljs.core/keyword.md)<br>
[`cljs.core/keyword?`](../cljs.core/keywordQMARK.md)<br>

---





Reader code @ [github]():

```clj
(defn- read-keyword
  [reader initch opts pending-forms]
  (let [ch (read-char reader)]
    (if-not (whitespace? ch)
      (let [token (read-token reader ch)
            s (parse-symbol token)]
        (if s
          (let [^String ns (s 0)
                ^String name (s 1)]
            (if (identical? \: (nth token 0))
              (if ns
                (let [ns (resolve-ns (symbol (subs ns 1)))]
                  (if ns
                    (keyword (str ns) name)
                    (reader-error reader "Invalid token: :" token)))
                (keyword (str *ns*) (subs name 1)))
              (keyword ns name)))
          (reader-error reader "Invalid token: :" token)))
      (reader-error reader "Invalid token: :"))))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>
-->

---
Reader table @ [github]():

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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/keyword-qualify.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Keywords starting with `::` will evaluate to regular keywords with a namespace qualification.\nThe namespace will resolve to either of the following:\n\n- current namespace if none is specified\n- given namespace if it exists\n- full namespace if the given one is an alias\n- reader error if given namespace doesn't exist",
 :syntax-equiv {:edn-url nil,
                :clj-url "http://clojure.org/reader#toc1"},
 :ns "syntax",
 :name "keyword-qualify",
 :name-encode "keyword-qualify",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/keyword" "cljs.core/keyword" "cljs.core/keyword?"],
 :full-name-encode "syntax/keyword-qualify",
 :extra-sources ({:code "(defn- read-keyword\n  [reader initch opts pending-forms]\n  (let [ch (read-char reader)]\n    (if-not (whitespace? ch)\n      (let [token (read-token reader ch)\n            s (parse-symbol token)]\n        (if s\n          (let [^String ns (s 0)\n                ^String name (s 1)]\n            (if (identical? \\: (nth token 0))\n              (if ns\n                (let [ns (resolve-ns (symbol (subs ns 1)))]\n                  (if ns\n                    (keyword (str ns) name)\n                    (reader-error reader \"Invalid token: :\" token)))\n                (keyword (str *ns*) (subs name 1)))\n              (keyword ns name)))\n          (reader-error reader \"Invalid token: :\" token)))\n      (reader-error reader \"Invalid token: :\"))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-beta1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [343 361],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-beta1/src/main/clojure/clojure/tools/reader.clj#L343-L361"}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-1.0.0-beta1",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [743 762],
                  :url "https://github.com/clojure/tools.reader/blob/tools.reader-1.0.0-beta1/src/main/clojure/clojure/tools/reader.clj#L743-L762"}),
 :usage ["::foo" "::foo/bar"],
 :examples [{:id "b0a135",
             :content "If we are in the `user` namespace:\n\n```clj\n::foo\n;;=> :user/foo\n```\n\nWe can use namespace aliases:\n\n```clj\n(require '[example.util :as util])\n\n::util/foo\n;;=> :example.util/foo\n```\n\nExisting namespaces will resolve normally:\n\n```clj\n::cljs.core/foo\n;;=> :cljs.core/foo\n```\n\nNon-existing namespaces will throw a reader exception:\n\n```clj\n::foo/bar\n;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...\n```"}],
 :full-name "syntax/keyword-qualify",
 :display ":: keyword",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/keyword-qualify.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/keyword-qualify"]))
```

-->
