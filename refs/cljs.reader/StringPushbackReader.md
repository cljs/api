## cljs.reader/StringPushbackReader



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__StringPushbackReader.__ s buffer idx)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/reader.cljs#L18-L27):

```clj
(deftype StringPushbackReader [s buffer ^:mutable idx]
  PushbackReader
  (read-char [reader]
    (if (zero? (alength buffer))
      (do
        (set! idx (inc idx))
        (aget s idx))
      (.pop buffer)))
  (unread [reader ch]
    (.push buffer ch)))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1.7.170
└── src
    └── main
        └── cljs
            └── cljs
                └── <ins>[reader.cljs:18-27](https://github.com/clojure/clojurescript/blob/r1.7.170/src/main/cljs/cljs/reader.cljs#L18-L27)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/StringPushbackReader` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/StringPushbackReader.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/StringPushbackReader.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "StringPushbackReader",
 :type "type",
 :signature ["[s buffer idx]"],
 :source {:code "(deftype StringPushbackReader [s buffer ^:mutable idx]\n  PushbackReader\n  (read-char [reader]\n    (if (zero? (alength buffer))\n      (do\n        (set! idx (inc idx))\n        (aget s idx))\n      (.pop buffer)))\n  (unread [reader ch]\n    (.push buffer ch)))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1.7.170",
          :filename "src/main/cljs/cljs/reader.cljs",
          :lines [18 27]},
 :full-name "cljs.reader/StringPushbackReader",
 :full-name-encode "cljs.reader/StringPushbackReader",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/StringPushbackReader"]))
```

-->
