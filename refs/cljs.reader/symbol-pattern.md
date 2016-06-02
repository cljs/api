## cljs.reader/symbol-pattern



 <table border="1">
<tr>
<td>var</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github]():

```clj
(def symbol-pattern (re-pattern "^[:]?([^0-9/].*/)?([^0-9/][^/]*)$"))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/symbol-pattern` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/symbol-pattern.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/symbol-pattern.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "symbol-pattern",
 :name-encode "symbol-pattern",
 :history [["+" "0.0-927"]],
 :type "var",
 :full-name-encode "cljs.reader/symbol-pattern",
 :source {:code "(def symbol-pattern (re-pattern \"^[:]?([^0-9/].*/)?([^0-9/][^/]*)$\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [101],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/reader.cljs#L101"},
 :full-name "cljs.reader/symbol-pattern",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/symbol-pattern.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/symbol-pattern"]))
```

-->
