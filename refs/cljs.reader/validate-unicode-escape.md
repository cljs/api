## cljs.reader/validate-unicode-escape



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(validate-unicode-escape unicode-pattern reader escape-char unicode-str)</samp><br>

---

 <samp>
(__validate-unicode-escape__ unicode-pattern reader escape-char unicode-str)<br>
</samp>

---







Source code @ [github]():

```clj
(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]
  (if (re-matches unicode-pattern unicode-str)
    unicode-str
    (reader-error reader "Unexpected unicode escape \\" escape-char unicode-str)))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/validate-unicode-escape` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/validate-unicode-escape.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/validate-unicode-escape.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "validate-unicode-escape",
 :signature ["[unicode-pattern reader escape-char unicode-str]"],
 :name-encode "validate-unicode-escape",
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.reader/validate-unicode-escape",
 :source {:code "(defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]\n  (if (re-matches unicode-pattern unicode-str)\n    unicode-str\n    (reader-error reader \"Unexpected unicode escape \\\\\" escape-char unicode-str)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.8.51",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [184 187],
          :url "https://github.com/clojure/clojurescript/blob/r1.8.51/src/main/cljs/cljs/reader.cljs#L184-L187"},
 :usage ["(validate-unicode-escape unicode-pattern reader escape-char unicode-str)"],
 :full-name "cljs.reader/validate-unicode-escape",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/validate-unicode-escape.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/validate-unicode-escape"]))
```

-->
