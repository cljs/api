## cljs.reader/deregister-tag-parser!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1424"><img valign="middle" alt="[+] 0.0-1424" title="Added in 0.0-1424" src="https://img.shields.io/badge/+-0.0--1424-lightgrey.svg"></a> </td>
</tr>
</table>

<samp>(deregister-tag-parser! tag)</samp><br>

---

 <samp>
(__deregister-tag-parser!__ tag)<br>
</samp>

---







Source code @ [github]():

```clj
(defn deregister-tag-parser!
  [tag]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* dissoc tag)
    old-parser))
```

<!--
Repo - tag - source tree - lines:

 <pre>

</pre>

-->

---



###### External doc links:

[`cljs.reader/deregister-tag-parser!` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/deregister-tag-parser%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/deregister-tag-parserBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "deregister-tag-parser!",
 :signature ["[tag]"],
 :name-encode "deregister-tag-parserBANG",
 :history [["+" "0.0-1424"]],
 :type "function",
 :full-name-encode "cljs.reader/deregister-tag-parserBANG",
 :source {:code "(defn deregister-tag-parser!\n  [tag]\n  (let [tag (str tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* dissoc tag)\n    old-parser))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.9.14",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [613 618],
          :url "https://github.com/clojure/clojurescript/blob/r1.9.14/src/main/cljs/cljs/reader.cljs#L613-L618"},
 :usage ["(deregister-tag-parser! tag)"],
 :full-name "cljs.reader/deregister-tag-parser!",
 :cljsdoc-url "https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/deregister-tag-parserBANG.cljsdoc"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/deregister-tag-parser!"]))
```

-->
