## cljs.core/CHAR_MAP



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/1.7.10"><img valign="middle" alt="[+] 1.7.10" title="Added in 1.7.10" src="https://img.shields.io/badge/+-1.7.10-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L280-L305):

```clj
(def ^{:jsdoc ["@enum {string}"]}
  CHAR_MAP
  #js {"-"    "_"
       ":"    "_COLON_"
       "+"    "_PLUS_"
       ">"    "_GT_"
       "<"    "_LT_"
       "="    "_EQ_"
       "~"    "_TILDE_"
       "!"    "_BANG_"
       "@"    "_CIRCA_"
       "#"    "_SHARP_"
       "'"    "_SINGLEQUOTE_"
       "\\\"" "_DOUBLEQUOTE_"
       "%"    "_PERCENT_"
       "^"    "_CARET_"
       "&"    "_AMPERSAND_"
       "*"    "_STAR_"
       "|"    "_BAR_"
       "{"    "_LBRACE_"
       "}"    "_RBRACE_"
       "["    "_LBRACK_"
       "]"    "_RBRACK_"
       "/"    "_SLASH_"
       "\\\\" "_BSLASH_"
       "?"    "_QMARK_"})
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.145
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[core.cljs:280-305](https://github.com/clojure/clojurescript/blob/r1.7.145/src/main/cljs/cljs/core.cljs#L280-L305)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.core/CHAR_MAP` @ crossclj](http://crossclj.info/fun/cljs.core.cljs/CHAR_MAP.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.core/CHAR_MAP.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.core",
 :name "CHAR_MAP",
 :type "var",
 :source {:code "(def ^{:jsdoc [\"@enum {string}\"]}\n  CHAR_MAP\n  #js {\"-\"    \"_\"\n       \":\"    \"_COLON_\"\n       \"+\"    \"_PLUS_\"\n       \">\"    \"_GT_\"\n       \"<\"    \"_LT_\"\n       \"=\"    \"_EQ_\"\n       \"~\"    \"_TILDE_\"\n       \"!\"    \"_BANG_\"\n       \"@\"    \"_CIRCA_\"\n       \"#\"    \"_SHARP_\"\n       \"'\"    \"_SINGLEQUOTE_\"\n       \"\\\\\\\"\" \"_DOUBLEQUOTE_\"\n       \"%\"    \"_PERCENT_\"\n       \"^\"    \"_CARET_\"\n       \"&\"    \"_AMPERSAND_\"\n       \"*\"    \"_STAR_\"\n       \"|\"    \"_BAR_\"\n       \"{\"    \"_LBRACE_\"\n       \"}\"    \"_RBRACE_\"\n       \"[\"    \"_LBRACK_\"\n       \"]\"    \"_RBRACK_\"\n       \"/\"    \"_SLASH_\"\n       \"\\\\\\\\\" \"_BSLASH_\"\n       \"?\"    \"_QMARK_\"})",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.145",
          :filename "src/main/cljs/cljs/core.cljs",
          :lines [280 305]},
 :full-name "cljs.core/CHAR_MAP",
 :full-name-encode "cljs.core/CHAR_MAP",
 :history [["+" "1.7.10"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.core/CHAR_MAP"]))
```

-->
