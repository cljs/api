## cljs.reader/skip-line



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__skip-line__ reader _)<br>
</samp>

---





Source docstring:

```
Advances the reader to the end of a line. Returns the reader
```


Source code @ [github](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/reader.cljs#L88-L95):

```clj
(defn skip-line
  [reader _]
  (loop []
    (let [ch (read-char reader)]
      (if (or (identical? ch \n) (identical? ch \r) (nil? ch))
        reader
        (recur)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1889
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:88-95](https://github.com/clojure/clojurescript/blob/r1889/src/cljs/cljs/reader.cljs#L88-L95)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/skip-line` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/skip-line.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/skip-line.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "skip-line",
 :signature ["[reader _]"],
 :history [["+" "0.0-927"]],
 :type "function",
 :full-name-encode "cljs.reader/skip-line",
 :source {:code "(defn skip-line\n  [reader _]\n  (loop []\n    (let [ch (read-char reader)]\n      (if (or (identical? ch \\n) (identical? ch \\r) (nil? ch))\n        reader\n        (recur)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1889",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [88 95]},
 :full-name "cljs.reader/skip-line",
 :docstring "Advances the reader to the end of a line. Returns the reader"}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/skip-line"]))
```

-->
