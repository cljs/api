## cljs.reader/read-number



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-number__ reader initch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/reader.cljs#L289-L299):

```clj
(defn read-number
  [reader initch]
  (loop [buffer (gstring/StringBuffer. initch)
         ch (read-char reader)]
    (if (or (nil? ch) (whitespace? ch) (macros ch))
      (do
        (unread reader ch)
        (let [s (. buffer (toString))]
          (or (match-number s)
              (reader-error reader "Invalid number format [" s "]"))))
      (recur (do (.append buffer ch) buffer) (read-char reader)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1843
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:289-299](https://github.com/clojure/clojurescript/blob/r1843/src/cljs/cljs/reader.cljs#L289-L299)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-number` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-number.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-number.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-number",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-number\n  [reader initch]\n  (loop [buffer (gstring/StringBuffer. initch)\n         ch (read-char reader)]\n    (if (or (nil? ch) (whitespace? ch) (macros ch))\n      (do\n        (unread reader ch)\n        (let [s (. buffer (toString))]\n          (or (match-number s)\n              (reader-error reader \"Invalid number format [\" s \"]\"))))\n      (recur (do (.append buffer ch) buffer) (read-char reader)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1843",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [289 299]},
 :full-name "cljs.reader/read-number",
 :full-name-encode "cljs.reader/read-number",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-number"]))
```

-->
