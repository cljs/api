## cljs.reader/PushbackReader



 <table border="1">
<tr>
<td>protocol</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>









Source code @ [github](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/reader.cljs#L12-L15):

```clj
(defprotocol PushbackReader
  (read-char [reader] "Returns the next char from the Reader,
nil if the end of stream has been reached")
  (unread [reader ch] "Push back a single character on to the stream"))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2197
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:12-15](https://github.com/clojure/clojurescript/blob/r2197/src/cljs/cljs/reader.cljs#L12-L15)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/PushbackReader` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/PushbackReader.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/PushbackReader.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "PushbackReader",
 :type "protocol",
 :full-name-encode "cljs.reader/PushbackReader",
 :source {:code "(defprotocol PushbackReader\n  (read-char [reader] \"Returns the next char from the Reader,\nnil if the end of stream has been reached\")\n  (unread [reader ch] \"Push back a single character on to the stream\"))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2197",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [12 15]},
 :methods [{:name "read-char",
            :signature ["[reader]"],
            :docstring "Returns the next char from the Reader,\nnil if the end of stream has been reached"}
           {:name "unread",
            :signature ["[reader ch]"],
            :docstring "Push back a single character on to the stream"}],
 :full-name "cljs.reader/PushbackReader",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/PushbackReader"]))
```

-->
