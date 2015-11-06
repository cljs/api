## cljs.reader/StringPushbackReader



 <table border="1">
<tr>
<td>type</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__StringPushbackReader.__ s index-atom buffer-atom)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L18-L28):

```clj
(deftype StringPushbackReader [s index-atom buffer-atom]
  PushbackReader
  (read-char [reader]
             (if (empty? @buffer-atom)
               (let [idx @index-atom]
                 (swap! index-atom inc)
                 (nth s idx))
               (let [buf @buffer-atom]
                 (swap! buffer-atom rest)
                 (first buf))))
  (unread [reader ch] (swap! buffer-atom #(cons ch %))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1211
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:18-28](https://github.com/clojure/clojurescript/blob/r1211/src/cljs/cljs/reader.cljs#L18-L28)</ins>
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
 :signature ["[s index-atom buffer-atom]"],
 :source {:code "(deftype StringPushbackReader [s index-atom buffer-atom]\n  PushbackReader\n  (read-char [reader]\n             (if (empty? @buffer-atom)\n               (let [idx @index-atom]\n                 (swap! index-atom inc)\n                 (nth s idx))\n               (let [buf @buffer-atom]\n                 (swap! buffer-atom rest)\n                 (first buf))))\n  (unread [reader ch] (swap! buffer-atom #(cons ch %))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1211",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [18 28]},
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
