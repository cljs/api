## () list



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#lists)
</td>
</tr>
</table>

<samp>(...)</samp><br>

---


Creates a list.  The most salient feature of a list is that, when evaluated, it
is interpreted as a _call_.

In most languages, the parenthesis is on the right side of a function when
calling:

```js
// (not ClojureScript)
f(a, b)
```

In ClojureScript, the parenthesis simply starts on the left side:

```clj
;; ClojureScript (comma is optional)
(f a, b)
```

Thus, when `(f a b)` is evaluated, it calls `f` with two arguments `a` and `b`.

If `f` is a function, its arguments `a` and `b` will be evaluated before
the function receives them.

If `f` is a special form or macro, it will receive its arguments `a` and `b`
unevaluated, where they _may_ be evaluated internally.

(See [`List`][doc:cljs.core/List] for data structure details.)

[doc:cljs.core/List]:../cljs.core/List.md

---

###### Examples:

The following is a list that is evaluated to create var `a`:

```clj
(def a 1)
```

An empty list is unevaluated and left as an empty list:

```clj
()
;;=> ()
```

To signify an unevaluated list, precede it with a quote:

```clj
'(1 2 3)
;;=> (1 2 3)
```



---

###### See Also:

[`[] vector`](../syntax/vector.md)<br>
[`' quote`](../syntax/quote.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L157-L166):

```clj
(defn- read-list
  [rdr _]
  (let [[line column] (when (indexing-reader? rdr)
                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])
        the-list (read-delimited \) rdr true)]
    (if (empty? the-list)
      '()
      (with-meta (clojure.lang.PersistentList/create the-list)
        (when line
          {:line line :column column})))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.7.5
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:157-166](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L157-L166)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L544-L563):

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
tools.reader @ tools.reader-0.7.5
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:544-563](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.5/src/main/clojure/clojure/tools/reader.clj#L544-L563)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/list.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Creates a list.  The most salient feature of a list is that, when evaluated, it\nis interpreted as a _call_.\n\nIn most languages, the parenthesis is on the right side of a function when\ncalling:\n\n```js\n// (not ClojureScript)\nf(a, b)\n```\n\nIn ClojureScript, the parenthesis simply starts on the left side:\n\n```clj\n;; ClojureScript (comma is optional)\n(f a, b)\n```\n\nThus, when `(f a b)` is evaluated, it calls `f` with two arguments `a` and `b`.\n\nIf `f` is a function, its arguments `a` and `b` will be evaluated before\nthe function receives them.\n\nIf `f` is a special form or macro, it will receive its arguments `a` and `b`\nunevaluated, where they _may_ be evaluated internally.\n\n(See [doc:cljs.core/List] for data structure details.)",
 :ns "syntax",
 :name "list",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/vector" "syntax/quote"],
 :full-name-encode "syntax/list",
 :extra-sources ({:code "(defn- read-list\n  [rdr _]\n  (let [[line column] (when (indexing-reader? rdr)\n                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n        the-list (read-delimited \\) rdr true)]\n    (if (empty? the-list)\n      '()\n      (with-meta (clojure.lang.PersistentList/create the-list)\n        (when line\n          {:line line :column column})))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.5",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [157 166]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.5",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [544 563]}),
 :usage ["(...)"],
 :examples [{:id "cd26b0",
             :content "The following is a list that is evaluated to create var `a`:\n\n```clj\n(def a 1)\n```\n\nAn empty list is unevaluated and left as an empty list:\n\n```clj\n()\n;;=> ()\n```\n\nTo signify an unevaluated list, precede it with a quote:\n\n```clj\n'(1 2 3)\n;;=> (1 2 3)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#lists",
 :full-name "syntax/list",
 :display "() list",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/list"]))
```

-->
