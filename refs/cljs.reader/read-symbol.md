## cljs.reader/read-symbol



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-symbol__ reader initch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/reader.cljs#L317-L323):

```clj
(defn read-symbol
  [reader initch]
  (let [token (read-token reader initch)]
    (if (gstring/contains token "/")
      (symbol (subs token 0 (.indexOf token "/"))
              (subs token (inc (.indexOf token "/")) (.-length token)))
      (special-symbols token (symbol token)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2067
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:317-323](https://github.com/clojure/clojurescript/blob/r2067/src/cljs/cljs/reader.cljs#L317-L323)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-symbol` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-symbol.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-symbol.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-symbol",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-symbol\n  [reader initch]\n  (let [token (read-token reader initch)]\n    (if (gstring/contains token \"/\")\n      (symbol (subs token 0 (.indexOf token \"/\"))\n              (subs token (inc (.indexOf token \"/\")) (.-length token)))\n      (special-symbols token (symbol token)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2067",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [317 323]},
 :full-name "cljs.reader/read-symbol",
 :full-name-encode "cljs.reader/read-symbol",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-symbol"]))
```

-->
