## cljs.reader/read-keyword



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-927"><img valign="middle" alt="[+] 0.0-927" title="Added in 0.0-927" src="https://img.shields.io/badge/+-0.0--927-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__read-keyword__ reader initch)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/reader.cljs#L337-L351):

```clj
(defn read-keyword
  [reader initch]
  (let [token (read-token reader (read-char reader))
        a (re-matches* symbol-pattern token)
        token (aget a 0)
        ns (aget a 1)
        name (aget a 2)]
    (if (or (and (not (undefined? ns))
                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) ":/"))
            (identical? (aget name (dec (.-length name))) ":")
            (not (== (.indexOf token "::" 1) -1)))
      (reader-error reader "Invalid token: " token)
      (if (and (not (nil? ns)) (> (.-length ns) 0))
        (keyword (.substring ns 0 (.indexOf ns "/")) name)
        (keyword token)))))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2814
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:337-351](https://github.com/clojure/clojurescript/blob/r2814/src/cljs/cljs/reader.cljs#L337-L351)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/read-keyword` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/read-keyword.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/read-keyword.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "read-keyword",
 :type "function",
 :signature ["[reader initch]"],
 :source {:code "(defn read-keyword\n  [reader initch]\n  (let [token (read-token reader (read-char reader))\n        a (re-matches* symbol-pattern token)\n        token (aget a 0)\n        ns (aget a 1)\n        name (aget a 2)]\n    (if (or (and (not (undefined? ns))\n                 (identical? (. ns (substring (- (.-length ns) 2) (.-length ns))) \":/\"))\n            (identical? (aget name (dec (.-length name))) \":\")\n            (not (== (.indexOf token \"::\" 1) -1)))\n      (reader-error reader \"Invalid token: \" token)\n      (if (and (not (nil? ns)) (> (.-length ns) 0))\n        (keyword (.substring ns 0 (.indexOf ns \"/\")) name)\n        (keyword token)))))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2814",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [337 351]},
 :full-name "cljs.reader/read-keyword",
 :full-name-encode "cljs.reader/read-keyword",
 :history [["+" "0.0-927"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/read-keyword"]))
```

-->
