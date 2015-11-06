## NaN



 <table border="1">
<tr>
<td>special symbol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1853"><img valign="middle" alt="[+] 0.0-1853" title="Added in 0.0-1853" src="https://img.shields.io/badge/+-0.0--1853-lightgrey.svg"></a> </td>
</tr>
</table>



The IEEE 754 Floating Point representation of NaN (not a number), an undefined
or unrepresentable value.

To test for NaN, use the native JavaScript [`js/isNaN`] or the safer [`js/Number.isNaN`].

[`js/isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN
[`js/Number.isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN



---

###### Examples:

```clj
NaN
;;=> NaN
```

Testing for NaN:

```clj
(js/Number.isNaN (/ 0 0))
;;=> true

(js/Number.isNaN 1)
;;=> false
```

Equivalent to the JavaScript symbol:

```clj
js/NaN
;;=> NaN
```



---

###### See Also:

[`Infinity`](../syntax/Infinity.md)<br>
[`nil`](../syntax/nil.md)<br>

---





Reader code @ [github](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L239-L259):

```clj
(defn- read-symbol
  [rdr initch]
  (let [[line column] (when (indexing-reader? rdr)
                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])]
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
                  {:line line :column column})))
            (reader-error rdr "Invalid token: " token))))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
tools.reader @ tools.reader-0.7.6
└── src
    └── main
        └── clojure
            └── clojure
                └── tools
                    └── <ins>[reader.clj:239-259](https://github.com/clojure/tools.reader/blob/tools.reader-0.7.6/src/main/clojure/clojure/tools/reader.clj#L239-L259)</ins>
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

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/syntax/NaN.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:description "The IEEE 754 Floating Point representation of NaN (not a number), an undefined\nor unrepresentable value.\n\nTo test for NaN, use the native JavaScript [`js/isNaN`] or the safer [`js/Number.isNaN`].\n\n[`js/isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/isNaN\n[`js/Number.isNaN`]:https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN",
 :ns "syntax",
 :name "NaN",
 :history [["+" "0.0-1853"]],
 :type "special symbol",
 :related ["syntax/Infinity" "syntax/nil"],
 :full-name-encode "syntax/NaN",
 :extra-sources [{:code "(defn- read-symbol\n  [rdr initch]\n  (let [[line column] (when (indexing-reader? rdr)\n                        [(get-line-number rdr) (int (dec (get-column-number rdr)))])]\n    (when-let [token (read-token rdr initch)]\n      (case token\n\n        ;; special symbols\n        \"nil\" nil\n        \"true\" true\n        \"false\" false\n        \"/\" '/\n        \"NaN\" Double/NaN\n        \"-Infinity\" Double/NEGATIVE_INFINITY\n        (\"Infinity\" \"+Infinity\") Double/POSITIVE_INFINITY\n\n        (or (when-let [p (parse-symbol token)]\n              (with-meta (symbol (p 0) (p 1))\n                (when line\n                  {:line line :column column})))\n            (reader-error rdr \"Invalid token: \" token))))))",
                  :title "Reader code",
                  :repo "tools.reader",
                  :tag "tools.reader-0.7.6",
                  :filename "src/main/clojure/clojure/tools/reader.clj",
                  :lines [239 259]}],
 :examples [{:id "9661ba",
             :content "```clj\nNaN\n;;=> NaN\n```\n\nTesting for NaN:\n\n```clj\n(js/Number.isNaN (/ 0 0))\n;;=> true\n\n(js/Number.isNaN 1)\n;;=> false\n```\n\nEquivalent to the JavaScript symbol:\n\n```clj\njs/NaN\n;;=> NaN\n```"}],
 :full-name "syntax/NaN",
 :display "NaN"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "syntax/NaN"]))
```

-->
