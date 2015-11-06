## cljs.reader/read-literal



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.107"><img valign="middle" alt="[+] 1.7.107" title="Added in 1.7.107" src="https://img.shields.io/badge/+-1.7.107-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-literal__ rdr ch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/reader.cljs#L337-L350):

```clj
(defn read-literal
  [rdr ch]
  (let [token (read-token rdr ch)
        chars (subs token 1)]
    (cond (identical? (.-length chars) 1) chars
          (identical? chars "tab")       "\t"
          (identical? chars "return")    "\r"
          (identical? chars "newline")   "\n"
          (identical? chars "space")     " "
          (identical? chars "backspace") "\b"
          (identical? chars "formfeed")  "\f"
          (identical? (.charAt chars 0) "u") (make-unicode-char (subs chars 1))
          (identical? (.charAt chars 0) "o") (not-implemented rdr token)
          :else (reader-error rdr "Unknown character literal: " token))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.122
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:337-350](https://github.com/clojure/clojurescript/blob/r1.7.122/src/main/cljs/cljs/reader.cljs#L337-L350)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-literal` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-literal.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-literal.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-literal",
 :type "function",
 :signature ["[rdr ch]"],
 :source {:code "(defn read-literal\n  [rdr ch]\n  (let [token (read-token rdr ch)\n        chars (subs token 1)]\n    (cond (identical? (.-length chars) 1) chars\n          (identical? chars \"tab\")       \"\\t\"\n          (identical? chars \"return\")    \"\\r\"\n          (identical? chars \"newline\")   \"\\n\"\n          (identical? chars \"space\")     \" \"\n          (identical? chars \"backspace\") \"\\b\"\n          (identical? chars \"formfeed\")  \"\\f\"\n          (identical? (.charAt chars 0) \"u\") (make-unicode-char (subs chars 1))\n          (identical? (.charAt chars 0) \"o\") (not-implemented rdr token)\n          :else (reader-error rdr \"Unknown character literal: \" token))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.122",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [337 350]},
 :full-name "cljs.reader/read-literal",
 :full-name-encode "cljs.reader/read-literal",
 :history [["+" "1.7.107"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-literal"]))
```

-->
