## ^ meta



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc2)
</td>
</tr>
</table>

<samp>^{...}</samp><br>
<samp>^:foo</samp><br>
<samp>^"foo"</samp><br>
<samp>^foo</samp><br>

---


Attaches metadata to the following form.  Metadata can only be attached to a
symbol or collection.

Metadata will assume the following transformations depending on its type:

- keyword `^:foo` => `^{:foo true}`
- string `^"foo"` => `^{:tag "foo"}`
- symbol `^foo` => `^{:tag <value of foo>}`



---

###### Examples:

Attach metadata to a collection:

```clj
^:foo [1 2 3]
;;=> [1 2 3]
```

View the resulting metadata:

```clj
(meta ^:foo [1 2 3])
;;=> {:foo true}

(meta ^{:foo "bar"} [1 2 3])
;;=> {:foo "bar"}

(meta ^"foo" [1 2 3])
;;=> {:tag "foo"}

(def foo 1)
(meta ^foo [1 2 3])
;;=> {:tag 1}
```

Chain metadata:

```clj
(meta ^:foo ^"foo" [1 2 3])
;;=> {:foo true, :tag "foo"}
```



---

###### See Also:

[`cljs.core/meta`](../cljs.core/meta.md)<br>
[`cljs.core/with-meta`](../cljs.core/with-meta.md)<br>
[`cljs.core/vary-meta`](../cljs.core/vary-meta.md)<br>
[`cljs.core/alter-meta!`](../cljs.core/alter-metaBANG.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L340-L356):

```clj
(defn- read-meta
  [rdr _]
  (log-source rdr
    (let [[line column] (when (indexing-reader? rdr)
                          [(get-line-number rdr) (int (dec (get-column-number rdr)))])
          m (desugar-meta (read rdr true nil true))]
      (when-not (map? m)
        (reader-error rdr "Metadata must be Symbol, Keyword, String or Map"))
      (let [o (read rdr true nil true)]
        (if (instance? IMeta o)
          (let [m (if (and line (seq? o))
                    (assoc m :line line :column column)
                    m)]
            (if (instance? IObj o)
              (with-meta o (merge (meta o) m))
              (reset-meta! o m)))
          (reader-error rdr "Metadata can only be applied to IMetas"))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.8.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:340-356](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L340-L356)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L591-L610):

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
tools.reader @ tools.reader-0.8.10
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:591-610](https://github.com/clojure/tools.reader/blob/tools.reader-0.8.10/src/main/clojure/clojure/tools/reader.clj#L591-L610)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/meta.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "Attaches metadata to the following form.  Metadata can only be attached to a\nsymbol or collection.\n\nMetadata will assume the following transformations depending on its type:\n\n- keyword `^:foo` => `^{:foo true}`\n- string `^\"foo\"` => `^{:tag \"foo\"}`\n- symbol `^foo` => `^{:tag <value of foo>}`",
 :ns "syntax",
 :name "meta",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["cljs.core/meta"
           "cljs.core/with-meta"
           "cljs.core/vary-meta"
           "cljs.core/alter-meta!"],
 :full-name-encode "syntax/meta",
 :extra-sources ({:code "(defn- read-meta\n  [rdr _]\n  (log-source rdr\n    (let [[line column] (when (indexing-reader? rdr)\n                          [(get-line-number rdr) (int (dec (get-column-number rdr)))])\n          m (desugar-meta (read rdr true nil true))]\n      (when-not (map? m)\n        (reader-error rdr \"Metadata must be Symbol, Keyword, String or Map\"))\n      (let [o (read rdr true nil true)]\n        (if (instance? IMeta o)\n          (let [m (if (and line (seq? o))\n                    (assoc m :line line :column column)\n                    m)]\n            (if (instance? IObj o)\n              (with-meta o (merge (meta o) m))\n              (reset-meta! o m)))\n          (reader-error rdr \"Metadata can only be applied to IMetas\"))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [340 356]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.8.10",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [591 610]}),
 :usage ["^{...}" "^:foo" "^\"foo\"" "^foo"],
 :examples [{:id "5b8fec",
             :content "Attach metadata to a collection:\n\n```clj\n^:foo [1 2 3]\n;;=> [1 2 3]\n```\n\nView the resulting metadata:\n\n```clj\n(meta ^:foo [1 2 3])\n;;=> {:foo true}\n\n(meta ^{:foo \"bar\"} [1 2 3])\n;;=> {:foo \"bar\"}\n\n(meta ^\"foo\" [1 2 3])\n;;=> {:tag \"foo\"}\n\n(def foo 1)\n(meta ^foo [1 2 3])\n;;=> {:tag 1}\n```\n\nChain metadata:\n\n```clj\n(meta ^:foo ^\"foo\" [1 2 3])\n;;=> {:foo true, :tag \"foo\"}\n```"}],
 :full-name "syntax/meta",
 :display "^ meta",
 :clj-doc "http://clojure.org/reader#toc2"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/meta"]))
```

-->
