## cljs.reader/unicode-2-pattern



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(def unicode-2-pattern (re-pattern "^[0-9A-Fa-f]{2}$"))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/unicode-2-pattern` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/unicode-2-pattern.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/unicode-2-pattern.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "unicode-2-pattern",
 :name-encode "unicode-2-pattern",
 :history [["+" "0.0-1424"]],
 :type "var",
 :full-name-encode "cljs.reader/unicode-2-pattern",
 :source {:code "(def unicode-2-pattern (re-pattern \"^[0-9A-Fa-f]{2}$\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.40",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [181],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.40/src/main/cljs/cljs/reader.cljs#L181"},
 :full-name "cljs.reader/unicode-2-pattern",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/unicode-2-pattern.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/unicode-2-pattern"]))
```

-->
