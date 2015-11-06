## cljs.reader/register-default-tag-parser!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1576"><img valign="middle" alt="[+] 0.0-1576" title="Added in 0.0-1576" src="https://img.shields.io/badge/+-0.0--1576-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__register-default-tag-parser!__ f)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/reader.cljs#L599-L603):

```clj
(defn register-default-tag-parser!
  [f]
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] f))
    old-parser))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r2356
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:599-603](https://github.com/clojure/clojurescript/blob/r2356/src/cljs/cljs/reader.cljs#L599-L603)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/register-default-tag-parser!` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/register-default-tag-parser%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/register-default-tag-parserBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "register-default-tag-parser!",
 :type "function",
 :signature ["[f]"],
 :source {:code "(defn register-default-tag-parser!\n  [f]\n  (let [old-parser @*default-data-reader-fn*]\n    (swap! *default-data-reader-fn* (fn [_] f))\n    old-parser))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r2356",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [599 603]},
 :full-name "cljs.reader/register-default-tag-parser!",
 :full-name-encode "cljs.reader/register-default-tag-parserBANG",
 :history [["+" "0.0-1576"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/register-default-tag-parser!"]))
```

-->
