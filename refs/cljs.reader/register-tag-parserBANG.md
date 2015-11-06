## cljs.reader/register-tag-parser!



 <table border="1">
<tr>
<td>function</td>
<td><a href="https://github.com/cljsinfo/cljs-api-docs/tree/0.0-1236"><img valign="middle" alt="[+] 0.0-1236" title="Added in 0.0-1236" src="https://img.shields.io/badge/+-0.0--1236-lightgrey.svg"></a> </td>
</tr>
</table>


 <samp>
(__register-tag-parser!__ tag f)<br>
</samp>

---







Source code @ [github](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L539-L544):

```clj
(defn register-tag-parser!
  [tag f]
  (let [tag (name tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* assoc tag f)
    old-parser))
```

<!--
Repo - tag - source tree - lines:

 <pre>
clojurescript @ r1450
└── src
    └── cljs
        └── cljs
            └── <ins>[reader.cljs:539-544](https://github.com/clojure/clojurescript/blob/r1450/src/cljs/cljs/reader.cljs#L539-L544)</ins>
</pre>

-->

---



###### External doc links:

[`cljs.reader/register-tag-parser!` @ crossclj](http://crossclj.info/fun/cljs.reader.cljs/register-tag-parser%21.html)<br>

---

 <table>
<tr><td>
<img valign="middle" align="right" width="48px" src="http://i.imgur.com/Hi20huC.png">
</td><td>
Created for the upcoming ClojureScript website.<br>
[edit here] | [learn how]
</td></tr></table>

[edit here]:https://github.com/cljsinfo/cljs-api-docs/blob/master/cljsdoc/cljs.reader/register-tag-parserBANG.cljsdoc
[learn how]:https://github.com/cljsinfo/cljs-api-docs/wiki/cljsdoc-files

<!--

This information was too distracting to show to readers, but I'll leave it
commented here since it is helpful to:

- pretty-print the data used to generate this document
- and show how to retrieve that data



The API data for this symbol:

```clj
{:ns "cljs.reader",
 :name "register-tag-parser!",
 :type "function",
 :signature ["[tag f]"],
 :source {:code "(defn register-tag-parser!\n  [tag f]\n  (let [tag (name tag)\n        old-parser (get @*tag-table* tag)]\n    (swap! *tag-table* assoc tag f)\n    old-parser))",
          :title "Source code",
          :repo "clojurescript",
          :tag "r1450",
          :filename "src/cljs/cljs/reader.cljs",
          :lines [539 544]},
 :full-name "cljs.reader/register-tag-parser!",
 :full-name-encode "cljs.reader/register-tag-parserBANG",
 :history [["+" "0.0-1236"]]}

```

Retrieve the API data for this symbol:

```clj
;; from Clojure REPL
(require '[clojure.edn :as edn])
(-> (slurp "https://raw.githubusercontent.com/cljsinfo/cljs-api-docs/catalog/cljs-api.edn")
    (edn/read-string)
    (get-in [:symbols "cljs.reader/register-tag-parser!"]))
```

-->
