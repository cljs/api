## Infinity



 <table border="1">
<tr>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1853"><img valign="middle" alt="[+] 0.0-1853" title="Added in 0.0-1853" src="https://img.shields.io/badge/+-0.0--1853-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>Infinity</samp><br>
<samp>-Infinity</samp><br>
<samp>+Infinity</samp><br>

---


The IEEE 754 Floating Point representations of infinity.

`Infinity` = `+Infinity` = positive infinity

`-Infinity` = negative infinity



---

###### Examples:

```clj
Infinity
;;=> Infinity

+Infinity
;;=> Infinity

-Infinity
;;=> -Infinity
```

Math with infinities:

```clj
(/ 1 0)
;;=> Infinity

(Math/log 0)
;;=> -Infinity

(* 0 Infinity)
;;=> NaN
```

They are equivalent to the JavaScript symbols:

```clj
js/Infinity
;;=> Infinity

js/-Infinity
;;=> -Infinity
```



---

###### See Also:

[`number literal`](../syntax/number.md)<br>
[`NaN`](../syntax/NaN.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.10.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L303-L329):

```clj
(defn- read-symbol
  [rdr initch]
  (let [[line column] (starting-line-col-info rdr)]
    (when-let [token (read-token rdr initch)]
      (case token

        ;; special symbols
        "nil" nil
        "true" true
        "false" false
        "/" '/
        "NaN" Double/NaN
        "-Infinity" Double/NEGATIVE_INFINITY
        ("Infinity" "+Infinity") Double/POSITIVE_INFINITY

        (or (when-let [p (parse-symbol token)]
              (with-meta (symbol (p 0) (p 1))
                (when line
                  (merge
                   (when-let [file (get-file-name rdr)]
                     {:file file})
                   (let [[end-line end-column] (ending-line-col-info rdr)]
                     {:line line
                      :column column
                      :end-line end-line
                      :end-column end-column})))))
            (reader-error rdr "Invalid token: " token))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.10.0-alpha3
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:303-329](https://github.com/clojure/tools.reader/blob/tools.reader-0.10.0-alpha3/src/main/clojure/clojure/tools/reader.clj#L303-L329)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/Infinity.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "The IEEE 754 Floating Point representations of infinity.\n\n`Infinity` = `+Infinity` = positive infinity\n\n`-Infinity` = negative infinity",
 :ns "syntax",
 :name "Infinity",
 :history [["+" "0.0-1853"]],
 :type "special symbol",
 :related ["syntax/number" "syntax/NaN"],
 :full-name-encode "syntax/Infinity",
 :extra-sources [{:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (starting-line-col-info rdr)]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  (merge\n                   (when-let [file (get-file-name rdr)]\n                     {:file file})\n                   (let [[end-line end-column] (ending-line-col-info rdr)]\n                     {:line line\n                      :column column\n                      :end-line end-line\n                      :end-column end-column})))))\n            (reader-error rdr \"Invalid token: \" token))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.10.0-alpha3",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [303 329]}],
 :usage ["Infinity" "-Infinity" "+Infinity"],
 :examples [{:id "463fd4",
             :content "```clj\nInfinity\n;;=> Infinity\n\n+Infinity\n;;=> Infinity\n\n-Infinity\n;;=> -Infinity\n```\n\nMath with infinities:\n\n```clj\n(/ 1 0)\n;;=> Infinity\n\n(Math/log 0)\n;;=> -Infinity\n\n(* 0 Infinity)\n;;=> NaN\n```\n\nThey are equivalent to the JavaScript symbols:\n\n```clj\njs/Infinity\n;;=> Infinity\n\njs/-Infinity\n;;=> -Infinity\n```"}],
 :full-name "syntax/Infinity",
 :display "Infinity"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/Infinity"]))
```

-->
