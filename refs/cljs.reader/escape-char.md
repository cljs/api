## cljs.reader/escape-char



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__escape-char__ buffer reader)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L201-L222):

```clj
(defn escape-char
  [buffer reader]
  (let [ch (read-char reader)
        mapresult (escape-char-map ch)]
    (if mapresult
      mapresult
      (cond
        (identical? ch \x)
        (->> (read-2-chars reader)
          (validate-unicode-escape unicode-2-pattern reader ch)
          (make-unicode-char))

        (identical? ch \u)
        (->> (read-4-chars reader)
          (validate-unicode-escape unicode-4-pattern reader ch)
          (make-unicode-char))

        (numeric? ch)
        (.fromCharCode js/String ch)

        :else
        (reader-error reader "Unexpected unicode escape \\" ch )))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1803
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:201-222](https://github.com/clojure/clojurescript/blob/r1803/src/cljs/cljs/reader.cljs#L201-L222)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/escape-char` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/escape-char.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/escape-char.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "escape-char",
 :type "function",
 :signature ["[buffer reader]"],
 :source {:code "(defn escape-char\n  [buffer reader]\n  (let [ch (read-char reader)\n        mapresult (escape-char-map ch)]\n    (if mapresult\n      mapresult\n      (cond\n        (identical? ch \\x)\n        (->> (read-2-chars reader)\n          (validate-unicode-escape unicode-2-pattern reader ch)\n          (make-unicode-char))\n\n        (identical? ch \\u)\n        (->> (read-4-chars reader)\n          (validate-unicode-escape unicode-4-pattern reader ch)\n          (make-unicode-char))\n\n        (numeric? ch)\n        (.fromCharCode js/String ch)\n\n        :else\n        (reader-error reader \"Unexpected unicode escape \\\\\" ch )))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1803",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [201 222]},
 :full-name "cljs.reader/escape-char",
 :full-name-encode "cljs.reader/escape-char",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/escape-char"]))
```

-->
