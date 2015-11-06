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




 @ [github](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L):

```clj

```

<!--
Repo - tag - source tree - lines:

 <pre>
clojure @ clojure-1.3.0
└── src
    └── jvm
        └── clojure
            └── lang
                └── <ins>[LispReader.java:](https://github.com/clojure/clojure/blob/clojure-1.3.0/src/jvm/clojure/lang/LispReader.java#L)</ins>
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
 :ns "syntax",
 :name "keyword-qualify",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/keyword" "cljs.core/keyword" "cljs.core/keyword?"],
 :full-name-encode "syntax/keyword-qualify",
 :source {:repo "clojure",
          :tag "clojure-1.3.0",
          :filename "src/jvm/clojure/lang/LispReader.java",
          :lines [nil]},
 :usage ["::foo" "::foo/bar"],
 :examples [{:id "b0a135",
             :content "If we are in the `user` namespace:\n\n```clj\n::foo\n;;=> :user/foo\n```\n\nWe can use namespace aliases:\n\n```clj\n(require '[example.util :as util])\n\n::util/foo\n;;=> :example.util/foo\n```\n\nExisting namespaces will resolve normally:\n\n```clj\n::cljs.core/foo\n;;=> :cljs.core/foo\n```\n\nNon-existing namespaces will throw a reader exception:\n\n```clj\n::foo/bar\n;; clojure.lang.ExceptionInfo: Invalid token: ::foo/bar {:type :reader-exception, ...\n```"}],
 :full-name "syntax/keyword-qualify",
 :display ":: keyword",
 :clj-doc "http://clojure.org/reader#toc1"}

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
