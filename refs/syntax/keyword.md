## : keyword



 <table border="1">
<tr>
<td>syntax</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/1GjPKvB.png"> clj doc](http://clojure.org/reader#toc1)
</td>
<td>
[<img height="24px" valign="middle" src="http://i.imgur.com/I8uNXHv.png"> edn doc](https://github.com/edn-format/edn#keywords)
</td>
</tr>
</table>

<samp>:foo</samp><br>
<samp>:foo/bar</samp><br>

---


A keyword is a string-like datatype that evaluates to itself.  Keywords are often used
as enums or keys for maps.  Keywords should not start with a number.

Keywords can have an optional namespace. For example, `:foo/bar`. This is useful
for functions in a namespace to prevent key collisions on a globally accessible
map.



---

###### Examples:

```clj
:foo
;;=> :foo

:a/foo
;;=> :a/foo
```



---
###### Examples:

A keyword is also callable for retrieving values from a map:

```clj
(def m {:foo 1})
(:foo m)
;;=> 1

(def things [{:foo 1 :bar 2}
             {:foo 3 :bar 4}
             {:foo 5 :bar 6}])
(map :foo things)
;;=> (1 3 5)
```



---

###### See Also:

[`:: keyword`](../syntax/keyword-qualify.md)<br>
[`cljs.core/keyword`](../cljs.core/keyword.md)<br>
[`cljs.core/keyword?`](../cljs.core/keywordQMARK.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L265-L283):

```clj
(defn- read-keyword
  [reader initch]
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
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:265-283](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L265-L283)</ins>
</pre>
-->

---
Reader table @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L543-L562):

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
tools.reader @ tools.reader-0.7.8
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:543-562](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.8/src/main/clojure/clojure/tools/reader.clj#L543-L562)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "A keyword is a string-like datatype that evaluates to itself.  Keywords are often used\nas enums or keys for maps.  Keywords should not start with a number.\n\nKeywords can have an optional namespace. For example, `:foo/bar`. This is useful\nfor functions in a namespace to prevent key collisions on a globally accessible\nmap.",
 :ns "syntax",
 :name "keyword",
 :history [["+" "0.0-927"]],
 :type "syntax",
 :related ["syntax/keyword-qualify"
           "cljs.core/keyword"
           "cljs.core/keyword?"],
 :full-name-encode "syntax/keyword",
 :extra-sources ({:code "(defn- read-keyword\n  [reader initch]\n  (let [ch (read-char reader)]\n    (if-not (whitespace? ch)\n      (let [token (read-token reader ch)\n            s (parse-symbol token)]\n        (if s\n          (let [^String ns (s 0)\n                ^String name (s 1)]\n            (if (identical? \\: (nth token 0))\n              (if ns\n                (let [ns (resolve-ns (symbol (subs ns 1)))]\n                  (if ns\n                    (keyword (str ns) name)\n                    (reader-error reader \"Invalid token: :\" token)))\n                (keyword (str *ns*) (subs name 1)))\n              (keyword ns name)))\n          (reader-error reader \"Invalid token: :\" token)))\n      (reader-error reader \"Invalid token: :\"))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.8",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [265 283]}
                 {:code "(defn- macros [ch]\n  (case ch\n    \\\" read-string*\n    \\: read-keyword\n    \\; read-comment\n    \\' (wrapping-reader 'quote)\n    \\@ (wrapping-reader 'clojure.core/deref)\n    \\^ read-meta\n    \\` read-syntax-quote ;;(wrapping-reader 'syntax-quote)\n    \\~ read-unquote\n    \\( read-list\n    \\) read-unmatched-delimiter\n    \\[ read-vector\n    \\] read-unmatched-delimiter\n    \\{ read-map\n    \\} read-unmatched-delimiter\n    \\\\ read-char*\n    \\% read-arg\n    \\# read-dispatch\n    nil))",
                  :title "Reader table",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.8",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [543 562]}),
 :usage [":foo" ":foo/bar"],
 :examples [{:id "e5fdbe",
             :content "```clj\n:foo\n;;=> :foo\n\n:a/foo\n;;=> :a/foo\n```"}
            {:id "9765fe",
             :content "A keyword is also callable for retrieving values from a map:\n\n```clj\n(def m {:foo 1})\n(:foo m)\n;;=> 1\n\n(def things [{:foo 1 :bar 2}\n             {:foo 3 :bar 4}\n             {:foo 5 :bar 6}])\n(map :foo things)\n;;=> (1 3 5)\n```"}],
 :edn-doc "https://github.com/edn-format/edn#keywords",
 :full-name "syntax/keyword",
 :display ": keyword",
 :clj-doc "http://clojure.org/reader#toc1"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/keyword"]))
```

-->
