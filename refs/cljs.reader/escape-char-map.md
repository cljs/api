## cljs.reader/escape-char-map



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__escape-char-map__ c)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/reader.cljs#L160-L169):

```clj
(defn escape-char-map [c]
  (cond
   (identical? c \t) "\t"
   (identical? c \r) "\r"
   (identical? c \n) "\n"
   (identical? c \\) \\
   (identical? c \") \"
   (identical? c \b) "\b"
   (identical? c \f) "\f"
   :else nil))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1844
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:160-169](https://github.com/clojure/clojurescript/blob/r1844/src/cljs/cljs/reader.cljs#L160-L169)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/escape-char-map` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/escape-char-map.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/escape-char-map.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "escape-char-map",
 :type "function",
 :signature ["[c]"],
 :source {:code "(defn escape-char-map [c]\n  (cond\n   (identical? c \\t) \"\\t\"\n   (identical? c \\r) \"\\r\"\n   (identical? c \\n) \"\\n\"\n   (identical? c \\\\) \\\\\n   (identical? c \\\") \\\"\n   (identical? c \\b) \"\\b\"\n   (identical? c \\f) \"\\f\"\n   :else nil))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1844",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [160 169]},
 :full-name "cljs.reader/escape-char-map",
 :full-name-encode "cljs.reader/escape-char-map",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/escape-char-map"]))
```

-->
